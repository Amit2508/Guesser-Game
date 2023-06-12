package GameProject;
import java.util.*;
class Guesser
{
    int guessNumber ;
    int guessNumber()
     {
        System.out.println("Guesser! please guess the number");
        Scanner scan = new Scanner(System.in);
        guessNumber = scan.nextInt();
        return guessNumber;

     }
}

class Players
{
    int guessNumber;
    int guessNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player kindly enter the number");
        guessNumber= scan.nextInt();
        return guessNumber;
    }
}

class Umpire
{
    int numberFromGuesser;
    int nummberFromPlayer1;
    int nummberFromPlayer2;
    int nummberFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g= new Guesser();
        numberFromGuesser=g.guessNumber();

    }
    void collectNumFromPlayer()
    {
        Players p1 =new Players();
        Players p2 =new Players();
        Players p3 =new Players(); 
        nummberFromPlayer1 =p1.guessNumber();
        nummberFromPlayer2 =p3.guessNumber();
        nummberFromPlayer3 =p3.guessNumber();   
    }

    void compare()
    {
        if (numberFromGuesser==nummberFromPlayer1)
        {
            if(numberFromGuesser==nummberFromPlayer2 && numberFromGuesser==nummberFromPlayer3)
            {
                System.out.println("Game is tied");
                
            }
            else if(numberFromGuesser==nummberFromPlayer2)
            {
                System.out.println("player 1 and player 2 are winner");
            }

            else if(numberFromGuesser==nummberFromPlayer3)
            {
                System.out.println("player 1 and player 3 are winner");

            }
            else{
                System.out.println("Player 1 won the Game");
            }

        }
        else if (numberFromGuesser==nummberFromPlayer2)
        {
            if(numberFromGuesser==nummberFromPlayer3)
            {
                System.out.println(" Player 2 and Player 3 are winner");
            }

            else
            {
                System.out.println("Player 2 is winner");
            }
        }
        else if(numberFromGuesser==nummberFromPlayer3)
        {
            System.out.println("Player 3 won the Game");
        }

        else
        {
            System.out.println("All players lost the Game");
        }
    }

}
public class Launch1 
{
    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire u= new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }    
}
