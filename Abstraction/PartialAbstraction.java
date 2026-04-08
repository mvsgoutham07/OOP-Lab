/* A Smart Home system manages various devices like SmartBulbs and SmartFans. All devices have a deviceName and a concrete method showStatus() that prints the device name. However, the actual performAction() (like "Lighting up" or "Spinning") is unique to each device. Create an abstract class SmartDevice to implement this. */


abstract class SmartDevice {
String deviceName;

SmartDevice(String name) {
this.deviceName = name;
}

void showStatus() {
System.out.println("Device: " + deviceName + " is currently active.");
}


abstract void performAction();
}

class SmartBulb extends SmartDevice {
SmartBulb(String name) {
super(name);
}

@Override
void performAction() {
System.out.println(deviceName + " is emitting 700 lumens of light.");
}
}

public class PartialAbstraction {
public static void main(String[] args) {
SmartDevice myLight = new SmartBulb("Living Room Bulb");
myLight.showStatus(); 
myLight.performAction(); 
}
}