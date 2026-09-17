package kotlinx.coroutines;

/* compiled from: Supervisor.kt */
/* loaded from: classes2.dex */
final class SupervisorJobImpl extends kotlinx.coroutines.JobImpl {
    public SupervisorJobImpl(kotlinx.coroutines.Job r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
