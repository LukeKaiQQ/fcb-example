# fcb-example
* example 1
  * 輸出 Hello World
```js
System.out.println("Hello World");
```
***
* example 2
  * 判斷式
```js
if(condition == true) { 
    do something... 
} 
else if(condition == true) {
    do something... 
}
else { 
    do something... 
}
```
```js
switch(變數名稱或運算式) {
    case 常數1:
        do somethind...;
        break;
    case 常數2:
        do something...;
        break;
    default:
        do something;
}
```
***
* example 3, 4
  * 迴圈
```js
for(int start ; i < end ; i++) {
     do something...;
}
```
***
* example 5, 6, 7
  * BigDecimal, for-loop, Array混合技
***
* example 8, 9, 10
  * 新增物件、建構子、this、Overloading、Overriding
  * 封裝(public/default/protected/private)
```js
public class CalculateService {
    private int num = 100;
    public CalculateService() {
        System.out.println("我是建構子");
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}

CalculateService service = new CalculateService();
service.setNum(200);
System.out.println(service.getNum());
```
***  
* example 11
  * 繼承(extends)
```js
class Father {
    protected int num = 100;
    public void showMessage() {
        System.out.println("I'm father");
    }
}
public class Son extends Father {
    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("I'm son");
    }
}
```
*** 
* example 12
  * 因為幅點數有精準度問題，一律使用 BigDecinal 來計算匯率或金額等
  * setScale(int newScale, RoundingMode roundingMode)
```js
public BigDecimal rate = BigDecimal.valueOf(30);
public BigDecimal amount = BigDecimal.valueOf(1000);

public void calculate(BigDecimal rate, BigDecimal amount) {
    this.rate = rate;
    this.amount = amount;
    // 無條件捨去
    System.out.println(this.rate.multiply(this.amount).setScale(0, RoundingMode.FLOOR));
    // 無條件進入
    System.out.println(this.rate.multiply(this.amount).setScale(0, RoundingMode.CEILING));
    // 四捨五入
    System.out.println(this.rate.multiply(this.amount).setScale(2, RoundingMode.HALF_UP));
}
```
***
* example 13
* 
