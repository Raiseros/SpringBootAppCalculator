package ru.holyav.calculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.holyav.calculator.entity.Calculator;

import java.sql.SQLException;


@Controller
public class HelloController {


    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String registry(Model model) {
        Calculator theCalculator = new Calculator();
        model.addAttribute("calculator", theCalculator);
        return "calculation";
    }


    @PostMapping("calculator")
    public String addStudent(@ModelAttribute("calculator") Calculator theCalculator) throws SQLException {
        long tempSumMeters = theCalculator.getSumMeters();
        long tempCostSquareMeter = theCalculator.getCostSquareMeter();
        boolean tempCheckBox = theCalculator.isCheckBox();
        long tempSumTax = (((tempSumMeters * tempCostSquareMeter) * 6)/100);
        theCalculator.setSumTaxes(tempSumTax);
        long sumAfterSumTax = ((tempSumMeters * tempCostSquareMeter) - tempSumTax);
        long tempsumAfterSumTax = sumAfterSumTax;

        if ( tempCheckBox == true) {
            tempsumAfterSumTax = (sumAfterSumTax - 1000);
            tempSumMeters = (tempSumMeters * 1000);
            theCalculator.setSumAfterCheckBox(tempSumMeters);
        } else{
            theCalculator.setSumAfterCheckBox(0);
        }

        long sumMinusTenRate = (sumAfterSumTax - ((sumAfterSumTax * 10) / 100));
        theCalculator.setRemainsTenRate(sumMinusTenRate);
        long sumMinusFiveRate = (sumAfterSumTax - ((sumAfterSumTax * 5) / 100));
        theCalculator.setRemainsFiveRate(sumMinusFiveRate);
        long sumMinusTwentyRate = (sumAfterSumTax - ((sumAfterSumTax * 20) / 100));
        theCalculator.setRemainsTwentyRate(sumMinusTwentyRate);
        long sumMinusThirtyRate = (sumAfterSumTax - ((sumAfterSumTax * 30) / 100));
        theCalculator.setRemainsThirtyRate(sumMinusThirtyRate);


        return "calculation2";
    }


}

