package devices;

import Command.*;

public class RemoteControl {
    private Command[] slots;
    private Command lastCommand;
    private String repo="";
    private boolean lastWasOn = false;

    public RemoteControl(int numberOfSlots) {
        slots = new Command[numberOfSlots];
        lastCommand = null;
    }
    public void init(Device... devices) {
        for (int i = 0; i < devices.length && i < slots.length; i++) {
            if (devices[i] != null) {
                slots[i] = new OnCommand(devices[i]);
            }
        }
    }

    public void setCommand(int slot, OnCommand command) {
        slots[slot] = command;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public Command[] getSlots() {
        return slots;
    }

    public void setSlots(Command[] slots) {
        this.slots = slots;
    }

    public void onButtonPressed(int slot) {
        if (slots[slot] != null) {
            OnCommand s = (OnCommand) slots[slot];
            s.execute();
            repo+=s.getDevice().On();
            lastCommand = s;
            lastWasOn = true;
        }
    }

    public void offButtonPressed(int slot) {
        if (slots[slot] != null) {
            OnCommand s = (OnCommand) slots[slot];
            s.execute();
            repo+=s.getDevice().Off();
            lastCommand = s;
            lastWasOn = false;
        }
    }
    public void undo() {
        if (lastCommand != null) {
            if (lastWasOn) {
                OnCommand s = (OnCommand) lastCommand;
                s.undo();
                repo+=s.getDevice().Off();
            } else {
                OnCommand s = (OnCommand) lastCommand;
                s.execute();
                repo+=s.getDevice().On();
            }
            lastCommand = null;
            }
        }

}
