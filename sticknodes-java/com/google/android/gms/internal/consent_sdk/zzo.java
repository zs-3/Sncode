package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzo implements com.google.android.gms.internal.consent_sdk.zzdn {
    private final com.google.android.gms.internal.consent_sdk.zzds zza;
    private final com.google.android.gms.internal.consent_sdk.zzds zzb;

    public zzo(com.google.android.gms.internal.consent_sdk.zzds r1, com.google.android.gms.internal.consent_sdk.zzds r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzl r0 = r1.zzb()
            return r0
    }

    public final com.google.android.gms.internal.consent_sdk.zzl zzb() {
            r3 = this;
            com.google.android.gms.internal.consent_sdk.zzds r0 = r3.zza
            java.lang.Object r0 = r0.zza()
            android.app.Application r0 = (android.app.Application) r0
            com.google.android.gms.internal.consent_sdk.zzds r1 = r3.zzb
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.consent_sdk.zzap r1 = (com.google.android.gms.internal.consent_sdk.zzap) r1
            com.google.android.gms.internal.consent_sdk.zzl r2 = new com.google.android.gms.internal.consent_sdk.zzl
            r2.<init>(r0, r1)
            return r2
    }
}
