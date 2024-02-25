import java.util.Scanner;

public class LoopsB8CtoF {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        var trash = "";
        boolean done = false;

        // fahrenheit = (celsius * 9/5) + 32

        Scanner scanner = new Scanner(System.in);

        //Input loop
        do {
            System.out.println("Enter the temp for Celsius: ");

            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                scanner.nextLine();

                if(celsius >=0 || celsius <=0){
                    fahrenheit = ((celsius * 1.8) + 32);
                    System.out.printf("The temp in Fahrenheit is: " + fahrenheit);
                    done = true;
                }
            } else {
                //error message
                trash = scanner.nextLine();
                System.out.println("You entered an invalid value: " + trash);
            }

        }while (!done);

    }
}
