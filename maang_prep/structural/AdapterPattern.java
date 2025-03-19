package maang_prep.structural;

// Target interface: USB-C charger
interface USB_C_Charger {
    void chargeWithUSBC();
}

// Adaptee: Old Micro-USB Phone
class MicroUSB {
    public void chargeWithMicroUSB() {
        System.out.println("charging with mirco USB");
    }
}

class MicroUSBToUSBCCAdapter implements USB_C_Charger {
    private MicroUSB microUSB;

    public MicroUSBToUSBCCAdapter(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    public void chargeWithUSBC () {
        System.out.println("Adapter converts micro USB to USB-C");
        microUSB.chargeWithMicroUSB();
    }
}

public class AdapterPattern {
    // The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two interfaces, making them compatible without modifying existing code.

    // 🔹 Key Components
    //      Target Interface → Defines the expected interface for the client.
    //      Adaptee (Existing Class) → Has an incompatible interface that needs adaptation.
    //      Adapter → Converts the Adaptee's interface into the Target Interface.
    //      Client → Uses the Target Interface without knowing about the adaptation.

    //Example: Charging Different Devices with a Universal Adapter
    //      Imagine we have a mobile charger that only accepts USB-C, but we have an old micro-USB phone. We need an Adapter to make them work together.

    // ✅ Integrating legacy code with modern systems.
    // ✅ Making two incompatible interfaces work together.
    // ✅ Avoiding code modification in existing classes.
    public static void main(String[] args) {
        MicroUSB oldPhone = new MicroUSB();

        USB_C_Charger adapter = new MicroUSBToUSBCCAdapter(oldPhone);
        adapter.chargeWithUSBC();
    }
}
