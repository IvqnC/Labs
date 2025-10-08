/* Ivan Cheung | 9/22/25 
   This program calculates and displays a table of x and y values for the function y = 20 * |sin(x)|, 
   where the user specifies the starting x value, how much to increment x by, and how many data points to generate.
*/

import java.util.Scanner;
public class StarGraph {
        public static void main(String[] Args){
        
        //Instance Variables
        int elemsInArray;
        double xMin;
        double increment;
        int i;

        //Scanner created
        Scanner scnr = new Scanner(System.in);
        
        //System asks the user to enter the amount of x values
        System.out.print("Please enter the number of x values to process: ");
        elemsInArray = scnr.nextInt();
        //If the user enters an invalid amount, the program writes an error and terminates
        if (elemsInArray < 1){
            System.out.println("The number of x values must be an integer greater than 0.");
            System.exit(0);
        }

        //System asks the user for the minimum x value
        System.out.print("Enter a minimum value for x: ");
        xMin = scnr.nextDouble();

        //System asks the user how much they want to increase the x value by
        System.out.print("Enter the amount to increment x: ");
        increment = scnr.nextDouble();
        //If the user enters an invalid amount, the program writes and error message and terminates
        if(increment <= 0){
            System.out.println("The increment must be a decimal number greater than 0.");
            System.exit(0);
        }

        //Two arrays are created to store the x and y values
        double[] xValues = new double[elemsInArray];
        double[] yValues = new double[elemsInArray];

        //Sets the values in the x array with the increments
        for(i = 1; i < elemsInArray; i++){
            xValues[0] = xMin;
            xValues[i] = xValues[i - 1] + increment;
        }

        //System sets the values in the y array for the coresponding x values
        for(i = 0; i < elemsInArray; i++){
            //finds the y value by doing the sin of the x value and multiplying by 20
            yValues[i] = (20 * Math.abs(Math.sin(xValues[i])));
        }
        
        //System prints out the all the x and y values from the first to last index in the arrays
        System.out.println("Values");
        for(i = 0; i < elemsInArray; i++){
        System.out.printf("x: %.3f, y: %.3f%n", xValues[i], yValues[i]);
        }

    scnr.close();
    }
}