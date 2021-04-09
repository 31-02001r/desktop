

public class Student {
    private String reg;
    private String name;
    private int semester;

    public Student(String name, int semester){
        setName(name);
        setSemester(semester);
    }
    
    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }




}
