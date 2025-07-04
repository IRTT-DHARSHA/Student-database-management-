<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Student List</title>
  <link rel="stylesheet" th:href="@{/table.css}" />
</head>
<body>
  <div class="container">
    <h1>📋 All Students</h1>
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Roll No</th>
          <th>Name</th>
          <th>Dept</th>
          <th>Year</th>
          <th>DOB</th>
          <th>Blood Group</th>
          <th>Native Place</th>
          <th>Hostel</th>
        </tr>
      </thead>
      <tbody>
        <tr th:each="student : ${students}">
          <td th:text="${student.id}"></td>
          <td th:text="${student.rollno}"></td>
          <td th:text="${student.name}"></td>
          <td th:text="${student.dept}"></td>
          <td th:text="${student.year}"></td>
          <td th:text="${student.dob}"></td>
          <td th:text="${student.bloodgroup}"></td>
          <td th:text="${student.nativeplace}"></td>
          <td th:text="${student.hostel_r_not}"></td>
        </tr>
      </tbody>
    </table>
    <br>
    <a href="/students/form" class="button">➕ Add New Student</a>
  </div>
</body>
</html>
