package kotlinx.coroutines;

/* compiled from: Executors.kt */
/* loaded from: classes2.dex */
public abstract class ExecutorCoroutineDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements java.io.Closeable {
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher.Key Key = null;

    /* compiled from: Executors.kt */
    public static final class Key extends kotlin.coroutines.AbstractCoroutineContextKey<kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.ExecutorCoroutineDispatcher> {


        private Key() {
                r2 = this;
                kotlinx.coroutines.CoroutineDispatcher$Key r0 = kotlinx.coroutines.CoroutineDispatcher.Key
                kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1 r1 = kotlinx.coroutines.ExecutorCoroutineDispatcher.Key.AnonymousClass1.INSTANCE
                r2.<init>(r0, r1)
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.ExecutorCoroutineDispatcher$Key r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcher$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.ExecutorCoroutineDispatcher.Key = r0
            return
    }

    public ExecutorCoroutineDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }
}
