package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcvj implements com.google.android.gms.internal.ads.zzddo, com.google.android.gms.internal.ads.zzczo {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzcvl zzb;
    private final com.google.android.gms.internal.ads.zzfhc zzc;
    private final java.lang.String zzd;

    zzcvj(com.google.android.gms.common.util.Clock r1, com.google.android.gms.internal.ads.zzcvl r2, com.google.android.gms.internal.ads.zzfhc r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zza() {
            r5 = this;
            com.google.android.gms.common.util.Clock r0 = r5.zza
            com.google.android.gms.internal.ads.zzcvl r1 = r5.zzb
            java.lang.String r2 = r5.zzd
            long r3 = r0.elapsedRealtime()
            r1.zze(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
            r5 = this;
            com.google.android.gms.common.util.Clock r0 = r5.zza
            java.lang.String r1 = r5.zzd
            long r2 = r0.elapsedRealtime()
            com.google.android.gms.internal.ads.zzfhc r0 = r5.zzc
            com.google.android.gms.internal.ads.zzcvl r4 = r5.zzb
            java.lang.String r0 = r0.zzf
            r4.zzd(r0, r1, r2)
            return
    }
}
