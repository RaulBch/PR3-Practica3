package practica3;

import java.math.BigInteger;

public class MultiplicacionSumas implements Multiplicacion {

    @Override
    public BigInteger multiplica(BigInteger n, BigInteger m) {
        if(m.compareTo(new BigInteger("0")) ==0) return new BigInteger("0");
        return(n.add(multiplica(n,m.subtract(new BigInteger("1")))));

    }
    
}
