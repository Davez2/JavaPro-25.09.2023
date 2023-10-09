package Competition;

public class Human implements Participant{
    public int maxRunDistance;
    public int maxJumpHeight;
    public Human(int maxRunDistance, int maxJumpHeight){
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
        System.out.println("Human is running");
    }

    @Override
    public void jump() {
        System.out.println("Human jumped");
    }
}