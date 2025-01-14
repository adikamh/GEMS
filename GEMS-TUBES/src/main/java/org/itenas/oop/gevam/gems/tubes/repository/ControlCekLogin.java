package org.itenas.oop.gevam.gems.tubes.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.itenas.oop.gevam.gems.tubes.config.ConnectionManager;
import org.itenas.oop.gevam.gems.tubes.service.NgecekLogin;

public class ControlCekLogin implements NgecekLogin {
    
    private final Connection connection;

    public ControlCekLogin() {
        ConnectionManager conMan = new ConnectionManager();
        this.connection = conMan.logOn();
    }

    @Override
    public boolean checkCredentials(String username, String password, String tableName) throws SQLException {
        String query = "SELECT * FROM " + tableName + " WHERE Username = ? AND Password = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println("Error checking credentials: " + e.getMessage());
            throw e;
        }
    }
}
