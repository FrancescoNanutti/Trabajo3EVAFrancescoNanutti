# Laberinto de 3 niveles programado en java
# Autor: Francesco Nanutti

## Descripción del juego
Laberinto desarrollado en Java, donde el jugador controla una bolita y debe navegar a través de un laberinto para alcanzar el final. El juego cuenta con tres niveles que el jugador debe completar.

## Clases
El proyecto consta de las siguientes clases:
1. Main: Controla el flujo principal del juego, maneja los eventos de teclado y dibuja la interfaz gráfica.
2. Bolita: Representa la bolita controlada por el jugador y maneja su movimiento.
3. Laberinto: Define los niveles del laberinto y se encarga de dibujarlos.


### Controles
- **Flecha Izquierda**: Mover la bolita hacia la izquierda.
- **Flecha Derecha**: Mover la bolita hacia la derecha.
- **Flecha Arriba**: Mover la bolita hacia arriba.
- **Flecha Abajo**: Mover la bolita hacia abajo.

### Objetivo
El objetivo es mover la bolita  desde la posición de inicio hasta la posición final del laberinto, indicada por la coordenada (840, 440). Al completar un nivel, el juego avanzará automáticamente al siguiente nivel. Completa los tres niveles para ganar el juego.

### Estadísticas del Juego
El juego muestra las siguientes estadísticas en la parte superior de la ventana:
- **Movimientos**: Número de movimientos realizados por el jugador.
- **Tiempo**: Tiempo transcurrido desde el inicio del juego.

### Finalización del Juego
Cuando completes los tres niveles, el juego mostrará un mensaje de felicitación con tu nombre, tiempo total y el número de movimientos realizados. Luego, el juego se cerrará automáticamente.


##Notas
En ciertas partes del juego me ha sido dificil añadir algunas cosas. Por ejemplo: el drawString que te muestra el tiempo o la logica que hay detras del movimiento de la bolita.
Otro problema que tuve fue el trabajar desde clase debido a que no podia clonar el repositorio en el equipo de sobremesa.

Tambien aprendi el uso de distintas librerias que ofrece java, por ejemplo las **swing** para controlar ventanas y su contenido, y también las **awt** que ofrecen al usuario trabajar con entorno grafico y tambien las **awt.event** para trabajar con los metodos KeyListener y KeyEvent, que nos permiten usar el teclado para acciones, en este caso el movimiento de la bolita.



