/**
 * Created by jojoldu@gmail.com on 2016-03-05.
 */
 function outer(arg1, arg2){
 	var local = 8;
 	function inner(inArg){
 		console.log("arg1: "+arg1+"\narg2: "+arg2);
 		console.log("local: "+local+"\ninArg: "+inArg);
 	}
 	return inner;
 }

 var exam = outer(2,4);
 exam(2);