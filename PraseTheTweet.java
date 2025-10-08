import java.util.Scanner;
public class PraseTheTweet{
     public static void main(String[] args){
        
        //Creating scanner class that reads users input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a tweet below: ");
        String tweet = scanner.nextLine();
        
        //Declaring variables with right data types
        String type;
        String detail;
        String location;
        double longitude;
        double latitude;
        int start;
        int finish;
        
        //Indexing scanner input to find substring values and triming white spaces

        //type value:
        start = tweet.indexOf("#typ");
        finish = tweet.indexOf(";", start);
        type = tweet.substring(start + 5, finish).trim();
        tweet = tweet.substring(finish + 1);
        type = type.toUpperCase();

        //detail value:
        start = tweet.indexOf("#det");
        finish = tweet.indexOf(";", start);
        detail = tweet.substring(start + 5, finish).trim();
        tweet = tweet.substring(finish + 1);
        detail = detail.replace(",", "-");

        //location value:
        start = tweet.indexOf("#loc");
        finish = tweet.indexOf(";", start);
        location = tweet.substring(start + 5, finish).trim();
        tweet = tweet.substring(finish + 1);
        location = location.replace(",", "-");

        //latitude value:
        start = tweet.indexOf("#lat");
        finish = tweet.indexOf(";", start);
        String latStr = tweet.substring(start + 5, finish).trim();
        latitude = Double.parseDouble(latStr);
        tweet = tweet.substring(finish + 1);

        //longitude value:
        start = tweet.indexOf("#lng");
        finish = tweet.indexOf(";", start);
        String lngStr = tweet.substring(start + 5, finish).trim();
        longitude = Double.parseDouble(lngStr);

        //Printing out each substring statements
        System.out.println("Type:\t\t" + type);
        System.out.println("Detail:\t\t" + detail);
        System.out.println("Location:\t" + location);
        System.out.println("Latitude:\t" + latitude);
        System.out.println("Longitude:\t" + longitude);

        scanner.close();
    }
}