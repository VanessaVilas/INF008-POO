class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        this.name =  name;
    }

    @Override
    public void breathe() {
        System.out.println("Peixe está respirando!");
    }

    @Override
    public void swim() {
        System.out.println("Peixe está nadando!");
    }
}