package model.service;

import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimir on 09.02.2018.
 */

@Singleton
public class CalculationLogService {

    @Resource(lookup = "jdbcPostgreCalculator")
    private DataSource dataSource;

    private final String LAST_TEN = "select * from calculation_log order by creation_date desc limit 10;";
    private final String INSERT_LOG = "insert into calculation_log (param1, param2, operation, result) values (?, ?, ?, ?);";

    public List<CalculationLog> getCalculationLog() {
        List<CalculationLog> result = new ArrayList<CalculationLog>();
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(LAST_TEN);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result.add(new CalculationLog(rs.getLong("id"),
                        rs.getDouble("param1"),
                        rs.getDouble("param2"),
                        rs.getString("operation"),
                        rs.getDouble("result"),
                        rs.getTimestamp("creation_date")));
            }
        } catch (SQLException e) {
            //ignore
        }
        return result;
    }

    public void insertCalculationLog(CalculationLog log) {
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement(INSERT_LOG);
            ps.setDouble(1, log.getParam1());
            ps.setDouble(2, log.getParam2());
            ps.setString(3, log.getOperation());
            ps.setDouble(4, log.getResult());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
