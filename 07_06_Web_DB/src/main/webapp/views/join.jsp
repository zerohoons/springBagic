<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
	text-align: center;
	margin: auto;
	}
	
	table{
		width: 500px;
		margin: auto;
		text-align: center;
	}
	
	table, th, td{
		border: 5px solid lightpink;
		border-collapse: collapse;
	}
	h1{
		text-align: center;
	}
	input{
	padding: 10px;
	text-decoration: none;
	}
}


</style>

<script type="text/javascript">
	function list_go(f){
		f.action = "index.jsp";
		f.submit();
	}
</script>
</head>
<body>
	<div>
		<form action="join_ok.jsp" method="post">
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>PW</th>
						<th>NAME</th>
						<th>AGE</th>
						<th>ADDR</th>
					</tr>
				</thead>
				<tbody>
					<td><input type="text" name="id" required></td>
					<td><input type="text" name="pw" required></td>
					<td><input type="text" name="name" required></td>
					<td><input type="text" name="age" required></td>
					<td><input type="text" name="addr" required></td>
				</tbody>
				<tfoot>
					<tr style="height: 15px">
						<td colspan="5">
						<input type="submit" value="인원추가">&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="button" value="리스트로" onclick="list_go(this.form)">
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>