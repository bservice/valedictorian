package com.company;

/**
 * Created by bs666 on 11/3/17.
 */
public class HighSchoolClass {

    private Student[] students;

    //constructors and other data fields not shown
//returns the valedictorian of the class
    public Student getValedictorian() {

        // set gpa higher than rest of students
        // i dont know how to do that, shocker
    }

    // returns the percentage of students in the
// honors program
    public double getHonorsPercentage(double percent) {

        return percent;
    }

    // returns the student's grade point average
    public double getGPA()

    // returns true if the student is in the honors program
    public boolean isHonors();
    {
        if (getHonorsPercentage(95))
            return true;
        else
        {
            return false;
        }
    }
}