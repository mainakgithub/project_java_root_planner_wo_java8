public class routesD {
    private String from;
    private String to;
    private int fliDis;
    private String fliTime;
    private String fliRS;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getFliDis() {
        return fliDis;
    }

    public void setFliDis(int fliDis) {
        this.fliDis = fliDis;
    }

    public String getFliTime() {
        return fliTime;
    }

    public void setFliTime(String fliTime) {
        this.fliTime = fliTime;
    }

    public String getFliRS() {
        return fliRS;
    }

    public void setFliRS(String fliRS) {
        this.fliRS = fliRS;
    }


    public routesD(String from, String to, int fliDis, String fliTime, String fliRS) {
        this.from = from;
        this.to = to;
        this.fliDis = fliDis;
        this.fliTime = fliTime;
        this.fliRS = fliRS;
    }


    @Override
    public String toString() {
        return String.format("%15s      %15s       %15s          %15s       %15s", from, to, fliDis, fliTime, fliRS);
    }

    ;
}
        /*return "routesD{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", fliDis=" + fliDis +
                ", fliTime='" + fliTime + '\'' +
                ", fliRS='" + fliRS + '\'' +
                '}';
    }*/
    /*public String toString() {
        //System.out.println("From\t\tTo\t\tDistance in km\t    Travel Time\t\tTypical Airfare");
        return from+"		"+to+"		"+fliDis+"			"+fliTime+"		"+fliRS+" ";
    }*/
