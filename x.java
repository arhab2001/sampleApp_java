/**
 * x
 */
import java.util.Scanner;

public class x {
    
    public static void println( String _message){

        System.out.println(_message);
        

    }

    public static void println( int _message){

        System.out.println(_message);
        

    }

    public static void print( String _message){

        System.out.print(_message);
        

    }

    public static void print( int _message){

        System.out.print(_message);
        

    }

    public static String input(String _message){

        Scanner input = new Scanner(System.in);
        System.out.print(_message);

        return input.nextLine();
        

    }
}
