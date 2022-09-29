package net.ausiasmarch.wildcart.entity;

public class Calculation {
    
    private int op1;
    private int op2;
    private int result;

    /*public Calculation(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }
    */

    public int getOp1(){
        return this.op1;
    }

    public int getOp2(){
        return this.op2;
    }
    public int getResult(){
        return this.result;
    }
    public void setOp1(int op1){
        this.op1 = op1;
    }
    public void setOp2(int op2){
        this.op2 = op2;
    }
    
    public void setResult(int result){
        this.result = result;
    }

}
