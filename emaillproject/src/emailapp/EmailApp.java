package emailapp;
import java.util.Scanner;


public class EmailApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        String firstName;
        String lastName;

        System.out.print("Please enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Please enter your last name: ");
        lastName = input.nextLine();



        Email em1 = new Email(firstName, lastName);
        System.out.println(em1.showInfo());

        input.close();
    }
}
