/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Perguntas;
import model.PerguntasDAO;

/**
 *
 * @author user
 */
public class PerguntasDAOImp implements PerguntasDAO {

    private MySQLAccess mySQLAccess = new MySQLAccess();

    @Override
    public List<Perguntas> getAllPerguntas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Perguntas getPergunta(int codperg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertPergunta(Perguntas p) {
        try {
            PreparedStatement preparedStatement = mySQLAccess.getConnection().prepareStatement("INSERT INTO mydb.perguntas (descricao, respA, respB, respC, respD, respcorreta, idcategoria) VALUES (?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, p.getDescricao());
            preparedStatement.setString(2, p.getRespA());
            preparedStatement.setString(3, p.getRespB());
            preparedStatement.setString(4, p.getRespC());
            preparedStatement.setString(5, p.getRespD());
            preparedStatement.setString(6, p.getRespcorreta());
            preparedStatement.setString(7, "1");
            mySQLAccess.insertInto(preparedStatement);

        } catch (SQLException ex) {
            Logger.getLogger(PerguntasDAOImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updatePergunta(Perguntas p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePergunta(Perguntas p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
