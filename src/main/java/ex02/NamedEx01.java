package ex02;

import lombok.Data;

@Data
class User {
    private int id;
    private String username;
    private String password;
    private String type; // 선생, 학생

    // 학생
    private String classRoom; // 교실
    private String classYear; // 학년

    // 선생
    private String subject; // 담당 과목
    private String teacherName; // 이름
    
    private User(){}

    public static User createTeacher(int id, String username, String password, String subject, String teacherName){
        User user = new User();
        user.id = id;
        user.username = username;
        user.password = password;
        user.type = "선생";
        user.subject = subject;
        user.teacherName = teacherName;
        
        return user;
    }

    public static User createStudent(int id, String username, String password, String classRoom, String classYear){
        User user = new User();
        user.id = id;
        user.username = username;
        user.password = password;
        user.type = "학생";
        user.classRoom = classRoom;
        user.classYear = classYear;

        return user;
    }
}

public class NamedEx01 {
    public static void main(String[] args) {
        User student = User.createStudent(1, "ssar", "1234", "101", "3");
        User teacher = User.createTeacher(2, "cos", "1234", "수학", "코스");

        System.out.println(student);
        System.out.println(teacher);
    }
}
