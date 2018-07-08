package marafon;

import marafon.competitor.Cat;
import marafon.competitor.Dog;
import marafon.competitor.Human;
import marafon.obstacle.Cross;
import marafon.obstacle.Wall;
import marafon.obstacle.Water;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("1",
                new Human("A"),
                new Cat("B"),
                new Dog("C"),
                new Human("D")
        );

        new Course(
                new Cross(80),
                new Wall(6),
                new Water(4)
        ).toDoTeam(team);

        // Info
        System.out.print(team);
    }
}