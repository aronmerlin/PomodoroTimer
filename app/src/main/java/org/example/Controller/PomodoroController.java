package org.example.Controller;

import org.example.Model.PomodoroModel;
import org.example.View.PomodoroView;

public class PomodoroController {
    PomodoroModel pomodoroModel;
    PomodoroView pomodoroView;

    public PomodoroController(PomodoroModel pomodoroModel, PomodoroView pomodoroView) {
       this.pomodoroModel = pomodoroModel;
       this.pomodoroView = pomodoroView;
    }
    
}
