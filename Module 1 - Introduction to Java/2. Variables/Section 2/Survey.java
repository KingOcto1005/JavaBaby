import java.util.Scanner;

public class Survey {

    public static void main(String[] args) {
        
        Scanner scanThizz = new Scanner( System.in );

        System.out.println( "Welcome! THis is my first survey in Java!" );
        int counter = 0;


        System.out.println( "\nWhat is your name?" );

        String user = scanThizz.nextLine();
        counter ++;


        System.out.println( "\nHow much do you spend on weed?" );

        double weedBill = scanThizz.nextDouble();
        counter++;



        System.out.println( "\nHow many days a week do you work out?" );

        int workouts = scanThizz.nextInt();
        counter ++;


        System.out.println( "\nThank you "+ user + " for answering all " +counter+ " of my questions!" );
        scanThizz.close();
    };
};