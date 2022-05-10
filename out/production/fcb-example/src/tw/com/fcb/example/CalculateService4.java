package tw.com.fcb.example;

import java.math.BigDecimal;

abstract class AbstractCalculate implements ICalculate{
    protected BigDecimal rate = BigDecimal.valueOf(30);
    protected  BigDecimal amount = BigDecimal.valueOf(1000);

    public void calculate(){
        System.out.println(this.rate.multiply(this.amount));
    }
    public abstract void calculate2(BigDecimal rate, BigDecimal amount);
}

public class CalculateService4 extends AbstractCalculate{
    @Override
    public void calculate() {
        System.out.println(this.rate.multiply(this.amount));
    }

    @Override
    public void calculate2(BigDecimal rate, BigDecimal amount) {

    }
}
