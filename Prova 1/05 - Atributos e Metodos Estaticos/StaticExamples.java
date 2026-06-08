import java.util.Vector;

class MathUtils {
    public static final double PI = 3.141516;
}

class DateUtils {
    public static boolean validateDate(String date) {
        // Implement date validation
        return true;
    }
}

class Student {
    private String name;
    private int id;
    private static int studentCount = 0;

    public Student(String name) {
        this.name = name;
        this.id = studentCount++;
    }

    public void display() {
        System.out.println(id + " - " + name);
    }
}

public class StaticExamples {
    public static void main(String []args) {
        Student s1 = new Student("JOAO");
        Student s2 = new Student("MARIA");
        s1.display();
        s2.display();

        System.out.println(DateUtils.validateDate("31/02/2026"));
        System.out.println(MathUtils.PI);

        Vector<String> words = new Vector<String>();
        words.add("Hello");
        words.add("IFBA");
        words.add("ADS");
        words.add("Salvador");

        System.out.println(words.get(0) + "-" + words.get(1) + "-" + words.get(2) + "-" + words.get(3));

        System.out.println(String.join("-", words));
    }
}
