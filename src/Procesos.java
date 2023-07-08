import javax.swing.*;

public class Procesos {
    ConvertirMoneda moneda = new ConvertirMoneda();
    ConvertirTemperatura temp = new ConvertirTemperatura();

    public void ConvertirMoneda(double valor){
        String opciones = (JOptionPane.showInputDialog(null , "Escoja la moneda que desea converti" ,
                "Monedas" , JOptionPane.QUESTION_MESSAGE, null , new Object[]{"De dolar a pesos argentinos" , "De dolar a euro",
                "De dolar a pesos colombianos"} , "Escoja")).toString();

        switch (opciones){
            case "De dolar a pesos argntinos":{
                moneda.ConvertirdeDolarPesoArg(valor);
                break;
            }
            case "De dolar a euro":{
                moneda.ConvertirdeDolarEuro(valor);
                break;
            }
            case "De dolar a pesos colombianos":{
                moneda.ConvertirdeDolarpesoCol(valor);
                break;
            }
        }
    }

    public void ConvertirTemperatura(double valor){
        String opcion = (JOptionPane.showInputDialog(null, "Elige una temperatura a convertir",
                "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"},
                "Seleccion")).toString();

        switch (opcion){
            case "De Celsius a Fahrenheit":
                temp.ConvertirCelsiusAFahrenheith(valor);
                break;
            case "De Fahrenheit a Celsius":
                temp.ConvertirFahrenheithACelsius(valor);
                break;

        }


    }
}
