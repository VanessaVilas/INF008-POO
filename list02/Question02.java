// Questão 2: Rede Social - Gerenciamento de Posts 
package com.rede.social.entity; 
 
public class Post { 
    private String conteudo; 
    private String autor; 
    private int curtidas; 
    private boolean publico; 
     
    public Post(String conteudo, String autor) { 
        this(conteudo, autor, true); 
    } 
     
    public Post(String conteudo, String autor, boolean publico) { 
        // TODO: Implementar com validações 
        validarConteudo(conteudo);
        validarConteudo(autor);

        this.conteudo = conteudo;
        this.autor = autor;
        curtidas = 0;
        this.publico = publico;
    } 
     
    // TODO: Sobrecarregar curtir(): void e curtir(int quantidade): void 
    // Ambos devem usar um método privado para validar quantidade 
    public void curtir() {
        curtir(1);
    }
    public void curtir(int quantidade) {
        if (validarQuantidade(quantidade)) {
            curtidas += quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade inválida");
        }
    }
    private boolean validarQuantidade(int quantidade) {
        return quantidade > 0;
    }
     
    private void validarConteudo(String conteudo) { 
        if (conteudo == null || conteudo.trim().isEmpty()) { 
            throw new IllegalArgumentException("Conteúdo não pode ser vazio"); 
        } 
    } 
} 
// Pergunta: Complete a classe implementando: (1) Construtores que evitem duplicação usando this,  (2) Métodos curtir sobrecarregados que 
// compartilhem lógica de validação através de método privado, (3) Validações adequadas nos construtores. 
