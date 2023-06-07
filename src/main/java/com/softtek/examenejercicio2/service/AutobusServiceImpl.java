package com.softtek.examenejercicio2.service;

import com.softtek.examenejercicio2.model.Autobuses;
import com.softtek.examenejercicio2.repository.IAutobusRepo;
import com.softtek.examenejercicio2.repository.IVisitasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutobusServiceImpl implements IAutobusService {
    @Autowired
    IAutobusRepo repoBus;

    @Override
   public Autobuses createAutobus(Autobuses autobus){
        return repoBus.save(autobus);
    };

    @Override
    public List<Autobuses> getAll() throws Exception{
        return repoBus.findAll();
    };

    @Override
    public Autobuses getById(String id) throws Exception{
        Optional<Autobuses> autobus = repoBus.findById(id);
        if(!autobus.isPresent()){
            throw new Exception("No se encontro el autobus");
        }

        return autobus.get();
    };

    @Override
    public void removeAutobus(Autobuses autobus) throws Exception{
        repoBus.delete(autobus);
    };

    @Override
    public Autobuses updateAutobus(Autobuses autobus) throws Exception{
        return repoBus.save(autobus);
    };



}
