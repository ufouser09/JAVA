package files;

import java.io.File;  
import java.io.IOException;  

public class CreateFile {
  public static void main(String[] args) {
	  //String myDesktopPath = "/Users/elcin/Desktop/";  //windowsda başına C: ekle
    
	  try {
		  
      File myObj = new File("dosyam.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
