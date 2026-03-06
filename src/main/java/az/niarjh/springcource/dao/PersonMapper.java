package az.niarjh.springcource.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jspecify.annotations.Nullable;
import org.springframework.jdbc.core.RowMapper;

import az.niarjh.springcource.models.Person;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public @Nullable Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setEmail(rs.getString("email"));
        person.setAge(rs.getInt("age"));
        return person;
    }

}
