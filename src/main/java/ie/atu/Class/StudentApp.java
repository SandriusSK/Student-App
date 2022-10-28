package ie.atu.Class;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        //Created first instance of name
        System.out.println("Please enter student name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        ClassRoom studentRect = new ClassRoom();
        studentRect.setName(name);
        System.out.println("You entered : " + studentRect.getName());

        System.out.println("Please enter student email");
        String email = input.nextLine();
        studentRect.setEmail(email);
        System.out.println("You entered : " + studentRect.getEmail());

        System.out.println("Please enter student course");
        String course = input.nextLine();
        studentRect.setCourse(course);
        System.out.println("You entered : " + studentRect.getCourse());

        //Created second instance of name
        ClassRoom studentRect2 = new ClassRoom();
        System.out.println("Please enter second student name");
        String name2 = input.nextLine();
        studentRect2.setName(name2);
        System.out.println("You entered : " + studentRect2.getName());

        System.out.println("Please enter second student email");
        String email2 = input.nextLine();
        studentRect2.setEmail(email2);
        System.out.println("You entered : " + studentRect2.getEmail());

        System.out.println("Please enter second student course");
        String course2 = input.nextLine();
        studentRect.setCourse(course2);
        System.out.println("You entered : " + studentRect2.getCourse());
        ;
    }
}
