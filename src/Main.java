import javax.swing.*;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        PointGame pointGame = new PointGame();
        Mole  mole = new Mole(pointGame);

        FrmGeneral frmGeneral = new FrmGeneral(mole, pointGame);
        frmGeneral.setVisible(true);
        JLabel lbPuntaje = frmGeneral.getLbPuntaje();

        try {
            Thread.sleep(2000);

            new MoveMoleProcess(mole, pointGame).start();
            new ShowHideMoleProcess(frmGeneral, mole).start();
            new ShowPointsProcess(lbPuntaje, pointGame).start();
        } catch (InterruptedException e) {
            System.err.println("El hilo ha sido interrumpido.");
        }

    }
}