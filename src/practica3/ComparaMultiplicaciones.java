package practica3;

import java.math.BigInteger;
import java.util.Scanner;

public class ComparaMultiplicaciones {

    public static void main(String[] args) {
        Scanner getnum = new Scanner(System.in);
        System.out.println("Primer elemento a multiplicar: ");
        BigInteger a = getnum.nextBigInteger();
        System.out.println("Segundo elemento a multiplicar: ");
        BigInteger b = getnum.nextBigInteger();
        System.out.println("El resultado aplicando el metodo de la Multiplicacion Egipcia es : " + new MultiplicacionEgipcia().multiplica(a,b));
        System.out.println("El resultado aplicando el metodo de la Multiplicacion Rusa es    : " + new MultiplicacionRusa().multiplica(a,b));
        System.out.println("El resultado aplicando la operacion de multiplicacion interna es : " + a.multiply(b));
        
        //BigInteger a = new BigInteger("4001254436436");
        //BigInteger b = new BigInteger("8435436236343");
        
        
        //Resultado: 33752326663940423366593548
        //System.out.println(new MultiplicacionEgipcia().multiplica(a,b));
        //System.out.println(new MultiplicacionRusa().multiplica(c,d));
        
    }
    
}
