 class SI {//this is first class called SI.
    public double cal(double p,double r,double y){//this is a methood.
        return(p*r*y);// this is a formula to be computed.

    }
    
}
class simple{ //that is a second class called simple.
    public static void main(String args[]){ //this is a mandatory java syntax.
        SI mySI=new SI(); // object created.
       double result=mySI.cal(100000,0.05,5);// argument's values.
       System.out.println("result:" +result);// an output to be printed.
    }
}
