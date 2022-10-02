package net.ausiasmarch.wildcart.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;*/
import org.springframework.web.bind.annotation.*;

import net.ausiasmarch.wildcart.entity.Calculation;


@RestController
@CrossOrigin(origins="http://localhost:80")
@RequestMapping("/calculator")
public class CalculatorController {

    @PostMapping ("/add")
    public ResponseEntity<Calculation> calculadoraA(@RequestBody Calculation oCalc) {
        oCalc.setResult(oCalc.getOp1()+oCalc.getOp2());
        return new ResponseEntity<Calculation>(oCalc, HttpStatus.OK);
    }

    @PostMapping ("/minus")
    public ResponseEntity<Calculation> calculadoraN(@RequestBody Calculation oCalc) {
        oCalc.setResult(oCalc.getOp1()-oCalc.getOp2());
        return new ResponseEntity<Calculation>(oCalc, HttpStatus.OK);
    }

    @PostMapping ("/mult")
    public ResponseEntity<Calculation> calculadoraM(@RequestBody Calculation oCalc) {
        oCalc.setResult(oCalc.getOp1()*oCalc.getOp2());
        return new ResponseEntity<Calculation>(oCalc, HttpStatus.OK);
    }

    @PostMapping ("/div")
    public ResponseEntity<Calculation> calculadoraD(@RequestBody Calculation oCalc) {
        oCalc.setResult(oCalc.getOp1()/oCalc.getOp2());
        return new ResponseEntity<Calculation>(oCalc, HttpStatus.OK);
    }
    
}
