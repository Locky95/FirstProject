import java.util.*;

public class Die {

    Random r = new Random();


    ArrayList<Integer> die = new ArrayList<>();

    public void faceValue() {
        die.add(1);
        die.add(2);
        die.add(3);
        die.add(4);
        die.add(5);
        die.add(6);
    }
    public int Roll()
    {
        int x = die.get(r.nextInt(die.size() ));
        return x;
    }
}
