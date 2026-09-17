package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzov extends android.media.AudioDeviceCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzoz zza;

    /* synthetic */ zzov(com.google.android.gms.internal.ads.zzoz r1, com.google.android.gms.internal.ads.zzou r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] r3) {
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

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzoz r0 = r4.zza
            com.google.android.gms.internal.ads.zzpa r0 = com.google.android.gms.internal.ads.zzoz.zzd(r0)
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            int r1 = r5.length
            r2 = 0
        La:
            if (r2 >= r1) goto L1e
            r3 = r5[r2]
            boolean r3 = java.util.Objects.equals(r3, r0)
            if (r3 == 0) goto L1b
            com.google.android.gms.internal.ads.zzoz r5 = r4.zza
            r0 = 0
            com.google.android.gms.internal.ads.zzoz.zze(r5, r0)
            goto L1e
        L1b:
            int r2 = r2 + 1
            goto La
        L1e:
            com.google.android.gms.internal.ads.zzoz r5 = r4.zza
            android.content.Context r0 = com.google.android.gms.internal.ads.zzoz.zza(r5)
            com.google.android.gms.internal.ads.zzh r1 = com.google.android.gms.internal.ads.zzoz.zzb(r5)
            com.google.android.gms.internal.ads.zzpa r2 = com.google.android.gms.internal.ads.zzoz.zzd(r5)
            com.google.android.gms.internal.ads.zzos r0 = com.google.android.gms.internal.ads.zzos.zzc(r0, r1, r2)
            com.google.android.gms.internal.ads.zzoz.zzf(r5, r0)
            return
    }
}
