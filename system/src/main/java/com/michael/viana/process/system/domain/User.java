package com.michael.viana.process.system.domain;



import com.michael.viana.process.system.domain.dto.UserDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document()
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String Name;
    private String Cpf;
    private String BirthDate;
    private String Address;
    private String District;
    private String City;
    private String State;
    private String ZipCode;

    private String Email;
    private String Phone;
    private String Skype;

    public User() { }



    public User(String name, String cpf, String birthDate, String address, String district, String city, String state, String zipCode, String email, String phone, String skype) {
        this.Name = name;
        this.Cpf = cpf;
        this.BirthDate = birthDate;
        this.Address = address;
        this.District = district;
        this.City = city;
        this.State = state;
        this.ZipCode = zipCode;
        this.Email = email;
        this.Phone = phone;
        this.Skype = skype;
    }

    public User(String id, String name, String cpf, String birthDate, String address, String district, String city, String state, String zipCode, String email, String phone, String skype) {
        this.id = id;
        this.Name = name;
        this.Cpf = cpf;
        this.BirthDate = birthDate;
        this.Address = address;
        this.District = district;
        this.City = city;
        this.State = state;
        this.ZipCode = zipCode;
        this.Email = email;
        this.Phone = phone;
        this.Skype = skype;
    }

    public User(UserDTO userDTO){
        id = userDTO.getId();
        Name = userDTO.getName();
        Cpf = userDTO.getCpf();
        BirthDate = userDTO.getBirthDate();
        Address = userDTO.getAddress();
        District = userDTO.getDistrict();
        City = userDTO.getCity();
        State = userDTO.getState();
        ZipCode = userDTO.getZipCode();
        Email = userDTO.getEmail();
        Phone = userDTO.getPhone();
        Skype = userDTO.getSkype();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getSkype() {
        return Skype;
    }

    public void setSkype(String skype) {
        Skype = skype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
