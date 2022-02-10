package com.opshub.demo;

import java.io.*;
import java.util.Scanner;
 
class ReverseString {
    public static void main (String[] args) {
       
        String str= "Demo", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Demo");
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
