import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author FrancescoNanutti
 *
 */


public class Main extends JPanel
{
    Laberinto laberinto = new Laberinto();
    Bolita bolita= new Bolita();

    public Main()
    {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e)
            {

            }

            @Override
            public void keyPressed(KeyEvent tecla)//keyPressed sirve para cuando el usuario presione una tecla, activara una acción, en este caso una acción de movimiento en la bolita
            {
                bolita.presionarTecla(tecla);
            }

            @Override
            public void keyReleased(KeyEvent e)
            {

            }
        });
        setFocusable(true);//Sirve para que un objeto de JPanel reciba el foco o la reacción del teclado
    }


    public void paint(Graphics graficos)//"paint" es un metodo de la biblioteca de graphics
    {

        laberinto.dibujarLaberinto(graficos);
         bolita.dibujarBolita(graficos);

    }

    public static void main(String[] args)
    {

        JFrame ventana=new JFrame("Laberinto");
        Main juego = new Main();
        ventana.add(juego);
        ventana.setSize(935,560);//Establece el tamaño de la ventana del juego
        ventana.setLocation(250,100);//Localizar la ventana en la pantlla
        ventana.setVisible(true);//Mostrar la ventana en la pantalla

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}