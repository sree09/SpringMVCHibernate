<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cars List</title>
</head>
<body>
           <table border="1">

            <tr>
            <th>VIN</th>
            <th>MAKE</th>
            <th>MODEL</th>
            <th>YEAR</th>
            <th>MILEAGE</th>
            <th>PRICE</th>
            </tr>

      <c:forEach items="${carslist}" var="car">
        <tr>
          <td>${car.vin}</td>
          <td>${car.make}</td>
          <td>${car.model}</td>
          <td>${car.year}</td>
          <td>${car.mileage}</td>
          <td>${car.price}</td>
        </tr>
      </c:forEach>
    </table>

</body>
</html>