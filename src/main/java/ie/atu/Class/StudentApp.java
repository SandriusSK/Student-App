package ie.atu.Class;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("Please enter student name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("You entered : " + name);

        System.out.println("Please enter student email");
        String email = input.nextLine();
        System.out.println("You entered : " + email);


    }
}
