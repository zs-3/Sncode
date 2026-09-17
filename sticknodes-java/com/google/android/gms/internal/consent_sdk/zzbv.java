package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzbv implements com.google.android.gms.internal.consent_sdk.zzdn {
    private final com.google.android.gms.internal.consent_sdk.zzds zza;
    private final com.google.android.gms.internal.consent_sdk.zzds zzb;

    public zzbv(com.google.android.gms.internal.consent_sdk.zzds r1, com.google.android.gms.internal.consent_sdk.zzds r2, com.google.android.gms.internal.consent_sdk.zzds r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzbu r0 = r1.zzb()
            return r0
    }

    public final com.google.android.gms.internal.consent_sdk.zzbu zzb() {
            r4 = this;
            com.google.android.gms.internal.consent_sdk.zzds r0 = r4.zza
            java.lang.Object r0 = r0.zza()
            com.google.android.gms.internal.consent_sdk.zzbw r0 = (com.google.android.gms.internal.consent_sdk.zzbw) r0
            android.os.Handler r1 = com.google.android.gms.internal.consent_sdk.zzas.zzb()
            com.google.android.gms.internal.consent_sdk.zzds r2 = r4.zzb
            com.google.android.gms.internal.consent_sdk.zzcb r2 = (com.google.android.gms.internal.consent_sdk.zzcb) r2
            com.google.android.gms.internal.consent_sdk.zzca r2 = r2.zzb()
            com.google.android.gms.internal.consent_sdk.zzbu r3 = new com.google.android.gms.internal.consent_sdk.zzbu
            r3.<init>(r0, r1, r2)
            return r3
    }
}
