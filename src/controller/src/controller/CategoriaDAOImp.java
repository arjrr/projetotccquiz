/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Categoria;
import model.CategoriaDAO;

/**
 *
 * @author user
 */
public class CategoriaDAOImp implements CategoriaDAO {

    private MySQLAccess mySQLAccess = new MySQLAccess();

    @Override
    public List<Categoria> getAllCategorias() {
        List<Categoria> categorias = new ArrayList<>();

        try {
            Statement s = mySQLAccess.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT descricao FROM mydb.categoria");
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setDescricao(rs.getString("descricao"));
                categorias.add(categoria);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }

        return categorias;
    }

    @Override
    public Categoria getCategoria(int idcategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
