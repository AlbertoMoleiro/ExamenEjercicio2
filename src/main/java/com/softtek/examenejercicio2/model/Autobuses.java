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
@Table(name="autobuses")
public class Autobuses {
    @Id
    @Column(length = 7)
    private String matricula;

    @Column(name="a_fabricacion")
    private Integer aFabricacion;


    @OneToMany(mappedBy = "autobus", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Visitas> visitas;
}
