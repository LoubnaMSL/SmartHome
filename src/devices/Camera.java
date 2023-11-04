package devices;

public class Camera implements Device {
    @Override
    public String On() {
        return "Camera On-";
    }

    @Override
    public String Off() {
        return "Camera Off-";
    }
}
