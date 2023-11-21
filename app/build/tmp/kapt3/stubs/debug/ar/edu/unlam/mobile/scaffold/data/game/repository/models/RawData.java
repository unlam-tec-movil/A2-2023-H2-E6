package ar.edu.unlam.mobile.scaffold.data.game.repository.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/game/repository/models/RawData;", "", "attributeName", "", "getAttributeName", "()Ljava/lang/String;", "setAttributeName", "(Ljava/lang/String;)V", "attributeValue", "getAttributeValue", "setAttributeValue", "gameRawType", "getGameRawType", "setGameRawType", "name", "getName", "setName", "getOptions", "", "Lar/edu/unlam/mobile/scaffold/data/game/repository/models/Option;", "size", "", "app_debug"})
public abstract interface RawData {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getGameRawType();
    
    public abstract void setGameRawType(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getName();
    
    public abstract void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getAttributeName();
    
    public abstract void setAttributeName(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getAttributeValue();
    
    public abstract void setAttributeValue(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option> getOptions(int size);
}