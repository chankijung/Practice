// Java 프로그래밍 - 예외 처리

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//없는 예외 만들때 런타임예외를 상속받는다
class NotTenException extends RuntimeException{

}
public class Main {

    public static boolean checkTen(int ten) {
        if (ten != 10) {
           return false;
        }

        return true;
    }

    public static boolean checkTenWithException(int ten) {
        try {
            if(ten!=10){
                throw new NotTenException();
            }

        }catch (NotTenException e){
            System.out.println("e = " + e);
            return false;
        }

        return true;
    }

    public static boolean checkTenWithThrows(int ten) throws NotTenException {

            if(ten!=10) {
                throw new NotTenException();
            }


        return true;
    }

    public static void main(String[] args) throws IOException {

//      1. 예외
//      1-1. 0으로 나누기
        System.out.println("== 0으로 나누기 ==");
//      int a = 5 / 0;


//      1-2. 배열 인덱스 초과
        System.out.println("== 배열 인덱스 초과 ==");
        int[] b = new int[4];
//        b[4] = 1;

        
//      1-3. 없는 파일 열기
        System.out.println("== 없는 파일 열기 ==");
//        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));


//      2. throw, throws
        //throws 예외갑 처리 전가
        System.out.println("== checkTen ==");
        boolean checkResult = Main.checkTen(10);
        System.out.println("checkResult = " + checkResult);
        checkResult = Main.checkTenWithException(20);
        System.out.println("checkResult = " + checkResult);
        System.out.println("== checkTenWithException ==");


        System.out.println("== checkTenWithThrows ==");
        try{
            checkResult=checkTenWithThrows(5);
        }catch (NotTenException e){
            System.out.println("e = " + e);

        }
        System.out.println("checkResult="+checkResult);



    }

}
