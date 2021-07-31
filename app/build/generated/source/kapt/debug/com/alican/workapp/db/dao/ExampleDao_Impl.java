package com.alican.workapp.db.dao;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.alican.workapp.db.entity.ExampleEntity;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExampleDao_Impl implements ExampleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ExampleEntity> __insertionAdapterOfExampleEntity;

  public ExampleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExampleEntity = new EntityInsertionAdapter<ExampleEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ExampleEntity` (`id`) VALUES (nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExampleEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void insert(final ExampleEntity exampleEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExampleEntity.insert(exampleEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
