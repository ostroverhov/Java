package by.ostroverhov.lesson18;

import by.ostroverhov.lesson18.domain.Company;
import by.ostroverhov.lesson18.domain.Programmer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Programmers {
    private DataSource ds = DataSource.getInstance();

    public List<Programmer> find(String language) throws ProgrammerFindException {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            List<Programmer> programmers = new ArrayList<>();
            connection = ds.getConnection();
            pstmt = connection.prepareStatement(
                    "select * from programmer inner join company on programmer.company_id=company.id where language=?");
            pstmt.setString(1, language);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Programmer programmer = new Programmer.Builder()
                        .name(rs.getString(2))
                        .salary(rs.getInt(3))
                        .mastery(rs.getString(4))
                        .language(rs.getString(5))
                        .company(new Company.Builder()
                                .name(rs.getString(8))
                                .build())
                        .build();
                programmers.add(programmer);
            }
            return programmers;
        } catch (SQLException e) {
            throw new ProgrammerFindException(e);
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (connection != null) connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}