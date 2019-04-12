package br.com.k21;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    @RequestMapping("/calculadora-comissao")
    public double royalties(@RequestParam(value="valorVenda", defaultValue="0") double valorVenda) {
        return CalculadoraComissao.calcular(valorVenda);
    }
}