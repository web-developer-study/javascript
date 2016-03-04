/**
 * Created by jojoldu@gmail.com on 2016-03-04.
 */

//아래의 실행 결과는??
console.log("This is global context");

function ExContext1() {
    console.log("This is 1 ");
}
function ExContext2() {
    ExContext1();
    console.log("This is 2");
}
ExContext2();