package kotlinx.coroutines;

/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public interface ChildJob extends kotlinx.coroutines.Job {
    void parentCancelled(kotlinx.coroutines.ParentJob r1);
}
