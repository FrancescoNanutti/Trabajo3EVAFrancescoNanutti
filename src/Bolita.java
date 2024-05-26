import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class Bolita {
    private int ejeX = 40;
    private int ejeY = 40;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;
    public static int movimientos = 0;


    Laberinto lab = new Laberinto();
    public void dibujarBolita(Graphics graficos) {
        graficos.setColor(Color.BLUE);//Establece el color de la bolita
        graficos.fillOval(ejeX, ejeY, ancho, alto);//Coordenadas donde se dibuja el relleno de  la bolita
        graficos.setColor(Color.black);//Color del contorno
        graficos.drawOval(ejeX, ejeY, ancho, alto);//Sirve para dibujar el contorno
    }


    public void presionarTecla(KeyEvent accion)
    {
        int [][] posicionLaberinto=lab.obtieneLaberinto();
        if (accion.getKeyCode() == 37)//Flecha Izquierda-Dirección:Izquierda
        {
            if (posicionLaberinto[ejeY / lab.escala][(ejeX / lab.escala)-1]!=1)
            {
                ejeX = ejeX - movimiento;
                movimientos++;
            }
            else
            {
                ejeX=40;
                ejeY=40;
            }
        }
        if (accion.getKeyCode() == 39)//Flecha Derecha-Dirección:Derecha
        {
            if (posicionLaberinto[ejeY / lab.escala][(ejeX / lab.escala)+1]!=1)
            {
                ejeX = ejeX + movimiento;
                movimientos++;
            }
            else
            {
                ejeX=40;
                ejeY=40;
            }
        }
        if (accion.getKeyCode() == 38)//Flecha Arriba-Dirección:Arriba
        {
            if (posicionLaberinto[(ejeY / lab.escala)-1][ejeX / lab.escala]!=1)
            {
                ejeY = ejeY - movimiento;
                movimientos++;
            }
            else
            {
                ejeX=40;
                ejeY=40;
            }
        }
        if (accion.getKeyCode() == 40)//Flecha Abajo-Dirección abajo
        {
            if (posicionLaberinto[(ejeY / lab.escala)+1][ejeX / lab.escala]!=1)
            {
                ejeY = ejeY + movimiento;
                movimientos++;
            }
            else
            {
                ejeX=40;
                ejeY=40;
            }
        }


        //Para cuando la bolita llegue al final, cambie de nivel y vuelva a su posición de inicio
        if (ejeX==840 && ejeY==440)
        {
            Main.cambiarNivel();
            ejeX=40;
            ejeY=40;
        }



    }
}