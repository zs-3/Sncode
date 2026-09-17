package androidx.core.os;

/* compiled from: Bundle.kt */
/* loaded from: classes.dex */
final class BundleApi21ImplKt {
    public static final androidx.core.os.BundleApi21ImplKt INSTANCE = null;

    static {
            androidx.core.os.BundleApi21ImplKt r0 = new androidx.core.os.BundleApi21ImplKt
            r0.<init>()
            androidx.core.os.BundleApi21ImplKt.INSTANCE = r0
            return
    }

    private BundleApi21ImplKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void putSize(android.os.Bundle r1, java.lang.String r2, android.util.Size r3) {
            java.lang.String r0 = "bundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.putSize(r2, r3)
            return
    }

    public static final void putSizeF(android.os.Bundle r1, java.lang.String r2, android.util.SizeF r3) {
            java.lang.String r0 = "bundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.putSizeF(r2, r3)
            return
    }
}
