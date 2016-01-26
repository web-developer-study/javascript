var reversNum = function(num){
	var value = num;
	var result = 0;

	while(value > 0){
		result *= 10;
		a = value % 10;
		value = Math.floor(value / 10);
		result += a;
	}
	console.log('역순은 : ' + result);
}

reversNum(23422123);