package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       

      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader("original.txt"));

               PrintWriter outputStream = 
                       new PrintWriter(new FileOutputStream("numbered.txt"));


             /**
           구현하시오. 
          **/
         for(int i=0; i<6; i++){

        	 outputStream.write(i+1 + " ");
        	 String str = inputStream.readLine() ;
        	 outputStream.write(str) ;
        	 outputStream.write("\n");
         }         
         
         inputStream.close( );
         outputStream.close( );
         
      }catch (IOException e) {
    	  	System.err.println(e);
			System.exit(1);
      }
      
      /** catch() 구문 작성하시오 **/

   }
}
