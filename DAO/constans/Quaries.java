package DAO.constans;

public enum Quaries {

    CITY_INSERT("INSERT INTO users (cityname, index, country) VALUES(?, ?, ?)"),
    CITY_UPDATE("UPDATE users SET cityname = ?, index = ?, country_id = ? WHERE id = ?"),
    CITY_DELETE("DELETE FROM users WHERE id = ?"),
    CITY_FIND_BY_ID("SELECT c.id, c.cityname, c.country, c.index as country_id, c.cityname as country_name \" +\n" +
            "                    \"FROM city c \" +\n" +
            "                    \"JOIN country c ON c.country_id = d.id \" +\n" +
            "                    \"WHERE u.id = ?"),
    CITY_FIND_ALL()
    ;
    private String name;

    Quaries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
