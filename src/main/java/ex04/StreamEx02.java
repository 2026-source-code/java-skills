package ex04;

import java.util.List;

public class StreamEx02 {
    public static void main(String[] args) {

        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8, 9)
        );

        // [ [1,2,3], [4,5], [6,7,8,9] ]
        // [1,2,3], [4,5], [6,7,8,9]
        // 1,2,3    4,5    6,7,8,9
        // 1,2,3,4,5,6,7,8,9
        // [1,2,3,4,5,6,7,8,9]
        List<Integer> newList = matrix.stream()
                .flatMap(list -> list.stream())
                .filter(i-> i>5)
                .toList();

        for (Integer i : newList){
            System.out.println(i);
        }
    }
}
