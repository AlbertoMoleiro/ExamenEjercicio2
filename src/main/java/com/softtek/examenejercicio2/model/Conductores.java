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
@Table(name="conductores")
public class Conductores {
    @Id
    @Column(length = 10)
    private String dni;

    @Column(length = 60)
    private String nombre;

}
