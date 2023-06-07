package com.softtek.examenejercicio2.service;

import com.softtek.examenejercicio2.model.Lugares;
import com.softtek.examenejercicio2.repository.ILugaresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugaresService implements ILugaresService {
    @Autowired
    private ILugaresRepo repo;

    @Override
    public Lugares createLugar(Lugares lugar) {
        return repo.save(lugar);
    }

}
