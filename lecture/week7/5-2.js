/**
 * Created by jojoldu@gmail.com on 2016-03-04.
 */

function execute(paraml , param2) {
    var a = 1, b = 2;

    function func() {
        return a+b;
    }

    return paraml + param2 + func();
}
console.log(execute(3 , 4));
