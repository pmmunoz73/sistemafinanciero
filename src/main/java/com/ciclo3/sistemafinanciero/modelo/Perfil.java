package com.ciclo3.sistemafinanciero.modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_Perfil;
    @Column(name = "Imagen")
    private String imagen;
    @Column(name = "Telefono")
    private String telefono;
    @OneToOne
    @JoinColumn(name = "id_Empleado")
    private Empleado empleado;
    @Column(name = "fecha_Creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_Actualizacion")
    private Date fechaActualizacion;


    public Perfil() {
    }

    public Perfil(long id_Perfil, String imagen, String telefono, Empleado empleado, Date fechaCreacion,
                  Date fechaActualizacion) {
        this.id_Perfil = id_Perfil;
        this.imagen = imagen;
        this.telefono = telefono;
        this.empleado = empleado;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public long getId_Perfil() {
        return id_Perfil;
    }

    public void setId_Perfil(long id_Perfil) {
        this.id_Perfil = id_Perfil;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
