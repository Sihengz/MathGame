public class Player {

    private String name;
    private int score;
    private boolean loser;

    public Player(String name) {
        this.name = name;
        score = 0;
        loser = false;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setLoser(boolean loser) {
        this.loser = loser;
    }

    public boolean isLoser() {
        return loser;
    }

    public void incrementScore() {
        score++;
    }

    public void reset() {
        score = 0;
        setLoser(false);
    }
}