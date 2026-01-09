package ch1_JavaBasicProgramming.ch1_1_JavaProgramStructure;
//한줄 주석문은 '//'로 표현
/*여러줄의 주석문은
* 이렇게 표현*/

public class Hello {

    //메소드
    public static int sum(int n,int m){
        return n+m;
    }

    /*메인 메소드에서 시작. 퍼블릭인 이유는 jvm에서도 접근이 가능토록 하기위해서이며
    * static인 이유는 메인 메소드를 바로 메모리에 올리기 위한 것, 즉 인스턴스 생성 과정 생략하고 바로
    * 프로그램 시작을 위한것. 리턴 타입이 void인 이유는 메인 메소드는 리턴을 위한 메소드가 아니며,
    * 리턴 타입이 있고 리턴 값이 있더라도 jvm에서 무시함. 메소드 이름이 main인 이유는 jvm은
    * 메소드 이름이 main인 것만 실행하도록 약속해놓음. String[] args는 스트링 배열을 프로그램 시작하면서
    * 외부에서 스트링 배열 값들을 가져오기 위함이다. args는 다른 이름으로 변경이 가능하다.*/
    public static void main(String[] args){

        //변수 선언. 변수 타입과 식별자와 값으로 구성.
        int i=20;

        int s;

        char a;

        //메소드 호물문의 예
        s=sum(i,10);
        a='?';

        System.out.println(a);
        //Hello 문자열 출력
        System.out.println("Hello");
        System.out.println(s);
    }
}
