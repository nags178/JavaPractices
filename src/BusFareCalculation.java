import java.util.Scanner;

public class BusFareCalculation {
    static String busStops[] = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
    static int paths[] = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        String source, destination;
       // source = validateInputs(scannerObj);
       // destination = validateInputs(scannerObj);
       source = scannerObj.next();
       destination = scannerObj.next();
       getFare(source,destination);
       scannerObj.close();
    }

    static void getFare(String source, String destination){
        int sourceIndex = 0, destinationIndex = 0, totalFare = 0;
        for(int i=0;i<busStops.length;i++){
            if(source.toLowerCase() == busStops[i].toLowerCase()){
                sourceIndex = i;
            }
            if(destination.toLowerCase() == busStops[i].toLowerCase()){
                destinationIndex = i;
            }
        }
        for(int i=sourceIndex;i<busStops.length;i++){
            if(i != (busStops.length-1)){
                if(i)
                totalFare = totalFare + paths[i + 1]/200;
            }
        }
    }

    static int validateInputs(Scanner scanner) {
        
        int number;
        do {
            System.out.print("Please enter a positive number: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.printf("\"%s\" is not a valid number. Please enter valid number\n", input);
            }
            number = scanner.nextInt();
        } while (number < 0);

        System.out.printf("You have entered a positive number %d.\n", number);
        return number;
    }
}
