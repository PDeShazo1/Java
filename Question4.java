 class Test {

    public static void main(String[] args) {
    
    int totalCents = 88;
    
    int aq = totalCents/25; //maximum possible value of quarters
    
    int ad = totalCents/10; //maximum possible value of dimes
    
    int an = totalCents/5; //maximum possible value of nickels
    
    int ap = totalCents; //maximum possible value of pennies
    
    for(int q=0; q<= aq; q++){
    
    for(int d=0; d<= ad; d++){
    
    for(int n=0;n<= an; n++){
    
    for(int p=0;p<=ap; p++){
    
    if(((q*25) + (d*10) + (n*5) + p ) == totalCents){
    
    System.out.println("Q: "+q+" D: "+d+" N: "+n+" P: "+p );
    
    }
    
    }
    
    }
    
    }
    
    }
    
    }
    
    }