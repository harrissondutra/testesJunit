package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Harrisson", LocalDate.now(), new BigDecimal("1000"));
        service.acrescentaReajuste(funcionario, Desempenho.A_DESEJAR);;

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Harrisson", LocalDate.now(), new BigDecimal("1000"));
        service.acrescentaReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Harrisson", LocalDate.now(), new BigDecimal("1000"));
        service.acrescentaReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }


}
