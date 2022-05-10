package tw.com.fcb.example;

class Father{
    int number1 = 100;
    private int number2 = 200;
    protected int number3 = 300;

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    private void show(){
        System.out.println("xxx");
    }

    public void show2(){
        show();
    }
}

public class Son extends Father{
}
