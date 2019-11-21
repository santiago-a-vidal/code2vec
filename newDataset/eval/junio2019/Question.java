/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion.junio2019;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santiagovidal
 */
public class Question {
    private String text;
    private List<String> options;
    private Integer rightOption;
    private float score;

    public Question(String consigna, float puntaje) {
        this.text = consigna;
        this.options = new ArrayList<>();
        this.rightOption = -1;
        this.score = puntaje;
    }
    
    public void addOption(String opcion){
        this.options.add(opcion);
    }

    public void setRightOption(Integer opcionCorrecta) {
        this.rightOption = opcionCorrecta;
    }
    
    public boolean isCorrect(Integer respuesta){
        return this.rightOption==respuesta;
    }

    public float getScore() {
        return score;
    }
    
}
