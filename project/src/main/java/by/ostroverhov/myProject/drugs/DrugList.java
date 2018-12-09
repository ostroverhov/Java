package by.ostroverhov.myProject.drugs;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class DrugList<T> implements Iterator<Drug> {
    private DataSource ds = DataSource.getInstance();
    List<Drug> ourDrugs = new ArrayList<Drug>();

    public List<Drug> find(String language) throws Exception {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = ds.getConnection();
            pstmt = connection.prepareStatement("select * from drugs");
            pstmt.setString(1, language);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                ourDrugs.add(new Drug(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getBoolean(6),
                        rs.getInt(7)));
            }
        }catch (SQLException e) {
            throw new SQLException(e);
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

        return ourDrugs;
    }



   /* {
        ourDrugs.add(0, new Drug(0, "bortezomib", "liophilizate", "010218", parse("2018-04-05"), false, 550));
        ourDrugs.add(1, new Drug(1, "fludarabin", "tablet", "011218", parse("2018-06-08"), true, 1350));
        ourDrugs.add(2, new Drug(2, "decitabin", "liophilizate", "010516", parse("2016-03-15"), false, 580));
        ourDrugs.add(3, new Drug(3, "carboplatin", "concentrate", "082118", parse("2018-01-14"), true, 4300));
        ourDrugs.add(4, new Drug(4, "clofarabin", "liophilizate", "051717", parse("2017-08-21"), true, 1500));
    }*/

    public List<Drug> getOurDrugs() {
        return ourDrugs;
    }

    private Date parse(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Drug next() {
        return null;
    }
}
