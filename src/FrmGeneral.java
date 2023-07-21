import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class FrmGeneral extends JFrame {

    private JPanel panelParent;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button39;
    private JButton button40;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button49;
    private JPanel panel;
    private JLabel jlabel;
    private JLabel lbPuntaje;
    private PointGame pointGame;

    private ImageIcon moleGif;

    Mole mole;
    public FrmGeneral(Mole mole, PointGame pointGame) throws IOException {
        this.mole = mole;
        this.pointGame = pointGame;
        initComponents();
        this.moleGif = new ImageIcon("resources/topo.gif");
    }

    public void initComponents() {
        Component[] components = panel.getComponents();
        lbPuntaje.setText(pointGame.getPoints() + "");


// Crear un JLabel con el GIF



        for (Component component : components) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.setBackground(Color.WHITE);
                button.setText("");

                JLabel gifLabel = new JLabel();
                gifLabel.setPreferredSize(new Dimension(80, 60));
                gifLabel.setBounds(0, 0, 80, 60);
                button.setContentAreaFilled(false); // Hacer que el fondo del botón sea transparente
                button.setBorderPainted(false); // No mostrar el borde del botón
                button.setFocusPainted(false); // No mostrar el cambio de color al enfocar el botón
                button.add(gifLabel);


                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton clickedButton = (JButton) e.getSource();
                        int index = panel.getComponentZOrder(clickedButton);
                        System.out.println("Índice del JButton: " + index);

                        //golpeado
                        if (mole.getUbication() == index & !mole.getHit()) {
                            System.out.println("hit");
                            mole.setHit(true);
                            pointGame.win();
                        } else {
                            System.out.println("Fallaste");
                        }
                    }
                });
            }
        }


        setContentPane(panelParent);
//        setContentPane(panel);
        setTitle("Game");
        setSize(850, 800);
//        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JPanel getPanelParent() {
        return panelParent;
    }

    public JLabel getLbPuntaje() {
        return lbPuntaje;
    }

    public void showMole(JButton button) {
        JLabel label = (JLabel) button.getComponent(0);
        label.setIcon(moleGif);
    }

    public void hideMole(JButton button) {
        JLabel label = (JLabel) button.getComponent(0);
        label.setIcon(null);
    }
}
