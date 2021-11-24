package com.myproject.project;

import java.nio.file.Paths;



import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFiles;
import static spark.Spark.port;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import com.stripe.param.WebhookEndpointCreateParams;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Server {
  private static Gson gson = new Gson();

 

  static class CreatePayment {
    @SerializedName("items")
    Object[] items;

    public Object[] getItems() {
      return items;
    }
  }

  static class CreatePaymentResponse {
    private String clientSecret;

    public CreatePaymentResponse(String clientSecret) {
      this.clientSecret = clientSecret;
    }
  }
  
  private static int amount;
  
     public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
  


  static int calculateOrderAmount(Object[] items) {
    // Replace this constant with a calculation of the order's amount
    // Calculate the order total on the server to prevent
    // users from directly manipulating the amount on the client
//    return 140000;
//       int amount = new Purchase_product().amount;
      return amount;
    
  }
  

  

  public static void main(String[] args){
    port(4242);
    staticFiles.externalLocation(Paths.get("public").toAbsolutePath().toString());

    // This is your real test secret API key.
    Stripe.apiKey = "sk_test_51JT2tzK11Ue0aOYnBqE8GcwURXjvOVE4DRAxonHFe7Q1kFpZQ5woQe2YOH9TsSdOKlMYajVcAsgy5vEigHOCkE7H00vsjNq8yx";

    post("/create-payment-intent", (request, response) -> {
      response.type("application/json");

      CreatePayment postBody = gson.fromJson(request.body(), CreatePayment.class);
      PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
      .setCurrency("npr")
      .setAmount(new Long(calculateOrderAmount(postBody.getItems())))
//       .setAmount(new Long(new Purchase_product().amount))
      .build();
      // Create a PaymentIntent with the order amount and currency
      PaymentIntent intent = PaymentIntent.create(createParams);
      
      CreatePaymentResponse paymentResponse = new CreatePaymentResponse(intent.getClientSecret());
      
//      PaymentIntent paymentIntent = PaymentIntent.retrieve(intent.getId());
      
     
              try {
            Connection con=DatabaseConnection.getCon();
            Statement st=con.createStatement();
            st.execute("INSERT INTO payments(Payment_Id,Payment_Type,Amount) values('"+intent.getId()+"','"+intent.getPaymentMethodTypes()+"','"+intent.getAmount()/100+"')");
            con.close();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);

        }
      
      
      return gson.toJson(paymentResponse);
      

      
    });
          
  }
}