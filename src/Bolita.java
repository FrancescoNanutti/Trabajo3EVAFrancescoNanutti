import java.awt.*;
import java.awt.event.KeyEvent;


public class Bolita {
    private int x = 40;
    private int y = 40;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;

    public void dibujarBolita(Graphics graficos) {
        graficos.setColor(Color.green);//Establece el color de la bolita
        graficos.fillOval(x, y, ancho, alto);//Coordenadas donde se dibuja el relleno de  la bolita
        graficos.setColor(Color.black);//Color del contorno
        graficos.drawOval(x, y, ancho, alto);//Sirve para dibujar el contorno
    }

    public void presionarTecla(KeyEvent accion)
    {
        if (accion.getKeyCode() == 65)//Letra A-Dirección:Izquierda
        {
            x=x-movimiento;
        }
        if (accion.getKeyCode() == 68)//Letra D-Dirección:Derecha
        {
            x=x+movimiento;
        }
        if (accion.getKeyCode() == 87)//Letra W-Dirección:Arriba
        {
            y=y-movimiento;
        }
        if (accion.getKeyCode() == 83)//Letra S-Dirección abajo
        {
            y=y+movimiento;
        }
    }
}
