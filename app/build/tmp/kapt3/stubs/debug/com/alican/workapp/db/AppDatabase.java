package com.alican.workapp.db;

import java.lang.System;

@androidx.room.Database(entities = {com.alican.workapp.db.entity.ExampleEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/alican/workapp/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "exampleDao", "Lcom/alican/workapp/db/dao/ExampleDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.alican.workapp.db.dao.ExampleDao exampleDao();
    
    public AppDatabase() {
        super();
    }
}