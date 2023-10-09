package Competition;

public class Cat implements Participant {
    public int maxRunDistance;
    public int maxJumpHeight;
    public Cat(int maxRunDistance, int maxJumpHeight){
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int getMaxJumpDistance() {
        return maxJumpHeight;
    }
    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumped");
    }
}