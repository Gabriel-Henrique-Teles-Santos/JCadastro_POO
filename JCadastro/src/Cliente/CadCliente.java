/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author1 Gabriel Henrique Teles Santos
 * @author2 Gabriel Dordal Tinelli
 * @since 27/06/18
 * @version 1.0
 */
public class CadCliente {
    private Integer codigo;
    private String nome;
    private String email;
    private String password;
    private Integer cep;
    private Integer dataNasc;
    private String paisOrigem;

    public CadCliente(Integer pCodigo, String pNome, String pEmail, String pPassword, Integer pCep, Integer pDataNasc, String pPaisOrigem){
        codigo = pCodigo;
        nome = pNome;
        email= pEmail;
        password=pPassword;
        cep=pCep;
        dataNasc=pDataNasc;
        paisOrigem=pPaisOrigem;
    }

    public CadCliente() {
       
    }
    
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    
    public Integer getCep(){
        return cep;
    }
    public void setCep(Integer cep){
        this.cep=cep;
    }
    
    public Integer getDatNasc(){
        return dataNasc;
    }
    public void setDatNasc(Integer dataNasc){
        this.dataNasc=dataNasc;
    }
    
    public String getPaisOrigem(){
        return paisOrigem;
    }
    public void setPaisOrigem(String paisOrigem){
        this.paisOrigem=paisOrigem;
    }
            
    
}
