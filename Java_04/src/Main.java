// Java 프로그래밍 - 조건문

public class Main {
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");



//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "apple";

        switch (fruit){
            case "apple":
                System.out.println(fruit+"은 500원");
                break;
            case "blue":



        }


//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 5;



//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);
        String grade="a";
        int score =9;
        score = 85;
        switch (score/10){
            case 10:
            case 9:
                grade = "a";
                break;
            case 8:
                grade="b";
            case 7:
                grade="c";
            default:
                grade="d";
                break;

                // score를 10으로 나눈 이유는 100점, 90점은 정상적으로 케이스에 걸리지만
            // 84점 같은 점수가 나타나면 걸리지 않기 때문에
            // 10으로 나누면 나머지가 어찌되든 몫에만 걸려서 10으로 나눔 ㅇㅇ
        }


    }
}
