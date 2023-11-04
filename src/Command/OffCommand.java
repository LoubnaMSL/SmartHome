package Command;

import devices.Device;

public class OffCommand implements Command{
    Device device;
    public OffCommand(Device device) {
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
        device.Off();
    }

    @Override
    public void undo() {
        device.On();
    }

}
