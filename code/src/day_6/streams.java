package day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class streams {
    static void main() {
        ArrayList<Integer> ls = new ArrayList<>(List.of(445345, 345, 345, 334, 534, 5345, 35, 3523, 4, 45, 7, 467, 58, 56, 58, 56, 45, 623, 42, 2));
        ls.stream().forEach(a->System.out.print(a + ", "));
        List<Integer> result = ls.stream()
                .filter(a -> a%2==0)
                .toList();
        System.out.println();
        System.out.println("---------------------------");
        result.stream().forEach(a->System.out.print(a + ", "));
        List<String> names = List.of("Emma", "Liam", "Olivia", "Noah", "Ava",
                "Oliver", "Sophia", "Elijah", "Isabella", "James"
        );
        System.out.println();
        System.out.println("--------------------------");
        List<String > res = names.stream().filter(a-> a.startsWith("E")).toList();
        Collections.sort(names);
        System.out.println(names);
        System.out.println(res);
    }
}
