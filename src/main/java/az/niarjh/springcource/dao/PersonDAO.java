package az.niarjh.springcource.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import az.niarjh.springcource.models.Person;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private final JdbcTemplate jdbcTemplate;

    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        return jdbcTemplate.query("SELECT * FROM person", new PersonMapper());
    }

    public Person show(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person WHERE id=?", new PersonMapper(), id);
    }

    public void save(Person person) {
        jdbcTemplate.update("INSERT INTO person VALUES(1,?,?,?)",
                person.getName(),
                person.getAge(),
                person.getEmail());
    }

    public void update(Person updatedPerson, int id) {
        jdbcTemplate.update("UPDATE person SET name=?, age=?, email=? WHERE id=?", updatedPerson.getName(),
                updatedPerson.getAge(),
                updatedPerson.getEmail(),
                id);
    }

    public void delete(Person person, int id) {
        jdbcTemplate.update("DELETE person WHERE id=?",id);

    }
}