package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzf {
    public final android.media.AudioAttributes zza;

    /* synthetic */ zzf(com.google.android.gms.internal.ads.zzh r4, com.google.android.gms.internal.ads.zze r5) {
            r3 = this;
            r3.<init>()
            android.media.AudioAttributes$Builder r4 = new android.media.AudioAttributes$Builder
            r4.<init>()
            r5 = 0
            android.media.AudioAttributes$Builder r4 = r4.setContentType(r5)
            android.media.AudioAttributes$Builder r4 = r4.setFlags(r5)
            r0 = 1
            android.media.AudioAttributes$Builder r4 = r4.setUsage(r0)
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2 = 29
            if (r1 < r2) goto L1f
            com.google.android.gms.internal.ads.zzc.zza(r4, r0)
        L1f:
            r0 = 32
            if (r1 < r0) goto L26
            com.google.android.gms.internal.ads.zzd.zza(r4, r5)
        L26:
            android.media.AudioAttributes r4 = r4.build()
            r3.zza = r4
            return
    }
}
