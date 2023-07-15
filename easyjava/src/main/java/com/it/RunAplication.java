package com.it;

import com.it.builder.BuildTable;

import java.sql.SQLException;

public class RunAplication {
    public static void main(String[] args) throws SQLException {
        BuildTable.getTables();
    }
}
