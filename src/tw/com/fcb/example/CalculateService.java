package tw.com.fcb.example;

public class CalculateService{
    int num, num1, num2;
    private int num3 = 100;

//    constructor
    public CalculateService(){
        num = 100;
    }

//    constructor
    public CalculateService(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void out(){
        System.out.println(num1 + num2);
    }

    public void sum(int num1, int num2){
        System.out.println("Sum = " + (num1 + num2));
    }

    public void subtract(int num1, int num2){
        System.out.println("Subtract: " + (num1 - num2));
    }

    public void multiply(int num1, int num2){
        System.out.println("Multiply: " + (num1 * num2));
    }

    public void divide(int num1, int num2){
        System.out.println("Divide: " + (num1 / num2));
    }
}