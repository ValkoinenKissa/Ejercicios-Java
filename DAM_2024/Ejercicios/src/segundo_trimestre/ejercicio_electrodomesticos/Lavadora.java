package segundo_trimestre.ejercicio_electrodomesticos;
/*
Crearemos una subclase llamada Lavadora con las siguientes características:



Su atributo es carga, ademas de los atributos heredados.
Por defecto, la carga es de 5 kg. Usa una constante para ello.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
funcion get de carga.
precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
Llama al funcion padre y añade el código necesario.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
Crearemos una subclase llamada Television con las siguientes características:

Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados.
Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
funcion get de resolución y sintonizador TDT.
precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30%
y si tiene un sintonizador TDT incorporado, aumentara 50 €.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
Ahora crea una clase ejecutable que realice lo siguiente:

Crea un array de Electrodomesticos de 10 posiciones.
Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
Ahora, recorre este array y ejecuta el funcion precioFinal().
Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras
por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, pero recuerda que Television y
Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500,
el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.


 */
public class Lavadora {
}
