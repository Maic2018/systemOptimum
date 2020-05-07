package com.michael.viana.process.system.domain.dto;

import com.michael.viana.process.system.domain.User;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String Name;
    private String Cpf;
    private String BirthDate;
    private String Address;
    private String District;
    private String City;
    private String State;
    private String ZipCode;

    private String Email = null;
    private String Phone = null;
    private String Skype = null;

    public UserDTO() { }

    public UserDTO(User user) {
        id = user.getId();
        Name = user.getName();
        Cpf = user.getCpf();
        BirthDate = user.getBirthDate();
        Address = user.getAddress();
        District = user.getDistrict();
        City = user.getCity();
        State = user.getState();
        ZipCode = user.getZipCode();
        Email = user.getEmail();
        Phone = user.getPhone();
        Skype = user.getSkype();
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
        return Email;
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
}
