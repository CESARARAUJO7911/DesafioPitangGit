package org.desafio.controller;

import org.desafio.model.CarroModel;
import org.desafio.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroRepository carroRepository;
    @GetMapping
    public List<CarroModel> listar(){
        return carroRepository.findAll();
    }


}
