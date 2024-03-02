package br.com.fullstack.course.fullstackcourse.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CursosModel {


    private static List<CursosModel> cursosCadastrados = new ArrayList<>();

    private static Integer proximoId = 1;

    private Integer id;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;

    public static List<CursosModel> getCursosCadastrados() {
        return cursosCadastrados;
    }

    public static CursosModel salvar(CursosModel cursos){
        cursos.id = proximoId++;
        cursosCadastrados.add(cursos);
        return cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
