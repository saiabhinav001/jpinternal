import java.util.*;

// Class implementing Comparable for natural ordering
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student other) {
        // Natural ordering based on ID
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
}

// Comparator for custom ordering based on grade
class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGrade(), s1.getGrade()); // Descending order
    }
}

// Comparator for custom ordering based on name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName()); // Alphabetical order
    }
}

public class ComparableAndComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 88.5));
        students.add(new Student(1, "Bob", 75.3));
        students.add(new Student(2, "Charlie", 92.4));
        students.add(new Student(4, "David", 80.1));

        // Sorting using Comparable (natural ordering by ID)
        System.out.println("Sorting by natural ordering (ID):");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        // Sorting using Comparator (custom ordering by grade)
        System.out.println("Sorting by grade (descending):");
        Collections.sort(students, new GradeComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        // Sorting using Comparator (custom ordering by name)
        System.out.println("Sorting by name (alphabetical):");
        Collections.sort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
