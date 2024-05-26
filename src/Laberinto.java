import java.awt.Graphics;
import java.awt.Color;

public class Laberinto
{
    int[][]niveleslaberinto=new int[13][23];//Array para cambiar los niveles del laberinto
    private int fila=0;
    private int columna=0;
    private int numeroFilas=13;
    private int numeroColumnas=23;
    private int  anchoLaberinto=40;
    private int altoLaberinto=40;
    public static final int escala=40;


    public int[][] obtieneLaberinto()
    {
        if (Main.obtenerNivel()==1)
        {
            int laberinto1[][] =
                    {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                            {1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 2, 1 },
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },

                    };
            niveleslaberinto=laberinto1;
        }
        if (Main.obtenerNivel()==2)
        {
            int laberinto2[][]=
                    {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                            {1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1 },
                            {1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1 },
                            {1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                            {1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 },
                            {1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1 },
                            {1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1 },
                            {1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1 },
                            {1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 2, 1 },
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                    };
            niveleslaberinto=laberinto2;
        }
        if (Main.obtenerNivel()==3)
        {
            int laberinto3[][]=
                    {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                            {1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1 },
                            {1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1 },
                            {1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1 },
                            {1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1 },
                            {1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
                            {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1 },
                            {1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
                            {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
                            {1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 2, 1 },
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                    };
            niveleslaberinto=laberinto3;
        }
        return niveleslaberinto;
    }


    public void dibujarLaberinto(Graphics graficos)
    {
        int [][]laberinto=obtieneLaberinto();
        for (int fila=0; fila<numeroFilas; fila++)
        {
            for (int columna=0; columna<numeroColumnas; columna++)
                if (laberinto[fila][columna]==1)  //Reconoce una pared, por lo cual la va a pintar
                {
                    if (Main.obtenerNivel()==1)
                    {
                        graficos.setColor(Color.CYAN);//Color del bloque
                        graficos.fillRect(columna*escala,fila*escala,anchoLaberinto,altoLaberinto);//Se multiplica tanto a columna y a fila, para que el bloque sea más grande, y tenga un mejor espacio
                        graficos.setColor(Color.black);//Color del contorno del bloque
                        graficos.drawRect(columna*escala,fila*escala,anchoLaberinto,altoLaberinto);
                    }
                    if (Main.obtenerNivel()==2)
                    {
                        graficos.setColor(Color.GRAY);
                        graficos.fillRect(columna*escala,fila*escala,anchoLaberinto,altoLaberinto);
                        graficos.setColor(Color.black);//Color del contorno del bloque
                        graficos.drawRect(columna*escala,fila*escala,anchoLaberinto,altoLaberinto);
                    }
                    if (Main.obtenerNivel()==3)
                    {
                        graficos.setColor(Color.ORANGE);
                        graficos.fillRect(columna*escala,fila*escala,anchoLaberinto,altoLaberinto);
                        graficos.setColor(Color.black);//Color del contorno del bloque
                        graficos.drawRect(columna*escala,fila*escala,anchoLaberinto,altoLaberinto);
                    }
                }
                else if (laberinto[fila][columna]==2)
                {
                    graficos.setColor(Color.BLACK);//Color del bloque
                    graficos.fillRect(columna*escala,fila*escala,anchoLaberinto,altoLaberinto);//Se multiplica tanto a columna y a fila, para que el bloque sea más grande, y tenga un mejor espacio
                    graficos.setColor(Color.black);//Color del contorno del bloque
                    graficos.drawRect(columna*escala,fila*escala,anchoLaberinto,altoLaberinto);
                }
        }
    }
}