<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding-top: 50px;
        }
        .form-container {
            max-width: 500px;
            margin: auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-container .form-group {
            margin-bottom: 15px;
        }
        .form-container .form-group label {
            font-weight: bold;
        }
        .form-container .form-group input,
        .form-container .form-group select {
            width: 100%;
            padding: 8px;
            font-size: 16px;
            border: 1px solid #ced4da;
            border-radius: 4px;
        }
        .form-container .form-group input:focus,
        .form-container .form-group select:focus {
            border-color: #80bdff;
            outline: none;
        }
        .form-container .form-group .error {
            color: red;
            font-size: 0.875em;
        }
    </style>
</head>
<body>
<div class="form-container">
        <h2>Student Registration</h2>
        <form:form modelAttribute="student">
            <div class="form-group">
                <form:label path="name">Student Name</form:label>
                <form:input path="name" class="form-control" />
                <form:errors path="name" cssClass="error" />
            </div>
            <div class="form-group">
                <form:label path="classNo">Class</form:label>
                <form:input path="classNo" class="form-control" />
                <form:errors path="classNo" cssClass="error" />
            </div>
            <div class="form-group">
                <form:label path="email">Email</form:label>
                <form:input path="email" class="form-control" />
                <form:errors path="email" cssClass="error" />
            </div>
            <div class="form-group">
                <form:label path="phoneNumber">Phone Number</form:label>
                <form:input path="phoneNumber" class="form-control" />
                <form:errors path="phoneNumber" cssClass="error" />
            </div>
            <div class="form-group">
                <input type="submit" value="Register" class="btn btn-primary" />
            </div>
        </form:form>
    </div>
</body>
</html>