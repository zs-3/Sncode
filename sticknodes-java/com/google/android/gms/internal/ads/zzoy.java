package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzoy extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzoz zza;

    /* synthetic */ zzoy(com.google.android.gms.internal.ads.zzoz r1, com.google.android.gms.internal.ads.zzox r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            boolean r0 = r3.isInitialStickyBroadcast()
            if (r0 != 0) goto L17
            com.google.android.gms.internal.ads.zzoz r0 = r3.zza
            com.google.android.gms.internal.ads.zzh r1 = com.google.android.gms.internal.ads.zzoz.zzb(r0)
            com.google.android.gms.internal.ads.zzpa r2 = com.google.android.gms.internal.ads.zzoz.zzd(r0)
            com.google.android.gms.internal.ads.zzos r4 = com.google.android.gms.internal.ads.zzos.zzd(r4, r5, r1, r2)
            com.google.android.gms.internal.ads.zzoz.zzf(r0, r4)
        L17:
            return
    }
}
