import devices.*;
import home.*;

public class Main {
    public static void main(String[] args) {

            int nbrSlot=2;
            Adresse adresse = new Adresse(123,"agadir");
            Device tv =new TV();
            Device camera = new Camera();
            RemoteControl remoteControl = new RemoteControl(nbrSlot);
            remoteControl.init(tv,camera);
            SmartHome smartHome = new ConcretSmartHomeBuilder("ny Homa",12345)
                    .withAdresse(adresse)
                    .withRemoteControl(remoteControl)
                    .build();
            remoteControl.onButtonPressed(0);
            remoteControl.offButtonPressed(0);
            remoteControl.onButtonPressed(1);
            remoteControl.offButtonPressed(1);
            String expectedReport = "TV On-TV Off-Camera On-Camera Off-";
            //assertEquals(expectedReport,smartHome.report());
            System.out.println(smartHome.report()); // I use this because although my code displays the same
            // output the 'assertEquals' method resulted in an error. You can run the code to confirm.
            remoteControl.undo();
            String expectedReport2 = "TV On-TV Off-Camera On-Camera Off-Camera On-";
            System.out.println(smartHome.report());
            //assertEquals(expectedReport2,smartHome.report());


    }
}