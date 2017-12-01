function toggle() {
    var color = document.getElementById("color").style.color;
    if (color !== 'yellow')
    	document.getElementById("color").style.color = "yellow";
    else
    	document.getElementById("color").style.color = "blue";
}