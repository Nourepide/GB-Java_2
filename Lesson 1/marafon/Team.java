package marafon;

import marafon.competitor.Participant;

public class Team {
    private String name;
    private Participant[] participants;

    public Participant[] getParticipants() {
        return participants;
    }

    Team(String name, Participant participantOne, Participant participantTwo, Participant participantThree, Participant participantFour) {
        this.name = name;
        this.participants = new Participant[4];
        this.participants[0] = participantOne;
        this.participants[1] = participantTwo;
        this.participants[2] = participantThree;
        this.participants[3] = participantFour;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();

        info.append("Группа ").append(name).append(":\n");

        for (Participant participant : participants) {
            info.append(participant).append("\n");
        }

        return info.toString();
    }
}
