package Juegos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovimientoPelota extends JPanel implements ActionListener {
    private int x = 0;
    private int velocidadX = 1;
    private static final int ANCHO_PANTALLA = 800;
    private static final int ALTO_PANTALLA = 600;

    public MovimientoPelota() {
        Timer timer = new Timer(10, this); // Cada 10 milisegundos se llama a actionPerformed
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, 100, 50, 50); // Dibuja una pelota en la posición (x, 100)
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moverPelota();
        repaint(); // Vuelve a dibujar la pelota en su nueva posición
    }

    private void moverPelota() {
        x += velocidadX;

        if (x > ANCHO_PANTALLA - 50) { // El tamaño de la pelota es 50x50
            x = 0; // Reiniciar la posición cuando llega al borde derecho
        }
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Movimiento de Pelota");
        MovimientoPelota panel = new MovimientoPelota();
        ventana.add(panel);
        ventana.setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
