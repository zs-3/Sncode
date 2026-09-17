package kotlinx.coroutines.scheduling;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class NanoTimeSource extends kotlinx.coroutines.scheduling.SchedulerTimeSource {
    public static final kotlinx.coroutines.scheduling.NanoTimeSource INSTANCE = null;

    static {
            kotlinx.coroutines.scheduling.NanoTimeSource r0 = new kotlinx.coroutines.scheduling.NanoTimeSource
            r0.<init>()
            kotlinx.coroutines.scheduling.NanoTimeSource.INSTANCE = r0
            return
    }

    private NanoTimeSource() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.scheduling.SchedulerTimeSource
    public long nanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }
}
