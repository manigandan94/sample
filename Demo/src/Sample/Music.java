package Sample; 
import java.io.File; 
import javax.sound.sampled.AudioFormat; 
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.DataLine; 
public class Music 
{ 
	static boolean playCompleted;
	public static void main(String[] args) 
	{ 
		try 
		{ 
			File audioFile = new File("C:\\Users\\manigandang\\Desktop\\Sample\\Demo\\Music\\knowcat.wav"); 
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			AudioFormat format = audioStream.getFormat(); 
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			Clip audioClip = (Clip) AudioSystem.getLine(info);
			audioClip.open(audioStream); audioClip.start(); 
			System.out.println("Team Aqua"); 
			Thread.sleep(2000); 
			System.out.println("<------------------------------>"); 
			System.out.println(); 
			System.out.println("Inovate Techies"); 
			Thread.sleep(2000); 
			System.out.println("<------------------------------>"); 
			System.out.println(); 
			System.out.println("<The Captain - Akila>"); 
			Thread.sleep(2000); 
			System.out.println("<------------------------------>"); 
			System.out.println(); 
			System.out.println("<Guide:Preethi>"); 
			Thread.sleep(2000); 
			System.out.println("<------------------------------>"); 
			System.out.println(); 
			System.out.println("<Guide:Pavithra>"); 
			Thread.sleep(2000); 
			System.out.println("<------------------------------>"); 
			System.out.println();
			System.out.println("<Sarath>");
			Thread.sleep(2000); 
			System.out.println("<------------------------------>"); 
			System.out.println(); 
			System.out.println("<Manigandan>"); 
			Thread.sleep(2000); 
			System.out.println("<------------------------------>");
			System.out.println("<Mageshwari>"); 
 } 
		catch (Exception e) 
		{ 
			System.out.println(e); 
			} 
		} 
	}