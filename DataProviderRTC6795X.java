/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class DataProviderRTC6795X implements DispositivoDataProvider{

    @Override
    public String obterData() {
        System.out.println("Obtendo data a partir do relógio do sistema para smartphones X");
        return "01/01/2024";
    }
    
}
