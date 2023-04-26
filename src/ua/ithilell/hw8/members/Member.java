package ua.ithilell.hw8.members;

public class Member {

    private boolean isParticipant = true;
    private final String typeMember;
    private String name;
    private int maxHeight;
    private int maxDistance;

    public Member(String typeMember, String name, int maxHeight, int maxDistance) {
        this.typeMember = typeMember;
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    public void run(int distance, String typeObstacle){
        if (distance<=maxDistance) {
            System.out.println("Учасник " + typeMember + " - " + name + " пройшов перешкоду " + typeObstacle + " на дистанції " + distance);

        } else {
            System.out.println("Учасник " + typeMember + " - " + name + " не пройшов перешкоду " + typeObstacle + " на дистанції " + distance + ". Пройдено " + maxDistance);
            setParticipant(false);
        }

    }
    public void jump(int height, String typeObstacle){
        if (height<=maxHeight) {
            System.out.println("Учасник " + typeMember + " - " + name + " пройшов перешкоду " + typeObstacle + " на дистанції " + height);

        } else {
            System.out.println("Учасник " + typeMember + " - " + name + " не пройшов перешкоду " + typeObstacle + " з висотою " + height + ". Підпригнув на висоту " + maxHeight);
            setParticipant(false);
        }
    }

    public String getTypeMember() {
        return typeMember;
    }

    public String getName() {
        return name;
    }

    public boolean isParticipant() {
        return isParticipant;
    }

    public void setParticipant(boolean participant) {
        isParticipant = participant;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
