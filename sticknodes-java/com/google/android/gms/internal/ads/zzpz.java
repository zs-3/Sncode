package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzpz {
    private final android.media.AudioTrack zza;
    private final android.media.AudioTimestamp zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpz(android.media.AudioTrack r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            android.media.AudioTimestamp r1 = new android.media.AudioTimestamp
            r1.<init>()
            r0.zzb = r1
            return
    }

    public final long zza() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    public final long zzb() {
            r4 = this;
            android.media.AudioTimestamp r0 = r4.zzb
            long r0 = r0.nanoTime
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            return r0
    }

    public final boolean zzc() {
            r7 = this;
            android.media.AudioTrack r0 = r7.zza
            android.media.AudioTimestamp r1 = r7.zzb
            boolean r0 = r0.getTimestamp(r1)
            if (r0 == 0) goto L28
            android.media.AudioTimestamp r1 = r7.zzb
            long r1 = r1.framePosition
            long r3 = r7.zzd
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L1b
            long r3 = r7.zzc
            r5 = 1
            long r3 = r3 + r5
            r7.zzc = r3
        L1b:
            r7.zzd = r1
            long r3 = r7.zzf
            long r1 = r1 + r3
            long r3 = r7.zzc
            r5 = 32
            long r3 = r3 << r5
            long r1 = r1 + r3
            r7.zze = r1
        L28:
            return r0
    }
}
