package ar.edu.unlam.mobile.scaffold.core.database;

import java.lang.System;

@androidx.room.Database(entities = {ar.edu.unlam.mobile.scaffold.data.result.local.entity.GameResultEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lar/edu/unlam/mobile/scaffold/core/database/SwDatabase;", "Landroidx/room/RoomDatabase;", "()V", "resultDao", "Lar/edu/unlam/mobile/scaffold/data/result/local/ResultDao;", "app_debug"})
public abstract class SwDatabase extends androidx.room.RoomDatabase {
    
    public SwDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract ar.edu.unlam.mobile.scaffold.data.result.local.ResultDao resultDao();
}