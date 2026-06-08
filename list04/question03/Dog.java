class Dog extends Animal implements Swimmable {
    public Dog(String name) {
        this.name =  name;
    }

    @Override
    public void breathe() {
        System.out.println("Cachorro está respirando!");
    }

    @Override
    public void swim() {
        System.out.println("Cachorro está nadando!");
    }
}