package com.GestioDeRestaurante.bolivar.app.controller;

import com.GestioDeRestaurante.bolivar.app.ModelRes.*;
import com.GestioDeRestaurante.bolivar.app.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @GetMapping
    public List<Restaurante> listarRestaurantes() {
        return restauranteService.listarRestaurantes();
    }

    @PostMapping
    public Restaurante guardarRestaurante(@RequestBody Restaurante restaurante) {
        return restauranteService.guardarRestaurante(restaurante);
    }

    @GetMapping("/{id}")
    public Restaurante obtenerRestaurante(@PathVariable Long id) {
        return restauranteService.obtenerRestaurante(id);
    }

    @PutMapping("/{id}")
    public Restaurante actualizarRestaurante(@PathVariable Long id, @RequestBody Restaurante restaurante) {
        return restauranteService.actualizarRestaurante(id, restaurante);
    }

    @DeleteMapping("/{id}")
    public void eliminarRestaurante(@PathVariable Long id) {
        restauranteService.eliminarRestaurante(id);
    }
}