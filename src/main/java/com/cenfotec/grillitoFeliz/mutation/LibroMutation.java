package com.cenfotec.grillitoFeliz.mutation;

import com.cenfotec.grillitoFeliz.entities.Libro;
import com.cenfotec.grillitoFeliz.services.LibroService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static jdk.nashorn.internal.objects.Global.undefined;

@Component
public class LibroMutation implements GraphQLMutationResolver {

    @Autowired
    private LibroService libroService;

    public Libro createLibro(String nombre, String autor, String genero, String estado) {
        return this.libroService.createLibro(nombre, autor, genero, estado);
    }

    public Libro updateLibro(int id, String nombre, String autor, String genero, String estado) {
        return this.libroService.updateLibro(id, nombre, autor, genero, estado);
    }

    public Libro logicDeleteLibro(int id, String estado) {
        return this.libroService.logicDeleteLibro(id, estado);
    }

    public Boolean deleteLibro(int id) {
        return libroService.deleteLibro(id);
    }
}
