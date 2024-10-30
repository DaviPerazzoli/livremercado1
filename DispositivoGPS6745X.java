/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class DispositivoGPS6745X implements DispositivoLocalizador{

    @Override
    public String obterLocalizacao() {
        System.out.println("Obtendo localização usando o GPS para smartphones X");
        return "Florianópolis SC";
    }
    
}
