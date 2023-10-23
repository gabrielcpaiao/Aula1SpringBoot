package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.AlunoRepository;

@Controller
@RequestMapping("/alunos") // 
public class AlunoController {
    @Autowired
    AlunoRepository alunoRepo;

    @RequestMapping("/insert")
    public String insert() {
        return "/aluno/insert";
    }

    @RequestMapping(value="/insert", method=ResquestMethod.POST)
    public String insert() {
        return "";
    }
}
