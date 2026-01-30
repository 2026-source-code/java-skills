package ex01;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class Board{ // 1
    private int id;
    private String title;
    private String content;
    private List<Reply> replies = new ArrayList<>();
}

@Data
class Reply{ // N
    private int id;
    private String comment;
}

@Data
class DetailDTO {
    private int id;
    private String title;
    private String content;
    private List<String> comments = new ArrayList<>();

    public DetailDTO(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.comments = board.getReplies().stream() // r1, r2, r3
                .map(r-> r.getComment())
                .limit(2)
                .toList();

    }
}


public class CopyEx04 {
    public static void main(String[] args) {
        // 1. setter
        Reply r1 = new Reply();
        r1.setId(1);
        r1.setComment("댓글1");

        Reply r2 = new Reply();
        r2.setId(2);
        r2.setComment("댓글2");

        Reply r3 = new Reply();
        r3.setId(3);
        r3.setComment("댓글3");

        Board board = new Board();
        board.setId(1);
        board.setTitle("제목1");
        board.setContent("내용1");
        board.setReplies(List.of(r1, r2, r3));

        // 2. 옮기기 (객체복사)
        DetailDTO dto = new DetailDTO(board);
        System.out.println(dto);
    }
}
