package ch1_JavaBasicProgramming.ch1_3_JavaDataType;

/*데이터 타입은 자바에서 다루는 데이터 종류이다.
* boolean, char, byte, short, int, long,float, double이 있다. */

/*레퍼런스 타입은 배열에 대한 레퍼런스, 클래스에 대한 레퍼런스, 인터페이스에 대한 레퍼런스로 이용된다.
* c,c++의 포인터와 비슷한 개념이다.*/


/*boolean (논리 타입, 1비트, true 또는 false)

* char (문자 타입, 2바이트, Unicode)

* byte (정수 타입, 1바이트, -128~127)
* short (정수 타입, 2바이트, -32768~32767)
* int (정수 타입, 4바이트, -2^31~2^31-1)
* long (정수 타입, 8바이트, -2^63~2^63-1)

* float (실수 타입, 4바이트, -3.4E38~3.4E38)
* double (실수 타입, 8바이트, -1.7E308~1.7E308)*/

public class dataType {

    public static void main(String[] args){
        /*자바에서 문자열은 기본 타입이 아님*/
        String toolName="JDK";
        System.out.println(toolName+1);

        //동일 타입의 변수 여러개를 선언할 떄 콤마로 분리하여 나열하고, 선언할 때 초기값 지정할 수 있다.
        char a,b,c='C';

        //리터럴은 프로그램에 직접 표현한 값을 말한다.

        /*정수 리터럴
        * int n= 15; 십진수 15
        * int m= 015; 015는 8진수로서 십진수 13
        * int k= 0x15; 0x15는 16진수로서 십진수 21
        * int b= 0b0101; 0b0101은 2진수로서 십진수 5
        * int a= null 기본 타입에 null은 지정할 수 없다.*/

        //long타입으로 지정하고 싶으면 숫자 뒤에 L,l을 붙인다
        long g=24L;


        /*실수 리터럴
        * double d= 0.1234;
        * double e= 1234E-4; 1234*10^-4와 같으므로 0.1234와 동일
        * float f= 0.1234f; f= 0.1234로 하면 컴파일 오류, 자바 실수
        * 기본 타입이 double이라서 끝에 f를 꼭 붙임.
        * double w= .1234D; .1234와 .1234D는 동일
        * float는 메모리를 적게 먹기에 큰 작업에 쓰이나 부정확
        * double은 메모리 더 많이 먹으나 정확.
        * 실수 계산은 bigDecimal 사용*/


        /*문자 리터럴
        * 단일 인용부호 ('')로 표현*/
        char as='W';
        char bs='글';




        /*특수문자 리터럴
        * \b 백스페이스
        * \t 탭
        * \n 라인피드
        * \f 폼피드
        * \r 캐리지 리턴
        * \" 이중 인용부호
        * \' 단일 인용부호
        * \\ 백슬래시*/


        /*논리타입 리터럴
        * 논리 타입 리터럴은 true, false 두가지 뿐이며
        * boolean 타입의 변수에 직접 치환하거나 조건문에 사용됨*/
        boolean ab=true;
        boolean bb=0<10;
        //while(true){...}


        /*var 키워드로 타입 생략 후 변수 선언
        * var name; 변수 선언문에 초깃값이 주어지지 않으면 오류 발생
        * var 키워드는 지역 변수에만 한정함*/
        var la=200;
        var lb='C';
        var lc="asdf ";
        var ld=1.45;
        var lr=1.35f;
        var lt=1.567D;


        /*상수
        * 상수는 final 키워드로 선언하며
        * PI=PI+1; 상수 선언시 값이 초기화 되면 더이상 변경이 불가하다.*/
        final double PI=3.141592;


        /*타입 변환
        * 변수나 상수, 리터럴을 다른 타입으로 변환하는 것이다*/

        //리터럴 25가 int타입인데 long 타입으로 자동 변환
        long qw=25;
        //실수 연산을 위해 10을 10.0으로 자동 변환
        double qg=25.5*10;
        /*큰 타입에서 작은 타입으로 변환 할때 자동 변환 대신 오류를 발생시킨다.
        * 이때 이걸 알고도 변환을 원한다면 */
        int qy=200;
        byte gf=(byte) qy;
        //위의 식과 같이 진행하면 데이터 손실 발생하면서 변환한다.
        //이와 같은 강제 타입 변환을 Casting(캐스팅)이라고 한다.




    }
}
