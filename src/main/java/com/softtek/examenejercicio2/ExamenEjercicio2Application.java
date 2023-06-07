package com.softtek.examenejercicio2;

import com.softtek.examenejercicio2.model.Autobuses;
import com.softtek.examenejercicio2.model.Conductores;
import com.softtek.examenejercicio2.model.Lugares;
import com.softtek.examenejercicio2.model.Visitas;
import com.softtek.examenejercicio2.service.AutobusServiceImpl;
import com.softtek.examenejercicio2.service.ConductoresService;
import com.softtek.examenejercicio2.service.LugaresService;
import com.softtek.examenejercicio2.service.VisitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExamenEjercicio2Application implements CommandLineRunner {

	@Autowired
	private AutobusServiceImpl autobusService;
	@Autowired
	private VisitasService visitasService;

	@Autowired
	private LugaresService lugaresService;
	@Autowired
	private ConductoresService conductoresService;
	public static void main(String[] args) {
		SpringApplication.run(ExamenEjercicio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Crud de Autobuses

		Autobuses autobus = new Autobuses();
		autobus.setMatricula("12345AA");
		autobus.setAFabricacion(2005);
		Autobuses autobus2 = new Autobuses();
		autobus2.setMatricula("12345AB");
		autobus2.setAFabricacion(2006);

		Lugares lugar = new Lugares();
		lugar.setNombre("Lugar1");
		Lugares lugar2 = new Lugares();
		lugar2.setNombre("Lugar2");

		Conductores conductor=new Conductores();
		conductor.setDni("12345678A");
		conductor.setNombre("Conductor1");
		Conductores conductor2=new Conductores();
		conductor2.setDni("12345678B");
		conductor2.setNombre("Conductor2");

//		autobusService.createAutobus(autobus);
//		autobusService.createAutobus(autobus2);
//
//		lugaresService.createLugar(lugar);
//		lugaresService.createLugar(lugar2);
//
//		conductoresService.createConductor(conductor);
//		conductoresService.createConductor(conductor2);


		Visitas visita = new Visitas();
		visita.setDate(LocalDate.now());
		visita.setAutobus(autobus);
		visita.setConductor(conductor);
		visita.setLugar(lugar);

//		Visitas visita2 = new Visitas();
//		visita.setDate(LocalDate.now());
//		visita.setAutobus(autobus2);
//		visita.setConductor(conductor2);
//		visita.setLugar(lugar2);

		visitasService.createVisita(visita);




	}

}
