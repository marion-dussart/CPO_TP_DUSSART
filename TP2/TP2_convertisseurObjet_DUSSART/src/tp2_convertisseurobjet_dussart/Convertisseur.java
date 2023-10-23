/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_dussart;

/**
 *
 * @author mario
 */
public class Convertisseur {
    int nbConversions;
    double temp;
    
    
    public Convertisseur () {
            nbConversions = 0 ;
        }
    
    
    public static double CelciusVersKelvin (double Celcius) {
        return Celcius + 273.15;
    }
    
    public static double KelvinVersCelcius(double Kelvin) {
        return Kelvin - 273.15;
    }
    
    public static double FarenheitVersCelcius(double Farenheit) {
        return (Farenheit - 32) * 5 / 9;
    }
    
    public static double CelciusVersFarenheit(double Celcius) {
        return (Celcius * 9 / 5) + 32;
    }
    
    public static double FarenheitVersKelvin(double Farenheit) {
        double Celsius = FarenheitVersCelcius(Farenheit);
        return CelciusVersKelvin(Celsius);
    }

    public static double KelvinVersFarenheit(double Kelvin) {
        double Celsius = KelvinVersCelcius(Kelvin);
        return CelciusVersFarenheit(Celsius);
    }
    
    @Override
    public String toString () {
    return "nb de conversions"+ nbConversions;
    }

}
