<%--
  Created by IntelliJ IDEA.
  User: cosmo
  Date: 2023/2/19
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <form action="/spring_spring_test_main_war_exploded/fileupload" enctype="multipart/form-data" method="post">
    <label>
      描述：
      <input type="text" name="desc">
    </label><br><br>
    文件：<input type="file" name="file"><br><br>
    <input type="submit" value="上传">
  </form>
  </body>
</html>
