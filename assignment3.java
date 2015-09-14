package assignment3;

import java.util.Scanner;

/**
 * @author Adam
 */
public class Assignment3 {
    
    public static void main(String[] args) {
        /*This program asks the user for a word. It then proceeds to reverse the
        order of the letters in a for loop. Then it displays the ne word to the user.
        */

        int length;                 //holds word length
        String  word,               //holds user entered string
                letter,             //holds a letter of the word
                wordReverse = "";   //holds the user word in reverse order
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("Enter a word: "); //ask user for word
        word = keyboard.nextLine();  //assign word to variable
        length = word.length();     //find word length
        for(int i = 0; i < length; i++){   //for loop to find letter values
            letter = Character.toString(word.charAt(length-(i+1))); //get last letter in word
            wordReverse +=letter;   //add letter to wordReverse
        }   //end for loop
        System.out.println(wordReverse);   //display the word in reverse order
    }
}
