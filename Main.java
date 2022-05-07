
import java.io.File;


class Main {
  
  public static void main(String[] args) {

  File f = new File("folder.txt");
  File f2 = new File("folder2.txt");
  File f3 = new File("bugs.txt");

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