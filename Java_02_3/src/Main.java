// Java 프로그래밍 - 변수와 자료형_3



public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1="Hello Wolrd";
        System.out.println("s1="+s1);
        String s2= "01234";
        System.out.println("s2="+s2);

//      1-1. equals
        String s3="hi";
        String s4="hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);

        String s5= new String("hi");
        System.out.println(s3.equals(s5));
        // equals 는 값을 비교

        System.out.println(s3==s5);
        //new String은 새롭게 데이터를 만들기 때문에
        //서로 다른 객체가 되기 때문에 s3 과 s5는 다르다

//      1-2. indexOf
        String s6="hello! wolrd!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!", s6.indexOf("!")+1));
        //몇번째 인덱스부터 찾을 지 설정가능(2번째 것)

//      1-3. replace
        String s7=s6.replace("hello", "bye");
        System.out.println(s7);

//      1-4. substring
        System.out.println(s7.substring(0,3));
        System.out.println(s7.substring(0,s7.indexOf("!")+1));

//      1-5. toUpperCase
        System.out.println(s7.toUpperCase());



//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1:"+sb1);
        sb1.append("56780");
        System.out.println("sb1:"+sb1);
        String a= "01234";
        String b = "567889";
        String bak=a;
        System.out.println(a==bak);
        a+=b;
        System.out.println(a);
        System.out.println(a==bak);

        //문자열의 데이터가 빈번하게 변경,삭제되면 StringBuffer 사용
        //String을 자주 사용하면 메모리가 빈번히 새로 생성된다.



//      3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] array1 ={1,2,3,4,5};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);

        char[] array2={'a','b','c','d','e'};
        System.out.println(array2[3]);

        String[] array3 = new String[3];
        array3[0]="hello";
        array3[1]=" ";
        array3[2]="world";
        System.out.println(array3[0]+array3[1]+array3[2]);

    }
}
