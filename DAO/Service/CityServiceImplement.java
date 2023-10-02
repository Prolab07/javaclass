package DAO.Service;

import DAO.bd.CityDAO;
import DAO.bd.CityDAOImplement;
import DAO.dto.CityDTO;
import DAO.mapper.CityMapper;

import java.sql.SQLException;
import java.util.List;

public class CityServiceImplement implements CityService {
    private final CityDAO cityDAO;
    private final CityMapper cityMapper;

    public CityServiceImplement() throws SQLException {
        this.cityDAO = new CityDAOImplement();
        this.cityMapper = new CityMapper();
    }

    @Override
    public CityDTO findById(Integer id) {
        return cityMapper.toDTO(cityDAO.finydByID(id));
    }

    @Override
    public CityDTO save(CityDTO cityDTO) {
        return cityMapper.toDTO(cityDAO.save(cityMapper.toEntity(cityDTO)));
    }

    @Override
    public CityDTO update(CityDTO cityDTO) {
        return cityMapper.toDTO(cityDAO.update(cityMapper.toEntity(cityDTO)));
    }

    @Override
    public CityDTO delete(CityDTO cityDTO) {
        return cityMapper.toDTO(cityDAO.delete(cityMapper.toEntity(cityDTO)));
    }

    @Override
    public List<CityDTO> findAll() {
        return cityMapper.toDTOList(cityDAO.findALL());
    }
}
