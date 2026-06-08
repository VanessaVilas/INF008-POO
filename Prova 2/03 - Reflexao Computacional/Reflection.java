import java.lang.reflect.Constructor;

class Student
{
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sleep(int hours) {
        System.out.printf("%s is sleeping for %d hours\n", name, hours);
    }
}

public class Reflection
{
    public static void main(String []args) throws Exception {
        Student s1 = new Student("Joao", 20);
        s1.sleep(8);

        String className = "Student";

        Class classOp1 = s1.getClass();            // Forma 1
        Class classOp2 = Student.class;            // Forma 2
        Class classOp3 = Class.forName(className); // Forma 3

        System.out.println(classOp1 + ", " + classOp2 + ", " + classOp3);

        System.out.println(classOp3.getSimpleName());
        Constructor[] constructors = classOp3.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getParameterCount() + " params");
            System.out.println("Params:");
            for (Class type : constructor.getParameterTypes()) {
                System.out.println("\t" + type.getSimpleName());
            }
        }
    }
}
