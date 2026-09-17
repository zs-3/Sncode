package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcbf implements java.lang.Runnable {
    final /* synthetic */ android.media.MediaPlayer zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbn zzb;

    zzcbf(com.google.android.gms.internal.ads.zzcbn r1, android.media.MediaPlayer r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcbn r0 = r2.zzb
            android.media.MediaPlayer r1 = r2.zza
            com.google.android.gms.internal.ads.zzcbn.zzl(r0, r1)
            com.google.android.gms.internal.ads.zzcbn r0 = r2.zzb
            com.google.android.gms.internal.ads.zzcbo r1 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            if (r1 == 0) goto L16
            com.google.android.gms.internal.ads.zzcbo r0 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            r0.zzf()
        L16:
            return
    }
}
