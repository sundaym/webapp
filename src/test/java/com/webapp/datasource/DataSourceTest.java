package com.webapp.datasource;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
public class DataSourceTest {
    private static final Logger logger = LoggerFactory.getLogger(DataSourceTest.class);
    @Autowired
    DataSource dataSource;

    @Test
    public void testDataSource() throws Exception {
        Connection connection = dataSource.getConnection();
        logger.info("数据源:{}", connection);
        connection.close();
    }
}
