package ua.ithilell.hw8.members;

public class RunningTrack implements Obstacle{

    private final String typeObstacle = "RunningTrack";
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Member member) {
        member.run(distance, typeObstacle);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
