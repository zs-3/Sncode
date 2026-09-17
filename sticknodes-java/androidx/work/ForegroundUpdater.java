package androidx.work;

/* loaded from: classes.dex */
public interface ForegroundUpdater {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(android.content.Context r1, java.util.UUID r2, androidx.work.ForegroundInfo r3);
}
