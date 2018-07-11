package marafon;

import marafon.competitor.Participant;
import marafon.obstacle.Obstacle;

class Course {
    private Obstacle[] obstacles;

    Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    void toDoTeam(Team team) {
        for (Participant participant : team.getParticipants()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.toDo(participant);
                if (!participant.isOnDistance()) break;
            }

            // Separator
            System.out.println();
        }
    }
}
