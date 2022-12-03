package com.kodilla.jdbc;


import org.junit.jupiter.api.Test;

import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        Statement secondStatement = dbManager.getConnection().createStatement();
        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        secondStatement.execute(sqlProcedureCall);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(5, howMany);
        rs.close();
        statement.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET Bestseller=0";
        Statement statement=dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM books WHERE bestseller=0";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        Statement secondStatement = dbManager.getConnection().createStatement();
        // When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        secondStatement.execute(sqlProcedureCall);

        //Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(5, howMany);
        rs.close();
        statement.close();
    }

}