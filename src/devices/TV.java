package devices;

public class TV implements Device{

    @Override
    public String On() {
        return "TV On-";
    }

    @Override
    public String Off() {
        return "TV Off-";
    }
}
