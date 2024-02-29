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
            output = output.concat("Fizz");
        }
        if (input % 5 == 0) {
            output = output.concat("Buzz");
        }
        if (!output.equals("")) {
            return output;
        }
        return String.valueOf(input);
    }



}
