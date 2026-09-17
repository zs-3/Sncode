package kotlinx.coroutines;

/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public interface ChildHandle extends kotlinx.coroutines.DisposableHandle {
    boolean childCancelled(java.lang.Throwable r1);

    kotlinx.coroutines.Job getParent();
}
