<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Error Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-light">
    <div class="container pt-5">
        <div class="alert alert-danger">
            <h3 class="alert-heading">An Error Occurred</h3>
            <p>Sorry, something went wrong while processing your request.</p>
            <hr />
            <p><strong>Error Details:</strong> ${exception.message}</p>
            <p>
                <a href="index.jsp" class="btn btn-primary">Back to Home</a>
            </p>
        </div>
    </div>
</body>
</html>
    