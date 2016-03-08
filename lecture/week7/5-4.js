/**
 * Created by jojoldu@gmail.com on 2016-03-05.
 */
var var1 = 1;
var var2 = 2;

function func(){
	var var1 = 10;
	var var2 = 20;
	console.log(var1);
	console.log(var2);
}

func();
console.log(var1);
console.log(var2);