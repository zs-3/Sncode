package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzcb implements com.google.android.gms.internal.consent_sdk.zzdn {
    private final com.google.android.gms.internal.consent_sdk.zzds zza;
    private final com.google.android.gms.internal.consent_sdk.zzds zzb;
    private final com.google.android.gms.internal.consent_sdk.zzds zzc;
    private final com.google.android.gms.internal.consent_sdk.zzds zzd;
    private final com.google.android.gms.internal.consent_sdk.zzds zze;
    private final com.google.android.gms.internal.consent_sdk.zzds zzf;

    public zzcb(com.google.android.gms.internal.consent_sdk.zzds r1, com.google.android.gms.internal.consent_sdk.zzds r2, com.google.android.gms.internal.consent_sdk.zzds r3, com.google.android.gms.internal.consent_sdk.zzds r4, com.google.android.gms.internal.consent_sdk.zzds r5, com.google.android.gms.internal.consent_sdk.zzds r6, com.google.android.gms.internal.consent_sdk.zzds r7, com.google.android.gms.internal.consent_sdk.zzds r8) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r7
            r0.zzf = r8
            return
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzca r0 = r1.zzb()
            return r0
    }

    public final com.google.android.gms.internal.consent_sdk.zzca zzb() {
            r10 = this;
            com.google.android.gms.internal.consent_sdk.zzds r0 = r10.zza
            java.lang.Object r0 = r0.zza()
            r2 = r0
            android.app.Application r2 = (android.app.Application) r2
            com.google.android.gms.internal.consent_sdk.zzds r0 = r10.zzb
            java.lang.Object r0 = r0.zza()
            r3 = r0
            com.google.android.gms.internal.consent_sdk.zzbw r3 = (com.google.android.gms.internal.consent_sdk.zzbw) r3
            android.os.Handler r4 = com.google.android.gms.internal.consent_sdk.zzas.zzb()
            java.util.concurrent.Executor r5 = com.google.android.gms.internal.consent_sdk.zzau.zzb()
            com.google.android.gms.internal.consent_sdk.zzds r0 = r10.zzc
            java.lang.Object r0 = r0.zza()
            r6 = r0
            com.google.android.gms.internal.consent_sdk.zze r6 = (com.google.android.gms.internal.consent_sdk.zze) r6
            com.google.android.gms.internal.consent_sdk.zzds r0 = r10.zzd
            com.google.android.gms.internal.consent_sdk.zzao r0 = (com.google.android.gms.internal.consent_sdk.zzao) r0
            com.google.android.gms.internal.consent_sdk.zzan r7 = r0.zzb()
            com.google.android.gms.internal.consent_sdk.zzds r0 = r10.zze
            java.lang.Object r0 = r0.zza()
            r8 = r0
            com.google.android.gms.internal.consent_sdk.zzbb r8 = (com.google.android.gms.internal.consent_sdk.zzbb) r8
            com.google.android.gms.internal.consent_sdk.zzds r0 = r10.zzf
            java.lang.Object r0 = r0.zza()
            r9 = r0
            com.google.android.gms.internal.consent_sdk.zzap r9 = (com.google.android.gms.internal.consent_sdk.zzap) r9
            com.google.android.gms.internal.consent_sdk.zzca r0 = new com.google.android.gms.internal.consent_sdk.zzca
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }
}
