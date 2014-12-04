package practica3;

import java.math.BigInteger;

public class MultiplicacionEgipcia implements Multiplicacion {
    
    @Override
    public BigInteger multiplica(BigInteger n,BigInteger m) {
        return multiplicaEgipcia(n,m,new BigInteger("1"));
    } 

    private BigInteger multiplicaEgipcia(BigInteger n, BigInteger m, BigInteger doble1) {
        if(doble1.compareTo(m) == 1) return new BigInteger("0");
        
        BigInteger p = multiplicaEgipcia(n,m,doble1.multiply(new BigInteger("2")));
        // s=p/n
        if(p.divide(n).add(doble1).compareTo(m)!=1) return p.add(n.multiply(doble1));
        
        return p;
        
    }
    
}
