<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>List</h2>
<table>
    <c:forEach var="plumber" items="${plumbers}">
        <tr>
            <td>
                ${plumber.name}
            </td>
            <td>
                ${plumber.rank}
            </td>
            <td>
                ${plumber.fresh}
            </td>
        </tr>
    </c:forEach>
</table>