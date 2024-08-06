
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String GenComp(){
        String[] options = {"rock","r","paper","p","scissor","s"};
        Random random = new Random();
        int gen = random.nextInt(options.length);
        String comp = options[gen];
        return comp;
    }

    public static String gamePlay(String user, String computer){
        if(user.equals(computer)){
            return "Its a tie";
        } else if ((user.equals("rock" ) && computer.equals("scissor")) ||
                ((user.equals("r" ) && computer.equals("s")) ||
                        (user.equals("s" ) && computer.equals("p")) ||
                 (user.equals("scissor") && computer.equals("paper")) ||
                        (user.equals("p" ) && computer.equals("r")) ||
                         (user.equals("paper") && computer.equals("rock")))) {
            return "You win";
        }else {
        return "Computer won";
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your weapon: (Rock, paper or Scissors)");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next().toLowerCase();

        String startcomp = GenComp();
        System.out.println("Computer chose: "+ startcomp);
        String answ = gamePlay(userInput,startcomp);
        System.out.println("Result: "+ answ);

    }
}
