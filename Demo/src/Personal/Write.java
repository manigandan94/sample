package Personal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write 
{
	public static void main(String[] args) throws IOException
	{    
		FileWriter writer = new FileWriter("C:\\Users\\manigandang\\Desktop\\New folder\\testout2.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.close();  
    } 


	}

