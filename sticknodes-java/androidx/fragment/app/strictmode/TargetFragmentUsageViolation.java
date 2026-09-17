package androidx.fragment.app.strictmode;

/* compiled from: TargetFragmentUsageViolation.kt */
/* loaded from: classes.dex */
public abstract class TargetFragmentUsageViolation extends androidx.fragment.app.strictmode.Violation {
    public TargetFragmentUsageViolation(androidx.fragment.app.Fragment r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2, r3)
            return
    }
}
