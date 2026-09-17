package kotlinx.coroutines.sync;

/* compiled from: Mutex.kt */
/* loaded from: classes2.dex */
public interface Mutex {

    /* compiled from: Mutex.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void unlock$default(kotlinx.coroutines.sync.Mutex r0, java.lang.Object r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.unlock(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: unlock"
                r0.<init>(r1)
                throw r0
        }
    }

    boolean isLocked();

    java.lang.Object lock(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    void unlock(java.lang.Object r1);
}
