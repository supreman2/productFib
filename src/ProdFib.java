public class ProdFib { // must be public for codewars

    public static long[] productFib(long prod) {

        // нужно найти число фибоначчи и предыдущее ему число, произведение которых равно prod, также в структуру положить true
        // если произведение больше prod, то вернуть два предыдущих числа и false

        long  minus1 = 0;
        long  minus2 = 1;
        long cur;
        long[] res = new long[3];

        // int n = 2;

        while(true){

            cur = minus1 + minus2;

            if(cur*minus1 == prod) {

                res[0] = minus1;
                res[1] = cur;
                res[2] = 1;
                break;
            }
            else if (cur*minus1 > prod) {
                res[0] = minus1;
                res[1] = cur;
                res[2] = 0;
                break;

            }

            minus2 = minus1;
            minus1 = cur;

        }
        return res;
    }
}