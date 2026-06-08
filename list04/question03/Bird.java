class Bird extends Animal implements Flyable {
    public Bird(String name) {
        this.name =  name;
    }

    @Override
    public void breathe() {
        System.out.println("Passáro está respirando!");
    }

    @Override
    public void fly() {
        System.out.println("Passáro está voando!");
    }
}