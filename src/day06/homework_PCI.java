package come.homework.pci;

public class homework_PCI {
    public static void main(String args[]) {
        VideoCard v = new VideoCard();
        SoundCard s = new SoundCard();
        NetworkCard n = new NetworkCard();

        Computer c = new Computer();
        c.slot(v);
        c.slot(s);
        c.slot(n);

    }
}

class Computer {
    public void slot(PCI pci) {
        pci.play();
    }

}

interface PCI {
    void play();
}

class VideoCard implements PCI {
    public void play() {
        System.out.println("video");
    }
}

class SoundCard implements PCI {
    public void play() {
        System.out.println("sound");
    }
}

class NetworkCard implements PCI {
    public void play() {
        System.out.println("network");
    }
}