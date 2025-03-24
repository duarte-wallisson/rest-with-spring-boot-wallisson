package br.com.wallisson.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
}
