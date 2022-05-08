import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

class Game {

  public static void game(File file) {

    String originalWord; // word/phares the user must guess
    
    boolean correctAnswer = false; //boolean values that stores whether or not the user has complether the word/array(guessed the letters correctly)

    char[] hiddenArray; //copy of the wordArray that will be censored and updated depending on the user's input

    char guessedLetter; //the character the user guessed(inputted)

    int triesCount = 1; //number of guesses(whether wrong or right)
    int letterCount; //the amount of non blank characters in the wordArray

    double wrongGuess = 0.0; //current state of wrong guesses
    double maxWrong; //mac allowed of wrong guesses

    

    //arraylist is declared. Arraylist can easily be updated--no fixed lentgh.
     ArrayList<String> list = new ArrayList<String>();

    try {
      //scanner object is initialzed that will read from a text file
      Scanner scanText = new Scanner(file);

      //scans each non-blank line in the text file
      while (scanText.hasNextLine()) {
        list.add(scanText.nextLine());
      }

      scanText.close();

    }
        catch (FileNotFoundException e) {
      e.printStackTrace();
      System.out.println("The file was not found");
    }

      // System.out.println("THIS IS THE WORD BANK : ");
      
      // Functions.printList(list);

    //Random object is created to randomely pick an element from the ArrayList
    Random ran = new Random();

      //chooses a random line from the text file and stores it into a string
      originalWord = list.get(ran.nextInt((list.size())));

      //convers the original word/phrase(string) to undercaps and into an array of characters. this allows the array to be updated at specif indexs that match the original word/phrase 
      char[] wordArray = originalWord.toLowerCase().toCharArray();

      System.out.print("word array: ");//uncensored
      Functions.printCharArray(wordArray); 


      //initializes an array of the same lentgh as the word array
      hiddenArray = new char[wordArray.length];

      //creates a copy of the word array. this array can be manipulated without changing the word array
      for (int i = 0; i < hiddenArray.length; i++) {
         hiddenArray[i] = wordArray[i];
      }

      //censor method censors the char array 
      Functions.censor(hiddenArray);   
      
      System.out.print("TRY: " + triesCount + "\n");  

      //number of guessable letters is stored in the letterCount variable
      letterCount = Functions.count(hiddenArray);

      //the max allowed wrong quesses is equal to half og the total number of guessable letters(no spaces since the user cannot guess spaces)
      maxWrong =  Math.floor(letterCount/2);

      Animation.hangmanfigure(wrongGuess,maxWrong,correctAnswer);

    
      //System.out.println("\nBellow is the censored version of the array: ");
      Functions.printCharArray(hiddenArray);



  //as long as amount of wrong guesses are less than the Max allowed wrong guesses and the user hasnt completed the word(guessed all letters correctly)
  while(wrongGuess < maxWrong && correctAnswer==false){

    //ArrayList "letterBank" is initializedto store all of the user's guesses
    ArrayList<Character> letterBank = new ArrayList<>();
    
       //create object of a scanner and takes user input and stores it
     Scanner input = new Scanner(System.in);

        System.out.println("\n\t\t\t\t\t\t\t\tYou have " +(int)(maxWrong - wrongGuess) + " wrong guesses left");

        System.out.println("\nGuess a letter:\n");

        //takes ONLY the first character the user inputs. Does not take spaces.Iif the user inputs a space(s) and then a character the scanner will skip over the space anf take in the first character after the space(s)
       

        guessedLetter = input.next().charAt(0);
        
       
        //inserts the inputted characters into an arrayList
        letterBank.add(guessedLetter);

        //keeps track of each inputted charcater (whether rigth or wrong)
        triesCount++;

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("TRY: " + triesCount + "\n");
        //this method counts the  number of letters (no spaces) in the word array
        Functions.count(hiddenArray);


        //checks to see if the guessed letter is in the word array. if so then the hidden array is updated in the same index's that the letter appears in the word array. The hidden array is then updated (reassingment of the hiddenArray)

        hiddenArray = Functions.check(guessedLetter, wordArray, hiddenArray);

    
        //checks to see if the inputted character is anywhere in the original word. If not the wrongGuess variable increments by one
        if(!originalWord.toLowerCase().contains(Character.toString(guessedLetter).toLowerCase())){

        wrongGuess++;

        }

        //updates to see whther the user has guessed the word correctly
        correctAnswer = Arrays.equals(wordArray, hiddenArray);

        //displays the hangman figure 
        Animation.hangmanfigure(wrongGuess,maxWrong, correctAnswer);


        //prints the current status of the hiddenArray
        Functions.printCharArray(hiddenArray);
  
        System.out.println("\nHey baby, you already guessed these letters so dont be waste time guessing them again :) \n\t" +letterBank + "\n" );

        System.out.println("WRONG GUESS COUNT: " + (int)wrongGuess);
        
  }

  Functions.congrats(originalWord, correctAnswer);
  
  Functions.secretPhrase(originalWord, correctAnswer);

  }  
  
  
}

