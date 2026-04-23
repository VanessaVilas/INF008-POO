// Modele Curso e Modulo com composição, de forma que módulos existam apenas dentro de um curso.
class Module {
    private String title;

    public Module(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Módulo: " + title);
    }
}