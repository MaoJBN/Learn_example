
package com.mycompany.example_2;

public class Guess {
  String wordguess= "play";
  int life =6;
  char [] result = new char[4];
  public boolean GuessWord(char abc){
   for(int i=0;i<wordguess.length();i++){
       if(abc == wordguess.charAt(i)){
           System.out.println(abc);
           result[i]=abc;
           return true;
       }
   }
   if(life<=0){
       System.out.println("perdiste");
       return false;
   }else{
           System.out.println("NO ES LA LETRA MENOS UNA VIDA");
           life=life-1;
           return true;
           
   }
  }
}
