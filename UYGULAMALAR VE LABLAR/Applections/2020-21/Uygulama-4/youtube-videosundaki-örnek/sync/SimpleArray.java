package sync;

import java.util.Arrays;
import java.util.Random;

public class SimpleArray 
{
   private final int[] array; 
   private int writeIndex = 0; 
   private final static Random generator = new Random();

   
   public SimpleArray( int size )
   {
      array = new int[ size ];
   } 

   
   public  synchronized void  add( int value )
   {
      int position = writeIndex; 

//      try
//      {
//         // put thread to sleep for 0-499 milliseconds
//         Thread.sleep( generator.nextInt( 500 ) ); 
//      } 
//      catch ( InterruptedException ex )
//      {
//         ex.printStackTrace();
//      } 

      
      array[ position ] = value;
      System.out.printf( "%s wrote %2d to element %d.\n", 
         Thread.currentThread().getName(), value, position );

      ++writeIndex; 
      System.out.printf( "Next write index: %d\n", writeIndex );
   } 
   
   
   public String toString()
   {
      return "\nContents of SimpleArray:\n" + Arrays.toString( array );
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/