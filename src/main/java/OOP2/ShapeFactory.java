package OOP2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShapeFactory {

    public List<Shape> shapeFactory(String[] a) {
        List<Shape> list = new ArrayList<>();
        Scanner sc = new Scanner(a[0]);
        int n = sc.nextInt();
        int dem = 1;

        while (n-- != 0) {
            sc = new Scanner(a[dem++]);
            String s = sc.nextLine();
            int[] x = Arrays.stream(s.split("\\s"))
                    .filter(t -> !t.equals(""))
                    .mapToInt(Integer::valueOf)
                    .toArray();
            if (x.length == 3) list.add(new Circle(x[0], x[1], x[2]));
            if (x.length == 6) list.add(new Triangle(x[0], x[1], x[2], x[3], x[4], x[5]));
            if (x.length == 8) list.add(new Quadrilateral(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7]));
        }
        return list;
    }
}
