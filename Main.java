import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;


class Main {
  
 static Music backgroundMusic = new Music();
  
  public static void main(String[] args) {

    backgroundMusic.play("Trapp_Family.wav");

    System.out.println("Song should play");
    

  File f1 = new File("phrases.txt");
  File f2 = new File("valentine.txt");
  File f3 = new File("bugs.txt"); //

    
 /* int rounds = 3;

  for(int r = 1; r <= rounds; r++){
    System.out.println();
        System.out.println("\n\n\nRound " + (r) + ":\n");
        Game.game(f);
        
        
         try{
        Thread.sleep(5000);//5000ms = 5s 
        }  
    catch(InterruptedException ex){
    }
    

  }
*/
    System.out.println("\n\n\n\nFINAL ROUND\n");
    Game.game(f3);
    
    

  }
  
}