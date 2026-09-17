package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcvh implements com.google.android.gms.ads.internal.client.zza {
    private final com.google.android.gms.internal.ads.zzcvl zza;
    private final com.google.android.gms.internal.ads.zzfhc zzb;

    zzcvh(com.google.android.gms.internal.ads.zzcvl r1, com.google.android.gms.internal.ads.zzfhc r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r2.zzb
            com.google.android.gms.internal.ads.zzcvl r1 = r2.zza
            java.lang.String r0 = r0.zzf
            r1.zzc(r0)
            return
    }
}
