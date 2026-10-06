package block1;

public class Pr4 {
    public static void task1() {
        // 1
        Seasons myFavoriteSeason = Seasons.Winter;
        System.out.println("name: " + myFavoriteSeason.name() + ", order: " + myFavoriteSeason.ordinal());
        // 6
        for (var season : Seasons.values()) {
            System.out.println(season.name() + " temperature: " + season.getSeasonTemperature() + ", description: " + getDescription(season));
        }
    }
    private enum Seasons {
        Winter(-25), Spring(9), Summer(25), Autumn(9);
        // 3
        int seasonTemperature;
        public int getSeasonTemperature() { return seasonTemperature; }
        // 4
        Seasons(int temperature) {
            seasonTemperature = temperature;
        }
    }
    // 2
    private static void printFavoriteSeason(Seasons season) {
        switch (season) {
            case Winter -> System.out.println("Я люблю зиму");
            case Spring -> System.out.println("Я люблю аллергию");
            case Summer -> System.out.println("Я люблю лето");
            default -> System.out.println("Я люблю осень");
        }
    }
    // 5
    private static String getDescription(Seasons season) {
        switch (season) {
            case Winter: return "Холодное время года";
            case Spring: return "Период цветения";
            case Summer: return "Жаркое время года";
            default: return "Вторые по популярности обои на Windows 98";
        }
    }

    // Пункт 4
    private enum Manufacturer { Intel, Amd, Nvidia, Gigabyte, Aorus, Asus, Acer }
    private class Computer {
        Processor processor;
        public Processor getProcessor() { return processor; }
        public void setProcessor(Processor proc) { processor = proc; }

        Memory memory;
        public Memory getMemory() { return memory; }
        public void setMemory(Memory mem) { memory = mem; }

        Monitor monitor;
        public Monitor getMonitor() { return monitor; }
        public void setMonitor(Monitor mon) { monitor = mon; }

        public Computer(Processor proc, Memory mem, Monitor mon) {
            this.processor = proc;
            this.memory = mem;
            this.monitor = mon;
        }
    }
    private class Processor {
        private float clockFreq;
        public float getClockFreq() { return clockFreq; }
        public void setClockFreq(float newFreq) { clockFreq = newFreq; }

        private Manufacturer manufacturer;
        public Manufacturer getManufacturer() { return manufacturer; }
        public void setManufacturer(Manufacturer man) { manufacturer = man; }

        public Processor(float freq, Manufacturer man) {
            this.clockFreq = freq;
            this.manufacturer = man;
        }
    }
    private class Memory {
        private int ram, rom;
        public int getRam() { return ram; }
        public int getRom() { return rom; }
        public void setRam(int _ram) { ram = _ram; }
        public void setRom(int _rom) { rom = _rom; }

        private Manufacturer ramManufacturer, romManufacturer;
        public Manufacturer getRamManufacturer() { return ramManufacturer; }
        public Manufacturer getRomManufacturer() { return romManufacturer; }
        public void setRamManufacturer(Manufacturer man) { ramManufacturer = man; }
        public void setRomManufacturer(Manufacturer man) { romManufacturer = man; }

        public Memory(int _ram, int _rom, Manufacturer ramMan, Manufacturer romMan) {
            this.ram = _ram;
            this.rom = _rom;
            this.ramManufacturer = ramMan;
            this.romManufacturer = romMan;
        }
    }
    private class Monitor {
        private int resolutionX, resolutionY;
        public int getResolutionX() { return resolutionX; }
        public int getResolutionY() { return resolutionY; }
        public void setResolutionX(int newResX) { resolutionX = newResX; }
        public void setResolutionY(int newResY) { resolutionY = newResY; }

        private float diagonal;
        public float getDiagonal() { return diagonal; }
        public void setDiagonal(float diag) { diagonal = diag; }

        private Manufacturer manufacturer;
        public Manufacturer getManufacturer() { return manufacturer; }
        public void setManufacturer(Manufacturer man) { manufacturer = man; }

        public Monitor(int resX, int resY, float diag, Manufacturer man) {
            this.resolutionX = resX;
            this.resolutionY = resY;
            this.diagonal = diag;
            this.manufacturer = man;
        }
    }
}
