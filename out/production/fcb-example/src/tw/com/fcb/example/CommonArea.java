package tw.com.fcb.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CommonArea {
    private String id;
    private String name;
    BigDecimal rate;
    BigDecimal amountB;
    BigDecimal amountS;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmountB() {
        return amountB;
    }

    public void setAmountB(BigDecimal amountB) {
        this.amountB = amountB;
    }

    public BigDecimal getAmountS() {
        return amountS;
    }

    public void setAmountS() {
        this.amountS = this.amountB.multiply(this.rate).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "CommonArea{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", amountB=" + amountB +
                ", amountS=" + amountS +
                '}';
    }
}
