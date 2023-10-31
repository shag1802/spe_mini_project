//package org.example;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//public class Main {
//
//    private static final Logger logger =LogManager.getLogger(Main.class);
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
////        This is just a comment done for testing git
//
//        logger.info("Start of Execution");
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}
package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("The world's first unscientific calculator. Now with many many DevOp tools behind it");
        //some changes
        Scanner reader = new Scanner(System.in);
        int op, flag=0;
        double val, exp;
        int a, b;

        do{
            System.out.println("Welcome To Calculator App!!!");
            System.out.println("Please select a operations from the following:");
            System.out.println("");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Power");
            System.out.println("4. Square Root");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Enter your choice(number): ");
            System.out.println("");
            op = reader.nextInt();
            if(op==5) flag = 1;
            else{
                switch(op){

                    case 1:  // Addition
                        System.out.println("You have selected addition operation");
                        System.out.println("");
                        System.out.print("Enter 1st number: ");
                        a = reader.nextInt();
                        System.out.print("Enter 2nd number: ");
                        b= reader.nextInt();
                        add(a,b);
                        break;

                    case 2: //Subtraction
                        System.out.println("You have selected subtraction operation");
                        System.out.println("");
                        System.out.print("Enter 1st number: ");
                        a = reader.nextInt();
                        System.out.print("Enter 2nd number: ");
                        b= reader.nextInt();
                        sub(a,b);
                        break;

                    case 3: //Power
                        System.out.println("You have selected power operation");
                        System.out.println("");
                        System.out.print("Enter number the number: ");
                        val = reader.nextDouble();
                        System.out.print("Enter the exponent: ");
                        exp = reader.nextDouble();
                        power(val,exp);
                        break;

                    case 4: //Square root
                        System.out.println("You have selected Square Root operation");
                        System.out.println("");
                        System.out.print("Enter the number: ");
                        val = reader.nextDouble();
                        squareRoot(val);
                        break;



                    default:
                        System.out.println("Invalid input!!");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }
    public static int add(int a, int b){
        int c = a+ b;
        System.out.println("");
        System.out.println("The Result is "+c);
        System.out.println("");
        logger.info("Addition function is executing");
        return c;
    }
    public static int sub(int a ,int b) {
        int c = a - b;
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Subtraction function is executing");
        return c;
    }
    public static double power(double num, double exp){
        double c = Math.pow(num,exp);
        System.out.println("");
        System.out.println("The Result is "+ c);
        System.out.println("");
        logger.info("Power function is executing");
        return c;
    }
    public static double squareRoot(double num){
        double c = Math.sqrt(num);
        System.out.println("");
        System.out.println("The Result is "+c);
        System.out.println("");
        logger.info("SquareRoot function is executing");
        return c;
    }

}