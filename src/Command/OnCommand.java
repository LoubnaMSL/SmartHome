package Command;

import devices.Device;

public class OnCommand implements Command{
    private Device device;



    public OnCommand(Device device) {
        this.device = device;
    }
    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {

        device.On();
    }
    @Override
    public void undo() {
        device.Off();
    }

}
