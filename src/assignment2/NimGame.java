import java.util.Scanner;

public class NimGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 7;
        System.out.println("The current total is " + total);
        while (total>0) {
            int humannumber = 0;
            while (humannumber != 1 && humannumber !=2) {
                System.out.println("Enter your number (1 or 2):");
                humannumber = in.nextInt();

                if (humannumber != 1 && humannumber != 2) {
                    System.out.println("You can only pick 1 or 2");
                }
            }
            total = total-humannumber;
            System.out.println("The new total is " + total);

            if (total <= 0) {
                System.out.println("You took the last one! You lose!");
            }
            else {
                int computernumber = (int) (Math.random()*2)+1;
                total = total-computernumber;
                System.out.println("I pick " + computernumber + ", so the new total is: " + total);
                if (total<=0) {
                    System.out.println("The total is now " + total + ". I lose!");
                }
            }
        }
    }
}
