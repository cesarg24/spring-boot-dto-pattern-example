package com.cesar.libro.springboot.webapp.springboot_web.models;

public class Libro {

    private Long code;
    private String title;
    private String autor;
    private String editorial;
    private Integer year;

    
    public Libro(Long code, String title, String autor, String editorial, Integer year) {
        this.code = code;
        this.title = title;
        this.autor = autor;
        this.editorial = editorial;
        this.year = year;
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
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public Integer getYear() {
        return year;
    }
}
