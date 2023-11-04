package home;

import devices.RemoteControl;

public class ConcretSmartHomeBuilder {

    private String name;
    private int id;
    private Adresse adresse;
    private RemoteControl remoteControl;

    public ConcretSmartHomeBuilder(String name,int id) {
        this.name = name;
        this.id=id;
    }

    public ConcretSmartHomeBuilder withAdresse(Adresse ad){
        adresse=ad;
        return this;
    }
    public ConcretSmartHomeBuilder withRemoteControl(RemoteControl rm){
        remoteControl=rm;
        return this;
    }
    public SmartHome build(){
        SmartHome sm=SmartHome.createHome();
        sm.setName(this.name);
        sm.setId(this.id);
        sm.setAdresse(this.adresse);
        sm.setRemoteControl(this.remoteControl);
        return sm;
    }
}
