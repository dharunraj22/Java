package practice;

public class Student {

    private static final int MIN_MARK = 0;
    private static final int MAX_MARK = 100;
    private static final int PASS_MARK = 50;
    
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        setId(id);
        setName(name);
        setMarks(marks);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks<MIN_MARK || marks>MAX_MARK) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        this.marks = marks;
    }

    public boolean hasPassed() {
        return this.marks > PASS_MARK;
    }

    public char getGrade() {
        if (marks > 90) return 'A';
        if (marks > 80) return 'B';
        if (marks > 70) return 'C';
        if (marks > 60) return 'D';
        if (marks > PASS_MARK) return 'E';
        return 'F';
    }

}
