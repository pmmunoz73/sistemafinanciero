package com.ciclo3.sistemafinanciero.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

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
    @Column(name = "id_Movimiento")
    private Integer id_Movimiento;

    @Column(name = "id_Empresa")
    private Integer id_Empresa;

    @Column(name = "id_Empleado")
    private Integer id_Empleado;

    @Column(name = "concepto")
    private  String concepto;

    @Column(name = "monto")
    private float monto;


    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fechaActualizacion;

    @ManyToOne
    @JoinColumn(name = "id_empresa", insertable = false, updatable = false)
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "id_empleado", insertable = false, updatable = false)
    private Empleado empleado;


}