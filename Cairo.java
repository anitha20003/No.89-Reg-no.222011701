// Class Cairo
class Cairo {
    public void methodCairo() {
        System.out.println("Method from Class Cairo");
    }
}

// Class Nairobi
class Nairobi {
    public void methodNairobi() {
        System.out.println("Method from Class Nairobi");
    }
}

// Class Lagos
class Lagos {
    public void methodLagos() {
        System.out.println("Method from Class Lagos");
    }
}

// Class Casablanca
class Casablanca {
    public void methodCasablanca() {
        System.out.println("Method from Class Casablanca");
    }
}

// Cars class to create objects and call methods from Cairo, Nairobi, Lagos, and Casablanca
class Cars {
    public static void main(String[] args) {
        Cairo objCairo = new Cairo();
        Nairobi objNairobi = new Nairobi();
        Lagos objLagos = new Lagos();
        Casablanca objCasablanca = new Casablanca();

        // Calling methods from each class
        objCairo.methodCairo();
        objNairobi.methodNairobi();
        objLagos.methodLagos();
        objCasablanca.methodCasablanca();
    }
}