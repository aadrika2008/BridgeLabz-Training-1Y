import java.util.Scanner;
   classimport java.util.Scanner;
   classimport java.util.Scanner;
   class ArrayExample{
   public static void main(){
       Scanner sc=new Scanner(System.in);
       int marks[] = {12,14,16,18,20};// Array elements
       
        System.out.println("Using for each loop");
       for (int i : marks){ // Using for each loop
           System.out.println(""+i);
       }
         
       System.out.println("Array elements: ");
       for(int i =0;i<marks.length;i++){
           System.out.println(marks[i]); //Printing elements
       }
       
              System.out.println(marks[0]);// Accessing element at specific index
           
          System.out.println("Updating elements:");
          marks[3]=100;
          System.out.println("Array elements: ");
       
           for(int i =0;i<marks.length;i++){
           System.out.println(marks[i]); //Printing elements
       }

   }
 }


