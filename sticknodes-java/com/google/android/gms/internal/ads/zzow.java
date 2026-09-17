package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzow extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzoz zza;
    private final android.content.ContentResolver zzb;
    private final android.net.Uri zzc;

    public zzow(com.google.android.gms.internal.ads.zzoz r1, android.os.Handler r2, android.content.ContentResolver r3, android.net.Uri r4) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            r0.zzb = r3
            r0.zzc = r4
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzoz r3 = r2.zza
            android.content.Context r0 = com.google.android.gms.internal.ads.zzoz.zza(r3)
            com.google.android.gms.internal.ads.zzh r1 = com.google.android.gms.internal.ads.zzoz.zzb(r3)
            com.google.android.gms.internal.ads.zzpa r3 = com.google.android.gms.internal.ads.zzoz.zzd(r3)
            com.google.android.gms.internal.ads.zzos r3 = com.google.android.gms.internal.ads.zzos.zzc(r0, r1, r3)
            com.google.android.gms.internal.ads.zzoz r0 = r2.zza
            com.google.android.gms.internal.ads.zzoz.zzf(r0, r3)
            return
    }

    public final void zza() {
            r3 = this;
            android.content.ContentResolver r0 = r3.zzb
            android.net.Uri r1 = r3.zzc
            r2 = 0
            r0.registerContentObserver(r1, r2, r3)
            return
    }

    public final void zzb() {
            r1 = this;
            android.content.ContentResolver r0 = r1.zzb
            r0.unregisterContentObserver(r1)
            return
    }
}
