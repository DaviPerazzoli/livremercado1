/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class SmartphoneModeloXFabrica implements DispositivoFactory{

    @Override
    public DispositivoDataProvider criarDispositivoDataProvider() {
        return new DataProviderRTC6795X();
    }

    @Override
    public DispositivoLocalizador criarDispositivoLocalizador() {
        return new DispositivoGPS6745X();
    }
    
}
