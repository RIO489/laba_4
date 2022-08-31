package Laba_1.Task6.User;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User()
    {
        firstName = "Sanjo";
        lastName = "Stray";
        age = 29;
        email = "Sanjo.Stray@gmail.com";
    }

    public  User(final String firstName,final String lastName,final int age,final String email)
    {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final User user = (User) o;
        return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, email);
    }
}

