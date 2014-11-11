/**
 * 
 */
var req;

function getCity(nation) {
	if (window.XMLHttpRequest) {
		req = new XMLHttpRequest();
	} else if (window.ActivexObject) {
		req = new ActivexObject("Microsoft.XMLHTTP");
	}
	var url = "showCity.jsp?nation=" + nation;
	req.onreadystatechange = getResponse;
	req.open("GET", url, true);
	req.send(null);
}
function getResponse() {
	if (req.readyState == 4)
		if (req.status == 200)
			document.getElementById("show_city").innerHTML = req.responseText;
}
