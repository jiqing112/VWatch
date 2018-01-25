<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<%
    out.print("hello peace");
%>

<%
    for(int i=0;i<5;i++)
    {
%>
</br>
<%
        out.print("hello peace"+i);
%>
<br/>
<%
        out.print("换行符穿插在中间了,一样会被循环输出");
    }//for循环结束
%>

</body>
</html>
