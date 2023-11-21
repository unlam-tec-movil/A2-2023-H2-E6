package ar.edu.unlam.mobile.scaffold.data.result.local;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ResultDao_Impl implements ResultDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GameResultEntity> __insertionAdapterOfGameResultEntity;

  public ResultDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGameResultEntity = new EntityInsertionAdapter<GameResultEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `gameResult` (`id`,`gameResult`,`size`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final GameResultEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getGameResult() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getGameResult());
        }
        statement.bindLong(3, entity.getSize());
      }
    };
  }

  @Override
  public void insert(final GameResultEntity gameResult) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfGameResultEntity.insert(gameResult);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<GameResultEntity>> getAllResults() {
    final String _sql = "SELECT * FROM gameResult";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"gameResult"}, new Callable<List<GameResultEntity>>() {
      @Override
      @NonNull
      public List<GameResultEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGameResult = CursorUtil.getColumnIndexOrThrow(_cursor, "gameResult");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final List<GameResultEntity> _result = new ArrayList<GameResultEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GameResultEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpGameResult;
            if (_cursor.isNull(_cursorIndexOfGameResult)) {
              _tmpGameResult = null;
            } else {
              _tmpGameResult = _cursor.getString(_cursorIndexOfGameResult);
            }
            final int _tmpSize;
            _tmpSize = _cursor.getInt(_cursorIndexOfSize);
            _item = new GameResultEntity(_tmpId,_tmpGameResult,_tmpSize);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
