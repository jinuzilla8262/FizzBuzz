package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

//        for(int i=0;i<100;i++){
//            fizzBuzz(i);
//            System.out.println(i + " :" +fizzBuzz(i));
//        }
    }
    public static String fizzBuzz(int input) {
        if (isDivisibleBy(input, 3)) {
            return "Fizz";
        }
        if (isDivisibleBy(input, 5)) {
            return "Buzz";
        }
        return String.valueOf(input);

    }
    private static boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }



}
