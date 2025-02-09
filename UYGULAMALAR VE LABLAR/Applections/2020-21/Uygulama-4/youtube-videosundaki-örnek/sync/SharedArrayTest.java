package sync;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;


public class SharedArrayTest
{
   public static void main( String[] arg ) throws InterruptedException
   {
      
      SimpleArray sharedSimpleArray = new SimpleArray( 6 );

      
      ArrayWriter writer1 = new ArrayWriter( 1, sharedSimpleArray );
      ArrayWriter writer2 = new ArrayWriter( 11, sharedSimpleArray );
    
      
      ExecutorService executor = Executors.newCachedThreadPool();
      executor.execute( writer1 );
      executor.execute( writer2 );
      
      executor.shutdown();

      try
      {
         //wait 1 minute for both writers to finish executing
         boolean tasksEnded = executor.awaitTermination( 1, TimeUnit.MINUTES );

         if ( tasksEnded )
            System.out.println( sharedSimpleArray ); 
         else
            System.out.println( 
               "Timed out while waiting for tasks to finish." );
      } 
      catch ( InterruptedException ex )
      {
         System.out.println( 
            "Interrupted while waiting for tasks to finish." );
      } 
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