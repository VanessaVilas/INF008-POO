/********************************************************************************************************************************************
1. Classes, objetos e referências

Problema: Implemente um sistema de reserva de salas de estudo. Deve existir uma classe Sala com código, capacidade e status de ocupação, e 
uma classe Reserva que armazene a referência para a Sala reservada e o nome do responsável.

Guia de implementação:
    - Crie objetos Sala e Reserva separadamente.
    - Faça duas variáveis de referência apontarem para a mesma Sala e demonstre, no programa principal, o efeito de alterar o estado por uma 
      referência e observar pela outra.
    - Implemente um método que troque a sala associada a uma reserva.
    - No main, mostre claramente a diferença entre copiar referência e criar novo objeto.
********************************************************************************************************************************************/

// Crie objetos Sala e Reserva separadamente.
class Room {
    public String code;
    public int capacity;
    public boolean busy;

    public Room(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;
        busy = false;
    }
}

class Reservation {
    public Room reservedRoom;
    public String responsibleName;

    public Reservation(Room reservedRoom, String responsibleName) {
        this.reservedRoom = reservedRoom;
        this.responsibleName = responsibleName;

        reservedRoom.busy = true;
    }

    // Implemente um método que troque a sala associada a uma reserva.
    public void changeRoom(Room reservedRoom) {
        this.reservedRoom.busy = false;

        this.reservedRoom = reservedRoom;
        reservedRoom.busy = true;
    }
}

class Main {
    public static void main(String []args) {
        Room r1 = new Room("D108", 40);
        // Faça duas variáveis de referência apontarem para a mesma Sala e demonstre, no programa principal, o efeito de alterar o estado por 
        // uma referência e observar pela outra.
        Room ref1 = r1;
        Room ref2 = r1;

        System.out.println("Antes de alterar:");
        System.out.println(ref1.capacity);
        System.out.println(ref2.capacity);

        ref1.capacity = 30;

        System.out.println("Depois de alterar usando ref1:");
        System.out.println(ref1.capacity);
        System.out.println(ref2.capacity);
        
        // Teste do método que troca a sala associada a uma reserva.
        Reservation reserv1 = new Reservation(r1, "Sandro");

        System.out.println("Antes de trocar a sala:");
        System.out.println(reserv1.reservedRoom.code);

        Room r2 = new Room("H01", 20);
        reserv1.changeRoom(r2);

        System.out.println("Depois de trocar a sala:");
        System.out.println(reserv1.reservedRoom.code);

        // No main, mostre claramente a diferença entre copiar referência e criar novo objeto.
        Room copyRef = r2;

        Room newRoom = new Room(r2.code, r2.capacity);

        System.out.println("Antes de alterar:");
        System.out.println(r2.capacity);
        System.out.println(newRoom.capacity);

        copyRef.capacity = 10;

        System.out.println("Depois de alterar copyRef:");
        System.out.println(r2.capacity);
        System.out.println(newRoom.capacity);
    }
}