
//extends keyword inherit a class
public class Hostellite extends Student {

    private String hostleName;
    private int roomNo;

    public Hostellite(String name, int semester, String hostleName, int roomNo){
        super(name, semester);
    setHostleName(hostleName);
    setRoomNo(roomNo);
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getHostleName() {
        return hostleName;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setHostleName(String hostleName) {
        this.hostleName = hostleName;
    }






}
