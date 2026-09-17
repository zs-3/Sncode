package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzqu {
    private final android.media.AudioTrack zza;
    private final com.google.android.gms.internal.ads.zzoz zzb;
    private android.media.AudioRouting.OnRoutingChangedListener zzc;

    public zzqu(android.media.AudioTrack r2, com.google.android.gms.internal.ads.zzoz r3) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            r1.zzb = r3
            com.google.android.gms.internal.ads.zzqt r3 = new com.google.android.gms.internal.ads.zzqt
            r3.<init>(r1)
            r1.zzc = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.myLooper()
            r3.<init>(r0)
            android.media.AudioRouting$OnRoutingChangedListener r0 = r1.zzc
            r2.addOnRoutingChangedListener(r0, r3)
            return
    }

    public static /* synthetic */ void zza(com.google.android.gms.internal.ads.zzqu r0, android.media.AudioRouting r1) {
            r0.zzc(r1)
            return
    }

    private void zzc(android.media.AudioRouting r2) {
            r1 = this;
            android.media.AudioRouting$OnRoutingChangedListener r0 = r1.zzc
            if (r0 != 0) goto L5
            goto L14
        L5:
            android.media.AudioDeviceInfo r0 = r2.getRoutedDevice()
            if (r0 == 0) goto L14
            com.google.android.gms.internal.ads.zzoz r0 = r1.zzb
            android.media.AudioDeviceInfo r2 = r2.getRoutedDevice()
            r0.zzh(r2)
        L14:
            return
    }

    public void zzb() {
            r2 = this;
            android.media.AudioRouting$OnRoutingChangedListener r0 = r2.zzc
            java.util.Objects.requireNonNull(r0)
            android.media.AudioTrack r1 = r2.zza
            r1.removeOnRoutingChangedListener(r0)
            r0 = 0
            r2.zzc = r0
            return
    }
}
