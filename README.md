##Práctica 3: Investigar el método de multiplicación más eficiente entre los propuestos
¿Cuál de los tres algoritmos recursivos propuestos a continuación es el más eficiente en el supuesto de que se tuviera que implementar una tecla de multiplicar en una máquina con capacidad para manejar grandes números? Diseñar y desarrollar un programa en Java que permita la ejecución de los tres algoritmos y muestre los resultados empíricos necesarios para hacer la comparación en una sola ejecución. Los algoritmos son:

* Multiplicación mediante sumas sucesivas
* Multiplicación rusa
* Multiplicación egipcia

Los datos de entrada y los resultados obtenidos al multiplicar deben ser objetos de la clase BigInteger.

Cada ejecución debe mostrar por pantalla dos cuadros con el siguiente formato:

```
Tamaño de las ristras	Tiempo Sumas	Tiempo Rusa	Tiempo Egipcia
          x1	           xxxx	         xxxx	       xxxx
          x2	           xxxx	         xxxx	       xxxx
          x3	           xxxx	         xxxx	       xxxx
          x4	           xxxx	         xxxx	       xxxx
          x5	           xxxx	         xxxx	       xxxx
          x6	           xxxx	         xxxx	       xxxx
          
          
Tamaño de las ristras	Resultados Sumas	Resultados Rusa	 Resultados Egipcia
          x1	           xxxx	              xxxx	              xxxx
          x2	           xxxx	              xxxx	              xxxx
          x3	           xxxx	              xxxx	              xxxx
```
siendo x1, x2, x3, x4, x5 y x6 las ristras con las que se inicializa el parámetro del que depende la recursividad. Los guiones indican que no es necesario mostrar resultados de tiempo para la multiplicación mediante sumas sucesivas en los tres últimos casos, así como los resultados de la multiplicación para los tres métodos y los tres últimos tamaños usados.
