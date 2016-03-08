/**
 * Created by jojoldu@gmail.com on 2016-03-05.
 */
 
//아래의 실행 결과는??
var value = 1;

function print1(){
	return value;
}

function print2(func){
	var value = "2";
	console.log(func());
}
print2(print1);
