/**
 * Created by jojoldu@gmail.com on 2016-03-05.
*/

/*
	나는 xx이며, 
	yy에 살고있습니다.
	나이는 zz입니다.
	라는 문장을 출력하는데
	xx,yy,zz 부분은 사용자에게 인자로 입력 받는 함수를 만드시오.
*/

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
	buff[1] = name;
	buff[3] = city;
	buff[5] = age;

	return buff.join('');
}

console.log(getComplete('이동욱', '서울', 30));