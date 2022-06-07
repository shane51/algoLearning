import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Fibonacci {

    static Map<Long, Long> dp = new HashMap<>();

    public long getFb(long n) {
        if(n==0){
            return 0;
        }
        if(n== 1 || n== 2){
            return 1;
        }
        if(Objects.nonNull(dp.get(n))){
            return dp.get(n);
        }

        long fbn = getFb(n-1) + getFb(n-2);
        dp.put(n, fbn);
        return fbn;
    }
}
