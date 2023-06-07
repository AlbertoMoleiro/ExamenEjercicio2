package com.softtek.examenejercicio2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="visitas")
public class Visitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "f_visita")
    private LocalDate date;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonIgnore
    @JoinColumn(name = "matricula", nullable = false, referencedColumnName = "matricula",foreignKey = @ForeignKey(name = "FK_visita_autobus"))
    private Autobuses autobus;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dni", nullable = false,referencedColumnName ="dni" ,foreignKey = @ForeignKey(name = "FK_visita_conductor"))
    private Conductores conductor;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idLugar",referencedColumnName = "idLugar",nullable = false, foreignKey = @ForeignKey(name = "FK_visita_lugar"))
    private Lugares lugar;
}
