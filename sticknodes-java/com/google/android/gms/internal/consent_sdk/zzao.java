package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzao implements com.google.android.gms.internal.consent_sdk.zzdn {
    private final com.google.android.gms.internal.consent_sdk.zzds zza;
    private final com.google.android.gms.internal.consent_sdk.zzds zzb;

    public zzao(com.google.android.gms.internal.consent_sdk.zzds r1, com.google.android.gms.internal.consent_sdk.zzds r2, com.google.android.gms.internal.consent_sdk.zzds r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzan r0 = r1.zzb()
            return r0
    }

    public final com.google.android.gms.internal.consent_sdk.zzan zzb() {
            r4 = this;
            com.google.android.gms.internal.consent_sdk.zzds r0 = r4.zza
            java.lang.Object r0 = r0.zza()
            android.app.Application r0 = (android.app.Application) r0
            com.google.android.gms.internal.consent_sdk.zzds r1 = r4.zzb
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.consent_sdk.zzap r1 = (com.google.android.gms.internal.consent_sdk.zzap) r1
            java.util.concurrent.Executor r2 = com.google.android.gms.internal.consent_sdk.zzau.zzb()
            com.google.android.gms.internal.consent_sdk.zzan r3 = new com.google.android.gms.internal.consent_sdk.zzan
            r3.<init>(r0, r1, r2)
            return r3
    }
}
