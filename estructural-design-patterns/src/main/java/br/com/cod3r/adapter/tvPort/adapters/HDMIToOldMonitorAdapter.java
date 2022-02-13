package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;


public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    private VGA vga;

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping the VGA's OldMonitor's Interface with a HDMI adapter.");
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don't work with sound");
    }

}
