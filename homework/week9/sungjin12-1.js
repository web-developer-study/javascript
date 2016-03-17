function initFunction(){
    var buff = [
        '나는 ',
        '', //name
        '이며,\n',
        '', //city
        '에 살고있습니다.\n나이는 ',
        '', //age
        '입니다.'
    ];
    function getComplete(name, city, age){
        if(name && city && age){
            buff[1] = name;
            buff[3] = city;
            buff[5] = age;
        }
        return buff.join('');
    }

    return getComplete;
}
var init = initFunction();
function showIntroduce(){
    var name = document.getElementById("name").value,
        city = document.getElementById("city").value,
        age = document.getElementById("age").value;       
    document.getElementById("introduce").innerHTML = init(name, city, age);
}
function showPrevIntroduce(){
    document.getElementById("prevIntroduce").innerHTML = init();
}