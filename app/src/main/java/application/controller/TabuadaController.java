package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //anotation especificacao para proximo codigo java Especificando Controlador
public class TabuadaController {
    @RequestMapping("/tabuada") //na url quando startar o servidor colocar /tabuada
    // https://8080-gabrielcpai-aula1spring-ayb028veeeh.ws-us105.gitpod.io/tabuada?numero=2
    // https://8080-gabrielcpai-aula1spring-cdd5v7wmwc8.ws-us105.gitpod.io/tabuada?numero=7
    public String calcula(@RequestParam("numero") int num, Model ui) { 
        // Criando o metodo calcula e o requestparam define os end points
        // so é possivel definir um mapeamento em uma aplicação
        // para manipular qualquer coisa da interface precisa usar o parametro ui que é do tipo Model
        int[] resultado = new int[10];
        for(int i = 0; i < 10; i++) {
            resultado[i] = (i + 1) * num;
        }
        ui.addAttribute("tabuada", resultado);
        return "tabuada";
        //usando o Spring Boot usar: gradle bootRun
    }
}
