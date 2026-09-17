package kotlinx.coroutines.internal;

/* compiled from: MainDispatcherFactory.kt */
/* loaded from: classes2.dex */
public interface MainDispatcherFactory {
    kotlinx.coroutines.MainCoroutineDispatcher createDispatcher(java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> r1);

    int getLoadPriority();

    java.lang.String hintOnError();
}
