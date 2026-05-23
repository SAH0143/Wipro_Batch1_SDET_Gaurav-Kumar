package Day10_class_Assingment;
import java.util.*;
public class MergeArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> firstNumbers = new ArrayList<>();

        firstNumbers.add(1);
        firstNumbers.add(2);
        firstNumbers.add(3);

        ArrayList<Integer> secondNumbers = new ArrayList<>();

        secondNumbers.add(3);
        secondNumbers.add(4);
        secondNumbers.add(5);

        ArrayList<Integer> mergedNumbers = new ArrayList<>();


        for(Integer value : firstNumbers) {

            if(!mergedNumbers.contains(value)) {

                mergedNumbers.add(value);
            }
        }


        for(Integer value : secondNumbers) {

            if(!mergedNumbers.contains(value)) {

                mergedNumbers.add(value);
            }
        }

        System.out.println(mergedNumbers);
	}
}
