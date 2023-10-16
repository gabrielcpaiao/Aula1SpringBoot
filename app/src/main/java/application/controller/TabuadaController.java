package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //anotation especificacao para proximo codigo java
public class TabuadaController {
    @RequestMapping("/tabuada") //na url quando startar o servidor colocar /tabuada
    //https://8080-gabrielcpai-aula1spring-ayb028veeeh.ws-us105.gitpod.io/tabuada?numero=2
    public String calcula(@RequestParam("numero") int num, Model ui) {
        int[] resultado = new int[10];
        for(int i = 0; i < 10; i++) {
            resultado[i] = (i + 1) * num;
        }
        ui.addAttribute("tabuada", resultado);
        return "tabuada";
    }
}
