 class compound {//first class to be calculated
    public double calculate(double d, double r, double n, double y){// method to be used
        return d*(Math.pow(1+r/n,(n*y))); // this is formula for computing task.
    }
    
}
class comp{ // second class to calculated
    public static void main(String args[]){// mandatory java syntax
compound mycompound=new compound();// object
double compound=mycompound.calculate(500000,0.18,12,3); // recalling function
System.out.println("compound:" +compound);// result to be printed
    }
}
