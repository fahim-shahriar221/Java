package student;
import java.util.ArrayList;
import java.util.List;

interface StudentManagement {
    void addStudent(Student student) throws DuplicateStudentException;
    void updateStudent(int id, String newName, int newNum, String newCourse);
    void deleteStudent(int id) throws StudentNotFoundException;
    Student searchStudentByName(String name);
}
class StudentManagementSystem implements StudentManagement {
    private List<Student> students = new ArrayList<>();{
        students.add(new Student(99,"Mehedi",56886,"OOP","ICE"));
        students.add(new Student(98,"Zisan",543386,"OOP","ICE"));
        students.add(new Student(97,"Abid",236886,"EEE","ICE"));
        students.add(new Student(69,"Iqram",56886,"ENG","ICE"));
        students.add(new Student(67,"Ayon",569776,"EEE","ICE"));
        students.add(new Student(4,"Sadman",989898,"OOP","ICE"));
    }
    @Override
    public void addStudent(Student student) throws DuplicateStudentException {
        if (students.stream().anyMatch(s -> s.getId() == student.getId())) {
            throw new DuplicateStudentException("Student with ID " + student.getId() + " already exists.");
        }
        students.add(student);
        System.out.println("Student added successfully!");
    }

    @Override
    public void updateStudent(int id, String newName, int newNum, String newCourse) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.update();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    @Override
    public void deleteStudent(int id) throws StudentNotFoundException {
        Student student = students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
        if (student == null) {
            throw new StudentNotFoundException("Student with ID " + id + " not found.");
        }
        students.remove(student);
        System.out.println("Student deleted successfully!");
    }

    @Override
    public Student searchStudentByName(String name) {
        return students.stream().filter(s -> s.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            students.forEach(Student::view);
        }
    }
}
class DuplicateStudentException extends Exception {
    public DuplicateStudentException(String message) {
        super(message);
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
