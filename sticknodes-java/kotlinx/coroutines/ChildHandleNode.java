package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class ChildHandleNode extends kotlinx.coroutines.JobCancellingNode implements kotlinx.coroutines.ChildHandle {
    public final kotlinx.coroutines.ChildJob childJob;

    public ChildHandleNode(kotlinx.coroutines.ChildJob r1) {
            r0 = this;
            r0.<init>()
            r0.childJob = r1
            return
    }

    @Override // kotlinx.coroutines.ChildHandle
    public boolean childCancelled(java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.JobSupport r0 = r1.getJob()
            boolean r2 = r0.childCancelled(r2)
            return r2
    }

    @Override // kotlinx.coroutines.ChildHandle
    public kotlinx.coroutines.Job getParent() {
            r1 = this;
            kotlinx.coroutines.JobSupport r0 = r1.getJob()
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.invoke2(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.ChildJob r2 = r1.childJob
            kotlinx.coroutines.JobSupport r0 = r1.getJob()
            r2.parentCancelled(r0)
            return
    }
}
