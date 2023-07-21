import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShowHideMoleProcess extends Thread {

    private FrmGeneral frame;

    private JPanel panel;

    private Mole mole;


    public ShowHideMoleProcess(FrmGeneral frame, Mole mole) {
        this.frame = frame;
        this.panel = frame.getPanel();
        this.mole = mole;
    }

    @Override
    public void run() {

        while (true) {
            if (mole.isSight()) {
                frame.showMole((JButton) panel.getComponent(mole.getUbication()));
//                panel.getComponent(mole.getUbication()).setBackground(Color.RED);
            } else {
                frame.hideMole((JButton) panel.getComponent(mole.getUbication()));
//                panel.getComponent(mole.getUbication()).setBackground(Color.WHITE);
            }

            if (mole.getHit()) {
                frame.hideMole((JButton) panel.getComponent(mole.getUbication()));
//                panel.getComponent(mole.getUbication()).setBackground(Color.WHITE);
            }

            try {
                sleep(10);
            } catch (InterruptedException ex) {
                System.err.println("El hilo ha sido interrumpido.");
            }
        }
    }
}
