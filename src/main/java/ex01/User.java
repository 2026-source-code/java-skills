package ex01;

import lombok.Data;

@Data // getter, setter, toString
public class User {
    private int id;
    private String username;
    private String email;
}
