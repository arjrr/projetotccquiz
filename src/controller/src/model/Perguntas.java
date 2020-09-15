/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Perguntas {
    
    private String descricao;
    private String respA;
    private String respB;
    private String respC;
    private String respD;
    private String respcorreta;

    public Perguntas(String descricao, String respA, String respB, String respC, String respD, String respcorreta) {
        this.descricao = descricao;
        this.respA = respA;
        this.respB = respB;
        this.respC = respC;
        this.respD = respD;
        this.respcorreta = respcorreta;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the respA
     */
    public String getRespA() {
        return respA;
    }

    /**
     * @return the respB
     */
    public String getRespB() {
        return respB;
    }

    /**
     * @return the respC
     */
    public String getRespC() {
        return respC;
    }

    /**
     * @return the respD
     */
    public String getRespD() {
        return respD;
    }

    /**
     * @return the respcorreta
     */
    public String getRespcorreta() {
        return respcorreta;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param respA the respA to set
     */
    public void setRespA(String respA) {
        this.respA = respA;
    }

    /**
     * @param respB the respB to set
     */
    public void setRespB(String respB) {
        this.respB = respB;
    }

    /**
     * @param respC the respC to set
     */
    public void setRespC(String respC) {
        this.respC = respC;
    }

    /**
     * @param respD the respD to set
     */
    public void setRespD(String respD) {
        this.respD = respD;
    }

    /**
     * @param respcorreta the respcorreta to set
     */
    public void setRespcorreta(String respcorreta) {
        this.respcorreta = respcorreta;
    }
    
}
