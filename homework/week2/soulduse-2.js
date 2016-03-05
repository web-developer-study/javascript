function reverseNum(number){
	var reverse = 0;
	while(number>0){
		reverse *= 10;
		reverse += number%10;
		number = Math.floor(number/10);
	}
	console.log('역순은 : '+reverse);
}

reverseNum(12345);
reverseNum(6789);