package com.softtek.examenejercicio2.repository;

import com.softtek.examenejercicio2.model.Autobuses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobusRepo extends JpaRepository<Autobuses,String> {
}
