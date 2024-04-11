package com.example.pract_lab2_gtics.controller;

import com.example.pract_lab2_gtics.repository.InventarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InventarioController {

    final InventarioRepository inventarioRepository;

    public InventarioController(InventarioRepository inventarioRepository){
        this.inventarioRepository = inventarioRepository;
    }



}



