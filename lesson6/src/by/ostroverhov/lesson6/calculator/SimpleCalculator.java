package by.ostroverhov.lesson6.calculator;

import by.ostroverhov.lesson6.calculator.menu.MenuDisplay;
import by.ostroverhov.lesson6.calculator.menu.RootMenuItem;
import by.ostroverhov.lesson6.calculator.operands.Operands;
import by.ostroverhov.lesson6.calculator.operands.OperandsBoundsException;
import by.ostroverhov.lesson6.calculator.operations.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleCalculator {
   private RootMenuItem rootMenu = new MenuDisplay();

   public void execute() {
       rootMenu.execute();
   }
}
