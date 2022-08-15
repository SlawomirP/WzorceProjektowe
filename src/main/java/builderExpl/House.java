package builderExpl;

public class House {

    private String adress;
    private Integer floorsNumber;
    private Integer doorsNumber;
    private Integer windowsNumber;

    private House(String adress, Integer floorsNumber, Integer doorsNumber, Integer windowsNumber) {
        this.adress = adress;
        this.floorsNumber = floorsNumber;
        this.doorsNumber = doorsNumber;
        this.windowsNumber = windowsNumber;
    }

    public static class HouseBuilder {
        private String adress;
        private Integer floorsNumber;
        private Integer doorsNumber;
        private Integer windowsNumber;

        public HouseBuilder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public HouseBuilder setFloorsNumber(Integer floorsNumber) {
            this.floorsNumber = floorsNumber;
            return this;
        }

        public HouseBuilder setDoorsNumber(Integer doorsNumber) {
            this.doorsNumber = doorsNumber;
            return this;
        }

        public HouseBuilder setWindowsNumber(Integer windowsNumber) {
            this.windowsNumber = windowsNumber;
            return this;
        }

        public House build() {
            return new House(adress, floorsNumber, doorsNumber, windowsNumber);
        }
    }

    public String getAdress() {
        return adress;
    }

    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    public Integer getDoorsNumber() {
        return doorsNumber;
    }

    public Integer getWindowsNumber() {
        return windowsNumber;
    }
}



