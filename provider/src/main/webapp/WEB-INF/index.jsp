<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2016-12-07
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="theme/js/jquery.min.js"></script>
    <script  type="text/javascript">
        $(function(){

            $("#test").click(function(){

                var customerId = $("input[name='customerId']").val();

                $.post('/home/getCustomer',{customerId:customerId},function(res){
                    console.info(res);
                });
            });
        });
    </script>
</head>
<body>
<input type="text" name="customerId" value="1">

<input type="button" value="获取用户" id="test"/>

账号： ${customer.account}
 <br>
名字： ${customer.name}
</body>
</html>
