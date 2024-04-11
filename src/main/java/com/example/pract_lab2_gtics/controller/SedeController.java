package com.example.pract_lab2_gtics.controller;

import com.example.pract_lab2_gtics.entity.Sede;
import com.example.pract_lab2_gtics.repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class SedeController {

    final SedeRepository sedeRepository;

    public SedeController(SedeRepository sedeRepository){
        this.sedeRepository = sedeRepository;
    }

    @GetMapping(value ={"/sede","","/"})
    public String listaSede(Model model){
        List<Sede> lista =sedeRepository.findAll();
        model.addAttribute("listaSede", lista);
        return "sede_vistas/sede";
    }

    @GetMapping("/sede/borrar")
    public String borrar(@RequestParam("idSede") int id){
        Optional<Sede> optSede =sedeRepository.findById(id);
        if(optSede.isPresent()){
            sedeRepository.deleteById(id);
        }
        return "redirect:/sede";

    }

    @GetMapping("sede/editar")
    public String editar(Model model,
                         @RequestParam("idSede") int id){
        Optional<Sede> sedeProv = sedeRepository.findById(id);
        if(sedeProv.isPresent()){
            Sede sede = sedeProv.get();
            model.addAttribute("sede", sede);
            return "sede_vistas/sedeEdit";
        }
        return "redirect:/sede";
    }

    @GetMapping(value="/sede/nuevo")
    public String nuevaSede(){
        return "sede_vistas/sedeNuevo";
    }


    @PostMapping(value = "sede/guardar")
    public String guardarSede(Sede sede){
        sedeRepository.save(sede);
        return "redirect:/sede";
    }

}
