import javax.swing.*;

public class ConvertirMoneda {
    public  void ConvertirdeDolarPesoArg(Double valor){
        double dolar = valor * 260.77;
        dolar = (double) Math.round(dolar * 100d)/100;
        JOptionPane.showMessageDialog(null , "Tienes $  "  + dolar  + " pesos argentinos");
    }

    public void ConvertirdeDolarEuro(Double valor){
        double dolar = valor * 0.91;
        dolar = (double) Math.round(dolar * 100d)/100;
        JOptionPane.showMessageDialog(null , "Tienes $  "  + dolar  + " euros");
    }
    public void ConvertirdeDolarpesoCol(Double valor){
        double dolar = valor * 4196.22;
        dolar = (double) Math.round(dolar * 100d)/100;
        JOptionPane.showMessageDialog(null , "Tienes $  "  + dolar  + " pesos colombianos");
    }

}
