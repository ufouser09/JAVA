package files;

import java.io.*;
import java.util.LinkedList;
public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Ali Demir";
      e.address = "İstanbul";
      e.SSN = 11122333;
      e.number = 101;
      
      Employee e2 = new Employee();
      e2.name = "Veli Bakır";
      e2.address = "Ankara";
      e2.SSN = 222333444;
      e2.number = 202;
      
      LinkedList<Employee> listem = new LinkedList<>();
      listem.add(e);
      listem.add(e2);
      
      try {
         FileOutputStream fileOut = new FileOutputStream("myfile.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(listem);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved.");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}

