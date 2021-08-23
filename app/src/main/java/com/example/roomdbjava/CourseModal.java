package com.example.roomdbjava;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "course_table")
public class CourseModal
{

    @PrimaryKey(autoGenerate = true)
     private int id;

     private String courseNAme;
     private String courseDescription;
     private String courseDuration;

    public CourseModal(String courseNAme, String courseDescription, String courseDuration) {
        this.courseNAme = courseNAme;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseNAme() {
        return courseNAme;
    }

    public void setCourseNAme(String courseNAme) {
        this.courseNAme = courseNAme;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
}
