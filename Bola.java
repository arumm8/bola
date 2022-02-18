package bola;
public class Bola {

    private double jariJari;
    
    public double setjariJari(double jari){
        return this.jariJari=jari;    
    }
    
    public double showDiameter (){
        return jariJari * 2;
    }
    
    public double showLuasPermukaan (){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
    
    public double showVolume (){
        return 4/3 * Math.PI * Math.pow(jariJari, 3);
    }
    
    public void cetak (){
       
        System.out.println("=============== Hasil Hitung ==================");
        System.out.println("Diameter bola\t\t: "+showDiameter());
        System.out.println("Luas permukaan bola\t: "+showLuasPermukaan ());
        System.out.println("volume bola\t\t: "+showVolume ());
        System.out.println("===============================================");
    }
}


