/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author lgma1
 */
public class Test1 {
    public static void main (String[] args) throws IOException {
     
     System.out.println ("Type Number 1:");
     Integer Number1 = loadNumber();
     
     
     System.out.println("Type Number 2 ");
     Integer Number2 = loadNumber();
     
     
     System.out.println("Type Number 3 ");
     Integer Number3 = loadNumber();
     
     Mathoperation(Number1,Number2,Number3);
    }
    
    /**
     * 
     * @return
     * @throws IOException 
     */
    private static Integer loadNumber() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader (System.in);
        BufferedReader reader = new BufferedReader (inputStreamReader);
        String strNumber= reader.readLine();
        Integer Number = Integer.parseInt(strNumber);
        return Number;  
    }   
    
    /**
     * 
     * @param Number1
     * @param Number2
     * @param Number3 
     */
    private static void Mathoperation (Integer Number1, Integer Number2, Integer Number3) {
        
      String Answer = "";
      
        if (Number3 == (Number1 + Number2))
            Answer = "+";{}
        
    
        if (Number3 == (Number1 - Number2))
            Answer = "-";{}
      
        
        if (Number3 == (Number1 * Number2)) 
            Answer = (Answer + "*"); {}
    
                     
        if (Number3 == (Number1 / Number2))
            Answer = (Answer + "/");{}
            
        if (Answer =="") 
                Answer = "None";
        
            
      System.out.println(Answer);
  
        
                  
      }
     }

        
    