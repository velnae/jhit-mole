import javax.swing.*;
import javax.swing.JOptionPane;

public class ShowPointsProcess extends Thread {

    private JLabel lbPoints;

    private PointGame pointGame;

    public ShowPointsProcess(JLabel lbPoints, PointGame pointGame) {
        this.lbPoints = lbPoints;
        this.pointGame = pointGame;
    }

    @Override
    public void run() {

        while (true) {
            lbPoints.setText(pointGame.getPoints() + "");

            if (pointGame.getPoints() == 0){
                JOptionPane.showMessageDialog(null, "Perdiste!!!, Click en OK para reiniciar el juego!! ");
                pointGame.restartPoint();
            }

            if (pointGame.getPoints() == pointGame.getMaxPoint()){
                JOptionPane.showMessageDialog(null, "GANASTE!!!, Click en OK para reiniciar el juego!! ");
                pointGame.restartPoint();
            }

            try {
                sleep(10);
            } catch (InterruptedException ex) {
                System.err.println("El hilo ha sido interrumpido.");
            }
        }
    }
}
