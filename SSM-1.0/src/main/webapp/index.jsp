<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script>
    $(function (){
        $("#but").click(function (){
           $.ajax({
               url:"${pageContext.request.contextPath}/test",
               data:{
                   "username":"laoxu",
                   "password":"123456"
               },
               dataType:"text",
               success:function (data){
                   alert(data)
               },
               error:function (e){
                   alert(e)
               }
           });
        });
    });
</script>
<body>
<h2>Hello World!</h2>
<button id="but">sdhihoiew</button>
</body>
</html>
