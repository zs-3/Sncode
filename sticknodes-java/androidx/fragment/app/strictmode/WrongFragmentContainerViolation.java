package androidx.fragment.app.strictmode;

/* compiled from: WrongFragmentContainerViolation.kt */
/* loaded from: classes.dex */
public final class WrongFragmentContainerViolation extends androidx.fragment.app.strictmode.Violation {
    private final android.view.ViewGroup container;

    public WrongFragmentContainerViolation(androidx.fragment.app.Fragment r3, android.view.ViewGroup r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to add fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " to container "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " which is not a FragmentContainerView"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.container = r4
            return
    }
}
