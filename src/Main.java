import com.google.common.primitives.Doubles;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double arr[] = { 1.2, 2.3, 3.4, 4.5, 5.6 };
        List<Double> myList = Doubles.asList(arr);
        System.out.println(myList);

        // :)

        double arr2[] = { 3.2, 5.5, 7.6 };
        List<Double> myList2 = Doubles.asList(arr2);
        System.out.println(myList2);
    }
}