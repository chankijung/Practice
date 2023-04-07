// Java 프로그래밍 - 클래스와 객체_2

import car.Car2;

class Car {
    String name;
    String type;

    Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 오버로딩 구현
    public void printCarInfo(String date){
        this.printCarInfo();
        System.out.println("date :"+date);
    }
    public void printCarInfo(int number){
        this.printCarInfo();
        System.out.println("number :"+number);
    }
    public void printCarInfo(String date, int number){
        this.printCarInfo();
        System.out.println("date :"+date);
        System.out.println("number :"+number);

    }

}


class Car3 {
    // 스태틱 변수
    static String name="None";

    String type;

    Car3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("=== Car Info ===");
        System.out.println("name: " + name);
        System.out.println("type: " + type);
    }

    // 스태틱 메소드
    public static void getName(){
        System.out.println("Car name: " +name);
    }

}


public class Main {

    public static void main(String[] args) {
        Car myCar1 = new Car("a", "sedan");
        myCar1.printCarInfo();

//      1. 오버로딩 사용
        System.out.println("=== 오버로딩 사용 ===");
        myCar1.printCarInfo();
        myCar1.printCarInfo(2002);
        myCar1.printCarInfo("1233");
        myCar1.printCarInfo("1233",2002);


//      2. 접근 제어자
        System.out.println("=== 접근 제어자 ===");
        Car2 myCar2= new Car2("a","b","c","d","e");
        System.out.println(myCar2.name1);
//        System.out.println(myCar2.name2);
//        System.out.println(myCar2.name3);
//        System.out.println(myCar2.name4);
//        System.out.println(myCar2.name5);




//      3. Static
        System.out.println("=== Static ===");
        Car3.getName();
        //객체생성안했는데 사용가능
        //스태틱이 붙으면 안에서 쓰는 변수도 스태틱이어야 한다.

        Car3 myCar3_1 = new Car3("a","sedan");
        Car3 myCar3_2 = new Car3("b","suv");
        Car3 myCar3_3 = new Car3("c","rv");

        myCar3_1.printCarInfo();
        myCar3_2.printCarInfo();
        myCar3_3.printCarInfo();

        //스태틱으로 name을 설정했기 때문에
        //마지막에 입력된 name값이 static에 남고 이것이 공유 됨
    }

}