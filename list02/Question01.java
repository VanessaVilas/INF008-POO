// Questão 1: Sistema Financeiro - Contas Bancárias 
package br.com.banco.model; 
 
public class ContaBancaria { 
    private String numero; 
    private double saldo; 
    private String tipo; // "CORRENTE" ou "POUPANCA" 
     
    public ContaBancaria(String numero, String tipo) { 
        this.numero = numero; 
        this.tipo = tipo; 
        this.saldo = 0.0; 
    } 
     
    public ContaBancaria(String numero, String tipo, double saldoInicial) { 
        // TODO: Implementar chamada a outro construtor 
        this(numero, tipo);
        // TODO: Validar saldoInicial >= 0 
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        } else {
            System.out.println("Saldo inicial inválido!");
        }
    } 
     
    // TODO: Criar métodos sobrecarregados para depositar 
    // depositar(double valor) e depositar(double valor, String descricao) 
    public void depositar(double valor) {
        if (validarValor(valor)) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido!");   
        }
    }
    public String depositar(double valor, String descricao) {
        depositar(valor);
        return "Descrição: " + descricao;
    }
     
    private boolean validarValor(double valor) { 
        return valor > 0; 
    }
     
    // TODO: Criar getters APENAS para os atributos necessários 
    public double getSaldo() {
        return saldo;
    }
    public String getTipo() {
        return tipo;
    }
} 
// Pergunta: Implemente os construtores e métodos seguindo rigorosamente: (1) Um construtor deve chamar o outro usando this, (2) Sobrecarregue o 
// método depositar mantendo a validação centralizada, (3) Use private para o método de validação, (4) Exponha apenas getters necessários. 