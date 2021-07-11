
public class BitStudy_7_8 {

	public static void main(String[] args) {
		System.out.println("이론정리");
		
		// 컴파일과 메모리
		// 1) java 파일 생성
		// 2) javac(compiler)가 컴파일을 통해 실행파일 형성(class파일)
		// 3) JRE의 JVM을 통해서 class 파일 실행 -> CPU에서 메모리 할당받음(to stack : main 함수)
		// 4) main함수가 할당받은 메모리에서 변수와 크기 및 초기화 설정
		// 5) 클래스 변수들은 new 연산자를 통해 heap 메모리영역에 객체형성(인스턴스)
		// 6) new 연산자를 통해 만들어진 클래스 변수는 주소값을 할당 받음
		// 7) 입력값에 따라 프로그램 진행 후 모든 메소드가 끝나면 프로그램 종료 -> 메모리 반납

		// 패키지와 클래스
		// 패키지 == 폴더 == 회사 도메인이름으로 저장하여 같은 클래스에 대해 다르게 저장가능		클래스변수
		// 클래스 == 객체를 만들 수 있는 설계도이자 (사용자 정의) 데이터 타입       ex) Emp    emp   =   new   Emp()
		// 클래스명의 맨앞글자는 대문자										 데이터타입 변수이름
		// main 함수가 있는 class : 독자적으로 실행이 가능
		// main 함수가 없는 class : 독자적으로 실행이 불가능 -> 보조 설계도
		
		// 변수 : 선언되는 위치에 따라 구분
		// 객체 변수 : 클래스 바로 하위에 위치하는 변수 - default값이 존재하여 따로 초기화 하지 않아도됨 ** 일부러 초기화 하지 않는다면 설계자의 의도를 파악해보자
		// 지역 변수 : 함수 하위에 위치하는 변수 - 함수가 끝나면 소멸 - 반드시 초기화 후 사용하여야함
		// 블록 변수 : if 나 for문 안에서 정의되는 변수
		// 변수이름의 맨앞글자는 대문자 안씀 : 클래스명이 대문자이용
		
		// 함수(메서드) : 기능
		// 함수안의 함수는 불가능 : 호출만 가능
		
		// 데이터 타입
		// 8가지 기본 타입 : 객체에 값을 저장
		// 객체에 저장되는 것이 숫자냐 논리냐에 따라 다름
		// 숫자 : byte = 정수     | 1바이트 | 8비트  | 범위 -2^7 ~ 2^7-1   |
		// 	 	 char = 한문자 '' | 2바이트 | 16비트 | 범위 -2^15 ~ 2^15-1 | 아스키코드 A = 65 / a = 97
		//  	 short = 정수    | 2바이트 | 16비트 | 범위 -2^15 ~ 2^15-1  | C언어와 호환
		// 		 int = 정수      | 4바이트 | 32비트 | 범위 -2^31 ~ 2^31-1  | -21억~21억   | 정수의 리터럴 | 정수 연산의 기본형
		//		 long = 정수     | 8바이트 | 64비트 | 범위 -2^63 ~ 2^63-1  | 정수와 연산시 long에 맞추어야함 | 접미사L로 상당히 큰 숫자도 8비트로 강제고정가능
		//       float = 실수    | 4바이트 | 범위 대략 소숫점 7~9 자리        | 접미사 F
		//		 double = 실수   | 8바이트 | 범위 대략 소숫점 15~17 자리      | float보다 정밀 | 실수의 리터럴 | 실수 연산의 기본형
		// 논리 : boolean = True or False | 0과 1이 아님
		// 문자열 : String = 문자열 ""       | 원래는 주소형 타입이지만(class) 기본형 처럼 사용할 것 | 문자열+숫자의 경우 숫자를 문자열로 취급하여 생각한다 ex) "100"+100 == 100100
		// 주소형 타입 : 객체에 주소를 저장 |  class , 배열 etc
		
		
		
		
	
	
	
	
	
	}

}