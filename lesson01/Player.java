class Player {
    private String name;
    private int power;

    public Player(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return name + ", " + power;
    }

    public void fight(Player other) {
        if (power > other.power) {
            System.out.println(name + " wins");
            power += 10;
            other.power -= 10;
        } else if (power < other.power) {
            System.out.println(other.name + " wins");
            power -= 10;
            other.power += 10;
        }
    }

    public static void main(String args[]) {
        Player p1 = new Player("JOAO", 100);
        Player p2 = new Player("MARIA", 110);

        p1.fight(p2); // equals to p2.fight(p1)

        System.out.println(p1);
        System.out.println(p2);
    }

    // Compilando e executando Player.java:
    // javac Player.java
    // java Player
}
