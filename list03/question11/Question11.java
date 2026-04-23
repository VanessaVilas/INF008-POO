/********************************************************************************************************************************************
11. Composição vs agregação

Problema: Modele um sistema de cursos livres com as classes Curso, Modulo, t1essor e Student.

Guia de implementação:
    - Modele Curso e Modulo com composição, de forma que módulos existam apenas dentro de um curso.
    - Modele Curso e t1essor com agregação, permitindo que um t1essor exista independentemente do curso.
    - Inclua Students matriculados no curso sem usar herança nem interfaces.
    - No main, demonstre por meio de cenários o que acontece quando um curso é removido: quais objetos deixam de fazer sentido e quais 
      continuam existindo
********************************************************************************************************************************************/

class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Sandro");
        Student s1 = new Student("Vanessa");
        Student s2 = new Student("João");

        Course c1 = new Course("Java Básico", t1);

        c1.addModule("Introdução");
        c1.addModule("POO");

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);

        c1.displayCourse();

        System.out.println("--- Removendo curso ---");
        c1 = null;

        // No main, demonstre por meio de cenários o que acontece quando um curso é removido: quais objetos deixam de fazer sentido e quais 
        // continuam existindo
        System.out.println("Objetos ainda existentes:");

        t1.display(); // continua existindo (AGREGAÇÃO)

        s1.display();   // continua existindo
        s2.display();   // continua existindo

        // Módulos NÃO existem mais
        // porque só existiam dentro do curso (COMPOSIÇÃO)
    }
}