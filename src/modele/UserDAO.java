package modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public User authenticate(String nom, String motDePasse) {
        String query = "SELECT * FROM utilisateurs WHERE nom = ? AND MotDePasse = ?";
        try (Connection connection = ConnexionDAO.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, nom);
            statement.setString(2, motDePasse);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("Id");
                    String typeAcces = resultSet.getString("TypeAcces");
                    return new User(id, nom, motDePasse, typeAcces);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}