function reverseNum(num){
	var s="";
	while(num>0){
		s += num%10; // 10으로 나눠서 나머지 값을 s 문자열에 while문이 끝날때까지 차례대로 추가
		num = Math.floor(num/10); // 나머지를 구했으면 10으로 나누고 소숫점을 버리고 다시 num에 넣어주고 위의 과정 반복
	}
	console.log(s);
}

reverseNum(9876);
