package com.example.springconfigserver;


import jakarta.persistence.*;

@Entity
@Table(name = "CONFIG_PROPS")
public class ConfigDBEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    public int id;
    @Column(name = "APPLICATION")
    public String application;
    @Column(name = "PROFILE")
    public String profile;
    @Column(name = "LABEL")
    public String label;
    @Column(name = "KEY")
    public String key;
    @Column(name = "VALUE")
    public String values;
}

