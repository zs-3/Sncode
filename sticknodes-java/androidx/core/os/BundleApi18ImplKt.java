package androidx.core.os;

/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
final class BundleApi18ImplKt {
    public static final androidx.core.os.BundleApi18ImplKt INSTANCE = null;

    static {
            androidx.core.os.BundleApi18ImplKt r0 = new androidx.core.os.BundleApi18ImplKt
            r0.<init>()
            androidx.core.os.BundleApi18ImplKt.INSTANCE = r0
            return
    }

    private BundleApi18ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void putBinder(android.os.Bundle r1, java.lang.String r2, android.os.IBinder r3) {
            java.lang.String r0 = "bundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.putBinder(r2, r3)
            return
    }
}
