package kingkinfajarr.data;

public enum Level {
    STANDARD("Standard level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String descrption;

    Level(String descrption) {
        this.descrption = descrption;
    }

    public String getDescrption() {
        return descrption;
    }
}
