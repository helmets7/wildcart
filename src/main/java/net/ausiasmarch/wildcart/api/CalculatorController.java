package net.ausiasmarch.wildcart.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ausiasmarch.wildcart.entity.Calculation;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    
    @GetMapping("/add/{op1}/{op2}")
    public ResponseEntity<Calculation> add(@PathVariable(value = "op1") int op1,
                                            @PathVariable(value = "op2") int op2) {
        Calculation oCalc = new Calculation(op1, op2);
        oCalc.setResult(op1+op2);
        return new ResponseEntity<>(oCalc, HttpStatus.OK);
    }
}
