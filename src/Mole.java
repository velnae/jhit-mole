public class Mole {
    private boolean hit;

    private boolean sight;

    private int ubication;


    private PointGame pointGame;

    public Mole(PointGame pointGame) {
        hit = false;
        ubication = 0;
        sight = false;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public void setUbication(int ubication) {
        this.ubication = ubication;
    }

    public int getUbication() {
        return ubication;
    }

    public void setSight(boolean sight) {
        this.sight = sight;
    }

    public boolean isSight() {
        return sight;
    }
    public boolean getHit() {
        return hit;
    }
}
