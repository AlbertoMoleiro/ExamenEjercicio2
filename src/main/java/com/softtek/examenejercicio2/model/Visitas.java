package com.softtek.examenejercicio2.model;

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

    @ManyToOne
    @JoinColumn(name = "matricula", nullable = false, foreignKey = @ForeignKey(name = "FK_visita_autobus"))
    private Autobuses autobus;

    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_visita_conductor"))
    private Conductores conductor;

    @ManyToOne
    @JoinColumn(name = "id_lugar", nullable = false, foreignKey = @ForeignKey(name = "FK_visita_lugar"))
    private Lugares lugar;
}
