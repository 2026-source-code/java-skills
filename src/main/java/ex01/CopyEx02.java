package ex01;

import lombok.Data;

@Data
class UserDTO2 {
    private int id;
    private String username;
    private String email;

    public UserDTO2(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
}

public class CopyEx02 {
    public static void main(String[] args) {
        // 1. setter
        User user = new User();
        user.setId(1);
        user.setUsername("ssar");
        user.setEmail("ssar@nate.com");

        UserDTO2 dto2 = new UserDTO2(user.getId(), user.getUsername(), user.getEmail());
        System.out.println(dto2);
    }
}
