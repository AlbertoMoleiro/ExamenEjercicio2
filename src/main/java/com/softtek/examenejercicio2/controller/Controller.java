package com.softtek.examenejercicio2.controller;

import com.softtek.examenejercicio2.model.Autobuses;
import com.softtek.examenejercicio2.service.AutobusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
@RestController
@RequestMapping("/autobuses")
public class Controller {
    @Autowired
    AutobusServiceImpl autobusesService;
    @GetMapping("/all")
    ResponseEntity<List<Autobuses>> getAll() throws Exception{
        return ResponseEntity.ok(autobusesService.getAll());
    }
}
