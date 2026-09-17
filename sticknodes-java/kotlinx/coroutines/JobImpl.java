package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public class JobImpl extends kotlinx.coroutines.JobSupport implements kotlinx.coroutines.CompletableJob {
    private final boolean handlesException;

    public JobImpl(kotlinx.coroutines.Job r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.initParentJob(r2)
            boolean r2 = r1.handlesException()
            r1.handlesException = r2
            return
    }

    private final boolean handlesException() {
            r4 = this;
            kotlinx.coroutines.ChildHandle r0 = r4.getParentHandle$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            kotlinx.coroutines.JobSupport r0 = r0.getJob()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.getHandlesException$kotlinx_coroutines_core()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            kotlinx.coroutines.ChildHandle r0 = r0.getParentHandle$kotlinx_coroutines_core()
            boolean r3 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            if (r3 == 0) goto L2a
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            kotlinx.coroutines.JobSupport r0 = r0.getJob()
            if (r0 != 0) goto L17
        L33:
            return r1
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getHandlesException$kotlinx_coroutines_core() {
            r1 = this;
            boolean r0 = r1.handlesException
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }
}
