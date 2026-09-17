package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzot {
    public static void zza(android.content.Context r1, android.media.AudioDeviceCallback r2, android.os.Handler r3) {
            java.lang.String r0 = "audio"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            java.util.Objects.requireNonNull(r1)
            r1.registerAudioDeviceCallback(r2, r3)
            return
    }

    public static void zzb(android.content.Context r1, android.media.AudioDeviceCallback r2) {
            java.lang.String r0 = "audio"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            java.util.Objects.requireNonNull(r1)
            r1.unregisterAudioDeviceCallback(r2)
            return
    }
}
