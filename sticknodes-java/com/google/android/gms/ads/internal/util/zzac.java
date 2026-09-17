package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzac {
    private boolean zza;
    private float zzb;

    public zzac() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.zzb = r0
            return
    }

    public static float zzb(android.content.Context r2) {
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            if (r2 != 0) goto Lb
            goto L1a
        Lb:
            r0 = 3
            int r1 = r2.getStreamMaxVolume(r0)
            int r2 = r2.getStreamVolume(r0)
            if (r1 == 0) goto L1a
            float r2 = (float) r2
            float r0 = (float) r1
            float r2 = r2 / r0
            return r2
        L1a:
            r2 = 0
            return r2
    }

    private final synchronized boolean zzf() {
            r2 = this;
            monitor-enter(r2)
            float r0 = r2.zzb     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Lb
            r0 = 1
        L9:
            monitor-exit(r2)
            return r0
        Lb:
            r0 = 0
            goto L9
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized float zza() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzf()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lb
            float r0 = r1.zzb     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lb:
            r0 = 1065353216(0x3f800000, float:1.0)
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzc(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zza = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzd(float r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzb = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized boolean zze() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zza     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
