import java.util.ArrayList;
import java.util.List;

class Course {
    String name;
    // Modele Curso e Modulo com composição, de forma que módulos existam apenas dentro de um curso.
    // Composição (módulos só existem dentro do curso)
    private List<Module> modules = new ArrayList<>();
    // Modele Curso e Professor com agregação, permitindo que um professor exista independentemente do curso.
    // Agregação (professor existe fora do curso)
    private Teacher teacher;
    // Inclua alunos matriculados no curso sem usar herança nem interfaces.
    // Alunos (associação simples)
    private List<Student> students = new ArrayList<>();

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void addModule(String title) {
        modules.add(new Module(title)); // criado dentro → composição
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void displayCourse() {
        System.out.println("Curso: " + name);

        teacher.display();

        System.out.println("Módulos:");
        for (Module m : modules) {
            m.display();
        }

        System.out.println("Alunos:");
        for (Student s : students) {
            s.display();
        }
    }
}