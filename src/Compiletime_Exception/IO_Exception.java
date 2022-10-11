package Compiletime_Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IO_Exception {

	public static void main(String[] args) {

    File file= new File("C:\\Users\\Modi\\Atlas_file"); //creating object for file class
    File file1= new File("C:\\Users\\Modi\\Atlas_file1");
    
   try {
		FileWriter fw = new FileWriter(file + "\\information.txt"); //opening connection for fileWriter
		fw.write("Ahmad, columbia\n Mahmod, towson\n Alex, elicot city\n Lisa, baltimore");//writing data
		fw.flush();//commit (giving permission)
		fw.close();//closing connection of filewriter
		
		FileWriter fw1 = new FileWriter(file1 + "\\information.txt");
		fw1.write("Ahmad, columbia");
		fw1.close();
		}
    
    catch (IOException e) {
		e.printStackTrace();
	}
		
		System.out.println("end.............");
		
		
		
	}

}
