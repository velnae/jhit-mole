import javax.swing.*;

public class PointGame {

    private final int startPoint;

    private final int maxPoint;

    private int points;

    private final int winPoints;

    private final int losePoints;

    public PointGame() {
        startPoint = 5;
        points = startPoint;
        winPoints = 1;
        losePoints = -1;
        maxPoint = 20;
    }

    public void lose() {
        this.points += losePoints;
    }
    public void win() {
        this.points += winPoints;
    }

    public int getPoints() {
        return points;
    }

    public void restartPoint() {
        this.points = startPoint;
    }

    public int getMaxPoint() {
        return maxPoint;
    }
}
