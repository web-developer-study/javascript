function reverseNum(num) {
	var res = "역순은 : ";
	while(num > 0) {
		res += num % 10
		num = parseInt(num / 10);
	}
	console.log(res);
}

reverseNum(54321);
reverseNum(9876);