public class Cat extends Animal {
    public Cat() {
        super();
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Cats can only run up to 200m");
            return;
        }

        super.run(distance);
    }


    @Override
    public void swim(int distance) {
        System.out.println("Cats cannot swim");
    }
}
