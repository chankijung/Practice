// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
        System.out.println("입력 :");
        int a = System.in.read()-'0';
        System.out.println("a=" +a);
        System.in.read(new byte[System.in.available()]);
        //입력스트림에 남아있는 갯수만큼 바이트를 소진해줌


//      InputStreamReader
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3];
        System.out.println("입력 :"  );
        reader.read(c);
        System.out.println(c);
        //읽고자하는 숫자만큼 배열 만들어야 함

//      BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력 :");
        String s1 =br.readLine();
        System.out.println("s1 = " + s1);
    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
//        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        sc.nextLine();

        System.out.println("입력2:");
        System.out.println(sc.nextInt());
        sc.nextLine();

        System.out.println("입력3:");
        System.out.println(sc.nextLine());
        //가장 많이 사용

//      참고) 정수, 문자열 변환
        int num=Integer.parseInt("1234");
        String str = Integer.toString(12345);

        
//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("ㅎㅇ");
        System.out.printf("gg");


        //서식문자
        String s = "자바";
        int number=4;

        System.out.printf("%s는 언어선호도 %d위입니다\n",s ,number);
        System.out.printf("$d\n",10);
        //정수형
        System.out.printf("$o\n",10);
        //8진수
        System.out.printf("$x\n",10);
        //16진수
        System.out.printf("$f\n",5.2f);
        //소숫점
        System.out.printf("$c\n",'a');
        //문자
        System.out.printf("$s\n","sss");
        //문자열

        System.out.printf("%5d\n",123);
        System.out.printf("%5d\n",1234);
        System.out.printf("%5d\n",1235);

    }
}
