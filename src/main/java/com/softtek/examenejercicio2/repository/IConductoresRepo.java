package com.softtek.examenejercicio2.repository;

import com.softtek.examenejercicio2.model.Conductores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConductoresRepo extends JpaRepository<Conductores, Long> {
}
