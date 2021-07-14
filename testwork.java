
public class testwork {

		public static void main(String[] args) {
			int[] lotto = new int[6] ;
			for (int i=0; i<6; i++) {
				lotto[i] =  (int)(Math.random()*45+1);  //임의값 6개 생성
				
				for (int j=0; j<i; j++) { //기존 i에 추가 생성되는 j값이				
					if (lotto[i] == lotto[j]) { //기존i 와 같다면
						--i;				// i -1을 하고 (다시 순환하도록)
						break;				//if문을 빠져나간다(j값 생성 for문으로					
					} 	
								
					if( lotto[i] < lotto[j]) {				
						int changer = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = changer;
					}
				}	
							
			}
			//검수 (향상 for문)
			for(int lottovalue : lotto) {
				System.out.printf("[%d]", lottovalue);
			}
		}
	}

	

