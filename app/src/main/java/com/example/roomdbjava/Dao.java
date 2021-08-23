package com.example.roomdbjava;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface Dao
{
    @Query("SELECT *  FROM course_table ORDER BY courseNAme ASC")
    LiveData<List<CourseModal>> getAllCourse();

    @Query("DELETE FROM course_table")
    void deleteAllCourse();

    @Delete
    void  deleteCourse(CourseModal modal);

    @Insert
  void insertCourse(CourseModal modal);

    @Update
    void updateCourse(CourseModal modal);

}
