
package com.mycompany.example_2;

public class Word {
    public boolean isWord(char letter) throws Exception{
        if(Character.isDigit(letter)){
         throw new Exception("Esta jugando al horcado mijo meta una letra");
        }
    return false; 
    }
}
