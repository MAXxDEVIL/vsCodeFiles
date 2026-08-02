import java.util.Scanner;


public class ariaOfRecttangle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Calculte area of Rectangle

        double width = 0, height = 0, area = 0;
        String name = "xxxx";


        System.out.println("========== Aria Calcultor ==========");
        System.out.println(" ");
        System.out.print("Enter the width : ");
        width = scanner.nextDouble();
        System.out.print("Enter the height : ");
        height = scanner.nextDouble();

        scanner.close();

        // Calculte 

        area = width * height;


        // output


        System.out.println("====================================");
        System.out.println("The aria of this " + name + " is :" + area + " cm²");
        System.out.println("====================================");

 



    }
}
