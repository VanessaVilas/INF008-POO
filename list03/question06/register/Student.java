package register;

// Em uma classe Aluno, defina alguns membros public e outros private.
public class Student {
    public String name;
    public String registration;
    private float average;

    public Student(String name, String registration) {
        this.name = name;
        this.registration = registration;
        this.average = 0;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        if (average < 0 || average > 10) {
            System.out.println("Média inválida!");
            return;
        }
        this.average = average;
    }
}