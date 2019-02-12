package com.jadecalculator;

import com.jadecalculator.controller.CalculatorController;
import com.jadecalculator.model.CalculatorModel;
import com.jadecalculator.view.CalculatorView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}
