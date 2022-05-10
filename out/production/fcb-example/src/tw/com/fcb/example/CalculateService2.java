package tw.com.fcb.example;

import java.math.BigDecimal;

class Calculate{
    protected BigDecimal rate = BigDecimal.valueOf(30);
    protected  BigDecimal amount = BigDecimal.valueOf(1000);

    public void calculate1(){
        System.out.println(this.rate.multiply(this.amount));
    }

    public void calculate2(BigDecimal rate, BigDecimal amount){
        this.rate = rate;
        this.amount = amount;
        System.out.println(rate.multiply(amount));
    }

    public void calculate2(BigDecimal rate, BigDecimal amount, String account){
        this.rate = rate;
        this.amount = amount;
        if(account.equals("86483666")){
            System.out.println(rate.multiply(amount).multiply(BigDecimal.valueOf(0.8)));
        }
        else{
//            this.calculate1();
            this.calculate2(rate, amount);
        }
    }
}

public class CalculateService2 extends Calculate{
    @Override
    public void calculate1() {
        super.calculate1();
        System.out.println(this.rate.multiply(this.amount).multiply(BigDecimal.valueOf(0.9)));
    }
}
