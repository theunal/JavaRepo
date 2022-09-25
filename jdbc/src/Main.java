import java.sql.*;
import java.util.ArrayList;

public class Main {




    public static void main(String[] args) throws SQLException {

        DbHelper helper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = "delete from city where ID = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4083);
            statement.executeUpdate();
            System.out.println("Kayıt silindi");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }


    }

    public static void select() throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries = new ArrayList<>();
            while (resultSet.next()) {

                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));

            }

            System.out.println(countries.size());

        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }


    }

    public static void insert() throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;


        try {
            connection = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "NSiirt");
            statement.setString(2, "TUR");
            statement.setString(3, "NSiirt");
            statement.setInt(4, 999);
            statement.executeUpdate();

            System.out.println("Kayıt eklendi");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }

    }

    public static void update() throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;


        try {
            connection = helper.getConnection();
            String sql = "update city set Population = 754 where ID = 4083";
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }

    }

    public static void delete() throws SQLException {
        DbHelper helper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = "delete from city where ID = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4083);
            statement.executeUpdate();
            System.out.println("Kayıt silindi");
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            statement.close();
            connection.close();
        }
    }
}
