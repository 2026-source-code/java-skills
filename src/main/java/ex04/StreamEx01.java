package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream은 임시 수도관!!
 */
public class StreamEx01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        // 1. 가공
        List<Integer> newList = list.stream() // 개울에 던지기
                .map(i -> i * 2) // 가공 혹은 연산 (N번) : 중간연산
                .toList(); // 수집

//        for(Integer i : newList){
//            System.out.println(i);
//        }

        // 2. filter
        List<Integer> newList2 = list.stream()
                .map(i -> i + 1) // 2,3,4,5
                //.peek(i -> System.out.print(i+" "))
                .filter(i -> i < 3)
                .toList();

        System.out.println();
        for (Integer i : newList2) {
            System.out.print(i + " ");
        }

        // 3. limit
        System.out.println();
        List<Integer> newList4 = list.stream()
                .limit(2)
                .toList();
        for (Integer i : newList4) {
            System.out.print(i+" ");
        }
    }
}
