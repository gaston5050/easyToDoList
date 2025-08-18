package com.example.easytodolist.model;

public class Task {

    private String titulo;
    private String descripcion;
    private boolean estado;

    public Task(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void cambiarEstado() {
        this.estado = !this.estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nDescripcion: " + descripcion + "\nEstado: " + estado;
    }




}
