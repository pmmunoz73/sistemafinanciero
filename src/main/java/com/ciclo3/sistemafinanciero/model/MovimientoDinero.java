package com.ciclo3.sistemafinanciero.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Table(name = "movimiento_dinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaccion")
    private Long idTransaccion;

    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "id_empleado")
    private Long idEmpleado;

    @Column(name = "concepto")
    private  String concepto;

    @Column(name = "monto")
    private float monto;

    @Column(name = "fecha_creacion")
    Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    Date fechaActualizacion;

    @ManyToOne
    @JoinColumn(name = "id_empresa", insertable = false, updatable = false)
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "id_empleado", insertable = false, updatable = false)
    private Empleado empleado;


}