package androidx.fragment.app.strictmode;

/* compiled from: FragmentTagUsageViolation.kt */
/* loaded from: classes.dex */
public final class FragmentTagUsageViolation extends androidx.fragment.app.strictmode.Violation {
    private final android.view.ViewGroup parentContainer;

    public FragmentTagUsageViolation(androidx.fragment.app.Fragment r3, android.view.ViewGroup r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to use <fragment> tag to add fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " to container "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.parentContainer = r4
            return
    }
}
