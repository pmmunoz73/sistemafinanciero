package com.ciclo3.sistemafinanciero.modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Transaccion {
    @Id
    @Column(name = "Id_Transaccion")
    private long id_transaccion;
    @Column(name = "Concepto")
    private String concepto;
    @Column(name = "Monto")
    private float monto;
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    @Column(name = "Empleado")
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "transacciones")
    @Column(name = "Empresa")
    private Empresa empresa;
    @Column(name = "fecha_Creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_Actualizacion")
    private Date fechaActualizacion;

    public Transaccion() {
    }

    public Transaccion(long id_transaccion, String concepto, float monto, Empleado empleado, Empresa empresa,
                       Date fechaCreacion, Date fechaActualizacion) {
        this.id_transaccion = id_transaccion;
        this.concepto = concepto;
        this.monto = monto;
        this.empleado = empleado;
        this.empresa = empresa;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public long getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(long id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
