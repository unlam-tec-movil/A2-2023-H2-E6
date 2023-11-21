package ar.edu.unlam.mobile.scaffold.data.kitty.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lar/edu/unlam/mobile/scaffold/data/kitty/network/KittyNetworkRepository;", "", "getRandomKitty", "Lkotlinx/coroutines/flow/Flow;", "Lar/edu/unlam/mobile/scaffold/data/kitty/network/KittyAPIModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface KittyNetworkRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRandomKitty(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<ar.edu.unlam.mobile.scaffold.data.kitty.network.KittyAPIModel>> continuation);
}