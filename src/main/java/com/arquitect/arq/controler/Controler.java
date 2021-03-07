package com.arquitect.arq.controler;

import com.arquitect.arq.interfaceService.IConductorService;
import com.arquitect.arq.model.Conductor;
import com.arquitect.arq.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controler {
    @Autowired
    private IConductorService service;

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Conductor> conductores = service.listar();
        model.addAttribute("conductores", conductores);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("conductor", new Conductor());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid Conductor c, Model model) {
        service.save(c);
        return "redirect:/listar";
    }
    @GetMapping("/edit/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Conductor> conductor = service.listarId(id);
        model.addAttribute("conductor",conductor);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
