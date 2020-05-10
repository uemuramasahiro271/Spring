<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include.jsp"%>

<!DOCTYPE html>
<html>
<body>
	<h2>ようこそ ${accountForm.userName} さん</h2>
	<ul>
		<li><a href="<c:url value='/echo' />">エコーアプリケーション</a></li>
		<li><a href="<c:url value='/crud' />">CRUDアプリケーション</a></li>
	</ul>
	<form action="<c:url value='/logout'/>" method="post">
		<sec:csrfInput />
		<button>ログアウト</button>
	</form>
</body>
</html>
