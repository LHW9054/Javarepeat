package variable;

public class Ex01 {
	public static void main(String[] args) {
		
		// 변수 : 값을 저장해 두었다가, 다시 사용하기 위한 메모리 공간(값의 재활용)
		// 함수 : 일정한 코드를 필요할때 마다 실행하기 위한 코드의 집합(코드의 재활용)
		// 클래스: 일정한 형식을 정의해두었다가, 객체를 생성하기 위해 여러번 사용하는 타입(타입의 재활용)
		
		
		// 변수를 주소로 참조하면, 포인터(자바에서는 사용하지 않는다.)
		// 변수를 이름으로 참조하면(reference)
		
		// 변수를 생성하기 위해서는 자료형을 명시해야 한다.(변수의 선언)
		// 이미 선언된 변수는 이름만으로 참조가능하다.
		// 변수에 값을 저장하는 작업을 , 할당 혹은 대입이라고 한다.
		// 변수를 선언하면서 동시에 값을 할당하는 작업을 초기화 라고 한다.
		
		int num;	//[자료형] [변수이름]
		num = 12;	// 변수에 값을 저장

		int num2 = 23;	// 변수 선언 및 초기화
		
		System.out.println(num);//선언된 변수는 이름만으로 참조할수 있다
		System.out.println(num2);
		
//		int num = 25; // 이미 선언된 변수는 지료형을 명시하지 않는다.
					  // 새로운 변수를 만들기 위해서는 기존변수와 이름이 겹치지 않아야 한다.
		
		num2 = num; //대입연산의 좌변은 공간
					//대입연산의 우변은 값
					// 우변부터 먼저 처리한다.
		
		num2 = num; //대입연산의 좌변은 공간
					//대입연산의 우변은 값
					//우변부터 먼저 처리한다.
		
//		num2 = num +2*3-4;
		
		num = 5;	//대입연산자 '=' 는 등호가 아니다.
//		5 = num;	//등호는'=='로 표기한다.
		
		System.out.println(num2);
		
//		System.out.println(num3); // 선언하지 않았거나, 값이 할당되지 않았으면 참조불가
		
		int num3;
//		System.out.println(num3);	//값이 할당되지 않았음
		
		
		
		
	}
}
