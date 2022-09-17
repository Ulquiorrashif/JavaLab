package Lab6;

public class Start {
    public static void main(String[] args) {
        Sorting sort=new Sorting();
        Student s1=new Student(123,"Tolik",18);
        Student s2=new Student(13,"Lolik",20);
        Student s3=new Student(14,"Ivan",19);
        Student s4=new Student(100,"Marina",18);
        Student s5=new Student(50,"Tolik",18);
        Student[] mas  = {s1,s2,s3,s4,s5};
        sort.insertionSort(mas);
        for (Student e :mas)
            System.out.println(e.toString());

    }
}
