package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {
/*
    @Test
    void testConnect() throws SQLException {
        //Given

        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws  SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String salQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(salQuery);

        //Then
        int counter = 0;
        while(rs.next()){
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5,counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlQuery = """
                SELECT U.FIRSTNAME, U.LASTNAME, p.ID,count(*) as count
                FROM posts p JOIN users u on p.USER_ID = u.ID
                group by p.USER_ID
                HAVING count>1""";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //When
        int counter=0;
        while(rs.next()){
            System.out.println(rs.getString("FIRSTNAME") +", "+
                    rs.getString("LASTNAME"));
            counter++;
        }
        assertEquals(2,counter);

        //Then
    }*/
}