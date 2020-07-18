package GuiaDoVendedor;

import java.util.ArrayList;
import java.util.List;

public class Conversor {

    private double silver;
    private double gold;
    private double iron;
    private List<String> romanos = new ArrayList<String>();
    private String numeroRomano = "";
    private int numeroArabe;
    private double credito;


    public Conversor(float silver, float gold, float iron) {
        this.silver = silver;
        this.gold = gold;
        this.iron = iron;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setNumeroArabe(int numeroArabe) {
        this.numeroArabe = numeroArabe;
    }

    public void retornaCredito(int minerio, String valor){
        if(minerio == 1){
            setCredito(numeroArabe * silver);
            System.out.println(valor + " Silver custa: " + credito);
        }
        else if(minerio == 2){
            setCredito(numeroArabe * gold);
            System.out.println(valor + " Gold custa: " + credito);
        }
        else if(minerio == 3){
            setCredito(numeroArabe * iron);
            System.out.println(valor + " Iron custa: " + credito);
        }
        else if(minerio == 4){
            setCredito(numeroArabe);
            System.out.println(valor + " vale: " + credito);
        }
    }

    public void transformaRomanoEmArabe(){
        for(String romano : romanos){
            numeroRomano+= romano;
        }
        setNumeroArabe(allRoman(numeroRomano));
    }

    public void conversorEspacialToRoman(String valor){

        String[] valoresEspaciais = valor.split(" ");

        for(int i = 0; i < valoresEspaciais.length; i++){

            if(valoresEspaciais[i].equalsIgnoreCase("snob")){
                romanos.add("I");
            }
            else if(valoresEspaciais[i].equalsIgnoreCase("krok")){
                romanos.add("V");
            }
            else if(valoresEspaciais[i].equalsIgnoreCase("squid")){
                romanos.add("X");
            }
            else if(valoresEspaciais[i].equalsIgnoreCase("leij")){
                romanos.add("L");
            } else System.out.println("Nem ideia do que isso significa");
        }
    }

    public int allRoman(String romano){
        switch (romano) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XI":
                return 11;
            case "XII":
                return 12;
            case "XIII":
                return 13;
            case "XIV":
                return 14;
            case "XV":
                return 15;
            case "XVI":
                return 16;
            case "XVII":
                return 17;
            case "XVIII":
                return 18;
            case "XIX":
                return 19;
            case "XX":
                return  20;
            case "XXI":
                return 21;
            case "XXII":
                return 22;
            case "XXIII":
                return 23;
            case "XXIV":
                return 24;
            case "XXV":
                return 25;
            case "XXVI":
                return 26;
            case "XXVII":
                return 27;
            case "XXVIII":
                return 28;
            case "XXIX":
                return 29;
            case "XXX":
                return 30;
            case "XXXI":
                return 31;
            case "XXXII":
                return 32;
            case "XXXIII":
                return 33;
            case "XXXIV":
                return 34;
            case "XXXV":
                return 35;
            case "XXXVI":
                return 36;
            case "XXXVII":
                return 37;
            case "XXXVIII":
                return 38;
            case "XXXIX":
                return 39;
            case "XL":
                return 40;
            case "XLI":
                return 41;
            case "XLII":
                return 42;
            case "XLIII":
                return 43;
            case "XLIV":
                return 44;
            case "XLV":
                return 45;
            case "XLVI":
                return 46;
            case "XLVII":
                return 47;
            case "XLVIII":
                return 48;
            case "XLIX":
                return 49;
            case "L":
                return 50;
        }
        return 0;
    }



}
