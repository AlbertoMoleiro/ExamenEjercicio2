package com.softtek.examenejercicio2.service;

import com.softtek.examenejercicio2.model.Conductores;
import com.softtek.examenejercicio2.repository.IConductoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConductoresService implements IConductoresService{
    @Autowired
    private IConductoresRepo repo;

    @Override
    public Conductores createConductor(Conductores conductor) {
        return repo.save(conductor);
    }
}
