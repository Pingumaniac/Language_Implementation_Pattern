package sql;

import java.util.Arrays;
import java.util.Date;

public class Person {
    public String name;
    public String SSN;
    public Date birthDay;
    public int age;
    public String[] roles;
    public Date[] vacation;

    public Person() {
        ;
    }

    public Person(String name, String SSN, Date birthDay, int age) {
        this.name = name;
        this.SSN = SSN;
        this.birthDay = birthDay;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", SSN='" + SSN + '\'' +
                ", birthDay=" + birthDay +
                ", age=" + age +
                ", roles=" + (roles == null ? null : Arrays.asList(roles)) +
                ", vacation=" + (vacation == null ? null : Arrays.asList(vacation)) +
                '}';
    }
}
