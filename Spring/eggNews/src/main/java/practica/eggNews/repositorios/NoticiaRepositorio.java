/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.eggNews.repositorios;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import practica.eggNews.entidades.Noticia;

/**
 *
 * @author franc
 */
@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, Integer>{
    
   @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
   public Noticia buscarPorTitulo(@Param("titulo") String titulo);
   
 
   
   
    
}
