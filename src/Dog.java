public class Dog extends Animal {

    public Dog() {
        super();
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Dogs can only run up to 500m");
            return;
        }

        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Dogs can only swim up to 10m");
            return;
        }

        super.swim(distance);
    }
}
