package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbkg implements com.google.android.gms.ads.internal.overlay.zzaa {
    boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ java.util.Map zzd;
    final /* synthetic */ java.util.Map zze;

    zzbkg(com.google.android.gms.internal.ads.zzbki r1, boolean r2, com.google.android.gms.ads.internal.client.zza r3, java.util.Map r4, java.util.Map r5) {
            r0 = this;
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.<init>()
            r1 = 0
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean r4) {
            r3 = this;
            boolean r0 = r3.zza
            if (r0 != 0) goto L32
            if (r4 == 0) goto L11
            boolean r0 = r3.zzb
            if (r0 == 0) goto L11
            com.google.android.gms.ads.internal.client.zza r0 = r3.zzc
            com.google.android.gms.internal.ads.zzdga r0 = (com.google.android.gms.internal.ads.zzdga) r0
            r0.zzdG()
        L11:
            r0 = 1
            r3.zza = r0
            java.util.Map r0 = r3.zzd
            java.util.Map r1 = r3.zze
            java.lang.String r2 = "event_id"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.put(r1, r4)
            com.google.android.gms.ads.internal.client.zza r4 = r3.zzc
            java.util.Map r0 = r3.zzd
            com.google.android.gms.internal.ads.zzbmr r4 = (com.google.android.gms.internal.ads.zzbmr) r4
            java.lang.String r1 = "openIntentAsync"
            r4.zzd(r1, r0)
        L32:
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int r1) {
            r0 = this;
            return
    }
}
