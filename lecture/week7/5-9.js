/**
 * Created by jojoldu@gmail.com on 2016-03-05.
*/

function Hello(func){
	this.greeting = 'Hello';
}

Hello.prototype.call = function(func){
	func? func(this.greeting) : this.func(this.greeting);
}

var user = function(greeting){
	console.log(greeting);
}

var obj = new Hello();
obj.func = user;
obj.call();



function saySomething(obj, methodName, name){
	return (function(greeting){
		return obj[methodName](greeting, name);
	});
}

function NewObj(obj, name){
	obj.func = saySomething(this, "who", name);
	return obj;
}

NewObj.prototype.who = function(greeting, name){
	console.log(greeting+" "+(name || "everyone"));
}

var newObj = new NewObj(obj, "Donguk"); 
newObj.call();