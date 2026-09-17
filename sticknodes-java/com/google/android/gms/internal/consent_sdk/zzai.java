package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzai {
    private android.app.Application zza;

    private zzai() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzai(com.google.android.gms.internal.consent_sdk.zzah r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.internal.consent_sdk.zza zza() {
            r3 = this;
            android.app.Application r0 = r3.zza
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            com.google.android.gms.internal.consent_sdk.zzdp.zzb(r0, r1)
            com.google.android.gms.internal.consent_sdk.zzag r0 = new com.google.android.gms.internal.consent_sdk.zzag
            android.app.Application r1 = r3.zza
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public final com.google.android.gms.internal.consent_sdk.zzai zzb(android.app.Application r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return r0
    }
}
