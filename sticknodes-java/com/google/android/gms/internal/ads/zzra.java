package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzra {
    final /* synthetic */ com.google.android.gms.internal.ads.zzrc zza;
    private final android.os.Handler zzb;
    private final android.media.AudioTrack.StreamEventCallback zzc;

    public zzra(com.google.android.gms.internal.ads.zzrc r2) {
            r1 = this;
            r1.zza = r2
            r1.<init>()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.myLooper()
            r2.<init>(r0)
            r1.zzb = r2
            com.google.android.gms.internal.ads.zzqz r2 = new com.google.android.gms.internal.ads.zzqz
            r2.<init>(r1)
            r1.zzc = r2
            return
    }

    public void zza(android.media.AudioTrack r3) {
            r2 = this;
            android.os.Handler r0 = r2.zzb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzqy r1 = new com.google.android.gms.internal.ads.zzqy
            r1.<init>(r0)
            android.media.AudioTrack$StreamEventCallback r0 = r2.zzc
            r3.registerStreamEventCallback(r1, r0)
            return
    }

    public void zzb(android.media.AudioTrack r2) {
            r1 = this;
            android.media.AudioTrack$StreamEventCallback r0 = r1.zzc
            r2.unregisterStreamEventCallback(r0)
            android.os.Handler r2 = r1.zzb
            r0 = 0
            r2.removeCallbacksAndMessages(r0)
            return
    }
}
