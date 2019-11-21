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
public class Test {
   private List<Question> questions;
   private String topic;
   private float succedingScore;

    public Test(String tema, float puntajeAprobacion) {
        this.questions = new ArrayList<>();
        this.topic = tema;
        this.succedingScore = puntajeAprobacion;
    }
   
    public void addQuestion(Question pregunta){
        this.questions.add(pregunta);
    }
    
    public String getTopic() {
        return topic;
    }
    
    //ejerccio 2
    public float rateTest(List<Integer> respuestas){
        float notaExamen=0;
        for (int i = 0; i < questions.size(); i++) {
            Question pregunta=questions.get(i);
            notaExamen=notaExamen+calculateQuestionGrade(pregunta,respuestas.get(i));
            
        }
        return notaExamen;
    }
    
    //ejercicio 2
    public boolean isApproved(List<Integer> respuestas){
        if(rateTest(respuestas)>=succedingScore)
            return true;
        return false;
    }

    
    //ejercicio 2
    protected float calculateQuestionGrade(Question pregunta, Integer respuesta) {
        if(pregunta.isCorrect(respuesta))
            return pregunta.getScore();
        return 0;
    }

    
    
}
