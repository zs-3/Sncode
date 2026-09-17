package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzdp {
    public static java.lang.Object zza(java.lang.Object r1) {
            java.lang.String r0 = "Cannot return null from a non-@Nullable @Provides method"
            java.util.Objects.requireNonNull(r1, r0)
            return r1
    }

    public static void zzb(java.lang.Object r1, java.lang.Class r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = " must be set"
            java.lang.String r2 = r2.concat(r0)
            r1.<init>(r2)
            throw r1
    }
}
