import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> szamok = new ArrayList<>();

        //Legnagyobb szamot megtalalni

        szamok.add(6666);
        szamok.add(19);
        szamok.add(0);
        szamok.add(103);
        szamok.add(101);

        int max = 0;
        
        for(int x : szamok){

            if(x >= szamok.get(0) && x >= szamok.get(1) && x >= szamok.get(2)){
                max = x;
            }
        }

        System.out.println(max);

    }
}
