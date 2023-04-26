package ua.ithilell.hw8.members;

public class Wall implements Obstacle{
    private final String typeObstacle = "RunningTrack";
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Member member) {
        member.jump(height, typeObstacle);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
