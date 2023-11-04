package home;

import devices.*;
import Command.*;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    private String name;
    private int id;
    private Adresse adresse;
    private RemoteControl remoteControl;

    private SmartHome() {
    }
    public static SmartHome createHome(){
        return new SmartHome();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }
    public String report() {
        StringBuilder report = new StringBuilder();

        if (remoteControl != null) {
          report= new StringBuilder(remoteControl.getRepo());
        }

        return report.toString();
    }

}
