package Reto3.api.Reportes;

public class StatusReservas {
    private int complete;
    private int canceled;

    public StatusReservas(int complete, int canceled) {
        this.complete = complete;
        this.canceled = canceled;
    }

    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public int getCanceled() {
        return canceled;
    }

    public void setCanceled(int canceled) {
        this.canceled = canceled;
    }
}
