package com.ciclo3.sistemafinanciero.modelo;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpleado;
    @Column(name = "Correo", unique = true)
    private String email;
    @OneToOne
    @JoinColumn(name = "id_Perfil")
    private Perfil perfil;
    @Enumerated(EnumType.STRING)
    @Column(name = "Rol", length = 10)
    private Enum_Rol rol;
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @OneToMany(mappedBy = "empleado")
    private List<Transaccion> transacciones;
    @Column(name = "fecha_Creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_Actualizacion")
    private Date fechaActualizacion;

    public Empleado() {
    }

    public Empleado(long idEmpleado, String email, Perfil perfil, Enum_Rol rol, Empresa empresa,
                    List<Transaccion> transacciones, Date fechaCreacion, Date fechaActualizacion) {
        this.idEmpleado = idEmpleado;
        this.email = email;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.transacciones = transacciones;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Enum_Rol getRol() {
        return rol;
    }

    public void setRol(Enum_Rol rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
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
