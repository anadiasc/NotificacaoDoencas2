package br.edu.ifpi.notificacaodoencas.Models;

import java.util.UUID;

public class Notificacao {
    private UUID id;
    //dados gerais
    private String tipoNotificacao = "individual";
    private String doenca;
    private String codigoCID;
    private String dataNotificacao;//usar o tipo localdate
    private String unidadeFederativa;
    private String municipioNotificacao;
    private String unidadeSaude;
    private String codigoUnidade;
    private String dataSintomas;
    //notificacao individual
    private String nomePaciente;
    private String dataNascimento;
    private int idade;
    private String sexo;
    private String gestante;
    private String raca;
    private String escolaridade;
    private String numCartaoSus;
    private String nomeMae;
    //dados residencia
    private String unidadeFederativaPaciente;
    private String municipioResid;
    private String destrito;
    private String bairro;
    private String logradouro;
    private int numero;
    private String complemento;
    private String pontoRef;
    private String cep;
    private String telefone;
    private String zona;
    private String pais;

    public Notificacao() {}

    public UUID getId(){
        return id;
    }

    public String getTipoNotificacao() {
        return tipoNotificacao;
    }

    public String getDoenca() {
        return doenca;
    }

    public String getCodigoCID() {
        return codigoCID;
    }

    public String getDataNotificacao() {
        return dataNotificacao;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public String getMunicipioNotificacao() {
        return municipioNotificacao;
    }

    public String getUnidadeSaude() {
        return unidadeSaude;
    }

    public String getCodigoUnidade() {
        return codigoUnidade;
    }

    public String getDataSintomas() {
        return dataSintomas;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getGestante() {
        return gestante;
    }

    public String getRaca() {
        return raca;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public String getNumCartaoSus() {
        return numCartaoSus;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getUnidadeFederativaPaciente() {
        return unidadeFederativaPaciente;
    }

    public String getMunicipioResid() {
        return municipioResid;
    }

    public String getDestrito() {
        return destrito;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getPontoRef() {
        return pontoRef;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getZona() {
        return zona;
    }

    public String getPais() {
        return pais;
    }

    public void setId(UUID id){
        this.id = id;
    }

    public void setTipoNotificacao(String tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public void setCodigoCID(String codigoCID) {
        this.codigoCID = codigoCID;
    }

    public void setDataNotificacao(String dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public void setUnidadeFederativa(String unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public void setMunicipioNotificacao(String municipioNotificacao) {
        this.municipioNotificacao = municipioNotificacao;
    }

    public void setUnidadeSaude(String unidadeSaude) {
        this.unidadeSaude = unidadeSaude;
    }

    public void setCodigoUnidade(String codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }

    public void setDataSintomas(String dataSintomas) {
        this.dataSintomas = dataSintomas;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setGestante(String gestante) {
        this.gestante = gestante;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setNumCartaoSus(String numCartaoSus) {
        this.numCartaoSus = numCartaoSus;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void setUnidadeFederativaPaciente(String unidadeFederativaPaciente) {
        this.unidadeFederativaPaciente = unidadeFederativaPaciente;
    }

    public void setMunicipioResid(String municipioResid) {
        this.municipioResid = municipioResid;
    }

    public void setDestrito(String destrito) {
        this.destrito = destrito;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setPontoRef(String pontoRef) {
        this.pontoRef = pontoRef;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
