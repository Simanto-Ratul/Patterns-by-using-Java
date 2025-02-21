import java.util.Scanner;

public class FindTheNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pcnumber = (int) (Math.random() * 100);
        int usernumber = 0;
        System.out.println("Hi there!  :)");

        do {
            System.out.print("Guess a number(1-100) : ");
            usernumber = sc.nextInt();

            if (usernumber == pcnumber) {
                System.out.println("WOOHOO!!!...That's amazing. You choose the correct number.");
            } else if (usernumber > pcnumber) {
                System.out.println("The number is too large. Please enter small number. :(");
            } else {
                System.out.println("The number is too small. Please enter large number. :(");
            }
        } while (usernumber >= 0);
        System.out.println("PC generatred number is : " + pcnumber);
    }
}
