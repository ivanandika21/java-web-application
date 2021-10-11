/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_stok;

/**
 *
 * @author 4sekawan
 */
class stokvga {
    public interfaceDataVga getStokVga(String temp) {
        if ("AMD".equals(main.manufactures)){
            if ("Aorus".equals(main.brand)) {
                return new vgaAmdAorus();
            } else if ("Asus".equals(main.brand)) {
                return new vgaAmdAsus();
            } else if ("Evga".equals(main.brand)) {
                return new vgaAmdEvga();
            } else if ("Gigabyte".equals(main.brand)) {
                return new vgaAmdGigabyte();
            } else if ("Zotac".equals(main.brand)) {
                return new vgaAmdZotac();
            }
        } else if ("NVIDIA".equals(main.manufactures)){
            if ("Aorus".equals(main.brand)) {
                return new vgaNvidiaAorus();
            } else if ("Asus".equals(main.brand)) {
                return new vgaNvidiaAsus();
            } else if ("Evga".equals(main.brand)) {
                return new vgaNvidiaEvga();
            } else if ("Gigabyte".equals(main.brand)) {
                return new vgaNvidiaGigabyte();
            } else if ("Zotac".equals(main.brand)) {
                return new vgaNvidiaZotac();
            }
        }
        return null;
    }
}
