package ex03;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeEx01 {
    public static void main(String[] args) {
        // 1. 로컬 데이트 타임 (UTC로 세팅되있음)
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);

        // 2. 존을 설정해서 시간 만들기 (X)
        ZonedDateTime now2 = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println(now2);

        // 3. Instant 시간 (O)
        Instant now3 = Instant.now();
        System.out.println(now3);

        // 4. Timestamp (1/1000) -> 시간이 변환되서 출력됨!! (x)
        Timestamp now4 = new Timestamp(1000 * 60 * 60 * 10);
        System.out.println(now4);

        Timestamp now5 = new Timestamp(System.currentTimeMillis()+1000 * 60 * 60 * 10);
        System.out.println(System.currentTimeMillis());
        System.out.println(now5);
    }
}
