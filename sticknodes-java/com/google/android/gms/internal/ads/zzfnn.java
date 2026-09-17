package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfnn extends com.google.android.gms.ads.internal.client.zzbn {
    final /* synthetic */ com.google.android.gms.internal.ads.zzggh zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfno zzc;

    zzfnn(com.google.android.gms.internal.ads.zzfno r1, com.google.android.gms.internal.ads.zzggh r2, com.google.android.gms.ads.internal.client.zzby r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(com.google.android.gms.ads.internal.client.zze r5) {
            r4 = this;
            com.google.android.gms.ads.LoadAdError r0 = r5.zzb()
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzfno r1 = r4.zzc
            com.google.android.gms.ads.internal.client.zzfu r1 = r1.zze
            java.lang.String r1 = r1.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to load interstitial ad with error: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " for ad unit: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzfnz r0 = new com.google.android.gms.internal.ads.zzfnz
            com.google.android.gms.internal.ads.zzfno r1 = r4.zzc
            com.google.android.gms.internal.ads.zzggh r2 = r4.zza
            r0.<init>(r1, r2)
            r0.zza(r5)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfnz r0 = new com.google.android.gms.internal.ads.zzfnz
            com.google.android.gms.internal.ads.zzfno r1 = r3.zzc
            com.google.android.gms.internal.ads.zzggh r2 = r3.zza
            r0.<init>(r1, r2)
            com.google.android.gms.ads.internal.client.zzby r1 = r3.zzb
            r0.zzb(r1)
            return
    }
}
