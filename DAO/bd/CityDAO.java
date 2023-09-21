package DAO.bd;

import DAO.entity.City;
import java.util.List;

public interface CityDAO {
   City finydByID(Integer id);
   City update(City city);
   City save(City city);
   City delete_(City city);
  List<City> findALL();
}