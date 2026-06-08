class Student
{
    private String name;
    private long enrollmentId;
    private int id;

    public void forgetNotebook() {
        System.out.println(name + " forgot his/her notebook :(((((");
    }
    public void study(int hours) {
        System.out.println(name + " is studying for " + hours + " hours!");
    }
}

class Exemplo1
{
    public static void main(String args[]) {
        new Student(); // Cria um objeto perdidão na memória
        Student s2 = new Student(); // Caso mais comum
        Student s3 = null;
        System.out.println(s3);
        System.out.println(s3 == null);

        s2.study(5);
    }
}
