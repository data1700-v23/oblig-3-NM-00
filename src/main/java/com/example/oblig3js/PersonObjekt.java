package com.example.oblig3js;
import jakarta.persistence.*;
@Entity
@Table(name ="PersonObjekt")

public class PersonObjekt {
    @Id
    @GeneratedValue
    private int id;

    @Column (name = "film")
    private String film;

    @Column (name = "antall")
    private int antall;
    @Column (name = "fornavn")
    private String fornavn;
    @Column (name = "etternavn")
    private String etternavn;

    @Column (name = "telefonnr")
    private int telefonnr;
    @Column (name = "email")
    private String email;


    public PersonObjekt(String film, int antall, String fornavn, String etternavn, int telefonnr, String email, int id){
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.email = email;
        this.id = id;
    }

    public PersonObjekt() {

    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
