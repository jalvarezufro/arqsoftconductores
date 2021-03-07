package com.arquitect.arq.controler;

import com.arquitect.arq.interfaceService.IConductorService;
import com.arquitect.arq.model.Conductor;
import com.arquitect.arq.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@CrossOrigin("http://200.13.4.226/")
@RestController
@RequestMapping

public class Controler  {

    @Autowired
    private IConductorService service;

    @GetMapping("/listar")
    public ResponseEntity<List<Conductor>> listar(Model model) {
        List<Conductor> conductores = service.listar();

        return new ResponseEntity<List<Conductor>>(conductores, HttpStatus.OK);
    }


    @PostMapping("/save")
    public Conductor save(@RequestBody Conductor c) {
        return service.save(c);
    }

    @GetMapping("/detalle/{id}")
    public Optional<Conductor> editar(@PathVariable int id, Model model) {
        Optional<Conductor> conductor = service.listarId(id);

        return conductor;
    }

    @RequestMapping(method = RequestMethod.DELETE, path="/delete/{id}")
        public String delete(Model model,@PathVariable int id){
            service.delete(id);
            return "listo";
        }

}
