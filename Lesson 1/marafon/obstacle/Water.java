package marafon.obstacle;

import marafon.competitor.Participant;

public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void toDo(Participant participant) {
        participant.swim(length);
    }
}