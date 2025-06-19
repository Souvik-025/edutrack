<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
    <title>Registration Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container pt-5">
        <div class="row justify-content-center">
            <div class="col-md-6 bg-white p-4 rounded shadow-sm">
                <h3 class="text-center text-success mb-4">🎉 Student Registered Successfully!</h3>

                <p><strong>Roll Number:</strong> ${student.id}</p>
                <p><strong>Name:</strong> ${student.name}</p>
                <p><strong>Class:</strong> ${student.classNo}</p>

                <div class="text-center mt-4">
                    <a href="register" class="btn btn-primary">Register Another Student</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
    