package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzawx {
    private static final java.lang.String[] zza = null;
    private long zzb;
    private long zzc;
    private long zzd;
    private boolean zze;

    static {
            java.lang.String r0 = "android:establish_vpn_service"
            java.lang.String r1 = "android:establish_vpn_manager"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.internal.ads.zzawx.zza = r0
            return
    }

    zzawx(android.content.Context r3, java.util.concurrent.Executor r4, java.lang.String[] r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzb = r0
            r2.zzc = r0
            r0 = -1
            r2.zzd = r0
            r0 = 0
            r2.zze = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L17
            return
        L17:
            com.google.android.gms.internal.ads.zzaww r0 = new com.google.android.gms.internal.ads.zzaww
            r0.<init>(r2)
            java.lang.String r1 = "appops"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L27
            android.app.AppOpsManager r3 = (android.app.AppOpsManager) r3     // Catch: java.lang.Throwable -> L27
            r3.startWatchingActive(r5, r4, r0)     // Catch: java.lang.Throwable -> L27
        L27:
            return
    }

    static /* bridge */ /* synthetic */ long zza(com.google.android.gms.internal.ads.zzawx r2) {
            long r0 = r2.zzc
            return r0
    }

    public static com.google.android.gms.internal.ads.zzawx zzd(android.content.Context r2, java.util.concurrent.Executor r3) {
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzawx.zza
            com.google.android.gms.internal.ads.zzawx r1 = new com.google.android.gms.internal.ads.zzawx
            r1.<init>(r2, r3, r0)
            return r1
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzawx r0, long r1) {
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzawx r0, boolean r1) {
            r0.zze = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzawx r0, long r1) {
            r0.zzb = r1
            return
    }

    public final long zzb() {
            r4 = this;
            long r0 = r4.zzd
            r2 = -1
            r4.zzd = r2
            return r0
    }

    public final long zzc() {
            r4 = this;
            boolean r0 = r4.zze
            if (r0 == 0) goto La
            long r0 = r4.zzc
            long r2 = r4.zzb
            long r0 = r0 - r2
            return r0
        La:
            r0 = -1
            return r0
    }

    public final void zzh() {
            r2 = this;
            boolean r0 = r2.zze
            if (r0 == 0) goto La
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzc = r0
        La:
            return
    }
}
