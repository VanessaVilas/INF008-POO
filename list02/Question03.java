// Questão 3: Sistema de Matrícula - Gestão de Alunos 
package edu.universidade.core; 
 
public class Aluno { 
    private String matricula; 
    private String nome; 
    private int idade; 
    private String curso; 
     
    // TODO: Criar 3 construtores sobrecarregados: 
    // 1. Apenas matricula e nome 
    public Aluno(String matricula, String nome) {
        this(matricula, nome, 0, null);
    }
    // 2. Matricula, nome e idade   
    public Aluno(String matricula, String nome, int idade) {
        this(matricula, nome, idade, null);
    }
    // 3. Matricula, nome, idade e curso 
    public Aluno(String matricula, String nome, int idade, String curso) {
        if (validarMatricula(matricula)) {
            throw new IllegalArgumentException("Matrícula inválida");
        } else {
            this.matricula = matricula;
            this.nome = nome;
            this.idade = idade;
            this.curso = curso;
        }
    }
    // Um deve chamar o outro para evitar duplicação 
     
    public String getMatricula() { return matricula; } 
    public String getNome() { return nome; } 
    // Necessários para identificação do aluno
    private int getIdade() { return idade; }
    private String getCurso() { return curso; }
    // TODO: Definir quais getters são realmente necessários 
     
    // TODO: Criar método privado validarMatricula(String matricula) 
    public boolean validarMatricula(String matricula) {
        return matricula == null || matricula.trim().isEmpty();
    }
} 
 
// Pergunta: Implemente os construtores encadeados e determine quais getters devem ser públicos. Justifique a escolha de visibilidade baseado no 
// princípio de menor privilégio. 