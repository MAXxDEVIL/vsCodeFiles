import java.util.Scanner;


public class madLibs {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Mad Libs game

        String ad1, n1, ad2, v1, ad3;
    

        System.out.println("==============  Mad Libs game ==============");
        System.out.println(" ");

        System.out.print("Enter an adjective (description) : ");
        ad1 = scanner.nextLine();
        System.out.print("Enter a noune (animal or person) : ");
        n1 = scanner.nextLine();
        System.out.print("Enter an adjective (description) : ");
        ad2 = scanner.nextLine();
        System.out.print("Enter an verb end with 'ing' (action) : ");
        v1 = scanner.nextLine();
        System.out.print("Enter an adjective (description) : ");
        ad3 = scanner.nextLine();
        System.out.println(" ");

        scanner.close();


        // Output
        
        System.out.println("============================================");
        System.out.println("Today I went a " + ad1 + " Zoo.");
        System.out.println("In a exhibit, I saw a " + n1 + ".");
        System.out.println(n1 + " was " + ad2 + " and" + v1 + "!");
        System.out.println("I was " + ad3 + "!");
        System.out.println("============================================");

       

    }
}
