package com.cesar.libro.springboot.webapp.springboot_web.models.dto;

import com.cesar.libro.springboot.webapp.springboot_web.models.Libro;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "code", "title", "autor", "advertising" })
public class LibroDto {

    private Long code;
    private String title;
    private String autor;
    private String advertising;

    public LibroDto(Libro libro, String advertising) {
        this.code = libro.getCode();
        this.title = libro.getTitle();
        this.autor = libro.getAutor();
        this.advertising = advertising;
    }
    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAdvertising() {
        return advertising;
    }
    public void setAdvertising(Long advertising) {
        this.advertising = advertising;
    }
    
}
