package ex01;

import lombok.Data;

@Data
class UserDTO3 {
    private int id;
    private String username;
    private String email;

    public UserDTO3(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
    }
}

public class CopyEx03 {
    public static void main(String[] args) {
        // 1. setter
        User user = new User();
        user.setId(1);
        user.setUsername("ssar");
        user.setEmail("ssar@nate.com");

        UserDTO3 dto3 = new UserDTO3(user);
        System.out.println(dto3);
    }
}
