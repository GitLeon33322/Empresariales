package com.GestioDeRestaurante.bolivar.app.controller;

import com.GestioDeRestaurante.bolivar.app.ModelRes.*;
import com.GestioDeRestaurante.bolivar.app.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaService.listarReservas();
    }

    @PostMapping
    public Reserva guardarReserva(@RequestBody Reserva reserva) {
        return reservaService.guardarReserva(reserva);
    }

    @GetMapping("/{id}")
    public Reserva obtenerReserva(@PathVariable Long id) {
        return reservaService.obtenerReserva(id);
    }

    @PutMapping("/{id}")
    public Reserva actualizarReserva(@PathVariable Long id, @RequestBody Reserva reserva) {
        return reservaService.actualizarReserva(id, reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminarReserva(@PathVariable Long id) {
        reservaService.eliminarReserva(id);
    }
}
