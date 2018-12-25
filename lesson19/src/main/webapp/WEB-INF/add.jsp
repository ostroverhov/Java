<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Add</h2>
<form name="PlumbersForm" action="/plumbers" method="POST">
    <table>
        <tr>
            <td>Name :</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Rank :</td>
            <td><input type="text" name="rank"/></td>
        </tr>
        <tr>
            <td>Fresh :</td>
            <td><input type="checkbox" name="fresh" value="true"/></td>
        </tr>
        <th><input type="submit" value="Submit" name="save"/></th>
    </table>
</form>