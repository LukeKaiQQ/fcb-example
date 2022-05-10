package tw.com.fcb.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateService3 implements ICalculate{
    protected BigDecimal rate = BigDecimal.valueOf(30);
    protected  BigDecimal amount = BigDecimal.valueOf(1000);
    public final int scale = 5;

    @Override
    public void calculate() {
        System.out.println(this.rate.multiply(this.amount).setScale(scale));
    }

    @Override
    public void calculate2(BigDecimal rate, BigDecimal amount) {
        this.rate = rate;
        this.amount = amount;
        System.out.println(this.rate.multiply(this.amount));
//        System.out.println(this.rate.multiply(this.amount).setScale(5));
        System.out.println(this.rate.multiply(this.amount).setScale(0, RoundingMode.FLOOR));
        System.out.println(this.rate.multiply(this.amount).setScale(0, RoundingMode.CEILING));
        System.out.println(this.rate.multiply(this.amount).setScale(2, RoundingMode.HALF_UP));
    }
}
