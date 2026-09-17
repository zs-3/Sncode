package androidx.privacysandbox.ads.adservices.measurement;

/* compiled from: SourceRegistrationRequest.kt */
/* loaded from: classes.dex */
public final class SourceRegistrationRequest {
    private final android.view.InputEvent inputEvent;
    private final java.util.List<android.net.Uri> registrationUris;

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.List<android.net.Uri> r1 = r4.registrationUris
            androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest r5 = (androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest) r5
            java.util.List<android.net.Uri> r3 = r5.registrationUris
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L21
            android.view.InputEvent r1 = r4.inputEvent
            android.view.InputEvent r5 = r5.inputEvent
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 == 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public final android.view.InputEvent getInputEvent() {
            r1 = this;
            android.view.InputEvent r0 = r1.inputEvent
            return r0
    }

    public final java.util.List<android.net.Uri> getRegistrationUris() {
            r1 = this;
            java.util.List<android.net.Uri> r0 = r1.registrationUris
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.List<android.net.Uri> r0 = r2.registrationUris
            int r0 = r0.hashCode()
            android.view.InputEvent r1 = r2.inputEvent
            if (r1 == 0) goto L11
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L11:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RegistrationUris=["
            r0.append(r1)
            java.util.List<android.net.Uri> r1 = r3.registrationUris
            r0.append(r1)
            java.lang.String r1 = "], InputEvent="
            r0.append(r1)
            android.view.InputEvent r1 = r3.inputEvent
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AppSourcesRegistrationRequest { "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " }"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
