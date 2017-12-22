import java.util.*; 
import java.lang.*;

public class CardCounter { 

   public static void main (String[] args) {  
      int count = 0;
      double delay = 1000;
   
      for (int i = 0; i < 3; i++) { 
         for (int j = 0; j < 10; j++) { 
            Random rand = new Random();
            int n = rand.nextInt(13) + 1; 
            displayCard(n);
            try {
               Thread.sleep((long)delay);
            } catch (InterruptedException e) {
               System.err.println("Exception");
            }
            if (n == 1 || n >= 10) { 
               count = count - 1; 
            }
            else if (n >= 2 && n <= 6) { 
               count = count +1;
            }
            else { 
               count = count + 0; 
            }
         }
      
         System.out.println("Please enter the current count:"); 
         Scanner in = new Scanner(System.in); 
         int num = in.nextInt(); 
      
         if (num == count) { 
            System.out.println("You are correct"); 
            delay = delay * 0.8;
         } else {
            System.out.println("You are incorrect. The correct answer should be " + count);
            delay = delay * 1.25;
         }
         try {
            Thread.sleep(1500);
         } catch (InterruptedException e) {
            System.err.println("Exception");
         }
      
      }
   
   }      
   public static void displayCard(int n) { 
      if (n == 1) { 
         System.out.println("A");
      } else if (n <= 10) { 
         System.out.println(n);
      }  else if (n == 11) { 
         System.out.println("J");
      }  else if (n == 12) { 
         System.out.println("Q");
      }  else if (n == 13) { 
         System.out.println("K");
      }  else { 
         System.out.println("Not in the deck"); 
      }      
   }
}
