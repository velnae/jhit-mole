import javax.swing.*;

public class PointGame {

    private int startPoint;

    private int points;

    private int winPoints;

    private int losePoints;

    public PointGame() {
        startPoint = 5;
        points = startPoint;
        winPoints = 1;
        losePoints = -1;
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
}
