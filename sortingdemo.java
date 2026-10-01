import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rollno;
    int marks;

    Student(String n, int r, int m){
        this.name = n;
        this.rollno = r;
        this.marks = m;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollno - o.rollno;
    }

    @Override
    public String toString() {
        return rollno + " " + name + " "+ marks;
    }
}
class CustomComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.marks!=o2.marks)
            return o2.marks - o1.marks;
        return o1.rollno - o2.rollno;
    }
}
public class sortingdemo {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(23);
        i.add(12);
        i.add(14);
        i.add(15);
        i.add(16);
        i.sort(null); //ascending order
        System.out.println(i);
      i.sort(Collections.reverseOrder()); //descending order
        System.out.println(i);

        ArrayList<Student>st=new ArrayList<>();

        st.add(new Student("rahul",1,100));
        st.add(new Student("Nitesh",210,20));
        st.add(new Student("Neetesh",7,80));
        st.add(new Student("Nilesh",9,70));
        st.add(new Student("Mitesh",20,80));
        st.sort(null);

        System.out.println(st);

        st.sort(new CustomComparator());
        System.out.println(st);

    }
        

        
}