package api;

/**
 * Data structure for status of cmc api requests
 */
public class Status {

    private String timestamp;
    private int errorcode;
    private String errormessage;
    private int elapsed;
    private int creditcount;
    private String notice;

    public String getTimestamp() {
        return timestamp;
    }

    public int getErrorcode() {
        return errorcode;
    }

    public String getErrormessage() {
        if(errormessage == null) {
            return "";
        }
        return errormessage;
    }

    public int getElapsed() {
        return elapsed;
    }

    public int getCreditcount() {
        return creditcount;
    }

    public String getNotice() {
        if(notice == null) {
            return "";
        }
        return notice;
    }

    @Override
    public String toString() {
        return "Status{" +
                "timestamp='" + timestamp + '\'' +
                ", errorcode=" + errorcode +
                ", errormessage='" + errormessage + '\'' +
                ", elapsed=" + elapsed +
                ", creditcount=" + creditcount +
                ", notice='" + notice + '\'' +
                '}';
    }
}
