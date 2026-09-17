package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzabc implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
    private static final com.google.android.gms.internal.ads.zzabc zzb = null;
    public volatile long zza;
    private final android.os.Handler zzc;
    private final android.os.HandlerThread zzd;
    private android.view.Choreographer zze;
    private int zzf;

    static {
            com.google.android.gms.internal.ads.zzabc r0 = new com.google.android.gms.internal.ads.zzabc
            r0.<init>()
            com.google.android.gms.internal.ads.zzabc.zzb = r0
            return
    }

    private zzabc() {
            r2 = this;
            r2.<init>()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zza = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "ExoPlayer:FrameReleaseChoreographer"
            r0.<init>(r1)
            r2.zzd = r0
            r0.start()
            android.os.Looper r0 = r0.getLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r2)
            r2.zzc = r1
            r0 = 1
            r1.sendEmptyMessage(r0)
            return
    }

    public static com.google.android.gms.internal.ads.zzabc zza() {
            com.google.android.gms.internal.ads.zzabc r0 = com.google.android.gms.internal.ads.zzabc.zzb
            return r0
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r3) {
            r2 = this;
            r2.zza = r3
            android.view.Choreographer r3 = r2.zze
            java.util.Objects.requireNonNull(r3)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postFrameCallbackDelayed(r2, r0)
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r4) {
            r3 = this;
            int r4 = r4.what
            r0 = 1
            if (r4 == r0) goto L33
            r1 = 2
            if (r4 == r1) goto L24
            r1 = 3
            if (r4 == r1) goto Ld
            r4 = 0
            return r4
        Ld:
            android.view.Choreographer r4 = r3.zze
            if (r4 == 0) goto L23
            int r1 = r3.zzf
            int r1 = r1 + (-1)
            r3.zzf = r1
            if (r1 != 0) goto L23
            r4.removeFrameCallback(r3)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zza = r1
        L23:
            return r0
        L24:
            android.view.Choreographer r4 = r3.zze
            if (r4 == 0) goto L32
            int r1 = r3.zzf
            int r1 = r1 + r0
            r3.zzf = r1
            if (r1 != r0) goto L32
            r4.postFrameCallback(r3)
        L32:
            return r0
        L33:
            android.view.Choreographer r4 = android.view.Choreographer.getInstance()     // Catch: java.lang.RuntimeException -> L3a
            r3.zze = r4     // Catch: java.lang.RuntimeException -> L3a
            goto L42
        L3a:
            r4 = move-exception
            java.lang.String r1 = "VideoFrameReleaseHelper"
            java.lang.String r2 = "Vsync sampling disabled due to platform error"
            com.google.android.gms.internal.ads.zzea.zzg(r1, r2, r4)
        L42:
            return r0
    }

    public final void zzb() {
            r2 = this;
            android.os.Handler r0 = r2.zzc
            r1 = 2
            r0.sendEmptyMessage(r1)
            return
    }

    public final void zzc() {
            r2 = this;
            android.os.Handler r0 = r2.zzc
            r1 = 3
            r0.sendEmptyMessage(r1)
            return
    }
}
