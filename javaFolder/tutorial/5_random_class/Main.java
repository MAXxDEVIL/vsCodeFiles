import java.util.Random;  //<-- import random
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

                                //  <--|
        Random random = new Random();//|-----  random funton 
                                //  <--|   

        Scanner scanner = new Scanner(System.in);

                                  //  <---|
        boolean isHead = random.nextBoolean();// |----- set paramiter to random funtion 
                                  //  <---|

        if (isHead){
            System.out.println("Heads");

        }
        else{
            System.out.println("Tails");
        }


    }
    
}
