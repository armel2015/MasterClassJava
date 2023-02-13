package JavaFileSystemAndNIO.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {

    public static void main(String[] args) {


        System.out.println(getIntEAFP());
    }

    private static int divideLBYL(int x, int y){
        if(y != 0){
            return x / y;
        }else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try {
            return x / y;
        }catch (ArithmeticException e){
            return 0;
        }
    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return s.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }

    private static int divide(int x, int y){
       return x / y ;
    }
}
