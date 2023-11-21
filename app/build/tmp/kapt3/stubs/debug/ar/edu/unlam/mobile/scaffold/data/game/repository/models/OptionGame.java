package ar.edu.unlam.mobile.scaffold.data.game.repository.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/game/repository/models/OptionGame;", "", "question", "", "answer", "Lar/edu/unlam/mobile/scaffold/data/game/repository/models/Option;", "options", "", "(Ljava/lang/String;Lar/edu/unlam/mobile/scaffold/data/game/repository/models/Option;Ljava/util/List;)V", "getAnswer", "()Lar/edu/unlam/mobile/scaffold/data/game/repository/models/Option;", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "getQuestion", "()Ljava/lang/String;", "isCorrect", "", "option", "shuffle", "", "app_debug"})
public final class OptionGame {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String question = null;
    @org.jetbrains.annotations.NotNull
    private final ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option answer = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option> options;
    
    public OptionGame(@org.jetbrains.annotations.NotNull
    java.lang.String question, @org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option answer, @org.jetbrains.annotations.NotNull
    java.util.List<ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option> options) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option getAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option> getOptions() {
        return null;
    }
    
    public final void setOptions(@org.jetbrains.annotations.NotNull
    java.util.List<ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option> p0) {
    }
    
    public final boolean isCorrect(@org.jetbrains.annotations.NotNull
    ar.edu.unlam.mobile.scaffold.data.game.repository.models.Option option) {
        return false;
    }
    
    public final void shuffle() {
    }
}