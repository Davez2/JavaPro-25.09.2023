package Competition;

public class WallTask implements Obstacle{
    public int height;
    public WallTask(int height){
        this.height = height;
    }
    @Override
    public int getHeight() {
        return height;
    }
    @Override
    public int getLength() {
        return 0;
    }
    @Override
    public void overcome() {
        System.out.println("Overcame wall");
    }
}