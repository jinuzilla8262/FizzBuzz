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
        if (input % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(input);
    }



}
