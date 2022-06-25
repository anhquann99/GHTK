import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/*
Cho 2 danh sách chứa các số có thể duplicate. Viết chương trình lấy ra 1 danh sách duy nhất chứa tất cả các số đấy, không chứa phần tử duplicate và danh sách kq được sắp xếp theo thứ tự từ bé đến lớn.
VD:
    Danh sách 1: 1,4,6,9,11,2,7,3,8
    Danh sách 2: 1,3,2,4,5,10,11,6
    Danh sách kq: 1,2,3,4,5,6,7,8,9,10,11
*/

public class Sort {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 4, 6, 9, 11, 2, 7, 3, 8};
        Integer[] arr2 = {1, 3, 2, 4, 5, 10, 11, 6};
        // Merge 2 array
        List<Integer> list = new ArrayList(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        Object[] arr = list.toArray();

        // Add to TreeSet
        TreeSet<Object> tree = new TreeSet<Object>();
        for (int i = 0; i < arr.length; i++) {
            tree.add(arr[i]);
        }

        arr = new Object[tree.size()];
        tree.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}