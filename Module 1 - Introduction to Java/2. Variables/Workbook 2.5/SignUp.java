import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        System.out.println( "\nWhat's your first name?" );
        String firstName = scan.nextLine();



        System.out.println( "\nWhat's your last name?" );
        String lastName = scan.nextLine();


        System.out.println( "\nHow old are you?" );
        int age = scan.nextInt();


        System.out.println( "\nPlease create a username" );
        scan.nextLine();
        String username = scan.nextLine();


        System.out.println( "\nWhat city are you from?" );
        String city = scan.nextLine();


        System.out.println( "\nWhat country is that located in?" );
        String country = scan.nextLine();


        System.out.println( 
            "\nFirst Name: "+ firstName+
            "\nLast Name: "+ lastName+
            "\nAge: "+ age+ 
            "\nUsername: "+ username+
            "\nCity: "+ city+
            "\nCountry: "+ country );


            scan.close();


        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
    }
}
