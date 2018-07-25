<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
	<link href="<c:url value="/resources/styleForm.css" />" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet'>
	<script>
	function activateUserLine(){
		document.getElementById('bord1').style.cssText = 'border-top:1px solid white; width:100%; height:5px; transform: scaleX(1); transform-origin:7% 50%;  transition: transform 500ms ease-in-out;'
	}
	function deactivateUserLine(){
		document.getElementById('bord1').style.cssText = 'border-top:1px solid white; width:100%; height:5px; transform: scaleX(0); transform-origin:7% 100%; transition: transform 250ms ease-in-out;'
	}
	function activatePassLine(){
		document.getElementById('bord2').style.cssText = 'border-top:1px solid white; width:100%; height:5px; transform: scaleX(1); transform-origin:7% 50%; transition: transform 500ms ease-in-out;'
	}
	function deactivatePassLine(){
		document.getElementById('bord2').style.cssText = 'border-top:1px solid white; width:100%; height:5px; transform: scaleX(0);  transform-origin:7% 100%; transition: transform 250ms ease-in-out;'
	}
	</script>
</head>
<body class = "background">
	<div>
		<h2>Login to your account</h2>
		<form class="form-style-8" action = "/login" method = "POST">
			<input type="text" name="field1" placeholder="Username" onfocus="activateUserLine();" onblur="deactivateUserLine();" /> 
			<div id = "bord1"></div>			
			<input type="password" name="field2" placeholder="Password" onfocus="activatePassLine();" onblur="deactivatePassLine();" /> 
			<div id = "bord2"></div>
			<input type="submit" value="Login" />
		</form>
	</div>
</body>
</html>
