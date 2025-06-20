<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Student List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container pt-5">
        <h2 class="mb-4">All Registered Students</h2>

        <c:if test="${empty students}">
            <div class="alert alert-warning">No students registered yet.</div>
        </c:if>

        <c:if test="${not empty students}">
            <table class="table table-striped table-bordered">
                <thead class="thead-light">
                    <tr>
                        <th>Roll No.</th>
                        <th>Name</th>
                        <th>Class</th>
                        <th>Email</th>
                        <th>Phone Number</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="s" items="${students}">
                        <tr>
                            <td>${s.id}</td>
                            <td>${s.name}</td>
                            <td>${s.classNo}</td>
                            <td>${s.email}</td>
                            <td>${s.phoneNumber}</td>
                            <td>
                                <a href="update?id=${s.id}" class="btn btn-sm btn-primary">Edit</a>
                                <a href="delete?id=${s.id}" class="btn btn-sm btn-danger"
                                   onclick="return confirm('Delete student ${s.name}?');">
                                   Delete
                                </a>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

        <a href="register" class="btn btn-primary mt-3">Register New Student</a>
        <a href="index.jsp" class="btn btn-primary mt-3">Go Back To Home</a>
    </div>
</body>
</html>
    