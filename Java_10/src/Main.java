// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person
abstract class Person{
    abstract void printInfo();
}


// 추상 클래스 상속
class Student extends Person{
    public void printInfo(){
        System.out.println("Student.printInfo();");
    }

}

public class Main {

    public static void main(String[] args) {
        
//        추상 클래스의 사용
//    Person p1 = new Person();
        //직접 사용 못함
        Student s1 = new Student();
        s1.printInfo();
        Person p2 =new Person() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo()");
            }
        };
        //추상클래스를 받아올때는 끝에 ; 필요
        p2.printInfo();
    }

}
