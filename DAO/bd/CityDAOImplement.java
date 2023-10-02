package DAO.bd;

import DAO.constans.Quaries;
import DAO.entity.City;
import DAO.entity.Country;
import MySQL.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CityDAOImplement implements CityDAO{
    private final Connection connection;

    public CityDAOImplement() throws SQLException {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    @Override
    public City finydByID(Integer id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Quaries.CITY_FIND_BY_ID.getName())) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Country country = new Country();
                country.setArea(resultSet.getInt("country_area"));
                country.setName(resultSet.getString("country_name"));
                country.setRegion(resultSet.getString("country_region"));

                City city = new City();
                city.setIndex(resultSet.getInt("index"));
                city.setCityname(resultSet.getString("cityname"));
                city.setCountry(resultSet.getString("country"));
                city.setCountry(country);
                return city;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);}
        return null;
    }

    @Override
    public City update(City city) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Quaries.CITY_UPDATE.getName())) {
            preparedStatement.setString(1,city.getCityname());
            preparedStatement.setString(2, city.getCountry());
            preparedStatement.setInt(3, city.getCountry().getId());
            preparedStatement.setInt(4, city.getIndex());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public City save(City city) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Quaries.CITY_INSERT.getName())) {
            preparedStatement.setString(1, city.getCityname());
            preparedStatement.setString(2, city.getCountry().getId());
            preparedStatement.setInt(3, city.getIndex());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public City delete(City city) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Quaries.CITY_DELETE.getName())) {
            preparedStatement.setInt(1, city.getIndex());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<City> findALL() {
        return null;
    }
}
