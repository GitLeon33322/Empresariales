package com.GestioDeRestaurante.bolivar.app.ModelRes;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;


@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private LocalTime hora; 
    private int numeroPersonas;

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}