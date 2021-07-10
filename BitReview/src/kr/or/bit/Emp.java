package kr.or.bit;


/*
 * 
 설계도 그리기 (회사 사원의 정보)
 */

public class Emp {   // Emp 설계도 - 설계도는 메모리에 올리지 않으면 종이조각에 불과
					// public private -> modifier
	
	// 정보를 담을 수 있는 변수 - 설계도를 만드는 자원
	// 사원은 사번을 가지고 있다
	// 변수 >> 데이터(자료).정보 >> (고유-안바뀜:자동차 제조사, 상태-바뀜:자동차 속도, 부품정보-하나의 값으로 표현되지 않음: 자동차엔진=벨트+철판
	// int String - 자료형 int - 4바이트 - 메모리가 적은 사양에서는 아껴쓰는것이 좋음(작은것을 쓰는 것이 좋음) : 지금은 메모리 충분한 시대
	private int empno; // 사번 : 메모리 공간을 4바이트로하고 정수를 가르키며 그 공간의 이름을 empno라고 칭함
	private String ename; // 이름
	private String job; // 직종
	private int sal; // 급여
	
	public String eat;
	
	// 객체 지향 언어의 3대 특징 = 상속 다형성 캡슐화(은닉화) - private
	
	//private 자원을 보호
	// 직접 할당을 막고 간접할당을 통하여 데이터 제어
	// 간접할당 -> 함수(기능) / method *********

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
