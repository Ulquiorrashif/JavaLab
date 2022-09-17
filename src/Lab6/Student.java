package Lab6;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    private int age;

    public Student(int iDNumber, String name, int age) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.age = age;
    }



    @Override
    public int compareTo(Student o) {
        return this.iDNumber-o.iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
