<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link href="/css/sticky-footer-navbar.css" rel="stylesheet"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" ></script>
<div class="container">
  <h3>Movie Data</h3>
  <form action='/index/update' method='post'>
    <table class='table table-hover table-responsive table-bordered'>
      <tr>
        <td><b>Title</b></td>
        <td><input type='text' name='title' class='form-control' value="${movie.title}" /></td>
      </tr>
      <tr>
        <td><b>Director</b></td>
        <td><input type='text' name='director' class='form-control' value="${movie.director}" /></td>
      </tr>
			<input type='hidden' id='id' rows='5' class='form-control' name='id' value="${movie.id}"/>
      <tr>
        <td></td>
        <td>
          <button type="submit" class="btn btn-primary">Update Movie Data</button>
        </td>
      </tr>
    </table>
  </form>
</div>
