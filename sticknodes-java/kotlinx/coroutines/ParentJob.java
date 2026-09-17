package kotlinx.coroutines;

/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public interface ParentJob extends kotlinx.coroutines.Job {
    java.util.concurrent.CancellationException getChildJobCancellationCause();
}
