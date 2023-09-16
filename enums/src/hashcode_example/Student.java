package hashcode_example;

import java.util.Objects;

public class Student {
    String username;

    public Student(String username) {
        this.username = username;
    }

    @Override                                               // eger overrideni komentara alsaq hashcodeler deyishecek..
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(username, student.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
