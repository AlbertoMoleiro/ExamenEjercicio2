package com.softtek.examenejercicio2.service;

import com.softtek.examenejercicio2.model.Autobuses;
import com.softtek.examenejercicio2.repository.IAutobusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutobusService implements IAutobusService {
    @Autowired
    IAutobusRepo repo;

    @Override
   public Autobuses createAutobus(Autobuses autobus){
        return repo.save(autobus);
    };

    @Override
    public List<Autobuses> getAll() throws Exception{
        return repo.findAll();
    };

    @Override
    public Autobuses getById(String id) throws Exception{
        Optional<Autobuses> autobus = repo.findById(id);
        if(autobus.isPresent()){
            throw new Exception("No se encontro el autobus");
        }

        return autobus.get();
    };

    @Override
    public void removeAutobus(Autobuses autobus) throws Exception{
        repo.delete(autobus);
    };

    @Override
    public Autobuses updateAutobus(Autobuses autobus) throws Exception{
        return repo.save(autobus);
    };



}
