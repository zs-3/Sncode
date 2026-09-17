package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zze {
    private final java.util.concurrent.Executor zza;

    zze(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.util.concurrent.Executor zza() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.zza
            return r0
    }

    public final void zzb(java.lang.String r2, java.lang.String r3, com.google.android.gms.internal.consent_sdk.zzd... r4) {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzc r0 = new com.google.android.gms.internal.consent_sdk.zzc
            r0.<init>(r2, r3, r4)
            java.util.concurrent.Executor r2 = r1.zza
            r2.execute(r0)
            return
    }
}
