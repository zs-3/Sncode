package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfnk extends com.google.android.gms.internal.ads.zzbaq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzggh zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfu zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfnl zzc;

    zzfnk(com.google.android.gms.internal.ads.zzfnl r1, com.google.android.gms.internal.ads.zzggh r2, com.google.android.gms.ads.internal.client.zzfu r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzb(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzc(com.google.android.gms.ads.internal.client.zze r5) {
            r4 = this;
            com.google.android.gms.ads.LoadAdError r0 = r5.zzb()
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.client.zzfu r1 = r4.zzb
            java.lang.String r1 = r1.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to load app open ad with error parcel: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " for ad unit: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            com.google.android.gms.internal.ads.zzfnz r0 = new com.google.android.gms.internal.ads.zzfnz
            com.google.android.gms.internal.ads.zzfnl r1 = r4.zzc
            com.google.android.gms.internal.ads.zzggh r2 = r4.zza
            r0.<init>(r1, r2)
            r0.zza(r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(com.google.android.gms.internal.ads.zzbao r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfnz r0 = new com.google.android.gms.internal.ads.zzfnz
            com.google.android.gms.internal.ads.zzfnl r1 = r3.zzc
            com.google.android.gms.internal.ads.zzggh r2 = r3.zza
            r0.<init>(r1, r2)
            r0.zzb(r4)
            return
    }
}
