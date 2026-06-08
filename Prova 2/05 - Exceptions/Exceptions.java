import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class EmptyStudentNameException extends Exception {
    public EmptyStudentNameException() {
        super("Empty student's name");
    }
}

class Exceptions
{
    private static void processEnrollment(String studentName) throws EmptyStudentNameException {
        if (studentName.isEmpty()) {
            throw new EmptyStudentNameException();
        }
    }
    public static void main(String []args)
        // throws Exception
        // throws //ClassNotFoundException,
        //        NoSuchMethodException,
        //        InstantiationException,
        //        IllegalAccessException,
        //        InvocationTargetException
    {
        String className = "java.lang.String";
        try {
            Class<?> clazz = Class.forName(className);
            Constructor constructor = clazz.getConstructor(String.class);
            String myString = (String) constructor.newInstance("JOAO");
            System.out.println(myString);
        } catch(ClassNotFoundException e) {
            System.out.printf("Class %s doesn't exist!\n", className);
        } catch(Exception e) {
            System.out.println("NoSuchMethodException");
        } finally {
            // Clean up
        }

        try {
            processEnrollment("");
        } catch(EmptyStudentNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
