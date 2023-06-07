package com.softtek.examenejercicio2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="lugares")
public class Lugares {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lugar")
    private Integer idLugar;

    @Column(length = 60)
    private String nombre;

    @OneToMany(mappedBy = "lugar", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Visitas> visitas;
}
