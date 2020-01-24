package br.com.alura.forumweb.controller.Vo;

import br.com.alura.forumweb.model.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TopicoVo {

    private Long id;
    private String titulo;
    private  String mensagem;
    private LocalDateTime dataCriacao;

    public TopicoVo (Topico topico){

        this.id=topico.getId();
        this.titulo=getTitulo();
        this.mensagem=getMensagem();
        this.dataCriacao=getDataCriacao();
    }

    public static List<TopicoVo> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoVo::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }



}
