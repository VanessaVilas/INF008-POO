/********************************************************************************************************************************************
6. Operadores de visibilidade: public e private

Problema: Organize um pequeno sistema acadêmico em pacotes distintos para cadastro e secretaria.

Guia de implementação:
    - Crie ao menos dois pacotes.
    - Em uma classe Aluno, defina alguns membros public e outros private.
    - Crie classes em pacotes diferentes e mostre, por meio de código, quais acessos são permitidos e quais precisam ser evitados.
    - O programa deve evidenciar o papel do encapsulamento sem usar herança.
********************************************************************************************************************************************/

import secretary.SecretariatSystem;

class Main {
    public static void main(String[] args) {
        SecretariatSystem system = new SecretariatSystem();
        system.processStudent();
    }
}