import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingCheck {

    public static boolean isSorted(List<Integer> list) {
        return isSorted(list, list.size());
    }

    public static boolean isSorted(List<Integer> list, int index) {
        if (index < 2) {
            return true;
        } else if (list.get(index - 2).compareTo(list.get(index - 1)) > 0) {
            return false;
        } else {
            return isSorted(list, index - 1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The size of Array");
        int size = s.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=size;i++)
        {
            System.out.println("Enter Value "+i);
            list.add(s.nextInt());
        }
        System.out.println(list);

        System.out.println(isSorted(list));
    }
}
