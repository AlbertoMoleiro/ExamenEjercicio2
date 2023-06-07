package com.softtek.examenejercicio2.service;

import com.softtek.examenejercicio2.model.Autobuses;

import java.util.List;

public interface IAutobusService {

    Autobuses createAutobus(Autobuses autobus) throws Exception;
    List<Autobuses> getAll() throws Exception;

    Autobuses getById(String id) throws Exception;

    void removeAutobus(Autobuses autobus) throws Exception;

    Autobuses updateAutobus(Autobuses autobus) throws Exception;


}
