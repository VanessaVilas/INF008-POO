// Modele Curso e Professor com agregação, permitindo que um professor exista independentemente do curso.
class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Professor: " + name);
    }
}