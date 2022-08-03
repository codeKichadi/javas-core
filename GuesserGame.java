import java.util.Scanner;

class Guesser{
    int key;
    public int guesserKey(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter guesser key value");
        key = sc.nextInt();
        return  key;
    }
}
class Player{
    int pNum;
    public int playerNumber(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player : " + i +" number " );
        pNum = sc.nextInt();
        return pNum;
    }
}
class Umpire{
    int guesserNum;
    int playerNum1,playerNum2,playerNum3;

    public void umpGuesserNum(){
        Guesser gc = new Guesser();
        guesserNum = gc.guesserKey();

    }
    public void umpPlayerNum(){
        Player pr1 = new Player();
        Player pr3 = new Player();
        Player pr2 = new Player();

        playerNum1 = pr1.playerNumber(1);
        playerNum2 = pr2.playerNumber(2);
        playerNum3 = pr3.playerNumber(3);
    }

    public void compare(){
      String  p1 = (playerNum1==guesserNum) ? "a": "";
      String  p2 = (playerNum2==guesserNum) ? "b": "";
      String  p3 = (playerNum3==guesserNum) ? "c": "";

      String  res = p1 + p2 + p3;
        
        switch (res){
            case "a" -> System.out.println("Winner is Player 1");
            case "b" -> System.out.println("Winner is Player 2");
            case "c" -> System.out.println("Winner is Player 3");
            case "ab"-> System.out.println("Winner is Player 1 & 2");
            case "bc" -> System.out.println("Winner is Player 2 & 3");
            case "ac" -> System.out.println("Winner is Player 1 & 3");
            case "abc" -> System.out.println("every Player guessed right answer");
            default -> System.out.println("No player guessed correct key value");

        }
    }
}
public class GuesserGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Umpire ump = new Umpire();
        ump.umpGuesserNum();
        ump.umpPlayerNum();
        ump.compare();

    }

}