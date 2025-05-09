package com.ba22004corto2.ba22004.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "miembros")
public class Miembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String correo;

    @Column
    private String telefono;

    @OneToMany(mappedBy = "miembro")
    private List<Membresia> membresias;

    @OneToOne
    @JoinColumn(name = "membresia_activa_id")
    private Membresia membresiaActiva;

    @OneToMany(mappedBy = "miembro")
    private List<AsistenciaClase> asistencias;


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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Membresia> getMembresias() {
        return membresias;
    }

    public void setMembresias(List<Membresia> membresias) {
        this.membresias = membresias;
    }

    public Membresia getMembresiaActiva() {
        return membresiaActiva;
    }

    public void setMembresiaActiva(Membresia membresiaActiva) {
        this.membresiaActiva = membresiaActiva;
    }
}
