package student;
interface Entity {
    void add();
    void update();
    void delete();
    void view();
}
abstract class AbstractEntity implements Entity {
    // Default method for deleting an entity
    public void delete() {
        System.out.println("Entity deleted successfully.");
    }
    // Default method for viewing an entity
    public void view() {
        System.out.println("Displaying entity details...");
    }
}
class Student extends AbstractEntity {
    private int id;
    private String name;
    private int num;
    private String course;
    private String dept;

    public Student(int id, String name, int num, String course, String dept) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.course = course;
        this.dept = dept;
    }

    // Getters and setters for the attributes
    public int getId() { return id; }
    public String getName() { return name; }
    public int getNum() { return num; }
    public String getCourse() { return course; }
    public String getDept() { return dept; }

    public void add() {
        System.out.println("Student added successfully!");
    }

    public void update() {
        System.out.println("Student updated successfully!");
    }

    @Override
    public void view() {
        System.out.println("\nStudent ID: " + id +
                "\nName: " + name +
                "\nContact Number: " + num +
                "\nCourse: " + course +
                "\nDepartment: " + dept +
                "\n-----------------------------------------" +
                "\n-----------------------------------------");
    }

    @Override
    public void delete() {
        super.delete();
    }
    @Override
    public String toString() {
        return "Student ID: " + id +
                "\nName: " + name +
                "\nContact Number: " + num +
                "\nCourse: " + course +
                "\nDepartment: " + dept +
                "\n-----------------------------------------";
    }

}
