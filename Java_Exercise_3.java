import java.util.Random;
import java.util.Scanner;

class Game {
    int num;
    private int noOfGuesses;

    public int getNoOfGuesses() { // getter --> no of guesses
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) { // setter --> no of guesses
        this.noOfGuesses = noOfGuesses;
    }

    public Game() { // Constructor --> random no. generator
        Random rand = new Random();
        num = rand.nextInt(10);
    }

    public int takeUserInput(){ // method --> take user input
        System.out.print("Guess The Number : ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public boolean isCorrect(int userNum,int compNum){ // method --> is correct
        if(userNum<compNum){
            System.out.println("go higher");
        }else if(userNum>compNum){
            System.out.println("go low");
        }
        return userNum == compNum;
    }
}

public class Java_Exercise_3 {
    public static void main(String[] args) {
        Game G = new Game();
        G.setNoOfGuesses(3);

        for (int i = 0; i < G.getNoOfGuesses();i++){
            if(G.isCorrect(G.takeUserInput(),G.num)){
                System.out.println("Congratulations! you win");
                break;
            }
        }

        System.out.println("Computer Chose : " + G.num);
    }
}
