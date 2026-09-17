package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzes extends com.google.android.gms.ads.internal.client.zzce {
    final /* synthetic */ com.google.android.gms.ads.preload.PreloadCallback zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzey zzb;

    zzes(com.google.android.gms.ads.internal.client.zzey r1, com.google.android.gms.ads.preload.PreloadCallback r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(com.google.android.gms.ads.internal.client.zzfu r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzey r0 = r1.zzb
            java.util.Optional r2 = com.google.android.gms.ads.internal.client.zzey.zzk(r0, r2)
            com.google.android.gms.ads.internal.client.zzeq r0 = new com.google.android.gms.ads.internal.client.zzeq
            r0.<init>(r1)
            r2.ifPresent(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(com.google.android.gms.ads.internal.client.zzfu r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzey r0 = r1.zzb
            java.util.Optional r2 = com.google.android.gms.ads.internal.client.zzey.zzk(r0, r2)
            com.google.android.gms.ads.internal.client.zzer r0 = new com.google.android.gms.ads.internal.client.zzer
            r0.<init>(r1)
            r2.ifPresent(r0)
            return
    }
}
