import java.util.Scanner;
public class DrawingShapes{
    public static void main(String[] args) {
        
        //Local Variables
        char input; // shape input
        int height; //height for rectangle
        int length; //length of sides
        int i;
        int j;
        int k;

        //Creates scanner object
        Scanner scnr = new Scanner(System.in);
        
        //Asks the user for shape and exits program if a wrong input was entered
        System.out.println("Enter a shape: r t h o p");
        input = scnr.nextLine().charAt(0);
        if (input != 'r' && input != 't' && input != 'h' && input != 'o' && input != 'p') {
            System.out.println("Invalid Shape");
            System.out.println("Goodbye!");
            System.exit(0);
        }

        //Asks the user for length and exits program if a wrong input was entered
        System.out.println("Enter a length");
        length = scnr.nextInt();
        if(length <= 1){
            System.out.println("Length must be greater than 1");
            System.out.println("Goodbye!");
            System.exit(0);
        }
        
        // Prints out the rectangle shape
        if (input == 'r'){
            //Asks the user for height of rectangle and exits program is wrong a input is entered
            System.out.println("Enter a height");
            height = scnr.nextInt();
            if (height <= 1){
                System.out.println("Height must be greater than 1");
                System.out.println("Goodbye!");
                System.exit(0);
            }
            System.out.println("Below is a " + length + " by " + height + " rectangle of *");
            System.out.println();
            for(i = 0; i < height; i++){ //Loops the amount of times for the height
                for(j = 0; j < length; j++){
                    System.out.print("*"); //prints the length of stars
                }
                System.out.println(""); //Goes to next line
            }
            System.out.println();
        }

        // Prints out the triangle shape
        if (input == 't'){
            System.out.println("Below is a triangle with two side lengths of " + length + " *");
            System.out.println();
            for(i = 1; i <= length; i++){ // loops the amount of times of the length 
                for(j = 1; j <= (length - i); j++){
                    System.out.print(" "); //prints out the spaces
                }
                for(k = 1; k <= (2* i - 1); k++){ 
                    System.out.print("*"); // prints the *
                }
                System.out.println();
            }
            System.out.println();
        }

        // Prints out the hexagon shape
        if(input == 'h'){
            System.out.println("Below is a hexagon with side lengths of " + length + " *");
            System.out.println();
            //Prints the top half and middle of hexagon
            for(i = 1; i <= length; i++){ //loops for the amount of time as the length
                for(j = 1; j <= length - i; j++){
                    System.out.print(" "); //prints spaces
                }
                for(k = 1; k <= length + 2 * i - 1; k++){
                    System.out.print("*"); //prints *
                }
                System.out.println();
            }
            //Prints the bottom half of hexagon
            for (i = length - 1; i >= 1; i--){ //loops for amount of bottom half
                for(j = 1; j <= length - i; j++){ //prints spaces
                    System.out.print(" ");
                }
                for(k = 1; k <= length + 2 * i - 1; k++){
                    System.out.print("*"); //prints *
                }
                System.out.println();
            }
            System.out.println();
        }

        // Prints out the octagon shape
        if(input == 'o'){
            System.out.println("Below is an octagon with side lengths of " + length + " *");
            System.out.println();
            //Prints top part of octagon
            for(i = 1; i < length; i++){ //loops for the top part
                for(j = 1; j <= length - i; j++){
                    System.out.print(" "); //prints spaces
                }
                for(k = 1; k <= length + 2 * i - 1; k++){
                    System.out.print("*"); //prints *
                }
                System.out.println();
            }
            //Prints middle part of octagon
            for(i = 1; i <= length; i++){ //loops amount of of time for middle rows
                System.out.print(" "); //prints spaces
                for(k = 1; k <= length + 2 * length - 2; k++){
                    System.out.print("*"); //prints *
                }
                System.out.println();
            }
            //Prints bottom part of octagon
            for(i = length - 1; i >= 1; i--) { //loops amount of time for bottom
                for(j = 1; j <= length - i; j++) {
                    System.out.print(" "); //prints spaces
                }
            for (k = 1; k <= length + 2 * i - 1; k++) {
                System.out.print("*"); //prints *
                }
            System.out.println();
            }
            System.out.println();
        }

        //Prints out pentagon shape
        if(input == 'p'){
            System.out.println("Below is a pentagon with 4 side lengths of " + length + " *");
            System.out.println();
            
            //Prints top point
            for(j = 1; j <= length - 1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
            //prints the slanted slides
            for(i = 1; i < length; i++){ //loops amount of times as side lengths
                for(j = 1; j <= (length - 1 - i); j++){
                    System.out.print(" "); //prints spaces
                }
                for(k = 1; k <= (1 + 2 * i); k++){
                    System.out.print("*"); //prints *
                }
                System.out.println();
            }
            //prints the bottom
            for (i = 1; i < length; i++) { // loops amount of times for bottom
                for (k = 1; k <= 2 * length - 1; k++) {
                    System.out.print("*"); //prints *
                }
                System.out.println();
            }
            System.out.println();
        }
        
        scnr.close();
    }
}