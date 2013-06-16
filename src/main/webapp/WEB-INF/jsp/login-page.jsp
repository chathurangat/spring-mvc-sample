<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>

  <label>${loginError}</label>

    <form action="../j_spring_security_check" method="post">

       <label> Username<input type="text" name="j_username"/>  </label>   <br/>
       <label> Password<input type="password" name="j_password"/>  </label>    <br/>
        <input type="submit" name="submit" value="Login"/>
    </form>
</body>
</html>