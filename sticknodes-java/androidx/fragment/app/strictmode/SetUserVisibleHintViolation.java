package androidx.fragment.app.strictmode;

/* compiled from: SetUserVisibleHintViolation.kt */
/* loaded from: classes.dex */
public final class SetUserVisibleHintViolation extends androidx.fragment.app.strictmode.Violation {
    private final boolean isVisibleToUser;

    public SetUserVisibleHintViolation(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to set user visible hint to "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " for fragment "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            r2.isVisibleToUser = r4
            return
    }
}
