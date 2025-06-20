<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Update Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        body {
            background-color: #f0f2f5;
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .update-card {
            background: #fff;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            width: 100%;
            max-width: 400px;
        }
        .update-card h2 {
            margin-bottom: 1.5rem;
            color: #333;
            text-align: center;
        }
        .form-group {
            margin-bottom: 1rem;
        }
        .form-group label {
            font-weight: bold;
        }
        .btn-group {
            text-align: center;
            margin-top: 1.5rem;
        }
    </style>
</head>
<body>
    <div class="update-card">
        <h2>Update Student</h2>
        <form:form method="post" modelAttribute="student">
            <div class="form-group">
                <input type="hidden" class="form-control"  value="${student.id}"/>
            </div>
            <div class="form-group">
                <form:label path="name">Student Name</form:label>
                <form:input path="name" cssClass="form-control" />
                <form:errors path="name" cssClass="text-danger" />
            </div>
            <div class="btn-group">
                <button type="submit" class="btn btn-primary">Update</button>
                <a href="getall" class="btn btn-secondary">Cancel</a>
            </div>
        </form:form>
    </div>
</body>
</html>
    