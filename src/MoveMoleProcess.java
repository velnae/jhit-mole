import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MoveMoleProcess extends Thread {
    private Mole mole;
    private PointGame pointGame;

    public MoveMoleProcess(Mole mole, PointGame pointGame) {
        this.mole = mole;
        this.pointGame = pointGame;
    }

    @Override
    public void run() {
        Random random = new Random();

        try {
            while (true) {
                //esta a la vista
                mole.setSight(true);
                int numeroAleatorio = random.nextInt(49);
                mole.setUbication(numeroAleatorio);

                Thread.sleep(2000);

                //se oculto
                if (!mole.getHit())
                    pointGame.lose();

                mole.setSight(false);
                mole.setHit(false);

                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.err.println("El hilo ha sido interrumpido.");
        }
    }
}
