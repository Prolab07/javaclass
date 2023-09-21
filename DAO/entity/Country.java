package DAO.entity;

import java.util.Objects;
// entity / model class - филды должны соответствовать колонкам в БД, а classname - это название таблицы
public class Country {

    private String name;
    private String region;
    private Integer area;

    public Country() {
        this.name = name;
        this.region = region;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!Objects.equals(name, country.name)) return false;
        if (!Objects.equals(region, country.region)) return false;
        return Objects.equals(area, country.area);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", area=" + area +
                '}';
    }

    public int getID() {
        return null;
    }
}
