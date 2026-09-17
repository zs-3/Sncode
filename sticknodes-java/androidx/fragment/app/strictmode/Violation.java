package androidx.fragment.app.strictmode;

/* compiled from: Violation.kt */
/* loaded from: classes.dex */
public abstract class Violation extends java.lang.RuntimeException {
    private final androidx.fragment.app.Fragment fragment;

    public Violation(androidx.fragment.app.Fragment r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r3)
            r1.fragment = r2
            return
    }

    public final androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.fragment
            return r0
    }
}
