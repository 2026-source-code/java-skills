package ex01;

import lombok.Data;

@Data
class UserDTO {
    private int id;
    private String username;
    private String email;
}

public class CopyEx01 {
    public static void main(String[] args) {
        // 1. setter
        User user = new User();
        user.setId(3);
        user.setUsername("ssar");
        user.setEmail("ssar@nate.com");

        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        System.out.println(dto);
    }
}






