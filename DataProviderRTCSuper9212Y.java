/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class DataProviderRTCSuper9212Y implements DispositivoDataProvider{

    @Override
    public String obterData() {
        System.out.println("Obtendo data a partir do relógio do sistema para smartphones Y");
        return "01/01/2024";
    }
    
}
