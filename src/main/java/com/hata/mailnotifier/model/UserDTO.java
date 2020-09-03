package com.hata.mailnotifier.model;

import lombok.Data;

import java.util.Objects;

public class UserDTO {
    private Integer id;
    private String name;
    private String email;
    private String status;

    public UserDTO() {
    }

    public UserDTO(String name, String email, String status) {
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public UserDTO(Integer id, String name, String email, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(id, userDTO.id) &&
                Objects.equals(name, userDTO.name) &&
                Objects.equals(email, userDTO.email) &&
                Objects.equals(status, userDTO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, status);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
