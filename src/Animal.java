public class Animal {
    private static int count;

    public Animal() {
        count++;
    }

    public void run(int distance) {
        System.out.println(getClass().getSimpleName() + " ran " + distance + "m");
    }

    public void swim(int distance) {
        System.out.println(getClass().getSimpleName() + " swam " + distance + "m");
    }

    public static int getCount() {
        return count;
    }
}
