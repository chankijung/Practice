// Java 프로그래밍 - 클래스와 객체_1

// Car 클래스 - 객체변수, 메소드


// Car2 클래스 - 생성자, this

//      Car 클래스 사용
class Car{
    String name;
    String type;
    public void printCarInfo(){
        System.out.println("car Info");
        System.out.println("name="+name);
        System.out.println("type="+type);
    }
    public void move(){
        System.out.println("이동");
    }
    public void brake(){
        System.out.println("정지");
    }
}
//      Car2 클래스 사
class Car2{
    String name;
    String type;

    Car2(String name, String type){
        this.name=name;
        this.type=type;
        System.out.println("생성자 출력");
    }
    public void carInfo(){
        System.out.println("=carinfo=");
        System.out.println("name="+name);
        System.out.println("type="+type);
    }
    public void load(){
        System.out.println("짐을 주세요");
    }
    public void horn(){
        System.out.println("빵빵");
    }
}
public class Main {

    public static void main(String[] args) {
    Car myCar = new Car();
    myCar.name="a";
    myCar.type="suv";
    myCar.printCarInfo();
    myCar.move();
    myCar.brake();

    Car2 myCar2=new Car2("b","sedan");
    myCar2.carInfo();
    myCar2.load();
    myCar2.horn();

    }
}
