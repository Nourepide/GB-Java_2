package marafon.obstacle;

import marafon.competitor.Participant;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void toDo(Participant participant) {
        participant.jump(height);
    }
}