package androidx.fragment.app.strictmode;

/* compiled from: GetRetainInstanceUsageViolation.kt */
/* loaded from: classes.dex */
public final class GetRetainInstanceUsageViolation extends androidx.fragment.app.strictmode.RetainInstanceUsageViolation {
    public GetRetainInstanceUsageViolation(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to get retain instance for fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            return
    }
}
