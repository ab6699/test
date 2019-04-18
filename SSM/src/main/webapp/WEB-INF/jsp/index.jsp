<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap-3.3.4.css">
    <script type="text/javascript" src="/js/jquery-3.0.0.js"></script>
    <script type="text/javascript" src="/js/jqPaginator.js"></script>
</head>
<body>
<center>
<h1>HelloSSM</h1>
<table border="1" width="60%" align="center" >
  <thead>
    <tr align="center">
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pageInfo.list}" var="user">
        <tr align="center">
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>

                <button type="button" onclick="update(${user.id})">修改</button>
                <button type="button" onclick="deleteUser(${user.id})">删除</button>
            </td>
        </tr>
    </c:forEach>

    </tbody>

</table>

<div>
    <button type="button" onclick="add()">新增</button>
</div>
<!-- 分页的导航栏 -->
<div class="pagination-layout">

    <div class="pagination">
        <ul class="pagination">

        </ul>


    </div>
</div>


</div>
</center>
<script>

    window.onload = function () {
        var if_fistime = true;
        $(".pagination")
            .jqPaginator(
                {
                    totalPages: ${pageInfo.pages},
                    visiblePages: 5,
                    currentPage: ${pageInfo.pageNum},
                    first: '<li class="first"><a href="javascript:void(0);">第一页</a></li>',
                    prev: '<li class="prev"><a href="javascript:void(0);">上一页</a></li>',
                    next: '<li class="next"><a href="javascript:void(0);">下一页</a></li>',
                    last: '<li class="last"><a href="javascript:void(0);">最后一页</a></li>',
                    page: '<li class="page"><a href="javascript:void(0);">{{page}}</a></li>',

                    onPageChange: function (num) {

                        /* alert(num); */
                        if (if_fistime) {
                            if_fistime = false;
                        } else {
                            changePage(num);
                        }

                    }

                })

    }

    function changePage(num) {

        window.location.href = "toIndex?pageNum=" + num;
    }


</script>
<script>

    function update(id) {
        location.href = "/queryOneInfo?id=" + id;
    };


    function add() {
        location.href = "/toCreate";
    };

    function deleteUser(id) {
        location.href = '/delete?id=' + id;
    };
</script>
</body>
</html>
