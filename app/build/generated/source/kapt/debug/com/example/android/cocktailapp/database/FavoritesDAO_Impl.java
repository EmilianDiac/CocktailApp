package com.example.android.cocktailapp.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoritesDAO_Impl implements FavoritesDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteCocktail> __insertionAdapterOfFavoriteCocktail;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFavoriteCocktails;

  public FavoritesDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteCocktail = new EntityInsertionAdapter<FavoriteCocktail>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `favorite_cocktails_table` (`name`,`image_url`,`cocktail_id`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoriteCocktail value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageUrl());
        }
        stmt.bindLong(3, value.getCocktailId());
      }
    };
    this.__preparedStmtOfDeleteAllFavoriteCocktails = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favorite_cocktails_table";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final FavoriteCocktail cocktail, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavoriteCocktail.insert(cocktail);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllFavoriteCocktails(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFavoriteCocktails.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllFavoriteCocktails.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<FavoriteCocktail>> getAllFavoriteCocktails() {
    final String _sql = "SELECT * FROM favorite_cocktails_table ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"favorite_cocktails_table"}, false, new Callable<List<FavoriteCocktail>>() {
      @Override
      public List<FavoriteCocktail> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfCocktailId = CursorUtil.getColumnIndexOrThrow(_cursor, "cocktail_id");
          final List<FavoriteCocktail> _result = new ArrayList<FavoriteCocktail>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavoriteCocktail _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpImageUrl;
            _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            final long _tmpCocktailId;
            _tmpCocktailId = _cursor.getLong(_cursorIndexOfCocktailId);
            _item = new FavoriteCocktail(_tmpName,_tmpImageUrl,_tmpCocktailId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
