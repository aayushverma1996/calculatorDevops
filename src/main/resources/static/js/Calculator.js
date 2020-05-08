function calc(val)
{
	var x=document.getElementById('expression');

	if(val=="AC")
		x.value="";
	else
		x.value+=val;
}

