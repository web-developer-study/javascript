function getRandomNum(range, count) {
	var freq = [];
	console.log("20개 숫자중 랜덤한 숫자 5개는");

	while(count > 0) {
		var ranNum = parseInt(Math.random() * range) + 1;
		
		if(freq[ranNum] != -1) {
			console.log(ranNum);
			freq[ranNum] = -1;
			count--;
		}
	}
}

getRandomNum(20, 5);