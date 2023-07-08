import javax.swing.*;


public class Principal {
    public static void main(String[] args) {
        Procesos moneda = new Procesos();
        Procesos temperatura = new Procesos();

        String opciones = (JOptionPane.showInputDialog(null , "Conversor" , "Menu"
        , JOptionPane.QUESTION_MESSAGE, null , new Object[]{"Conversor de monedas" , "Conversor de temperatura"}
        , "Selecione")).toString();


        switch (opciones){
            case "Conversor de monedas":{
                String input = JOptionPane.showInputDialog("Ingrese la cantidad de dolares a convertir");
                Double valor = Double.parseDouble(input);
                moneda.ConvertirMoneda(valor);

                int selecion = JOptionPane.showConfirmDialog(null , "Deseas continuar");

                if(JOptionPane.OK_OPTION == selecion){
                    String inputnuevo = JOptionPane.showInputDialog("Ingrese la cantidad de dolares a convertir");
                    Double valornuevo = Double.parseDouble(input);
                    moneda.ConvertirMoneda(valornuevo);
                    break;
                }
                else {
                    JOptionPane.showMessageDialog(null , "Programa finalizado");
                }
            }

            case "Conversor de temperatura":{
                String input = JOptionPane.showInputDialog("Ingrese el valor de la temperatura");

                double valorRecibido = Double.parseDouble(input);
                temperatura.ConvertirTemperatura(valorRecibido);

                int seleccion = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
                if (JOptionPane.OK_OPTION == seleccion){

                    String nuevoValor = JOptionPane.showInputDialog("Ingrese un nuevo valor de temperatura");

                    double nuevoValorRecibido = Double.parseDouble(nuevoValor);
                    temperatura.ConvertirTemperatura(nuevoValorRecibido);

                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                }

            }
        }

    }
}