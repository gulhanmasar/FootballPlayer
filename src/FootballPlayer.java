public class FootballPlayer {
    int numberOfGoals;
    int minutes;
    int no = 10;
    String name;
    boolean inPlay;
    void play (int minutesToPlay){
        minutes = minutes + minutesToPlay;

    }

    void score(int goalCount) {
        numberOfGoals = numberOfGoals + goalCount;
    }


}
