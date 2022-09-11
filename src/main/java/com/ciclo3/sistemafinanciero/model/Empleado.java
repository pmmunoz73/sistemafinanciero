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

@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

   /* @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "id_perfil")
    private String idPerfil;
*/
    @Column (name = "nombre")
    private String nombre;

    @Column(name = "email", unique = true)
    private String email;

 /*   @Column(name = "rol", length = 20)
    @Enumerated(EnumType.STRING)
    private EnumRole rol;
*/
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;

    @ManyToOne
    @JoinColumn(name = "id_empresa", insertable = false, updatable = false)
    private Empresa empresa;

/*    @OneToMany(mappedBy = "empleado")
    private List<Transaccion> transacciones;*/

    @OneToOne
    @JoinColumn(name = "id_perfil", insertable = false, updatable = false)
    private Perfil perfil;





}


