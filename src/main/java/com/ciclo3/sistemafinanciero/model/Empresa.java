package com.ciclo3.sistemafinanciero.model;

//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column (name = "nombre", unique = true)
    private String nombre;

    @Column (name = "nit", unique = true)
    private String nit;

    @Column (name = "direccion")
    private String direccion;

    @Column (name = "telefono")
    private String telefono;

    @Column(name = "fecha_creacion")
    //@Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    //@Temporal(TemporalType.DATE)
    private Date fechaActualizacion;

    /*@OneToMany(mappedBy = "empresa")
    private List<Empleado> empleado;*/

   /* @OneToMany(mappedBy = "empresa")
    private List<Transaccion> transacciones;*/


}
