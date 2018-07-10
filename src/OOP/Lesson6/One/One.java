package OOP.Lesson6.One;
/*
Created by matua on 10.07.2018 at 13:31
*/

import java.math.BigInteger;

public class One {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Factorial(), String.valueOf(i));
            thread.start();
        }
    }
}

class Factorial implements Runnable {

    @Override
    public void run() {
        System.out.println(getFactorial(Integer.parseInt(Thread.currentThread().getName())));
    }

    public BigInteger getFactorial(int i) {
        BigInteger result = new BigInteger("1");
        for (int j = 2; j <= i; j++) {
            result = result.multiply(new BigInteger("" + j));
        }
        return result;
    }
}
