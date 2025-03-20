package com.GestioDeRestaurante.bolivar.app.service;

import com.GestioDeRestaurante.bolivar.app.ModelRes.*;
import com.GestioDeRestaurante.bolivar.app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    public Reserva guardarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Reserva obtenerReserva(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    public Reserva actualizarReserva(Long id, Reserva reserva) {
        reserva.setId(id);
        return reservaRepository.save(reserva);
    }

    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
