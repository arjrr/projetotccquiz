/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author user
 */
public interface CategoriaDAO {

    public List<Categoria> getAllCategorias();

    public Categoria getCategoria(int idcategoria);

    public void insertCategoria(Categoria categoria);
}
