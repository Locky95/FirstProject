

public class DiceGame extends Die {

    public static void main(String args []) {

        Die die = new Die();

        int roll1 = die.Roll();
        int roll2 = die.Roll();

        int totalRoll = roll1 + roll2;

        if (totalRoll == 7) {
            System.out.print("you win");
        } else
            System.out.print("you lose");


    }
}
