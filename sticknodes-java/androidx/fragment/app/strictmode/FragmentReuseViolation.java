package androidx.fragment.app.strictmode;

/* compiled from: FragmentReuseViolation.kt */
/* loaded from: classes.dex */
public final class FragmentReuseViolation extends androidx.fragment.app.strictmode.Violation {
    private final java.lang.String previousFragmentId;

    public FragmentReuseViolation(androidx.fragment.app.Fragment r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "previousFragmentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to reuse fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " with previous ID "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.previousFragmentId = r4
            return
    }
}
