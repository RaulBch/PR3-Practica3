package practica3;

import java.math.BigInteger;

public class MultiplicacionEgipcia implements Multiplicacion {
    
    private BigInteger[] resultado = {new BigInteger("0"),new BigInteger("0")};
    
    
    @Override
    public BigInteger multiplica(BigInteger n,BigInteger m) {
        return multiplicaEgipcia(n,m,new BigInteger("1"))[0];
    } 

    private BigInteger[] multiplicaEgipcia(BigInteger n, BigInteger m, BigInteger doble1) {
        if(doble1.compareTo(m) == 1) return resultado;
        
        resultado = multiplicaEgipcia(n,m,doble1.multiply(new BigInteger("2")));
        
        if(resultado[1].add(doble1).compareTo(m)!=1) return new BigInteger[]
        {resultado[0].add(n.multiply(doble1)),resultado[1].add(doble1)};
        
        return resultado;
        
    }
    
}
