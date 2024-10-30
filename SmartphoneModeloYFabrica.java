/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class SmartphoneModeloYFabrica implements DispositivoFactory{

    @Override
    public DispositivoDataProvider criarDispositivoDataProvider() {
        return new DataProviderRTCSuper9212Y();
    }

    @Override
    public DispositivoLocalizador criarDispositivoLocalizador() {
        return new DispositivoGPSActive9202Y();
    }
    
}
