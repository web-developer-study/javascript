/**
 * Created by jojoldu@gmail.com on 2016-03-12.
 */
/**

 클로저란 두 개의 것으로 이루어진 특별한 오브젝트이다.
 첫 번째는 함수이고, 두 번째는 그 함수가 만들어진 환경이다.
 그 함수가 만들어진 환경은 함수가 만들어질 때 사용할 수 있었던 변수들로 이루어진다.

 클로저는 자신의 scope 밖에 있는 변수들에 접근할 수 있는 함수를 말하는데
 inner function을 return할 때 클로저가 된다.

 **/



//1. 클로저 비사용 vs 사용
console.log("클로저 비사용시");

function notUseClosure(x){
    var num = 0;

    function increase(){
        num += x;
        num++;
        console.log(num);
    }

    increase();
}

notUseClosure(0);
notUseClosure(0);
notUseClosure(0);


console.log("클로저 사용시");

function useClosure(x){
    var num = 0;

    return function(){
        num += x;
        num++;
        console.log(num);
    };
}

var useClosure1 = useClosure(0);
useClosure1();
useClosure1();
useClosure1();