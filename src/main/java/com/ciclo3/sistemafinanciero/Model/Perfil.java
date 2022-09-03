package com.ciclo3.sistemafinanciero.Model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "Imagen")
    private String imagen;
    @Column(name = "Telefono")
    private String telefono;
    @OneToOne
    @JoinColumn(name = "Id")
    private Empleado empleado;
    @Column(name = "fecha_Creacion")
    @CreationTimestamp
    private Date fechaCreacion;
    @Column(name = "fecha_Actualizacion")
    @UpdateTimestamp
    private Date fechaActualizacion;


    public Perfil() {
    }

    public Perfil(long Id, String imagen, String telefono, Empleado empleado, Date fechaCreacion,
                  Date fechaActualizacion) {
        this.Id = Id;
        this.imagen = imagen;
        this.telefono = telefono;
        this.empleado = empleado;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
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
