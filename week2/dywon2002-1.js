function getRandomNum(a,b){
	
	// 뽑을 숫자 개수와 범위 비교
	if(a<b){
		console.log("뽑아낼 숫자의 개수가 범위보다 많습니다\n프로그램을 종료합니다");
	} 
	else{ // a>=b일 경우
	console.log(a+"개 숫자 중 랜덤한 숫자 "+b+"개는");
	var result = new Array(a); // 입력한 숫자 범위의 배열 생성
	for(var i=1;i<=a;i++){
		result[i-1]=i; // 숫자 1부터 범위 만큼 배열에 숫자를 1씩 증가시키며 값을 대입
	}
	for(var i=0;i<200;i++){ 
		var seq = Math.floor(Math.random()*a); // 랜덤 함수로 범위 내에서 숫자를 하나 임의로 뽑는다(0부터 a-1까지)
		var temp = result[0]; // swap 과정(배열 0번째 값과 랜덤 함수로 뽑은 숫자의 배열에 담긴 숫자를 200번 변경)
		result[0] = result[seq]; // result 배열안의 값을 i++순이 아닌 마구잡이로 셔플 한다
		result[seq] = temp;
	}
	for(var i=0;i<b;i++){
		console.log(result[i]); // 0번째부터 b의 개수만큼 뽑아낸다
	}

}
};
getRandomNum(6,2);