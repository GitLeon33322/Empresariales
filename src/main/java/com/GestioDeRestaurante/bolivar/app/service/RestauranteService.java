package com.GestioDeRestaurante.bolivar.app.service;

import com.GestioDeRestaurante.bolivar.app.ModelRes.*;
import com.GestioDeRestaurante.bolivar.app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<Restaurante> listarRestaurantes() {
        return restauranteRepository.findAll();
    }

    public Restaurante guardarRestaurante(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    public Restaurante obtenerRestaurante(Long id) {
        return restauranteRepository.findById(id).orElse(null);
    }

    public Restaurante actualizarRestaurante(Long id, Restaurante restaurante) {
        restaurante.setId(id);
        return restauranteRepository.save(restaurante);
    }

    public void eliminarRestaurante(Long id) {
        restauranteRepository.deleteById(id);
    }
}