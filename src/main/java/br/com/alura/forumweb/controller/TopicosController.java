package br.com.alura.forumweb.controller;

import br.com.alura.forumweb.controller.Vo.TopicoVo;
import br.com.alura.forumweb.model.Curso;
import br.com.alura.forumweb.model.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")

    public List<TopicoVo> lista(){

        Topico topico = new Topico("Duvida", "Duvida Com Spring", new Curso("Spring","Programacao"));

        return TopicoVo.converter(Arrays.asList(topico,topico,topico));
    }

}
