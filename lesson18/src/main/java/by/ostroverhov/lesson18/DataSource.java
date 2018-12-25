package by.ostroverhov.lesson18;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import static java.util.Objects.requireNonNull;

public class DataSource {
    private static final DataSource INSTANCE = new DataSource();
    private HikariConfig config = new HikariConfig(properties());
    private HikariDataSource ds = new HikariDataSource(config);

    private DataSource() {
    }

    public static DataSource getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    private Properties properties() {
        Properties properties = new Properties();
        try (InputStream stream = requireNonNull(getClass().getClassLoader().getResource("datasource.properties")).openStream()) {
            properties.load(stream);
            return properties;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}