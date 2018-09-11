package come.homework.pci;

public class homework_PCI {
    public static void main(String args[]) {
        Slot s = new Slot("PC");

    }
}

class Slot {
    String name;

    Slot(String name) {
        this.name = name;
    }
}

interface PCI {

}