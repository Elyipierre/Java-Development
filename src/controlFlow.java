import java.util.Scanner;

public class controlFlow {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
         int inputtednNum = scanner.nextInt();

        if (inputtednNum < 5) {
            System.out.println("Enjoy the good in life a friend brings you");
        } else {
            System.out.println("Reach for the stars, but keep your feet on the ground");
        }
    }
}
