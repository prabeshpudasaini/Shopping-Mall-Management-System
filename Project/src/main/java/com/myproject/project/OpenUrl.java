package com.myproject.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Desktop;
import java.io.*;
import java.net.URI;
/**
 *
 * @author user
 */
public class OpenUrl {
    public static void main(String[] args)
             throws Exception
    {
        Desktop desk = Desktop.getDesktop();
        
        // now we enter our URL that we want to open in our
        // default browser
        desk.browse(new URI("http://localhost:4242/checkout.html"));
    }
    
}
