package az.niarjh.springcource.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {

    private int id;
       
    @NotEmpty(message = "NAME SHOULD not be empty")
    @Size(min = 2, max = 30, message = "name should be between 2 and 30 character")
    private String name;
   
    @Min(value = 6, message = "age should be greater than 6")
    private int age;
    
    @NotEmpty(message = "Email SHOULD not be empty")
    @Email(message = "Email should be valid")
    private String email;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



}
