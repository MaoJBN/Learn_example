
package com.mycompany.example_2;

import java.util.Scanner;

public class Example_2 {

    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner(System.in);
          Word word = new Word();
          Guess guess = new Guess();
          boolean a = true;
          char [] result = new char[4];
          int i=0;
          do{
          System.out.println("Ingrese una letra" );
          char abc = scn.nextLine().charAt(0);
         try{
           word.isWord(abc);
           a=guess.GuessWord(abc);
           if(a){
           result[i]=abc;
           i++;
           }
          }catch(Exception e){
            System.out.println("Sea serio pelado: " + e.getMessage());
            System.out.println("meta otra letra");
          }
          }while(a);
         
          for(int c=0;c<4;c++){
              System.out.println(result[c]);
          }
    }
}
