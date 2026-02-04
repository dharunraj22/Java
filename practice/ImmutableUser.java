package practice;
import java.util.List;

public final class ImmutableUser {
    private final String id;
    private final String name;
    private final List<String> courses;

    public ImmutableUser(String id, String name, List<String> courses) {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (courses == null) {
            throw new IllegalArgumentException("Courses cannot be null");
        }
        this.id = id;
        this.name = name;
        this.courses = List.copyOf(courses);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getCourses() {
        return this.courses;
    }
}
