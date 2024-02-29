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
        String output = "";
        if (input % 3 == 0) {
            output += "Fizz";
        }
        if (input % 5 == 0) {
            output += "Buzz";
        }
        if (input % 3 != 0 && input % 5 != 0) {
            output = String.valueOf(input);
        }
        return output;
    }



}
