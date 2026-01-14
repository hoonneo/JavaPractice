package ch1_JavaBasicProgramming.ch1_4_Input;


/*Scanner scanner = new Scanner(System.in) Scanner 객체 생성
* scanner 객체는 System.in으로 키보드로부터 입력을 받고 System.in이 반환하는 바이트 스트림을
* 문자, 문자열, 정수, 실수 등으로 변환하여 리턴*/

/*사용자가 입력하는 키 값을 공백 ('\f','\r',' ','\n')으로 구분되는 토큰 단위로 읽음*/

/* Scanner 클래스 주요 메소드
* String next()  다음 토큰을 문자열로 리턴
* byte nextByte()  다음 토큰을 byte 타입으로 리턴
* short nextShort() 다음 토큰을 short 타입으로 리턴
* int nextInt()  다음 토큰을 int 타입으로 리턴
* long nextLong()  다음 토큰을 long 타입으로 리턴
* float nextFloat()  다음 토큰을 float 타입으로 리턴
* double nextDouble()  다음 토큰을 double 타입으로 리턴
* boolean nextBoolean()  다음 토큰을 boolean 타입으로 리턴
* String nextLine()  '\n'을 포함하는 한 라인을 읽고 '\n'을 버린 나머지만 문자열로 리턴
* boolean hasNext()  현재 입력된 토큰이 있으면 true, 아니면 새로운 입력 때까지 무한정 대기, 새로운
* 입력이 들어왔을 때 true 리턴, 컨트롤 z키가 입력되면 입력 끝이므로 false 리턴  */

import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        System.out.println("당신의 정보를 입력하시오");
        Scanner scanner=new Scanner(System.in);

        System.out.println("이름을 입력하시오: ");
        String name=scanner.next();

        System.out.println("나이를 입력하시오: ");
        int age=scanner.nextInt();

        System.out.println("체중을 입력하시오: ");
        double weight=scanner.nextDouble();

        String sex;
        while(true){
            System.out.println("성별을 입력하시오(Male/Female): ");
            sex=scanner.next();
            if(sex.equals("Male")||sex.equals("Female")){
                break;
            }else{
                System.out.println("Male/Female 중에 하나 입력하시오!");
            }
        }

        System.out.printf("당신의 이름: %s, 당신의 나이: %d, 당신의 체중: %f, 당신의 성별: %s",name,age,weight,sex);
    }
}
