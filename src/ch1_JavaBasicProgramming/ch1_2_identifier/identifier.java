package ch1_JavaBasicProgramming.ch1_2_identifier;

public class identifier {

    public static void main(String[] args){

        /*변수 선언. int i에서 i는 식별자이다. int는 변수의 타입이다.
         *식별자는 특수문자, 공백은 사용 불가이나 '_','$'는 예외이다.
         * 식별자로 한글 사용 불가이고 if,while, class같은 자바 언어 키워드는 사용불가이다.
         * 식별자 첫 문자로 숫자는 사용 불가이다.
         * 대소문자 구별하고 길이 제한은 없다. */
        int i=20;

        int s;

        char a;

        a='?';
        System.out.println(a);
        System.out.println("Hello");

    }
}
