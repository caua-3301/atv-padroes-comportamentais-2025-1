package br.edu.ifpb.ads.padroes.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Classe responsável pela manipulação de datas
 * */
public class GenericDate {

    /**
     * Metodo responsável pela obtenção da data atual no formado dd/MM/yyyy
     *
     * @return String com a data atual
     * */
    public static String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();

        return currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
