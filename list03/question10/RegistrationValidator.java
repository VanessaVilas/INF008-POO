class RegistrationValidator {
    private String name;
    private String email;
    private String cpf;
    private int age;

    // Crie um método público cadastrarParticipante que use métodos privados para validar nome, e-mail, CPF e idade mínima.
    // Faça o método público retornar mensagens claras sobre falhas de validação.
    public void registerParticipant(String name, String email, String cpf, int age) {
        if (!validateName(name)) {
            System.out.println("Erro: nome inválido.");
        }
        if (!validateEmail(email)) {
            System.out.println("Erro: e-mail inválido.");
        }
        if (!validateCpf(cpf)) {
            System.out.println("Erro: CPF inválido.");
        }
        if (!validateAge(age)) {
            System.out.println("Erro: idade mínima não atendida.");
        }

        if (validateName(name) && validateEmail(email) && validateCpf(cpf) && validateAge(age)) {
            System.out.println("Cadastro realizado com sucesso!");
        }
    }

    // Os métodos privados não devem ser acessados diretamente fora da classe.
    private boolean validateName(String name) {
        return name != null && name.trim().length() >= 3;
    }

    private boolean validateEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    private boolean validateCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    private boolean validateAge(int age) {
        return age >= 18;
    }
}