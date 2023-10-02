package DAO;

import DAO.Service.CityService;
import DAO.Service.CityServiceImplement;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        CityService cityService = new CityServiceImplement();
        cityService.findAll();

    }
}
