package kotlinx.coroutines;

/* compiled from: Dispatchers.kt */
/* loaded from: classes2.dex */
public final class Dispatchers {
    private static final kotlinx.coroutines.CoroutineDispatcher Default = null;
    public static final kotlinx.coroutines.Dispatchers INSTANCE = null;
    private static final kotlinx.coroutines.CoroutineDispatcher IO = null;
    private static final kotlinx.coroutines.CoroutineDispatcher Unconfined = null;

    static {
            kotlinx.coroutines.Dispatchers r0 = new kotlinx.coroutines.Dispatchers
            r0.<init>()
            kotlinx.coroutines.Dispatchers.INSTANCE = r0
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.Dispatchers.Default = r0
            kotlinx.coroutines.Unconfined r0 = kotlinx.coroutines.Unconfined.INSTANCE
            kotlinx.coroutines.Dispatchers.Unconfined = r0
            kotlinx.coroutines.scheduling.DefaultIoScheduler r0 = kotlinx.coroutines.scheduling.DefaultIoScheduler.INSTANCE
            kotlinx.coroutines.Dispatchers.IO = r0
            return
    }

    private Dispatchers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getDefault() {
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.Default
            return r0
    }

    public static final kotlinx.coroutines.CoroutineDispatcher getIO() {
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.IO
            return r0
    }

    public static final kotlinx.coroutines.MainCoroutineDispatcher getMain() {
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher
            return r0
    }
}
