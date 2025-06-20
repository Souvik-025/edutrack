<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Welcome</title>
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f0f2f5;
      min-height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    .card {
      padding: 2rem;
      border-radius: 8px;
      box-shadow: 0 4px 12px rgba(0,0,0,0.1);
      background: white;
      text-align: center;
      max-width: 400px;
      width: 90%;
    }
    .card h2 {
      margin-bottom: 1.5rem;
      color: #333;
    }
    .card a {
      display: block;
      margin: 0.75rem 0;
      font-size: 1.1rem;
      text-decoration: none;
      color: #0056b3;
    }
    .card a:hover {
      text-decoration: underline;
      color: green;
    }
  </style>
</head>
<body>
  <div class="card">
    <h2 class="h4">Hello World!</h2>
    <a href="register" class="btn btn-outline-primary">Register</a>
    <a href="getall" class="btn btn-outline-secondary">View All Students</a>
  </div>
</body>
</html>
