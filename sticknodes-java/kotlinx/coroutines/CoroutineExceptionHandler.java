package kotlinx.coroutines;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends kotlin.coroutines.CoroutineContext.Element {
    public static final kotlinx.coroutines.CoroutineExceptionHandler.Key Key = null;

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineExceptionHandler> {
        static final /* synthetic */ kotlinx.coroutines.CoroutineExceptionHandler.Key $$INSTANCE = null;

        static {
                kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = new kotlinx.coroutines.CoroutineExceptionHandler$Key
                r0.<init>()
                kotlinx.coroutines.CoroutineExceptionHandler.Key.$$INSTANCE = r0
                return
        }

        private Key() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key.$$INSTANCE
            kotlinx.coroutines.CoroutineExceptionHandler.Key = r0
            return
    }

    void handleException(kotlin.coroutines.CoroutineContext r1, java.lang.Throwable r2);
}
