import java.awt.*;

public class Laberinto
{
    private int fila=0;
    private int columna=0;
    private int numeroFilas=13;
    private int numeroColumnas=23;
    private int anchoLaberinto=40;
    private int altoLaberinto=40;
    public void dibujarLaberinto(Graphics graficos)
    {
        int [][]laberinto=dibujarLaberinto();
        for (int fila=0; fila<numeroFilas; fila++)
        {
            for (int columna=0; columna<numeroColumnas; columna++)
                if (laberinto[fila][columna]==1)  //Reconoce una pared, por lo cual la va a pintar
                {
                    graficos.setColor(Color.PINK);//Color del bloque
                    graficos.fillRect(columna*40,fila*40,anchoLaberinto,altoLaberinto);//Se multiplica tanto a columna y a fila, para que el bloque sea más grande, y tenga un mejor espacio
                    graficos.setColor(Color.black);//Color del contorno del bloque
                    graficos.drawRect(columna*40,fila*40,anchoLaberinto,altoLaberinto);
                }

        }
    }

    public int[][] dibujarLaberinto()
    {
        int laberinto[][]=
                {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                        {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1 },
                        {1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                        {1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                };
        return laberinto;
    }
}
