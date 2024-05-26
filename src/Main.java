import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * @author FrancescoNanutti
 *
 */




public class Main extends JPanel
{
    Laberinto laberinto = new Laberinto();
    Bolita bolita= new Bolita();
    public static int contarNivel=1;
    static double tiempoJuego;
    static DecimalFormat df = new DecimalFormat("#0.0");



    public Main()
    {
        addKeyListener(new KeyListener() {
            //Metodo KeyTyped no se usa
            @Override
            public void keyTyped(KeyEvent e)
            {


            }


            @Override
            public void keyPressed(KeyEvent tecla)//keyPressed sirve para cuando el usuario presione una tecla, activara una acción, en este caso una acción de movimiento en la bolita
            {
                bolita.presionarTecla(tecla);
            }


            //Metodo keyReleased no se usa
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
        dibujarEstadisticas((Graphics2D) graficos);

    }



    public static void dibujarEstadisticas(Graphics2D graficos)
    {
        Font movimientos=new Font("Arial",Font.BOLD,20);
        graficos.setFont(movimientos);
        graficos.setColor(Color.black);
        graficos.drawString("Movimientos: " +Bolita.movimientos,40,25);
        Font tiempo=new Font("Arial",Font.BOLD,20);
        tiempoJuego += (double) 1/60;
        graficos.drawString("Tiempo: " + df.format(tiempoJuego), 325,25);
    }



    //Metodo para cambiar el nivel, y suma la variable contarNivel
    public static int cambiarNivel()
    {
        return contarNivel++;
    }

    //Metodo para conseguir el nivel, y te devuelve el número del nivel que se encuentra
    public static int obtenerNivel()
    {
        return contarNivel;
    }

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        String nombrejugador;
        JOptionPane.showMessageDialog(null, "Bienvenido al laberinto, usa las flechas direccionales para moverte");
        JOptionPane.showMessageDialog(null, "¿Podras completar los 3 niveles?");
        nombrejugador= JOptionPane.showInputDialog("Introduce tu nombre");

        JFrame ventana=new JFrame("Laberinto");
        Main juego = new Main();
        ventana.add(juego);
        ventana.setSize(920,555);//Establece el tamaño de la ventana del juego
        ventana.setLocation(250,100);//Localizar la ventana en la pantlla
        ventana.setVisible(true);//Mostrar la ventana en la pantalla
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Sirve para que cuando se cierre la ventana, se termine de ejecutar


        while (true)//Este bucle sirve para que mientras el juego está en proceso, haya un descanzo de hilos de 10 milisegundos, provocando así el movimiento de la bolita.
        {
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ventana.repaint();

            if (obtenerNivel()>3)
            {
                JOptionPane.showMessageDialog(null, "¡Felicidades " + nombrejugador  + "! has completado los 3 niveles en " +df.format(tiempoJuego)+ " segundos, y has hecho " +Bolita.movimientos+ " movimientos");
                System.exit(0);
            }
        }
    }
}