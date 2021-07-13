import java.util.Scanner;

public class BitStudy_7_12 {

	public static void main(String[] args) {
		
		// 참고하면 좋은 강좌들
		
		// 드림코딩 엘리 자바스크립트 기초강의 ES5+
		// 얄팍한 코딩사전 : 개념을 쉽고 잘 이해할수 있도록 설명해둠
		// 형상관리 간단한 과제 나갈 예정
		
		
		// [git]
		
		// 간단한 흐름 설명
		// 내 PC에 로컬 저장소(로컬 리파지토리) : 스냅샷 저장본
		// --add----->
		// Stage : 내가 작업한 내용 올려둠 | 버전관리가 가능함 | 여러개의 작업을 하나의 스냅샷으로 만들 수 있음
		// --commit-->
		// 버전을 만드는 작업 -> 로컬에만 있으면 타인과 공유 불가 -> github에게 폴더를 빌려야 함
		// --push---->
		// github에 원격 저장소(리모트 리파지토리)
		// 원격 저장소에 두는 이유 : 나의 소스를 여러명이 접근해서 작업할 수 있도록 도와줌
		
		// git 잘못쓰면 다 날라가고 절대 복구 불가 -> 꼬이면 겉잡을수 없다	
		// 계속 실패하면서 날려봐야 익히기 빠르다
		// 첫번째 프로젝트 : 협업 x - pull push만 하는 수준
		// 두번째 프로젝트 : 협업 권장(강제x)
		// 마지막 프로젝트 : 협업 필수 - CLI / 이클립스 / 툴 쓸지는 자유
		// 첫번째과제 : 1)개인별 깃허브에 가입하기 - 2)저장소 만들기 - 3)깃 설치 - 4)깃배시로 저장소 만들기 git init - 5)add로 문서만들고 - 등등.. 과제 낼 때 설명
		
		
		// [UML]
		
		// UML 언어 - 그림을 그리는 것도 언어
		// 어떤 나라에서든 커뮤니케이션이 가능하도록 해석을 맞추자 : 그림
		// 대표적으로 할 수 있는것 : 설계도 그리기
		
		
		// [출력 : Print 함수]
		
		// java : System.out.println(); // 오버로딩이 된 상태라서 바로 실행 가능
		// 공백 : 출력 -- 줄바꿈이나 띄어쓰기없음 -- 뒤에 값과 붙여서 나옴
		System.out.print(" ");
		
		// ln : 내부적으로 줄바꿈 포함됨
		System.out.println();
		
		// f : formating -- 형식을 정해둔 위치에 같은 형식이 입력되도록 함
		//     ㄴ %d , %f , %s , %c
		int d = 10;
		double f = 3.14;
		String s = "안녕";
		char c = 'a';
		System.out.printf("%d \n" , d);  // 10진수
		System.out.printf("%f \n" , f);  // 실수
		System.out.printf("%s \n" , s ); // 문자열
		System.out.printf("%c \n" , c);  // 한 문자
		
		
		// [입력 : Scanner]
		
		// import java.util.Scanner; : 사용하려는 자원의 패키지를 먼저 import시켜야 사용가능하다 -- ctrl shift o
		Scanner sc = new Scanner(System.in);
		// 키보드로 입력한 내용을 입력시킬 수 있다.
		// 함수 실행 시 입력 받을 때까지 무한 대기한다.
		// 주의 사항 : 이클립스에서 입출력 작업 할 때 nextInt, Float 보다는 Line을 사용하는 것이 좋다. 값이 안받거나 넘어가버림(enter를 숫자로 인식해서 받아버림)
		
		// sc.nextline()  : 문자열을 입력받는다
		s = sc.nextLine();
		// sc.nextInt()   : 정수를 입력받는다
		d = sc.nextInt();
		// sc.nextFloat() : 실수를 입력받는다
		f = sc.nextFloat();
		
		// 웹화면에서 사용자가 입력하는 모든 값은 문자열 [String]이다
		// 결합 또는 연산을 할때는 [문자열] -> [숫자] (정수, 실수) 로 바꾸는 작업이 필요
		d = Integer.parseInt("1000");  //  1000 이라는 숫자 정수로 바꿔줌
		f = Float.parseFloat("3.14");  // 3.14 라는   숫자 실수로 바꿔줌
		
		
		// [반드시 외워야 하는 3문]
		
		// 조건문 : if문 3가지, switch(경우){case break}
		// 반복문 : for(반복횟수 정확) while(조건 t/f에 따라 무한루프가능) do~while (반드시 한번은 진행하는 while문)
		// 분기문 : break(블럭탈출) continue(아래 구문 skip(무시))
		
		// if문
		// 구조 : if(조건[boolean]) { 참 일시 실행 } else { 거짓 일시 실행 }
		// 단일 if문은 실행블럭 생략 가능
		if(2>1) System.out.println("a");
		
		// switch문
		// 구조 : switch(변수) { case [기대할 수 있는 경우들1] : 해당 될 시 실행
		//						break;  여기서 멈춰서 switch문 탈출 -- 없어도 문법적으로 문제되지 않음 -- 다만 변수와 기대하는 경우가 맞는 case에서 없으면 밑의 case들에 대해 모두 실행됨
		//					  case [기대할 수 있는 경우들2] : 해당 될 시 실행
		//								:
		//								:
		//					  default : 기대할 수 있는 경우들에 대해 모두 해당되지 않는 경우 실행
		//					}
		
		s = "a";
		switch(s) {
		case "a" : System.out.println("일치");
		break;
		default  : System.out.println("틀림");
		}
		
		// for문
		// 반복 횟수가 정해져 있는 경우 사용
		// 구조 : 기준값 정의 후 for(변화값 정의 , 변하는 범위 , 변하는 방식){ 기준값과 변화값의 연산 }
		for(int a=1 ; a<10 ; a++) {
			d+=a;
		}
		
		// while문
		// 반복횟수가 정해지지 않은 경우 사용 -- 무한 루프 or 조건에 따라 멈춤
		// 구조 : 기준값 정의 후 while(기준값에 대한 조건 [boolean]) { 기준값의 변화 : 멈추거나 제어 할 수 있는 조건으로 써야 무한루프 없다 }
		// 기준값에 대한 조건이 거짓일 경우 탈출한다.
		// 논리 순서가 상당히 중요하므로 의도한 대로 정확한 배치가 중요하다
		// 구구단 생성하는데 기본적으로 사용됨
		// 다시 입력하라는 무한루프 문구를 만드는 데 사용됨
		int k = 2;
		int p = 1;
		while(k<=9) {
			p=1;
			while(p<=9) {
				System.out.printf("[%d]*[%d]=[%d]\t",k,p,k*p);
				p++;
			}
			System.out.println();
			k++;
		}
		
		// do-while문
		// 강제로 한번 수행하고 그 다음 회차부터는 조건을 보고 거짓일시 탈출
		// do { 실행할 내용 } while (조건); : 한번 실행하고, 조건이 참 일시 do 다시 실행 / 거짓 일시 탈출
		
		// 분기문 continue / break
		// continue : 아래 구문 skip(무시)
		// break(for 블럭, while 블럭) : 멈추고 그 다음 루프 시작
		

	}

}
