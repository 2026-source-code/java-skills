package ex05;

import java.util.Optional;

public class OptEx01 {

    static String download(int i){
        if(i % 2 == 0){
            return null;
        }else{
            return i+"";
        }
    }

    public static void main(String[] args) {
        // 1. 옵셔널 of 메서드
        String name = "ssar";
        Optional<String> opt = Optional.of(name); // 선물박스안에 값이 들어감 (null 못들어감)
        System.out.println(opt.get());

        // 2. 옵셔널 nullable
        String name2 = "cos";
        Optional<String> opt2 = Optional.ofNullable(name2);

        if(opt2.isPresent()){
            System.out.println(opt2.get());
        }

        if(opt2.isEmpty()){
            throw new RuntimeException("name2에 값이 없어요");
        }

        // 3. orElse
        String name3 = download(2); // 짝수 = null, 홀수 = 값이있음
        Optional<String> opt3 = Optional.ofNullable(name3);

        // 3.2 orElse
        String value2 = opt3.orElse("0");
        System.out.println("value2 : "+value2);

        // 3.1 orElseThrow
        String value1 = opt3.orElseThrow(() -> new RuntimeException("opt3에 값이 없어요"));
        System.out.println("value1 : "+value1);
        

    }
}
