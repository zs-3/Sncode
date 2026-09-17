package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzql {
    public static void zza(android.media.AudioTrack r0, com.google.android.gms.internal.ads.zzpa r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto L6
        L4:
            android.media.AudioDeviceInfo r1 = r1.zza
        L6:
            r0.setPreferredDevice(r1)
            return
    }
}
