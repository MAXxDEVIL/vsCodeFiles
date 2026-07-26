// Scanner class

import java.util.Scanner; 



public class _input {

    public static void main(){

        // Difine Scanner as scanner
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name : ");
 
        // Inputs
         //Integer (int)
        int variable = scanner.nextInt();
         
         // Double (double)
        double variable_1 = scanner.nextDouble();

         // Boolean (boolean)
        boolean variable_2 = scanner.nextBoolean();

         // Float (float)
        float variable_3 = scanner.nextFloat();
         
         // String (String) 
        String name = scanner.nextLine();

        

        System.out.println("Hello " + name);




        scanner.close();
    } 


}