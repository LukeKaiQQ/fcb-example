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
  * 繼承(extends)、介面(implements)
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
```js
public interface ICalculate {
    void calculate();
    void calculate2(BigDecimal rate, BigDecimal amount);
}
abstract class CalculateService implements ICalculate {
    protected BigDecimal rate = BigDecimal.valueOf(30);
    protected  BigDecimal amount = BigDecimal.valueOf(1000);
    
    public void calculate() {
        System.out.println(this.rate.multiply(this.amount));
    }
    public abstract void calculate2(BigDecimal rate, BigDecimal amount);
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
  * 陣列 
```js
int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
int[] scores = new int[10];

// 一般 for 迴圈寫法
for(int i = 0 ; i < scores.length ; i++) {
    System.out.println(i);
}

// for-each 寫法
for(int score : scores) {
    System.out.println(score);
}
```
***
* example 14, 15
  * 字串操作，使用 + 或 StringBuffer
  * length(), toLowerCase(), toUpperCase(), charAt(), indexOf(), replace(), substring()
  * append(), insert(), delete(), replace()
```js
String s = "Hello";
StringBuffer str = new StringBuffer(s);
str.append(" World);
str.insert(2, "Test");
str.delete(8, 11);
str.deleteCharAt(1);
str.replace(0, 7, "W);
```
***
* example 16, 17, 18, 19
  * 集合(List, Set, Map)
  * List：每個List中元素是[循序加入]並可指定索引來存取元素(ordered 且 duplicates)
  * Set：不允許重複(unordered 且 no duplicates)
  * Map：有key-value，Key值相同後蓋前
```js
List<String> lists = new ArrayList<String>();
lists.add("apple");
lists.add("banana");

Iterator it = lists.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}

Colelctions.sort(lists, Colelction.reverseOrder());
```
```js
String[] data = {"apple", "banana", "cat", "cat", "banana", "dog"};
List<String> lists = new ArrayList<String>(Arrays.asList(data));
lists.forEach(list -> System.out.println(list));
System.out.println("------------------------------------");
Set<String> sets = new HashSet<String>(Arrays.asList(data));
sets.forEach(s -> System.out.println(s));
```
```js
Map<String, String> maps = new HashMap<String, String>();
maps.put("A", "Apple");
maps.put("B", "Banana");

for(String key : maps.keySet()) {
    System.out.println(key + " " + maps.get(key));
}

for(Map.Entry<String, String> entry : maps.entrySet()) {
    System.out.println(entry);
    System.out.println(entry.getKey() + ":" + entry.getValue());
}

maps.forEach((k, v) -> System.out.println(k + ":" + v));
```
***
* example 20, 21
  * split()：切割字串
  * Arrays.asList()：將陣列轉成List
```js
String data = "apple,banana,banana,cat,banana,apple,dog";
List<String> lists = new ArrayList<String>(Arrays.asList(data.split(",| ")));
```
*** 
* example 22, 23, 24
  * 例外處理(try/catch/finally)
  * 自訂例外處理
```js
try{
    可能發生錯誤需要被監控的程式片段
    使用throw new Exception()明確拋出例外
}
catch(Exception e){
    處理特定例外的程式片段
    e.printStackTrace();
    System.out.println(e.getMessage());
}
finally {
    成功或發生例外皆會執行的程式片段
}
```
```js
class MemberIdException extends Exception {
    public MemberIdException(String customerId) {
        super("統編 " + customerId + " 驗證失敗");
    }
    public void showMessage() {
        System.out.println("請聯絡客服");  
    }
}
```
*** 
* example 25
  * Optional：減少程式碼中為了避免NullPointerException錯誤發生時，過多 if(obj == null){...} 的判斷
  * Optional.ofNullable() 允許null的情形
```js
Optional key = Optional.ofNullable(maps.get("A"));
if(key.isPresent()) {
    System.out.println(key);
}
else if(key.isEmpty()) {
    System.out.println("Empty");
}
else{
    System.out.println("Error");
}
```
*** 
* example 26
  * 進階題  
* example 27
  * LocalDateTime、LocalDate、LocalTime
```js
System.out.println(LocalDateTime.now());
System.out.println(LocalDate.now());
System.out.println(LocalTime.now());
```
```js
var date = LocalDate.of(2022, 05, 11);
var formatDate = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(date);

var time = LocalTime.of(14, 50, 40);
var formatterTime1 = DateTimeFormatter.ofPattern("HH:mm:ss").format(time);
var formatterTime2 = DateTimeFormatter.ofPattern("hh:mm:ss").format(time);
```
***
* example 28
  * 列舉(enum)
```js
public enum Currency {
    USD, GBP, HKD, JPY, EUR,
}

System.out.println(Currency.USD);

for(Currency currency : Currency.values()) {
    if(curr.equals(currency.name())){
        System.out.println(currency);
    }
    else{
        System.out.println("Not Found!!!");
    }
}
```
*** 
