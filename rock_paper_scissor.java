import java.util.Scanner;
import java.util.Random;


public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose 0 for rock , 1 for paper , 2 for scissor ");
        int input = sc.nextInt();
        if (input == 0 || input == 1 ||input == 2) {

            Random rn = new Random();
            int choice = rn.nextInt(3);


            if (choice == 0) {
                System.out.println("computer choice is rock");
            } else if (choice == 1) {
                System.out.println("computer choice is paper");
            } else if (choice == 2) {
                System.out.println("computer chose  scissors");
            }

            if (input == 0) {
                System.out.println("you chose rock");
            } else if (input == 1) {
                System.out.println("you chose paper");
            } else if (input == 2) {
                System.out.println("you chose scissors");
            }



            if (choice == input) {
                System.out.println("draw");
            } else if (input == 0 && choice == 1 || input == 1 && choice == 2 || input == 2 && choice == 0) {
                System.out.println("the computer wins");

            } else {
                System.out.println("you won");
            }

        }
        else if (input != 0 || input != 1 ||input != 2) {
            System.out.println("enter a valid choice");
        }


    }
}
