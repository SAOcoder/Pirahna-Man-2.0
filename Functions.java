import java.util.Scanner;
import java.util.ArrayList;

class Functions {

  //this method is only needed within this file so its better to just put it as private. the user seems to not hace acces to it eithe rway since the arrayList parameter is initialzed within the class so theres so way for the user to see this method.

    public static void printList(ArrayList<String> a) {

    for (int i = 0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }

    System.out.println();
  }
  
  //converts each non blank character in the hidden array into an underscore. allows the blank characters to remain in same indexs.
  public static void censor(char[] c){
      
    for(int i = 0; i < c.length; i++){
    
      if(!(c[i] == '\''||c[i] == '-'||c[i] == ' ' ||c[i] == '\\' || c[i] == '/'|| c[i] == '#'|| c[i] == '_'|| c[i] == '?'|| c[i] == '!')){ 

        c[i] = '_';
      }
     
    }

    System.out.println();
  }

  //display an array of characters
  public static void printCharArray(char[] c){
    
     System.out.println("\n");
    
      for(int i = 0; i < c.length;i++){
        System.out.print(c[i] + " ");
      }
      System.out.println();
  }


  //check to see if the user's character input is in the word array. If so,   then the index where the guessed letter(user input) matches will be assigned to the idex in the hidden array
  public static char[] check(char c, char[] wArray, char[] hArray){
    int j;

    for (j = 0; j < wArray.length; j++) {

      if (wArray[j] ==  Character.toLowerCase(c)) {
        // System.out.println(wArray[j] + " that letter is right here " + (j+1));
        hArray[j] = wArray[j];
      }
      //if the word array has space, then the space will be at the same index in the hidden array
      else if (wArray[j] ==  ' ') {
        System.out.print( wArray[j]); //changed from println because of big space in console
        hArray[j] = wArray[j];
      }
      else {
        // System.out.println( wArray[j] + " NOT HERE " + (j+1));
      }
    }

    System.out.println();

    return hArray;
  }


  //method ask the user to be my valentine. user will be re-asked until 'y' is inputted
  public static void pressure(){


  boolean correctResponse = false;

        for( int k = 0; k < 50 ;k++){

        System.out.println("\n\nWILL YOU BE MY VALENTINES? WILL YOU BE MY VALENTINES? WILL YOU BE MY VALENTINES?");   
        }
        
        Scanner sayYes = new Scanner(System.in);

          while(!correctResponse){
            
            System.out.println("\n\nEnter 'y' if you do :D \n");

            char response = sayYes.next().charAt(0);
            response = Character.toLowerCase(response);

              if(response == 'y'){
                System.out.println("\n\ngood girl >;)"); 
                correctResponse = true;
                sayYes.close();
                }

              else{

              for( int k = 0; k < 18 ;k++){

                         
                  try{
                      Thread.sleep(500);//500ms = .5s 
                      }  
                  catch(InterruptedException ex){
                  } 

                  System.out.println("\n\nWILL YOU BE MY VALENTINES? WILL YOU BE MY VALENTINES? WILL YOU BE MY VALENTINES?");  
                  System.out.println("\nSTOP PLAYING AND PUT Y");

                  }
              }
              
            }

            

            sayYes.close();
      }

      //method counts the number of non blank characters in an array of charactes and returns the result as an int
      public static int count(char[] cArray){
        int count = 0;
        
        for(int c = 0; c < cArray.length; c++){
          if(cArray[c] != ' ' && !Character.isLetter(cArray[c]) ){
            count++;
          }
        }

        System.out.println("\n" + count + " letters left to guess");

        return count;

      }



      //if the original phrase is the  then the pressure mehtod will run
      public static void secretPhrase(String originalWord, boolean correctAnswer)
      {

          if(originalWord.equals("Will You Be My Valentines") && correctAnswer == true)
          {
            // System.out.println("yeah");
            try{Thread.sleep(10000);} //10000ms = 10s 
            catch(InterruptedException e)
            {e.printStackTrace(); }
            
            Functions.pressure(); 
          }

          else{ //do nothing
            }

      }

      public static void congrats(String originalWord, boolean correctAnswer){
    //if the user guesses the word correctly they get congratulated
    if(correctAnswer == true){

      System.out.println("\nHOLD UP?! IT DOESNT MATTER HOW MANY GUESSES U GOT LEFT BECAUSE ...*drumRoll*... \n\t\t\t\t\t\tYOU DID IT!!!\n\t\t\t\t\tU are so smart piggy <3");
    }
    else{
      System.out.println("\n... Struggling huh? PFFFFFFF");

      System.out.println("\n\t\t\t\t\t\t\t\t\tThe answer was [" + originalWord + "] btw");
    }
        

      }


}