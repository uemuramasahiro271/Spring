<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>出力画面</h2>
	<div>入力したテキストは...</div>
	<div>
		「<span><c:out value="${echoForm.text}" /></span>」
	</div>
	<div>です。</div>
	<br>
	<div>
		<a href="<c:url value='/' />">トップ画面へ戻る</a>
	</div>
</body>
</html>