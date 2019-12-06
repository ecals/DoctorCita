package com.cals.doctorcita.entidad;

public class Medico {

    public int idMedico;
    public int idEspecialidad;

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public Double getMinutosAtencion() {
        return minutosAtencion;
    }

    public void setMinutosAtencion(Double minutosAtencion) {
        this.minutosAtencion = minutosAtencion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String CMP;
    public Double minutosAtencion;
    public String nombre;
    public String estado;
}

