package Juegos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class SpaceInvaders extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private int jugadorX, jugadorY;
    private ArrayList<Enemigo> enemigos;
    private boolean disparo;
    private int disparoX, disparoY;
    private boolean enJuego;
    private int puntaje;

    public SpaceInvaders() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        jugadorX = 175;
        jugadorY = 250;

        enemigos = new ArrayList<>();
        generarEnemigos();

        disparo = false;

        timer = new Timer(5, this);
        timer.start();

        enJuego = true;
        puntaje = 0;
    }

 // ...

    private void generarEnemigos() {
        enemigos.clear();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                enemigos.add(new Enemigo(50 + j * 50, 10 + i * 30)); // Cambiado 20 a 10
            }
        }
    }

    // ...


    @Override
    public void actionPerformed(ActionEvent e) {
        moverJugador();
        moverEnemigos();
        moverDisparo();
        verificarColision();
        repaint();
    }

    private void moverJugador() {
        if (jugadorX < 0) {
            jugadorX = 0;
        }
        if (jugadorX > 350) {
            jugadorX = 350;
        }
    }

    private void moverEnemigos() {
        for (Enemigo enemigo : enemigos) {
            enemigo.mover();
        }
    }

    private void moverDisparo() {
        if (disparo) {
            disparoY -= 3;
            if (disparoY < 0) {
                disparo = false;
            }
        }
    }

    private void verificarColision() {
        Rectangle jugadorRect = new Rectangle(jugadorX, jugadorY, 20, 20);

        for (int i = enemigos.size() - 1; i >= 0; i--) {
            Enemigo enemigo = enemigos.get(i);
            Rectangle enemigoRect = new Rectangle(enemigo.getX(), enemigo.getY(), 20, 20);

            if (jugadorRect.intersects(enemigoRect)) {
                enJuego = false;
                break;
            }

            if (disparo) {
                Rectangle disparoRect = new Rectangle(disparoX, disparoY, 5, 10);

                if (disparoRect.intersects(enemigoRect)) {
                    enemigos.remove(i);
                    puntaje += 10;
                    disparo = false;

                    if (enemigos.isEmpty()) {
                        generarEnemigos();
                    }

                    break;
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (enJuego) {
            g.setColor(Color.GREEN);
            g.fillRect(jugadorX, jugadorY, 20, 20);

            for (Enemigo enemigo : enemigos) {
                g.setColor(Color.RED);
                g.fillRect(enemigo.getX(), enemigo.getY(), 20, 20);
            }

            if (disparo) {
                g.setColor(Color.YELLOW);
                g.fillRect(disparoX, disparoY, 5, 10);
            }

            g.setColor(Color.WHITE);
            g.drawString("Puntaje: " + puntaje, 10, 20);
        } else {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.PLAIN, 30));
            g.drawString("Juego Terminado", 130, 150);
            g.drawString("Puntaje: " + puntaje, 150, 200);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            jugadorX -= 5;
        }
        if (key == KeyEvent.VK_RIGHT) {
            jugadorX += 5;
        }
        if (key == KeyEvent.VK_SPACE && !disparo) {
            disparoX = jugadorX + 7;
            disparoY = jugadorY - 10;
            disparo = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Space Invaders");
        SpaceInvaders juego = new SpaceInvaders();
        ventana.add(juego);
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

class Enemigo {
    private double x, y; // Cambiado a double para mayor precisión

    public Enemigo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover() {
        y += 0.2; // Cambiado 1 a 0.5 para movimiento más lento
    }

    public int getX() {
        return (int) x; // Convertido a int para la coordenada X
    }

    public int getY() {
        return (int) y; // Convertido a int para la coordenada Y
    }
}

