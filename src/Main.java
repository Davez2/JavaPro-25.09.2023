public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(400);
        dog.swim(11);
        Cat cat = new Cat();
        cat.run(200);
        cat.swim(5);

        System.out.println("Animals: " + Animal.getCount());
        System.out.println("Dogs: " + Dog.getCount());
        System.out.println("Cats: " + Cat.getCount());
    }
}
