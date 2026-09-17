package androidx.fragment.app.strictmode;

/* compiled from: SetTargetFragmentUsageViolation.kt */
/* loaded from: classes.dex */
public final class SetTargetFragmentUsageViolation extends androidx.fragment.app.strictmode.TargetFragmentUsageViolation {
    private final int requestCode;
    private final androidx.fragment.app.Fragment targetFragment;

    public SetTargetFragmentUsageViolation(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, int r5) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "targetFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to set target fragment "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " with request code "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " for fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.targetFragment = r4
            r2.requestCode = r5
            return
    }
}
