package DAO.Service;

import DAO.dto.CityDTO;

import java.util.List;

public interface CityService {
    CityDTO findById(Integer id);
    CityDTO save(CityDTO cityDTO);
    CityDTO update(CityDTO cityDTO);
    CityDTO delete(CityDTO cityDTO);
    List<CityDTO> findAll();

}
