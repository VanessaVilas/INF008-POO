// Crie ao menos dois pacotes.
package secretary;

import register.Student;

// Crie classes em pacotes diferentes e mostre, por meio de código, quais acessos são permitidos e quais precisam ser evitados.
public class SecretariatSystem {
    public void processStudent() {
        Student s1 = new Student("Vanessa", "2026001");

        System.out.println("Nome: " + s1.name);
        System.out.println("Matrícula: " + s1.registration);

        // O programa deve evidenciar o papel do encapsulamento sem usar herança.
        // s1.average = 9f;
        // System.out.println(s1.average);

        s1.setAverage(9f);
        System.out.println("Média: " + s1.getAverage());
    }
}