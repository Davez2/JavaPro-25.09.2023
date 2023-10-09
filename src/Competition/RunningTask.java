package Competition;

public class RunningTask implements Obstacle{
    public int length;

    public RunningTask(int length) {
        this.length = length;
    }
    @Override
    public int getHeight() {
        return 0;
    }
    @Override
    public int getLength() {
        return length;
    }
    public void overcome() {
        System.out.println("Overcame running track");
    }
}
