<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
      <title>Test</title>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" ></script>
  </head>
  <body>
    <div class="container">
      <h3>Movie Repository</h3>
      <br>
        <form action='/index/add' method='post'>
          <table class='table table-hover table-responsive table-bordered'>
            <tr>
              <td><b>Title</b></td>
              <td><input type='text' name='title' class='form-control'  required/></td>
            </tr>
            <tr>
              <td><b>Director</b></td>
              <td><input type='text' name='director' class='form-control' required /></td>
            </tr>
            <tr>
              <td>
                <button type="submit" class="btn btn-primary">Add</button>
              </td>
            </tr>
          </table>
          <b><c:out value="${danger}"></c:out></b>
        </form>
        <h3>Movies</h3>
        <br>
          <table class="table table-hover">
            <thead>
              <tr>
                <th><b>Title</b></th>
                <th><b>Director</b></th>
              </tr>
            </thead>
            <tbody>
              <c:forEach items="${list}" var="movie">
                <tr>
                  <td><c:out value="${movie.title}"></c:out></td>
                  <td><c:out value="${movie.director}"></c:out></td>
                  <td>
                    <a href="/index/${movie.id}/delete">
                      <button type="submit" class="btn btn-primary">Delete Movie</button>
                    </a>
                  </td>
                </tr>
              </c:forEach>
            </tbody>
          </table>
        </div>
      </body>
</html>
