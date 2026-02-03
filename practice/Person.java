package practice;

import java.util.Objects;

public class Person {
    private final String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } 
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Person p = (Person)obj;
        return this.id.equals(p.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
