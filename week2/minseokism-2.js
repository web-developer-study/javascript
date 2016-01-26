/*
 2016-01-16 weak2 homework
 2. 아래와 같이 입력한 숫자를 역순으로 출력하는 프로그램을 작성하세요.
 -  문자열, 배열, 기타 자료구조(리스트 등)사용 불가
 -  예시) reverseNum(54321);
 -       reverseNum(9876); 
 -       
 -       역순은 : 12345
 -       역순은 : 6789
 */

function reverseNum(x){
	var output="역순은 : ";        // 출력이자 역순으로 저장할 변수
	
	while(!x==0){       		 // x 가 0이 될때까지 반복  
		output+=(x%10);			 // x 를 10으로 나눈 나머지를 순서대로 output에 저장
		x=Math.floor(x/10);		 // x 를 10으로 나눈 몫을 정수로 다시 x에 저장 	
	}
	
	console.log(output);         // 결과물 출력
};

reverseNum(54321);

reverseNum(9876);