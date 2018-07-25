<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title></title>
	<link href="<c:url value="/resources/styleForm.css" />" rel="stylesheet">
  </head>
<body>
  <h1>Form</h1>
  <div class="form-style-5">
  	<p><font color="red">${errorMessage}</font></p>
    <form action = "/login" method = "POST">
      <fieldset>
        <legend><span class="number">1</span> Candidate Info</legend>
        <input type="text" name="field1" placeholder="username ">
        <input type="password" name="field2" placeholder="password">     
      </fieldset>
      <input type="submit" value="login" />
    </form>
  </div>
</body>
</html>
