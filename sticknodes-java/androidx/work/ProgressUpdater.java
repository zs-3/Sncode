package androidx.work;

/* loaded from: classes.dex */
public interface ProgressUpdater {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateProgress(android.content.Context r1, java.util.UUID r2, androidx.work.Data r3);
}
