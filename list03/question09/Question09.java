/********************************************************************************************************************************************
9. Atributos e métodos static

Problema: Desenvolva uma classe GeradorProtocolo usada por um sistema de atendimento.

Guia de implementação:
    - Use um atributo static para controlar a numeração sequencial global dos protocolos.
    - Implemente métodos static utilitários para formatar protocolos e validar códigos.
    - Mostre que vários objetos compartilham o mesmo contador global.
    - No main, crie diferentes atendimentos e comprove o comportamento compartilhado.
********************************************************************************************************************************************/
class Main {
    public static void main(String[] args) {
        // No main, crie diferentes atendimentos e comprove o comportamento compartilhado.
        GeneratorProtocol a1 = new GeneratorProtocol();
        GeneratorProtocol a2 = new GeneratorProtocol();
        GeneratorProtocol a3 = new GeneratorProtocol();

        System.out.println("A1: " + a1.getProtocol());
        System.out.println("A2: " + a2.getProtocol());
        System.out.println("A3: " + a3.getProtocol());

        // Mostre que vários objetos compartilham o mesmo contador global.
        System.out.println("Contador global: " + GeneratorProtocol.getGlobalCounter());
        System.out.println("A1: " + a1.getGlobalCounter());
        System.out.println("A2: " + a2.getGlobalCounter());
        System.out.println("A3: " + a3.getGlobalCounter());

        String test = "PROT-00010";
        System.out.println("Validação: " + GeneratorProtocol.validateProtocol(test));
    }
}