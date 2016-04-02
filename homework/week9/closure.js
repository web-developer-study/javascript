/**
 * Created by jojoldu@gmail.com on 2016-03-12.
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
    return function(){
        return buff.join('');
    }
}

function showIntroduce(){
    var name = document.getElementById("name").value,
        city = document.getElementById("city").value,
        age = document.getElementById("age").value;
        go = getComplete(name, city, age);
    document.getElementById("introduce").innerHTML = go();
}

function showPrevIntroduce(){
    document.getElementById("prevIntroduce").innerHTML = go();
}