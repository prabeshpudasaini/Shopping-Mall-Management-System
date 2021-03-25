

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.sql.*;
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author user
 */
public class DatabaseConnection {
    public static Connection getCon(){
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String db = "jdbc:sqlserver://DESKTOP-KN2KITT;databaseName=Shopping_Mall;user=sa;password=prabesh";
            Connection con = DriverManager.getConnection(db);
            return con;
            
        } 
        catch (Exception e)
        {
            return null;
        }
    }
//     public static void main(String[] args) {
// 
//        Connection conn = null;
// 
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String db = "jdbc:sqlserver://DESKTOP-KN2KITT;databaseName=Ecommerce;user=sa;password=prabesh";
//            conn = DriverManager.getConnection(db);
//            Statement st = conn.createStatement();
//            String query = "select * from Customer";
//            ResultSet rs = st.executeQuery(query);
//
//            while (rs.next()) {
//                System.out.println(rs.getString(1));
//                System.out.println(rs.getString(2));
//            }
//            conn.close();
////            if (conn != null) {
////                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
////                System.out.println("Driver name: " + dm.getDriverName());
////                System.out.println("Driver version: " + dm.getDriverVersion());
////                System.out.println("Product name: " + dm.getDatabaseProductName());
////                System.out.println("Product version: " + dm.getDatabaseProductVersion());
////            }
//// 
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//                    catch (ClassNotFoundException e) {
//            e.getStackTrace();
//        }
//        finally {
//            try {
//                if (conn != null && !conn.isClosed()) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//
//        }
//    }
}
