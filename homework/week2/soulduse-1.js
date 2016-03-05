function getRandomNum(numOne, numTwo){ 
	var mySet = new Set()
 
	if(numOne<=numTwo){
		console.log("형식에 맞지 않습니다.");
	}else{
		while(mySet.size<=numTwo-1){
			var random = Math.floor((Math.random()*numOne)+1);
			mySet.add(random);
		}
 
		console.log(numOne+'개 숫자 중 랜덤한 숫자 '+numTwo+'개는');
		mySet.forEach(function(item){
			console.log(item.toString());
		});
	}
}
 
getRandomNum(100,5);