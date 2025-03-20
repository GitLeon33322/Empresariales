package com.GestioDeRestaurante.bolivar.app.ModelRes;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurante")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva> reservas;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}