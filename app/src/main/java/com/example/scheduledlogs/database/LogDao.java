package com.example.scheduledlogs.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.scheduledlogs.model.Log;

import java.util.List;


@Dao
public interface LogDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertLogs(Log... log);

    @Update
    void updateLogs(Log... log);

    @Query("select * from log")
    LiveData<List<Log>> getLogs();
}
