package  tw.com.fcb.example;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CalculateApp{
    public static void main(String[] args){

//        ------------------------------------------------------------
//        example 1
//        System.out.println("Hello World");
//        System.out.println("Hello World " + 123);

//        ------------------------------------------------------------
//        example 2
//        int grade = 99;
//        if(grade >= 90 && grade <= 100){
//            System.out.println("優");
//        }
//        else if(grade >= 80 && grade < 90){
//            System.out.println("甲");
//        }
//        else if(grade >= 70 && grade < 80){
//            System.out.println("乙");
//        }
//        else if(grade >= 60 && grade < 70){
//            System.out.println("丙");
//        }
//        else{
//            System.out.println("丁");
//        }
//
//        switch (grade / 10) {
//            case 10: case 9:
//                System.out.println("優");
//                break;
//            case 8:
//                System.out.println("甲");
//                break;
//            case 7:
//                System.out.println("乙");
//                break;
//            case 6:
//                System.out.println("丙");
//                break;
//            default:
//                System.out.println("丁");
//                break;
//        }

//        ------------------------------------------------------------
//        example 3
//        for(int i = 1 ; i < 10 ; i++){
//            for(int j = 1 ; j < 10 ; j++){
//                System.out.printf("%d * %d = %d\t", i, j, (i*j));
//            }
//            System.out.print("\n");
//        }

//        ------------------------------------------------------------
//        example 4
//        int currency = 1;
//        for(int i = 0 ; i < 10 ; i++){
//            if(currency == i){
//                System.out.println("Currency: " + i + " Rate: " + BigDecimal.valueOf(28.5));
//            }
//            else{
//                System.out.println("Currency: " + i + " Not found!!!");
//            }
//        }

//        ------------------------------------------------------------
//        example 5
//        BigDecimal rate = BigDecimal.valueOf(29.99999);
//        BigDecimal amount = BigDecimal.valueOf(500000);
//        if(rate.compareTo(BigDecimal.valueOf(28)) < 0 ||
//                rate.compareTo(BigDecimal.valueOf(30)) > 0){
//            System.out.println("匯率超出合理範圍 ");
//        }
//        else if(amount.compareTo(BigDecimal.valueOf(0)) < 0){
//            System.out.println("金額小於0");
//        }
//        else if(amount.compareTo(BigDecimal.valueOf(500000)) > 0){
//            System.out.println("金額超過50萬");
//        }
//        else {
//            System.out.println("total: " + rate.multiply(amount));
//        }

//        ------------------------------------------------------------
//        example 6
//        int curr = 1;
//        for(int i = 0 ; i < 10 ; i++){
//            if(curr == i){
//                BigDecimal rate = BigDecimal.valueOf(29.99999);
//                BigDecimal amount = BigDecimal.valueOf(500000);
//                if(rate.compareTo(BigDecimal.valueOf(28)) < 0 ||
//                        rate.compareTo(BigDecimal.valueOf(30)) > 0){
//                    System.out.println("匯率超出合理範圍 ");
//                }
//                else if(amount.compareTo(BigDecimal.valueOf(0)) < 0){
//                    System.out.println("金額小於0");
//                }
//                else if(amount.compareTo(BigDecimal.valueOf(500000)) > 0){
//                    System.out.println("金額超過50萬");
//                }
//                else {
//                    System.out.println("total: " + rate.multiply(amount));
//                }
//            }
//            else{
//                System.out.println("Currency " + i + " 不存在!!!");
//            }
//        }

//        ------------------------------------------------------------
//        example 7
//        String[] customers = {"86483666", "05052322"};
//        String bussinessId = "86483666";
//        BigDecimal rate;
//        BigDecimal amount = BigDecimal.valueOf(10000);
//        for(String customer : customers){
//            System.out.println(customer);
//        }
//        for(String customer : customers) {
//            if (customer.equals(bussinessId)) {
//                rate = BigDecimal.valueOf(28);
//            } else {
//                rate = BigDecimal.valueOf(28.5);
//            }
//            System.out.println("BusinessId: " + customer + " Amount: " + rate.multiply(amount));
//        }

//        ------------------------------------------------------------
//        example 8
//        CalculateService calculateService = new CalculateService();
//        calculateService.sum(10, 2);
//        calculateService.subtract(10, 2);
//        calculateService.multiply(10, 2);
//        calculateService.divide(10, 2);
//
//        CalculateService calculateService2 = new CalculateService(20, 30);
//        calculateService2.out();

//        ------------------------------------------------------------
//        example 9
//        CalculateService2 calculateService2 = new CalculateService2();
//        System.out.println("=================================");
//        calculateService2.calculate1();
//        System.out.println("=================================");
//        calculateService2.calculate2(BigDecimal.valueOf(28), BigDecimal.valueOf(2000));
//        System.out.println("=================================");
//        calculateService2.calculate2(BigDecimal.valueOf(28), BigDecimal.valueOf(2000), "86483666");
//        calculateService2.calculate2(BigDecimal.valueOf(28), BigDecimal.valueOf(2000), "05052322");
//        System.out.println("=================================");
//
//        Calculate calculate = new Calculate();
//        calculate.calculate1();
//        calculate.calculate2(BigDecimal.valueOf(28), BigDecimal.valueOf(2000));
//        calculate.calculate2(BigDecimal.valueOf(28), BigDecimal.valueOf(2000), "86483666");
//        calculate.calculate2(BigDecimal.valueOf(28), BigDecimal.valueOf(2000), "05052322");
//        System.out.println("=================================");

//        ------------------------------------------------------------
//        example 10
//        CalculateService calculateService = new CalculateService();
//        System.out.println(calculateService.getNum3());
//        System.out.println(calculateService.getNum3());
//        calculateService.num3 = 200;
//        calculateService.setNum3(1000);
//        System.out.println(calculateService.getNum3());

//        ------------------------------------------------------------
//        example 11
//        Son son = new Son();
//        System.out.println("number1 = " + son.number1);
////        System.out.println("number2 = " + son.number2);
//        System.out.println("number2 = " + son.getNumber2());
//        System.out.println("number3 = " + son.number3);
//        son.show2();
//        son.showMessage();

//        ------------------------------------------------------------
//        example 12
//        System.out.println(1-0.9);
//        CalculateService3 calculateService3 = new CalculateService3();
//        calculateService3.calculate();
//        calculateService3.calculate2(BigDecimal.valueOf(28.12345), BigDecimal.valueOf(1234));

//        ------------------------------------------------------------
//        example 13
//        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        for(int score : scores){
//            System.out.println(score);
//        }
//
//        String[] customers = new String[10];
//        for(int i = 0 ; i < customers.length ; i++){
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter the customer: ");
//            String customer = scanner.next();
//            customers[i] = customer;
//        }
//        for(String customer : customers){
//            System.out.println(customer);
//        }

//        ------------------------------------------------------------
//        example 14
//        String s = "Hello World";
//
//        // 字串操作
//        System.out.println(s);
//        System.out.println("length: " + s.length());
//        System.out.println("toLowerCase(): " + s.toLowerCase());
//        System.out.println("toUpperCase(): " + s.toUpperCase());
//        System.out.println("charAt: " + s.charAt(2));
//        System.out.println("indexOf: " + s.indexOf('W'));
//        System.out.println("replace: " + s.replace('l', 'k'));
//        System.out.println("substring: " + s.substring(6));
//        System.out.println(s);

//        ------------------------------------------------------------
//        example 15
//        String s = "Hello";
//        StringBuffer s1 = new StringBuffer(s);
//        System.out.println("s1: " + s1);
//
//        s1.append(" World");
//        System.out.println("s1: " + s1);
//
//        s1.insert(2, "Test");
//        System.out.println("s1: " + s1);
//
//        s1.delete(8, 11);
//        System.out.println("s1: " + s1);
//
//        s1.deleteCharAt(1);
//        System.out.println("s1: " + s1);
//
//        s1.replace(0, 7, "W");
//        System.out.println("s1: " + s1);
//
//        System.out.println(s1.substring(1));
//        System.out.println(s1);

//        ------------------------------------------------------------
//        example 16
//        List<String> lists = new ArrayList<String>();
//        lists.add("apple");
//        lists.add("banana");
//        lists.add("cat");
//        lists.add("dog");
//        lists.add("egg");
//        lists.add("egg");
//        lists.add("egg");
//        lists.add(3, "test");
//        lists.remove(2);
//
//        Iterator it = lists.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        for(int i = 0 ; i < lists.size() ; i++){
//            System.out.println(lists.get(i));
//        }
//
//        Collections.sort(lists, Collections.reverseOrder());
//        Iterator it2 = lists.iterator();
//        while(it2.hasNext()){
//            System.out.println(it2.next());
//        }

//        ------------------------------------------------------------
//        example 17
//        List<String> lists = new ArrayList<String>();
//        Scanner scanner = new Scanner(System.in);
//
//        while(true){
//            System.out.print("Enter the string to list: ");
//            String data = scanner.next();
//            if(data.equals("quit")){
//                break;
//            }
//            else{
//                lists.add(data);
//            }
//        }
//        for(String list : lists){
//            System.out.println(list);
//        }
//
//        lists.add(3, "test");
//        lists.remove(2);
//        Iterator it = lists.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        ------------------------------------------------------------
//        example 18
//        String[] data = {"apple", "banana", "cat", "cat", "banana", "dog"};
//        List<String> lists = new ArrayList<String>(Arrays.asList(data));
//        lists.forEach(list -> System.out.println(list));
//        System.out.println("------------------------------------");
//        Set<String> sets = new HashSet<String>(Arrays.asList(data));
//        sets.forEach(s -> System.out.println(s));

//        ------------------------------------------------------------
//        example 19
//        Map<String, String> maps = new HashMap<String, String>();
//        maps.put("A", "Apple");
//        maps.put("B", "Banana");
//        maps.put("C", "Cat");
////        maps.put("C", "Dog");
//
//        Set<String> set = maps.keySet();
//        for (String s : maps.keySet()){
//            System.out.println(s);
//        }
//        for(String s : maps.values()){
//            System.out.println(s);
//        }
//        for(String s : maps.keySet()){
//            System.out.println(s + " " + maps.get(s));
//        }
//        for(Map.Entry<String, String> entry : maps.entrySet()){
//            System.out.println(entry);
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//        maps.forEach((k, v) -> System.out.println(k + ":" + v));
//
//        Map<Integer, String> map = new HashMap<Integer, String>();
//        map.put(1, "apple");
//        map.forEach((k, v) -> System.out.println(k + ":" + v));


//        ------------------------------------------------------------
//        example 20
//        String str = "apple,banana,cat,dog,egg fox";
//        String[] tokens = str.split(",| ");
//        for(String token : tokens){
//            System.out.println(token);
//        }
//        List<String> lists = new ArrayList<String>(Arrays.asList(tokens));
//        lists.add("elephant");
//        for(String list : lists){
//            System.out.println(list);
//        }

//        ------------------------------------------------------------
//        example 21
//        String data = "apple,banana,banana,cat,banana,apple,dog";
//
//        List<String> lists = new ArrayList<String>(Arrays.asList(data.split(",| ")));
//        for(String list : lists){
//            System.out.println(list);
//        }
//        System.out.println("--------------------------");
//        Map<String, Integer> maps = new HashMap<String, Integer>();
//        for(String list : lists){
//            if(maps.containsKey(list)){
//                Integer count = maps.get(list) + 1;
//                maps.put(list, count);
//            }
//            else{
//                maps.put(list, 1);
//            }
//        }
//        maps.forEach((k, v) -> System.out.println(k + " " + v));

//        ------------------------------------------------------------
//        example 22
//        int num1 = 10, num2 = 0;
//        System.out.println(num1 / num2);
//
//        try{
//            int num1 = 10, num2 = 0;
//            System.out.println(num1/num2);
//        }
//        catch (ArithmeticException e){
//            System.out.println("除以0");
//        }
//        catch (Exception e){}
//        finally {
//            System.out.println("finally...");
//        }

//        ------------------------------------------------------------
//        example 23
//        Scanner scanner = new Scanner(System.in);
//        BigDecimal num1 = scanner.nextBigDecimal();
//        BigDecimal num2 = scanner.nextBigDecimal();

//        try{
//            Scanner scanner = new Scanner(System.in);
//            BigDecimal num1 = scanner.nextBigDecimal();
//            BigDecimal num2 = scanner.nextBigDecimal();
//
//            if(num2.equals(0)){
//                throw new ArithmeticException();
//            }
//            else{
//                System.out.println(num1.divide(num2));
//            }
//        }
//        catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println("拋出例外 " + e);
//        }
//        catch (InputMismatchException e){
//            e.printStackTrace();
//            System.out.println("拋出例外 " + e);
//        }
//        catch(Exception e){
//            System.out.println("Catch all exception");
//        }
//        finally {
//            System.out.println("finally...");
//        }

//        ------------------------------------------------------------
//        example 24
//        try{
//            CheckIdService checkIdService = new CheckIdService();
//            checkIdService.CheckId("12345");
//            checkIdService.CheckId("A123456789");
//        }
//        catch (MemberIdException e){
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            e.show();
//        }
//        finally {
//            System.out.println("finally...");
//        }

//        ------------------------------------------------------------
//        example 25
//        Map<String, String> maps = new HashMap<String, String>();
//        maps.put("a", "apple");
//
//        System.out.println(maps.get("b"));
//        if(maps.get("b") == null){
//            System.out.println("Not Found");
//        }
//
//        System.out.println(Optional.ofNullable(maps.get("B")));
//        System.out.println(Optional.ofNullable(maps.get("B")).orElse("Not Found"));
//
//        Optional key = Optional.ofNullable(maps.get("a"));
//        if(key.isPresent()){
//            System.out.println(key);
//        }
//        else if(key.isEmpty()){
//            System.out.println("Empty");
//        }
//        else{
//            System.out.println("Error");
//        }

//        ------------------------------------------------------------
//        example 26
//        String data = "\"id\":\"86483666\"," +
//                "\"name\":\"kai\"," +
//                "\"rate\":\"28\"," +
//                "\"amountB\":\"1000\"";
//
//        String[] dataArr = {
//                "86483666,KAI,28.00000,1000.00",
//                "05052322,SUSU,28.12345,8888",
//                "A234567893,LALA,27.56789,7788"
//        };
//        CommonAreaService commonAreaService = new CommonAreaService();
//
//        for(String data : dataArr) {
//            String[] tokens = data.split(":|,");
//
//            CommonArea commonArea = new CommonArea();
//            commonArea.setId(tokens[0]);
//            commonArea.setName(tokens[1]);
//            commonArea.setRate(new BigDecimal(tokens[2]));
//            commonArea.setAmountB(new BigDecimal(tokens[3]));
//            commonAreaService.addList(commonArea);
//        }
//
//        commonAreaService.showList();
//        System.out.println("---------------------------");
//        List<CommonArea> getList = commonAreaService.getLists();
//        for(int i = 0 ; i < getList.size() ; i++){
//            System.out.println(getList.get(i).toString());
//        }

//        ------------------------------------------------------------
//        example 27
//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println("-------------------------------------------");
//
//        LocalDate date = LocalDate.of(2022, 5, 18);
//        String formatterDate = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(date);
//        System.out.println(date);
//        System.out.println(formatterDate);
//
//        var time = LocalTime.of(13, 50, 40);
//        var formatterTime1 =  DateTimeFormatter.ofPattern("HH:mm:ss").format(time);
//        var formatterTime2 =  DateTimeFormatter.ofPattern("hh:mm:ss").format(time);
//        System.out.println(time);
//        System.out.println(formatterTime1);
//        System.out.println(formatterTime2);
//        System.out.println("-------------------------------------------");
//
//        String formatDate = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDate.now());
//        System.out.println(formatDate);
//
//        String formatTime = DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now());
//        System.out.println(formatTime);
//        System.out.println("-------------------------------------------");

        LocalDate date1 = LocalDate.of(2022, 5, 20);
        var date2 = LocalDate.of(2023, 5, 20);
        var date3 = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(date1);
        System.out.println(date1.getYear() + "/" + date1.getMonthValue() + "/" + date1.getDayOfMonth());
        System.out.println(date3);
        System.out.println(date1.isLeapYear());
        System.out.println("-------------------------------------------");
        LocalDate tomorrow = date1.plusDays(1);
        LocalDate nextMonth = date1.plusMonths(1);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Next Month: " + nextMonth);
        var period1 = Period.between(date1, date2);
        System.out.println(period1);
        System.out.println("-------------------------------------------");
        long period2 = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(period2);

//        ------------------------------------------------------------
//        example 28
//        System.out.println(Currency.USD);
//        System.out.println(Currency.valueOf("USD"));
//        Currency[] currencies = Currency.values();
//        for(int i = 0 ; i < currencies.length ; i++) {
//            var currency1 = currencies[i];
//            var currency2 = currencies[i].name();
//            System.out.println("Currency1: " + currency1);
//            System.out.println("Currency2: " + currency2);
//            System.out.println(currencies[i]);
//        }
//        System.out.println("-------------------------------------------");

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter The Currency: ");
//        String currStr = scanner.next();
//        for(Currency currency : Currency.values()) {
//            System.out.println("Currency: " + currency);
//            if(currStr.equals(currency.name())){
//                System.out.println(currency);
//            }
//            else{
//                System.out.println(currency + " Not Match");
//            }
//            System.out.println();
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter The Currency: ");
//        String currencyCode = scanner.next();
//        for(Currency currency : Currency.values()){
//            System.out.println(currency + " : " + currency.getCurrencyCode());
//            if(currencyCode.equals(currency.getCurrencyCode())){
//                System.out.println("CurrencyCode: " + currency.getCurrencyCode());
//                System.out.println("CurrencyName: " + currency.name());
//                System.out.println(currency + " Match!! ");
//            }
//            else{
//                System.out.println(currency + " Not Match!! ");
//            }
//            System.out.println();
//        }

//        System.out.println(Currency.USD.getCurrencyCode());
//        System.out.println(Currency.USD.getCurrencyName());
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter The Currency: ");
//        String currStr = scanner.next();
//        for(Currency currency : Currency.values()){
//            System.out.println(currency + " : " + currency.getCurrencyCode() + " : " + currency.getCurrencyName());
//            if(currStr.equals(currency.getCurrencyCode()) || currStr.equals(currency.name())){
//                System.out.println(currency + " Match!! ");
//            }
//            else{
//                System.out.println(currency + " Not Match!! ");
//            }
//            System.out.println();
//        }

//        ------------------------------------------------------------
//        example 29
//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the file-name: ");
//            String fileName = scanner.next();
//            File file = new File(fileName);
//
//            do{
//                System.out.print("Enter the data: ");
//                String data = scanner.next();
//
//                if(data.equals("quit")) {
//                    break;
//                }
//                else {
//                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
//                    bufferedWriter.write(data);
//                    bufferedWriter.newLine();
//                    bufferedWriter.close();
//                }
//            }while (true);
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the file-name: ");
//            String fileName = scanner.next();
//            File file = new File(fileName);
//
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String line = null;
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//            bufferedReader.close();
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }

//        ------------------------------------------------------------
//        example 30
//        ExecutorService service = Executors.newFixedThreadPool(5);
//
//        for(int i = 1 ; i <= 20 ; i++) {
//            final int count = i;
//
//            Runnable runnable = new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(count);
//                    try {
//                        Thread.sleep(2000);
//                    }
//                    catch(InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            };
//            service.submit(runnable);
//        }
//        service.shutdown();
    }
}