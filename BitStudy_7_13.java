
public class BitStudy_7_13 {

	public static void main(String[] args) {

		// 접근자
		
		// 폴더와 폴더 간의 접근을 다룸 : 같은 파일 클래스 내에선 전혀 상관없다.
		// 아무것도 쓰지않으면 default : 같은 폴더 끼리만 언급 가능 -- 보통 연습외엔 쓰지않음
		// public : 같은 / 다른폴더도 언급 가능
		// private : 어디든 직접언급 불가 -- OOP 3대 특징인 캡슐화(은닉화)의 핵심 -- 변수의 경우 간접적으로 언급하여(getter[읽고] setter[쓰고]) 사용가능
		//                                         ㄴ 캡슐화 : 설계자가 의도한대로 진행할 수 있도록 기능과 형태를 제한해둔 것
		
		
		// 클래스
		
		// 클래스 == 설계도 == Type (사용자 정의 타입)
		// 클래스 (속성 + 기능) = member field + method
		// member field : 정보를 담을 수 있는 변수 >> ex) 사원은 [숫자형태]로 된 [사번]을 가지고 있다
		// 변수 만들 때
		// 1. 고유 / 상태 / 부품 선정
		// 2. 들어갈 타입 결정
		// =>> " instance variable "
		
		
		// 변수

		// 변수는 [scope(유효범위) : 선언되는 위치] 가 중요하다
		// 1. local variable 지역변수 : 함수안에 들어가는 함수 -- default 값이 없다 -- 사용할때 반드시 초기화 필요
		//     ㄴ block variable 블럭변수 : 함수 안에 if/for 블럭 안의 변수 -- 제어구문이실행되면 생성되고 끝나면 사라진다
		// 2. instance variable : 생성되는 객체마다 다른 값을 가진다 -- default 값이 있다 -- 초기화 할 필요 x
		//     ㄴ int = 0 , String = null , playground = null (클래스 변수의 default값은 null : 주소가 만들어지기 전이라 null)
		//    2.1 객체변수를 바로 초기화해도 문법적으로 전혀 문제는 없다.
		//        ㄴ 설계도는 유연해야하기 때문에 초기화 하지 않는 것이 좋다.
		//        ㄴ 단순하게 정리 : 설계도의 member field는 초기화 하지마라
		//        ㄴ 초기화는 생성자 함수의 역할이다.--POINT
		// 3. static variable : 객체 간 공유 자원 (new 사용하지 않아도 사용가능)
		
		
		// 함수
		
		// 함수(method : 기능 , 행위 정의하는 최소 단위 : 하나의 함수는 하나의 기능 구현  ex) 먹는다, 잔다, 걷는다
		// 함수는 호출에 의해서만 동작한다
		// 함수의 이름 ( 관용적 표현 : 써보니 나쁘지 않은 것으로 구전되어오는 것들 )
		// 의미있는 단어의 조합으로 만들 것 : 함수의 이름을 보고 어떤 함수인지 유추 할 수 있으면 잘 만든 것
		// 클래스의 첫글자는 대문자 : 첫글자는 소문자로 
		
		// java 함수 문법
		// 1. 일반함수 : void(return x) , parameter 가 있는 경우 >> public void print(String str){ 실행코드 }
		// 2. 일반함수 : void(return x) , parameter 가 없는 경우 >> public void print() { 실행코드 } : 일반적인 함수
		// 3. return type    , parameter 가 있는 경우 >> public int print(int data) { return return되는값(ex)data + 100; }
		// 4. return type    , parameter 가 없는 경우 >> public int print() { return return되는값(ex) 100; }
		
		// void -- 돌려주는 것이 없다 : return value 없다
		// return type >> 8가지 기본 타입 + String + [Array + Class + Collection + Interface] 
		// ex) boolean print (boolean bo) {}
		//	   ㄴ받아주는 값이 있으므로 반드시 return 필요
		
		// 함수이름(인자,파라메터 : 동전구멍 -- 넣은 타입이랑 같은 타입으로 넣어야 실행됨)
		// () : 동전구멍이 없음 -- 무제한으로 이용가능
		// parameter type >> 위와 동일
		// ㄴ parameter의 개수는 제한이 없지만 작동하려면 반드시 다 넣어주어야 실행이 된다.
	    // ex) void print(int a, int b, int c, int d, int e){}
	    //     ㄴ 반드시 5개의 parameter에 다 넣어주어야 실행된다 --> 다 안 넣으면 오류
	 
	 
	 



		 

	}

}
