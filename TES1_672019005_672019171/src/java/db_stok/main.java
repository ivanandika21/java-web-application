/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_stok;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author ivana
 */
@ManagedBean
public class main {
    public static String manufactures;
    public static String brand;
    public static String datavga;
    public static String keterangan;
    public static int stokvga;
    
    public main(){
        
    }

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        main.manufactures = manufactures;
    }

    public String getBrand() {
        namavga namaVga = new namavga();
        interfaceDataVga namavga1 = namaVga.getNamaVga("AMD");   
        interfaceDataVga namavga2 = namaVga.getNamaVga("NVIDIA");
        if ("AMD".equals(main.manufactures)) {
            return namavga1.getNamaVga();
        } else if ("NVIDIA".equals(main.manufactures)){
            return namavga2.getNamaVga();
        }
        return brand;
    }

    public void setBrand(String brand) {
        main.brand = brand;
    }

    public String getDatavga() {
        datavga dataVga = new datavga();
        interfaceDataVga datavga1 = dataVga.getDataVga("AMD");   
        interfaceDataVga datavga2 = dataVga.getDataVga("NVIDIA");
        if ("AMD".equals(main.manufactures)) {
            return datavga1.getDataVga();
        } else if ("NVIDIA".equals(main.manufactures)){
            return datavga2.getDataVga();
        }
        return datavga;
    }

    public void setDatavga(String datavga) {
        main.datavga = datavga;
    }
    
    public int getStokVga() {
        stokvga StokVga = new stokvga();
        interfaceDataVga stokvga1 = StokVga.getStokVga("AMD");   
        interfaceDataVga stokvga2 = StokVga.getStokVga("NVIDIA");
        if ("AMD".equals(main.manufactures)) {
            return stokvga1.getStokVga();
        } else if ("NVIDIA".equals(main.manufactures)){
            return stokvga2.getStokVga();
        }
        
        return stokvga;
    }

    public void setStokVga(int stokvga) {
        main.stokvga = stokvga;
    }
    
    public String getKeterangan() {
        keterangan Keterangan = new keterangan();
        interfaceDataVga keterangan1 = Keterangan.getKeterangan("AMD");   
        interfaceDataVga keterangan2 = Keterangan.getKeterangan("NVIDIA");
        if ("AMD".equals(main.manufactures)) {
            return keterangan1.getKeterangan();
        } else if ("NVIDIA".equals(main.manufactures)){
            return keterangan2.getKeterangan();
        }
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        main.keterangan = keterangan;
    }
    
}
