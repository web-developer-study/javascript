/**
 * 클로져
 * - 지역함수내의 변수는 함수가 종료됨과 동시에 메모리에서 삭제됨
 *   함수 외부에서 사용할 수 있도록 하는 기법을 클로져라 한다.
 * - 함수 내의 함수를 만들어서 사용
 * - 콜백함수 처럼 함수를 리턴하는 함수내부에서 지역함수 내부의 변수를 참조.
 */

function getComplete(name, city, age){
    var buff = [
        '나는 ',
        '', //name
        '이며,\n',
        '', //city
        '에 살고있습니다.\n나이는 ',
        '', //age
        '입니다.'
    ];
    
    if(name && city && age){
        buff[1] = name;
        buff[3] = city;
        buff[5] = age;    
    }
    
    return function() {
        return buff.join('');
    }
}

var intro;
function showIntroduce(){
    var name = document.getElementById("name").value,
        city = document.getElementById("city").value,
        age = document.getElementById("age").value;
        
    intro = getComplete(name, city, age);
    document.getElementById("introduce").innerHTML = intro();
}

function showPrevIntroduce(){
    document.getElementById("prevIntroduce").innerHTML = intro();
}
