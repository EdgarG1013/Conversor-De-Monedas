package com.edgar.conversordemonedas.Modelos;

import java.util.Map;

public record MonedaHistoricoFecha(
        String result,
        String documentation,
        String terms_of_use,
        int year,
        int month,
        int day,
        String base_code,
        Map<String, Double> conversion_rates
) {

}
