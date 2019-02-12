package com.jadecalculator.controller;

import com.jadecalculator.model.CalculatorModel;
import com.jadecalculator.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel){

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber,secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());
            }catch (NumberFormatException ex){
                theView.displayErrorMessage("Please Enter two Integers");
            }
        }
    }
}
