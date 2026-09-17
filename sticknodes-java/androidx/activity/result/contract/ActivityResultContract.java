package androidx.activity.result.contract;

/* compiled from: ActivityResultContract.kt */
/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* compiled from: ActivityResultContract.kt */
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        public final T getValue() {
                r1 = this;
                T r0 = r1.value
                return r0
        }
    }

    public ActivityResultContract() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract android.content.Intent createIntent(android.content.Context r1, I r2);

    public androidx.activity.result.contract.ActivityResultContract.SynchronousResult<O> getSynchronousResult(android.content.Context r1, I r2) {
            r0 = this;
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r1 = 0
            return r1
    }

    public abstract O parseResult(int r1, android.content.Intent r2);
}
