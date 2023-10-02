package DAO.entity;

import java.util.Objects;

public class City {
    private String cityname;
    private Integer index;
    private String country;

    public City() {
        this.cityname = cityname;
        this.index = index;
        this.country = country;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (!Objects.equals(cityname, city.cityname)) return false;
        return Objects.equals(index, city.index);
    }

    @Override
    public int hashCode() {
        int result = cityname != null ? cityname.hashCode() : 0;
        result = 31 * result + (index != null ? index.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityname='" + cityname + '\'' +
                ", index=" + index +
                '}';
    }
}

