<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRUDアプリケーション</title>
</head>
<body>
	<p>追加</p>
	<form:form modelAttribute="crudForm" action='/SpringProject/crud/add' method="post">
		<div>
			Name :
			<form:input path="roomName"></form:input>
	<%-- 		<form:input path="capacity"></form:input> --%>
			<input type="submit" value="追加">
		</div>
	</form:form>

	<p>編集</p>
	<form:form modelAttribute="crudForm" action='/SpringProject/crud/edit' method="post">
		<div>
			ID :
			<form:input path="id"></form:input>
			Name :
			<form:input path="roomName"></form:input>
			<input type="submit" value="編集">
		</div>
	</form:form>


	<p>削除</p>
	<form:form modelAttribute="crudForm" action='/SpringProject/crud/delete' method="post">
		<div>
			ID :
			<form:input path="id"></form:input>
			<input type="submit" value="削除">
		</div>
	</form:form>


	<p>---------------------------------------------------------------------------</p>
	<p>結果</p>
	<c:forEach var="room" items="${crudForm.roomList}">
		<p>ID = ${room.roomId}, Name = ${room.roomName}, Capacity = ${room.capacity}</p>
	</c:forEach>
</body>
</html>