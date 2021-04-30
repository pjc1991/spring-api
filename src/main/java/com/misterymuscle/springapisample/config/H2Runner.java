package com.misterymuscle.springapisample.config;

import java.sql.Connection;
import javax.sql.DataSource;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class H2Runner implements ApplicationRunner{

    // dependancy injection
    private final DataSource dataSource;
    // private final JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        try(Connection connection = dataSource.getConnection()){
            System.out.println(connection);
            String URL = connection.getMetaData().getURL();
            System.out.println(URL);
            String user = connection.getMetaData().getUserName();
            System.out.println(user);

        }
    }

}