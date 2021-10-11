/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_stok;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author 4sekawan
 */
@ManagedBean
public class vgaNvidiaZotac implements interfaceDataVga{
    final String namavga = "VGA Nvidia Zotac";
    final String datavga = "Ready";
    int stokvga = 5;
    final String keterangan = "Dari method vgaNvidiaZotac()";
    @Override
    public String getNamaVga() {
        return namavga;
    }
    @Override
    public String getDataVga() {
        return datavga;
    }
    @Override
    public int getStokVga() {
        return stokvga;
    }
    @Override
    public String getKeterangan() {
        return keterangan;
    }
}
