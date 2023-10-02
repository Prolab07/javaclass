package MySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CountryCreator {
        private void createDepartments() throws SQLException {
            Connection connection = DatabaseConnection.getInstance().getConnection();

            String sql = "INSERT INTO departments (name) VALUES (?), (?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, "IT");
                preparedStatement.setString(2, "HR");
                preparedStatement.executeUpdate();
            }
        }

        public void initialization() {
            try {
                createDepartments();
                System.out.println("Departments created successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

