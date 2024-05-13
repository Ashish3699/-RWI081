 import java.sql.*;

import static java.lang.Class.forName;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/ecommerce";
    private static final String name = "root";
    private static final String password = "****";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try {
            // using Statement Interface
//            Connection connection = DriverManager.getConnection(url, name, password);
//            Statement statement = connection.createStatement();

             /*      String query = "select * from users";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()==true){
                int id = resultSet.getInt("id");
                String city = resultSet.getString("city");
                String email = resultSet.getString("email");
                String name = resultSet.getString("name");
                String state = resultSet.getString("state");
                System.out.println("ID : "+id);
                System.out.println("City : "+city);
                System.out.println("Email : "+email);
                System.out.println("Name : "+name);
                System.out.println("State : "+state);  */


//            String query = String.format("INSERT INTO users VALUES(%d, '%s', '%s', '%s', '%s')",2, "Satna", "Ashishpatel1234@gmail.com", "Rahul", "Madhya Pradesh");
//            String query = String.format("UPDATE users SET state = '%s' WHERE id = %d", "Madhya Pradesh", 2);

//             String query = String.format("DELETE FROM users WHERE id = 154");
//            int rowsAffected = statement.executeUpdate(query);
//            if (rowsAffected > 0) {
//                System.out.println("Data Delete successfully! ");
//            } else {
//                System.out.println("Data Not Delete! ");
//            }

            Connection connection = DriverManager.getConnection(url, name, password);
//            String query = "INSERT INTO users(id,city,email,name,state)VALUES(?,?,?,?,?)";

            String query = "SELECT name FROM users WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 1);

//            preparedStatement.setInt(1,3);
//            preparedStatement.setString(2,"Bhopal");
//            preparedStatement.setString(3,"Ashish@gamil.com");
//            preparedStatement.setString(4,"Ashu");
//            preparedStatement.setString(5,"Madhya Pradesh");
//            int rowsAffected = preparedStatement.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Data Inserted successfully! ");
//            } else {
//                System.out.println("Data Not Inserted! ");
//            }

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println("Name :- " + name);
            } else {
                System.out.println("Name not found!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}


