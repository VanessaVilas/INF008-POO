// Questão 1: Sistema de Gerenciamento de Contatos
// Implemente uma classe Contact com os seguintes requisitos:
class Contact {
    // Atributos privados: name (String), phone (String), email (String) 
    private String name;
    private String phone;
    private String email;

    // Dois construtores sobrecarregados: um que recebe apenas name e phone, outro que recebe todos os três atributos
    public Contact(String name, String phone) {
        this(name, phone, "");
    }
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Métodos públicos getters e setters para todos os atributos 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Um método displayInfo() que retorna uma string formatada com todas as informações
    public void displayInfo() {
        System.out.println("Nome: " + getName() + ", Telefone: " + getPhone() + ", Email: " + getEmail());
    }

    // Um método updateContact(String phone, String email) que atualiza os dados
    public void updateContact(String phone, String email) {
        setPhone(phone);
        setEmail(email);
    }
}

// Desafio adicional: Crie uma classe AddressBook que gerencia um array de 10 objetos do tipo Contact e implemente métodos para:
class AddressBook {
    private Contact[] contacts = new Contact[10];
    private int count = 0;

    // Adicionar contato (passando objeto Contact como parâmetro). Valide se há espaço para inserir um novo contato
    public void addContact(Contact newContact) {
        if (count < 10) {
            contacts[count++] = newContact;
            System.out.println("Contato adicionado.");
        } else {
            System.out.println("Agenda cheia!");
        }
    } 

    // Buscar contato por nome
    public void searchNameContact(String name) {
        System.out.println("=== Buscar Contato ===");

        boolean found = false;
        for (int i = 0; i < count; i++)
            if (contacts[i].getName().equals(name)) {
                contacts[i].displayInfo();
                found = true;
            }
        
        if (!found)
            System.out.println("Nenhum contato encontrado.");
    }

    // Listar todos os contatos
    public void listAllContacts() {
        if (count == 0) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            System.out.println("=== Lista de Contatos ===");
            for (int i = 0; i < count; i++)
                contacts[i].displayInfo();
        }
    }
}

public class Question01 {
    public static void main(String []args) {
        AddressBook a1 = new AddressBook();

        Contact c1 = new Contact("Ana", "1111-1111");
        Contact c2 = new Contact("Carlos", "2222-2222", "carlos@email.com");

        a1.addContact(c1);
        a1.addContact(c2);

        a1.listAllContacts();

        a1.searchNameContact("Ana");

        c1.updateContact("9999-9999", "ana@email.com");
        c1.displayInfo();
    }
}