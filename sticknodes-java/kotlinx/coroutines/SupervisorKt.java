package kotlinx.coroutines;

/* compiled from: Supervisor.kt */
/* loaded from: classes2.dex */
public final class SupervisorKt {
    public static final kotlinx.coroutines.CompletableJob SupervisorJob(kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.SupervisorJobImpl r0 = new kotlinx.coroutines.SupervisorJobImpl
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob SupervisorJob$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.CompletableJob r0 = SupervisorJob(r0)
            return r0
    }
}
