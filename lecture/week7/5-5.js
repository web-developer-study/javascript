/**
 * Created by jojoldu@gmail.com on 2016-03-05.
 */

//아래의 실행결과를 예측해보시오.
var value = "1";

function print(){
 	var value = "2";

 	function printValue(){
 		return value;
 	}

 	console.log(printValue());
 }

 print();