import java.util.Scanner;

public class DeveloperTeaTime {
    //Task: Announce Developer Tea Time
    //Step 1: Wait for tea time
    //Step 2: Print out "It's Developer Tea Time!"
    // To use a function, we can just use its name or label; for example, announceDeveloperTeaTime()
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer team time...");
        System.out.println("Type in a random word and press Enter to start developer tea time: ");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }

    public static void main(String[] args) {
       System.out.println("Welcome to your new job");

        //call the function
        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Get promoted!");
    }
}
