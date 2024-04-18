package com.example.pract_lab2_gtics.controller;

import com.example.pract_lab2_gtics.entity.Sede;
import com.example.pract_lab2_gtics.entity.Trabajador;
import com.example.pract_lab2_gtics.repository.SedeRepository;
import com.example.pract_lab2_gtics.repository.TrabajadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class TrabajadorController {


    final TrabajadorRepository trabajadorRepository;
    final SedeRepository sedeRepository;

    public TrabajadorController(TrabajadorRepository trabajadorRepository, SedeRepository sedeRepository){
        this.trabajadorRepository = trabajadorRepository;
        this.sedeRepository = sedeRepository;
    }

    @GetMapping(value ={"/trabajador"})
    public String listaTrabajador(Model model){
        List<Trabajador> lista =trabajadorRepository.findAll();
        model.addAttribute("listaTrabajador", lista);
        return "trabajador/lista";
    }

    @GetMapping(value="/trabajador/nuevo")
    public String nuevoTrabajador(Model model){

        List<Sede> listaSede =sedeRepository.findAll();
        model.addAttribute("listaSede", listaSede);
        return "trabajador/nuevo";
    }


    @PostMapping(value = "/trabajador/guardar")
    public String guardarTrabajador(Trabajador trabajador){
        trabajadorRepository.save(trabajador);
        return "redirect:/trabajador";
    }


    @GetMapping("/trabajador/editar")
    public String editar(Model model,
                         @RequestParam("dniTrabajador") String dni){
        Optional<Trabajador> trabajadorProv = trabajadorRepository.findByDni(dni);
        if(trabajadorProv.isPresent()){
            List<Sede> listaSede =sedeRepository.findAll();
            Trabajador trabajador = trabajadorProv.get();
            model.addAttribute("listaSede", listaSede);
            model.addAttribute("trabajador", trabajador);
            return "trabajador/edit";
        }
        return "redirect:/trabajador";
    }


    @GetMapping("/trabajador/borrar")
    public String borrar(@RequestParam("dniTrabajador") String dni){
        Optional<Trabajador> trabajadorProv = trabajadorRepository.findByDni(dni);
        if(trabajadorProv.isPresent()){
            Trabajador trabajador = trabajadorProv.get();
            trabajadorRepository.deleteByDni(dni);
        }
        return "redirect:/trabajador";

    }




}
