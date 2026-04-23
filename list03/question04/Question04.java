/********************************************************************************************************************************************
4. Referência this

Problema: Implemente uma classe AgendamentoConsulta com atributos como paciente, especialidade, data e valor.

Guia de implementação:
    - Use this para diferenciar parâmetros de atributos com o mesmo nome.
    - Crie um método que atualize vários campos do agendamento de uma só vez.
    - Crie outro método que retorne o próprio objeto para permitir chamadas encadeadas.
    - No main, monte exemplos em que o uso de this fique evidente e necessário.
********************************************************************************************************************************************/

class AppointmentScheduling {
    public String patient;
    public String specialty;
    public String date;
    public float value;

    public AppointmentScheduling(String patient, String specialty, String date, float value) {
        updateWithThis(patient, specialty, date, value);
    }

    // Crie um método que atualize vários campos do agendamento de uma só vez.
    public void updateWithThis(String patient, String specialty, String date, float value) {
        // Use this para diferenciar parâmetros de atributos com o mesmo nome.
        this.patient = patient;
        this.specialty = specialty;
        this.date = date;
        this.value = value;
    }
    public void updateWithoutThis(String patient, String specialty, String date, float value) {
        patient = patient;
        specialty = specialty;
        date = date;
        value = value;
    }

    // Crie outro método que retorne o próprio objeto para permitir chamadas encadeadas.
    public void displayScheduling() {
        System.out.println("---------- AGENDAMENTO ----------");
        System.out.println("Paciente: " + patient);
        System.out.println("Especialidade: " + specialty);
        System.out.println("Data: " + date);
        System.out.println("Valor: R$ " + value);
        System.out.println("---------------------------------");
    }
}

class Main {
    public static void main(String []args) {
        // No main, monte exemplos em que o uso de this fique evidente e necessário.
        AppointmentScheduling a1 = new AppointmentScheduling("Vanesa", "Cardiologia", "10/05/2026", 200f);
        a1.displayScheduling();

        a1.updateWithThis("Vanessa", "Dermatologia", "15/05/2026", 180f);
        a1.displayScheduling();

        AppointmentScheduling a2 = new AppointmentScheduling("Veronica", "Ortopedia", "20/05/2026", 250f);
        a2.displayScheduling();

        a2.updateWithoutThis("Verônica", "Neurologia", "22/05/2026", 300f);
        a2.displayScheduling();
    }
}