package DAO.dto;

import DAO.entity.Country;

import java.util.Objects;

//DTO
public class CityDTO {
    private Integer index;
    private String cityname;
    private String countryname;

    public CityDTO() {
        this.countryname = countryname;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityDTO cityDTO = (CityDTO) o;

        if (!Objects.equals(index, cityDTO.index)) return false;
        if (!Objects.equals(cityname, cityDTO.cityname)) return false;
        return Objects.equals(countryname, cityDTO.countryname);
    }

    @Override
    public int hashCode() {
        int result = index != null ? index.hashCode() : 0;
        result = 31 * result + (cityname != null ? cityname.hashCode() : 0);
        result = 31 * result + (countryname != null ? countryname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CityDTO{" +
                "index=" + index +
                ", cityname='" + cityname + '\'' +
                ", countryname='" + countryname + '\'' +
                '}';
    }
}

