package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public abstract class JobNode extends kotlinx.coroutines.CompletionHandlerBase implements kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.Incomplete {
    public kotlinx.coroutines.JobSupport job;

    public JobNode() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
            r1 = this;
            kotlinx.coroutines.JobSupport r0 = r1.getJob()
            r0.removeNode$kotlinx_coroutines_core(r1)
            return
    }

    public final kotlinx.coroutines.JobSupport getJob() {
            r1 = this;
            kotlinx.coroutines.JobSupport r0 = r1.job
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Incomplete
    public kotlinx.coroutines.NodeList getList() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void setJob(kotlinx.coroutines.JobSupport r1) {
            r0 = this;
            r0.job = r1
            return
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            kotlinx.coroutines.JobSupport r1 = r2.getJob()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
