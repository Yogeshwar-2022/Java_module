import java.util.Random;
import java.util.Scanner;

public class Java_Exercise_2 {
    public static void main(String[] args) {

        // user's choice
        System.out.print("Your choice : ");
        Scanner sc = new Scanner(System.in);
        String user_ch = new String(sc.next().toLowerCase().trim());
        System.out.println("You chose : " + user_ch);

        // computer's choice
        String[] arr = {"paper","stone","scissors"};
        Random rn = new Random();
        int rn_ind = rn.nextInt(arr.length);
        String comp_ch = new String(arr[rn_ind]);
        System.out.println("Computer chose : " + comp_ch);

        // Driver program
        if (user_ch.equals(comp_ch)){
            System.out.println("it's a tie");
        }
        else if (user_ch.equals("paper") && comp_ch.equals("stone")){
            System.out.println("You win");
        }
        else if (user_ch.equals("paper") && comp_ch.equals("scissors")){
            System.out.println("You lose");
        }
        else if (user_ch.equals("stone") && comp_ch.equals("paper")){
            System.out.println("You lose");
        }
        else if (user_ch.equals("stone") && comp_ch.equals("scissors")){
            System.out.println("You win");
        }
        else if (user_ch.equals("scissors") && comp_ch.equals("stone")){
            System.out.println("You lose");
        }
        else if (user_ch.equals("scissors") && comp_ch.equals("paper")){
            System.out.println("You win");
        }
        else {
            System.out.println("You can only choose between --> paper , stone , scissors");
        }

    }
}