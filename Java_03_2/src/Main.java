// Java 프로그래밍 - 여러가지 연산자_2

public class Main {
    public static void main(String[] args) {

//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&)
        int num1=5;
        int num2=3;
        int result=0;
        result=num1&num2;
        System.out.println("result:"+result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

        //printf는 포맷에 맞게 데이터 값을 넣어서 출력
        //%04는 4자리수인데 부족한부부은 9으로
        //d 는 서식문자(자료형 타입에 맞게)

//      1-2. OR 연산자 (|)
        result=num1|num2;
        System.out.println("result:"+result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


//      1-3. XOR 연산자 (^)
        result=num1^num2;
        System.out.println("result:"+result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


//      1-4. 반전 연산자 (~)
        System.out.println("==~==");
        num1=5;
        result =~num1;
        System.out.println("result:"+result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%s\n", Integer.toBinaryString(result));
        //바이트는 32자리라서 앞에 부호비트가 전부 1로 바뀜

//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      2-1. << 연산자
        int numA=3;

        result=numA << 1;
        System.out.println("result:"+result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


//      2-2. >> 연산자
        result=numA >> 1;
        System.out.println("result:"+result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


//      2-3. >>> 연산자

        numA=-5;
        result=numA >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));
        result=numA>>>1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));
        //비트연산자는 많이 나오진 않음

    }

}
