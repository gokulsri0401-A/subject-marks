import java.util.Scanner;

public class admi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"Math", "Science", "English", "History", "Computer"};
        int total = 0;

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter mark for " + subjects[i] + ": ");
            int mark = scanner.nextInt();
            total += mark;
        }

        System.out.println("Total marks: " + total);
        System.out.println("Average: " + total / 5.0);

        scanner.close();
    }
}
