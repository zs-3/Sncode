package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaav extends android.view.Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final com.google.android.gms.internal.ads.zzaat zzd;
    private boolean zze;

    /* synthetic */ zzaav(com.google.android.gms.internal.ads.zzaat r1, android.graphics.SurfaceTexture r2, boolean r3, com.google.android.gms.internal.ads.zzaau r4) {
            r0 = this;
            r0.<init>(r2)
            r0.zzd = r1
            r0.zza = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzaav zza(android.content.Context r2, boolean r3) {
            r0 = 0
            r1 = 1
            if (r3 == 0) goto Lc
            boolean r2 = zzb(r2)
            if (r2 == 0) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            com.google.android.gms.internal.ads.zzdi.zzf(r1)
            com.google.android.gms.internal.ads.zzaat r2 = new com.google.android.gms.internal.ads.zzaat
            r2.<init>()
            if (r3 == 0) goto L18
            int r0 = com.google.android.gms.internal.ads.zzaav.zzb
        L18:
            com.google.android.gms.internal.ads.zzaav r2 = r2.zza(r0)
            return r2
    }

    public static synchronized boolean zzb(android.content.Context r4) {
            java.lang.Class<com.google.android.gms.internal.ads.zzaav> r0 = com.google.android.gms.internal.ads.zzaav.class
            monitor-enter(r0)
            boolean r1 = com.google.android.gms.internal.ads.zzaav.zzc     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1e
            boolean r4 = com.google.android.gms.internal.ads.zzdr.zzb(r4)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L19
            boolean r4 = com.google.android.gms.internal.ads.zzdr.zzc()     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L17
            r4 = 1
            goto L1a
        L17:
            r4 = 2
            goto L1a
        L19:
            r4 = 0
        L1a:
            com.google.android.gms.internal.ads.zzaav.zzb = r4     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzaav.zzc = r3     // Catch: java.lang.Throwable -> L25
        L1e:
            int r4 = com.google.android.gms.internal.ads.zzaav.zzb     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            if (r4 == 0) goto L24
            return r3
        L24:
            return r2
        L25:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // android.view.Surface
    public final void release() {
            r2 = this;
            super.release()
            com.google.android.gms.internal.ads.zzaat r0 = r2.zzd
            monitor-enter(r0)
            boolean r1 = r2.zze     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.google.android.gms.internal.ads.zzaat r1 = r2.zzd     // Catch: java.lang.Throwable -> L14
            r1.zzb()     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r2.zze = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }
}
