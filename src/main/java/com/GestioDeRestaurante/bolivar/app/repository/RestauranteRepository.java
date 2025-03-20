package com.GestioDeRestaurante.bolivar.app.repository;

import com.GestioDeRestaurante.bolivar.app.ModelRes.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}