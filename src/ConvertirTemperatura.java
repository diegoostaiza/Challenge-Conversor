import javax.swing.*;

public class ConvertirTemperatura {

    public void ConvertirCelsiusAFahrenheith(double valorRecibido){
        // formula F = ºC x 1.8 + 32
        double tempFahrenheit = (valorRecibido * 1.8) + 32;
        tempFahrenheit = (double) Math.round(tempFahrenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es " + tempFahrenheit + "º");
    }
    public void ConvertirFahrenheithACelsius(double valorRecibido){
        // F a ºC use la fórmula: ºC = (ºF-32) ÷ 1.8
        double tempCelsius = (valorRecibido - 32) / 1.8;
        tempCelsius = (double) Math.round(tempCelsius * 100d)/100;
        JOptionPane.showMessageDialog(null, "La temperatura en Celsius es " + tempCelsius + "º");
    }
}
