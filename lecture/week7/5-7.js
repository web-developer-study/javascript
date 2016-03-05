/**
 * Created by jojoldu@gmail.com on 2016-03-05.
 */

//다음의 실행결과는?
//왜 그런결과가 나온것인가?
 function outer(){
 	var x= 10;
 	var inner = function(){
 		console.log(x);
 	}
 	return inner;
 }

 var run = outer(); //이미 outer는 실행되었는데 x는 어떻게 살아있나?
 run();