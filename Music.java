import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

class Music {
  
  public void play(String f) {

    
    try{
      
  File file = new File(f);
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    clip.start();
      }

    catch(UnsupportedAudioFileException|LineUnavailableException e){
      e.printStackTrace();
    }
    catch(IOException io){
      io.printStackTrace();
    }
    
  
   }
  
}