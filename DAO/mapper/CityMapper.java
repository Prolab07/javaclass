package DAO.mapper;

import DAO.dto.CityDTO;
import DAO.entity.City;
import DAO.entity.Country;

import java.util.List;
import java.util.stream.Collectors;

public class CityMapper {
   public CityDTO toDTO(City city) {
        CityDTO cityDTO = new CityDTO();
        cityDTO.setIndex(city.getIndex());
        cityDTO.setCityname(city.getCityname());
        cityDTO.setCountryname(city.getCountry());
        return cityDTO;
    }
    public City toEntity(CityDTO cityDTO){
        City city = new City();
        city.setIndex(cityDTO.getIndex());
        city.setCityname(cityDTO.getCityname());
        city.setCountry(cityDTO.getCountryname());
        Country country = new Country();
        country.setArea(cityDTO.getIndex());
        country.setName(cityDTO.getCountryname());
        return city;
    }

    public List<CityDTO> toDTOList(List<City> cities){
       return cities.stream().map(
               this::toDTO
       ).collect(Collectors.toList());
    }
}
