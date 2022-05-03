package com.cenfotec.grillitoFeliz.services;

import com.cenfotec.grillitoFeliz.entities.Libro;
import com.cenfotec.grillitoFeliz.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public Libro createLibro(String nombre, String autor, String genero, String estado) {
        Libro libro = new Libro();
        libro.setNombre(nombre);
        libro.setAutor(autor);
        libro.setGenero(genero);
        libro.setEstado(estado);
        return this.libroRepository.save(libro);
    }

    public List<Libro> getAllLibros(int count) {
        return this.libroRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public Optional<Libro> getLibro(int id) {
        return this.libroRepository.findById(id);
    }

    public Libro updateLibro(int id, String nombre, String autor, String genero, String estado) {
        Libro libro = new Libro();
        libro.setId(id);
        libro.setNombre(nombre);
        libro.setAutor(autor);
        libro.setGenero(genero);
        libro.setEstado(estado);
        return this.libroRepository.save(libro);
    }

    public Libro logicDeleteLibro(int id, String estado) {
        Libro libro = new Libro();
        libro.setId(id);
        libro.setEstado(estado);
        return this.libroRepository.save(libro);
    }

    public Boolean deleteLibro(int id) {
        libroRepository.deleteById(id);
        return true;
    }

}
