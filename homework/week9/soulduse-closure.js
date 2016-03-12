var intro;

var getComplete = function(){
	var buff = [
		'나는 ',
		'',	// name
		'이며, \n',
		'',	// city
		'에 살고 있습니다.\n 나이는 ',
		'', // age
		'입니다.'
	];

	function addBuff(name, city, age){
		if(name && city && age){
			buff[1] = name;
			buff[3] = city;
			buff[5] = age;
		}		
		// console.log("결과 : "+buff.join(''));
	}

	return {
		add : function(name, city, age){
			addBuff(name, city, age);
		},
		value : function(){
			return buff.join('');
		}
	}
}

function showIntroduce() // 자기소개 문장 만들기
{
	var name = document.getElementById("name").value; 
	var age = document.getElementById("age").value; 
	var city = document.getElementById("city").value; 

	intro = getComplete();
	intro.add(name, city, age);
	document.getElementById("introduce").innerHTML = intro.value();
}

function showPrevIntroduce() // 이전 자기소개 문장 부르기
{
	document.getElementById("prevIntroduce").innerHTML = intro.value();
}