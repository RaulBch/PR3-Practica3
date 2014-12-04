package practica3;

import java.math.BigInteger;

public class MultiplicacionRusa implements Multiplicacion {

    private final BigInteger dos = new BigInteger("2");
    private final BigInteger cero = new BigInteger("0");
    
    @Override
    public BigInteger multiplica(BigInteger n, BigInteger m) {
        if(n.compareTo(new BigInteger("1")) != -1) {
            if(n.divideAndRemainder(dos)[1].compareTo(cero) != 0) 
                return m.add(multiplica(n.divide(dos),m.multiply(dos)));
            return multiplica(n.divide(dos),m.multiply(dos));
        }
        return cero;
    }
    
    
}
