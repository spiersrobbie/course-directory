package edu.isu.cs.cs2263;

public class Course {
    private static String[] dptCodes = {"CS", "CHEM", "PHYS", "MATH", "BTNY", "ZOO"};
    private static String[] dptNames = {"Computer Science", "Chemistry", "Physics", "Mathematics", "Botany", "Zoology"};

    private String department;
    private String courseName;
    private int numCredits;
    private int courseNum;

    public Course(String dptCode, String courseName, int numCredits, int courseNum){
        department = dptCode;
        this.courseName = courseName;
        this.numCredits = numCredits;
        this.courseNum = courseNum;
    }

    public String getDepartment(){return department;}

    public String toString(){
        return department + courseNum + ": " + courseName + ", " + numCredits + " credits.";
    }

    public static String[] getDptNames(){return dptNames;}

    public static String getDepartmentName(String dptCode){
        int ndx = 0;
        for (String code : dptCodes){
            if (dptCode.equals(code)){
                return dptNames[ndx];
            }
            ndx++;
        }
        return "Department Name Not Found";
    }

    public static String getDepartmentCode(String dptName){
        int ndx = 0;
        for (String name : dptNames){
            if (dptName.equals(name)){
                return dptCodes[ndx];
            }
            ndx++;
        }
        return "Department Code Not Found";
    }
}
