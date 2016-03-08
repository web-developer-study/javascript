var getRandomNum = function(scope, num){
	var i = 0;
	var print = scope + '개 숫자 중 랜덤한 숫자 ' + num + '개는\n';
	var list = new Array(num);
	var price = 0;
	var bool = true;

	while(i < num) {                                   // 중복되는 값이 얼마나 나올지 모르기 떄문에 while로 반복문을 돌림
		price = Math.floor(Math.random() * scope) + 1; // 랜덤한 값 구하기

		for(j = 0; j < list.length; j++) {             // 중복되는 값 체크
			if(list[j] === price) {
				bool = false;
			}
		}

		if(bool) {
			list[i] = price;
			print += price + '\n';
			i++;
		}

		bool = true;
	}
	console.log(print);
}

var getRandomNum2 = function(scope, num){
	var i = 0;
	var j = 0;
	var list = new Array();
	var value = 0;
	var print = scope + '개 숫자 중 랜덤한 숫자 ' + num + '개는\n';

	for(j; j < scope; j++){                            // 미리 값을 저장해 놓는다.
		list[j] = j + 1;
	}

	while(i < num){
		value = Math.floor(Math.random() * scope);
		if(list[value] !== undefined){                 // splice로 리스트의 크기가 줄어들기 떄문에 만약에 나올 undefined를 예방한다.
			print += list[value] + '\n';               // random한 값 value를 통해 미리 저장해놓은 값을 랜덤하게 꺼낸다.
			list.splice(value, 1);                     // 꺼낸 값을 다시 꺼내지 않기 위해 제거한다.
			i++;
		}
	}

	console.log(print);
}

// getRandomNum(20, 5);

getRandomNum2(20, 5);