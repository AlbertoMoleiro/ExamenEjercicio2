package com.softtek.examenejercicio2.service;

import com.softtek.examenejercicio2.model.Visitas;
import com.softtek.examenejercicio2.repository.IVisitasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitasService implements IVisitasService{
    @Autowired
    IVisitasRepo repoVisitas;

    @Override
    public Visitas createVisita(Visitas visita) throws Exception{
        return repoVisitas.save(visita);
    }

}
