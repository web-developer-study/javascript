/**
 * Created by jojoldu@gmail.com on 2016-03-12.
 */
var getComplete = (function (){
    var buff = [
        '나는 ',
        '', //name
        '이며,\n',
        '', //city
        '에 살고있습니다.\n나이는 ',
        '', //age
        '입니다.'
    ];

    return (function(name, city, age){
        if(name && city && age){
            buff[1] = name;
            buff[3] = city;
            buff[5] = age;
        }

        return buff.join('');
    });
})();

function showIntroduce(){
    var name = document.getElementById("name").value,
        city = document.getElementById("city").value,
        age = document.getElementById("age").value;

    document.getElementById("introduce").innerHTML = getComplete(name, city, age);
}

function showPrevIntroduce(){
    document.getElementById("prevIntroduce").innerHTML = getComplete();
}