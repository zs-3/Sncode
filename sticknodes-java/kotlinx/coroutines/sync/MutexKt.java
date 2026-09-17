package kotlinx.coroutines.sync;

/* compiled from: Mutex.kt */
/* loaded from: classes2.dex */
public final class MutexKt {
    private static final kotlinx.coroutines.internal.Symbol NO_OWNER = null;
    private static final kotlinx.coroutines.internal.Symbol ON_LOCK_ALREADY_LOCKED_BY_OWNER = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_OWNER"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.NO_OWNER = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "ALREADY_LOCKED_BY_OWNER"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER = r0
            return
    }

    public static final kotlinx.coroutines.sync.Mutex Mutex(boolean r1) {
            kotlinx.coroutines.sync.MutexImpl r0 = new kotlinx.coroutines.sync.MutexImpl
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Mutex Mutex$default(boolean r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.sync.Mutex r0 = Mutex(r0)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNO_OWNER$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.NO_OWNER
            return r0
    }
}
