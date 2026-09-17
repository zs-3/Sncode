package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzayc implements java.util.concurrent.Callable {
    protected final com.google.android.gms.internal.ads.zzawo zza;
    protected final java.lang.String zzb;
    protected final java.lang.String zzc;
    protected final com.google.android.gms.internal.ads.zzasm zzd;
    protected java.lang.reflect.Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzayc(com.google.android.gms.internal.ads.zzawo r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.internal.ads.zzasm r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zzf = r5
            r0.zzg = r6
            return
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            r1 = this;
            r1.zzk()
            r0 = 0
            return r0
    }

    protected abstract void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;

    public java.lang.Void zzk() throws java.lang.Exception {
            r10 = this;
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzawo r2 = r10.zza     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r10.zzb     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = r10.zzc     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Method r2 = r2.zzj(r3, r4)     // Catch: java.lang.Throwable -> L33
            r10.zze = r2     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L13
            goto L33
        L13:
            r10.zza()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzawo r2 = r10.zza     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzavh r3 = r2.zzd()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L33
            int r5 = r10.zzf     // Catch: java.lang.Throwable -> L33
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L33
            int r4 = r10.zzg     // Catch: java.lang.Throwable -> L33
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L33
            long r6 = r6 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            r8 = 0
            r9 = 0
            r3.zzc(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L33
        L33:
            r0 = 0
            return r0
    }
}
