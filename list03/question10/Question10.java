/********************************************************************************************************************************************
10. Métodos privados

Problema: Implemente uma classe ValidadorCadastro para cadastro de participantes de um evento.

Guia de implementação:
    - Crie um método público cadastrarParticipante que use métodos privados para validar nome, e-mail, CPF e idade mínima.
    - Os métodos privados não devem ser acessados diretamente fora da classe.
    - Faça o método público retornar mensagens claras sobre falhas de validação.
    - No main, teste entradas válidas e inválidas e mostre o fluxo de validação
********************************************************************************************************************************************/

class Main {
    public static void main(String[] args) {
        RegistrationValidator r1 = new RegistrationValidator();

        // No main, teste entradas válidas e inválidas e mostre o fluxo de validação
        r1.registerParticipant("Vanessa", "vanessa@email.com", "12345678901", 20);
        r1.registerParticipant("Va", "vanessa@email.com", "12345678901", 20);
        r1.registerParticipant("Vanessa", "emailinvalido", "12345678901", 20);
        r1.registerParticipant("Vanessa", "vanessa@email.com", "123", 20);
        r1.registerParticipant("Vanessa", "vanessa@email.com", "12345678901", 16);
        r1.registerParticipant("Va", "emailinvalido", "123", 16);
    }
}