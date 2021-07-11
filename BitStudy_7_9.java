
public class BitStudy_7_9 {

	public static void main(String[] args) {
		
		// 자바의 연산
		// 3가지 핵심
		// 1) 자바의 정수연산은 무조건 int형으로 변환 후 수행 -> 당연히 결과도 int
		//    -> 자바의 정수연산에 long이 개입 시 결과도 long타입
		// 2) 서로 다른 타입의 연산은 큰 쪽에 맞추어야 한다.
		//    -> 실수와 정수의 연산은 크기에 상관없이 무조건 실수형을 따른다
		// 3) 타입을 서로 맞춰주는 과정에서 캐스팅은 손실이나 오버플로우의 위험이 있다.
		//    따라서 그릇을 크게 바꿔주는 것이 가장 안전한 길이다.
		// ** char 타입은 10진수(int)와 호환이 가능하다(아스키코드)
		
		 byte aaa = 120;
		 byte bbb = 7;
		 // xxx byte resultAB = aaa + bbb; // 불가능한 이유 : 자바의 정수 연산은 무조건 int로 변환 후 수행한다.
		 // ooo byte resultAB = (byte)(aaa+bbb); // 가능하지만 손실이 발생한다.
		 int resultAB = aaa + bbb; // 그릇을 크게 바꿔주는것이 가장 타당하다
		 System.out.println("resultAB : " + resultAB);
		 
		 short ccc = 8;
		 // xxx short resultAC = aaa + ccc; // 불가능한 이유 : 자바의 정수 연산은 무조건 int로 변환 후 수행한다.
		 int resultAC = aaa + ccc;
		 System.out.println("resultAC : " + resultAC);
		 
		 long ddd = 12;
		 // xxx int resultAD = aaa + ddd; // 자바의 정수연산은 int라더니? 불가능한 이유 : 타입은 큰 것을 따르는 규칙에 의하여 long이 개입한 경우 long으로 바꿔주어야 한다.
		 long resultAD = aaa + ddd;
		 System.out.println("resultAD : " + resultAD);
		 
		 // xxx float eee = 2.22; // 실수의 리터럴은 double이다. 캐스팅이나 접미사 F필요
		 float eee = 2.22F;
		 long fff = 20;
		 // xxx long resultED = eee + fff ; // 불가능 : 실수 + 정수형일경우 실수형을 따른다
		 // ooo long resultED = (long)(eee + fff) ; // 가능하지만 손실이 발생한다.
		 float resultED = eee + fff;
		 System.out.println("resultED : "+ resultED);
		 
		 char ggg = 'T';
		 char hhh = 't';
		 int resultGH = ggg + hhh;
		 System.out.println("resultGH : " + resultGH); // char은 10진수와 호환 - int 정수로 바뀌어 연산된다
		 
		 
		 
		 
		 // 제어문 For - 주로 반복적인 작업이 필요할 경우에 사용
		 										  // for 제어문 사용법
		 int iii = 3;							  // 기준값 설정
		 for(int jjj = 1; jjj <= 10; jjj++ ) {    // for ( (1)변화값의 초기값 설정 , (2)변하는 값의 범위 , (4)변화값의 방향 )
			 iii += jjj;						  // { (3)기준값과 변화값의 연산 }
		 }
		 System.out.println("iii : " + iii);	  // { 변화된 기준값 출력 }
		 
		 
		 char testa = 'A';
		 for(int testb = 3; (int)testb >= 0; testb--) {
			 testa -= testb;
		 }
		 System.out.println("testa : "+(char)testa);   // 아스키코드안에서 활동해 볼 수 있다

		 
		 
		 
		// 조건문 if 와 삼항연산자 - 중첩가능
		// 삼항연산자와 if문의 활용 차이점 : 단순한 조건문일수록 삼항연산자가 짧은 코드를 사용할 수 있고, 복잡한 조건문일수록 if문이 한눈에 보기 훨씬 편하다.
		// if문
		 int rrr = 3;                         
		 int sss = 14;									  // 변수 설정
		 if (rrr + sss == 17) {							  // if ( 조건[boolean] ) {
			 int ttt = 20;								  //     참일 경우의 결과
			 System.out.println(ttt-rrr-sss);
		 }else {										  //  }else{
			 System.out.println("False");				  //     거짓일 경우의 결과
		 }												  //  }

		// 삼항연산자
		int ooo = 100;
		int ppp = 120;
		String qqq = (ooo == ppp) ? "True" : "False";      // [결과값] = [조건] ? [맞으면 선택될 결과] : [틀리면 선택될 결과]; 
		System.out.println("String qqq : " + qqq);
			
		
		// 연산자 : 값을 비교하지 타입을 비교하지 않는다.
		// == : 같은지
		// != : 다른지

		int kkk = 25;
		double lll = 25.0;
		
		if(kkk == lll) {
			System.out.println("25=25.0");       // 판단 : 참
		}else {
			System.out.println("다르다");      // 판단 : 거짓
		}
		 
		if(kkk != lll) {					   // 부정연산자일때는 틀렸냐? 라고 물었기 때문에 틀린게 참이다
			System.out.println("다르다");       // 판단 : 참
		}else {
			System.out.println("25=25.0");       // 판단 : 거짓
		}

		// 비트연산자 :  &    |   //    비트연산자는 2진법으로 바꾼 후 계산
		// 논리연산자 : &&   ||	   //    short circuit : &&은 처음에 거짓 발견하면 끝. ||은 처음에 참 발견하면 끝 - 짧게 끝난다
		
		int mmm = 6 ;							// 0110
		int nnn = 5 ;							// 0101
		System.out.println(mmm & nnn); 		   // 2진수로 바꾸고 0101 진리표로 판단
		System.out.println(mmm | nnn);
			
		
		
		
		// 조건 제어문 switch - 중첩가능
		// 조건 + 제어문의 형태
		// 확정적인 값을 가질 때 실행됨 : if문과의 차이
		int uuu = 40;			 					    	 // switch문에 들어갈 입력값 변수 설정                          
		String vvv = "";			// 지역변수라서 초기화 필수	 	//
		switch (uuu) {										// switch문 입력값에는 정수[byte short int] / 문자[char] / 문자열[String] 가능 !! [long] 실수[float double] / 논리형[boolean] 불가능
			case 20 : 	vvv = "20";	// case 뒤의 내용과 입력값이 일치하면 : 뒤로 나오는 코드 실행
				break;										// break 나올 시 switch문 탈출 : 문법적으로 필수는 아님
			case 40 : 	vvv += 'a'; // 대입연산자 sum += a ::: sum = sum + a ::: 숫자 뿐만 아니라 문자도 가능함
			case 50 : 	vvv += 'b'; // 이를 이용하여 뒤에 나오는 모든 문자열을 합하게 될 수 있음 :: 경품문제 생각
			case 70 : 	vvv += 'c';							// break 없을 시 case와 일치하는 시점 뒤로 모든 해당 코드 실행
				break;
			default :	vvv = "out";			// default 뒤에는 case와 전혀 일치하지 않는 값을 입력시에 실행되는 코드들이 있다. 
		}										// switch문 밖에 출력문이 있다면 default 뒤에 출력문을 넣어선 안된다. 함께 출력된다. :: xxx default : System.out.println("out");
			System.out.println("vvv : " + vvv);
			
		
			
		// 난수
		// Math 클래스는 java.lang에 있어서 import하지않아도 바로 사용 가능
		// new 연산자 사용도 하지 않아도 된다. (static)
		// 창 맨 위에 투명하게 import java.lang.* 라고 고정되어 있다고 생각하면된다.
		// 결과 : double형태의 실수값을 return 받음 -- 0.0 보다 크거나 같고 1.0보다 작다
		System.out.println(Math.random()); // 0.0 보다 크거나 같고 1.0보다 작다
		System.out.println(Math.random()*10); // 0 보다 크거나 같고 10보다 작다
		System.out.println((int)(Math.random()*10)); // 0 ~ 9 까지의 정수
		System.out.println((int)((Math.random()*10)+1)); // 1 ~ 10 까지의 정수
		
			
		
}
   

	
	
}
