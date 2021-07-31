package com.alican.workapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alican.workapp.db.dao.ExampleDao
import com.alican.workapp.db.entity.ExampleEntity

@Database(entities = [ExampleEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
}