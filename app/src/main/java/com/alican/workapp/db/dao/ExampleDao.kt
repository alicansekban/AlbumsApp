package com.alican.workapp.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.alican.workapp.db.entity.ExampleEntity

@Dao
interface ExampleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(exampleEntity: ExampleEntity)
}