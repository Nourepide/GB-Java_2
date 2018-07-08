package marafon.obstacle;

import marafon.competitor.Participant;

public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void toDo(Participant participant) {
        participant.run(length);
    }
}