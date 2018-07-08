package marafon.competitor;

public interface Participant {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistance();
}
