package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public abstract class zzfn {
    private final android.os.Handler zza;
    final java.lang.Object zzb;
    private boolean zzc;
    private final java.util.HashMap zzd;

    public zzfn(android.os.Looper r1, int r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.zzb = r2
            com.google.android.gms.internal.games.zzfu r2 = new com.google.android.gms.internal.games.zzfu
            r2.<init>(r1)
            r0.zza = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.games.zzfn r2) {
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            r1 = 0
            r2.zzc = r1     // Catch: java.lang.Throwable -> Lb
            r2.zzd()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    protected abstract void zza(java.lang.String r1, int r2);

    public final void zzc(java.lang.String r6, int r7) {
            r5 = this;
            java.lang.Object r0 = r5.zzb
            monitor-enter(r0)
            boolean r1 = r5.zzc     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L16
            r1 = 1
            r5.zzc = r1     // Catch: java.lang.Throwable -> L2f
            android.os.Handler r1 = r5.zza     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.games.zzfm r2 = new com.google.android.gms.internal.games.zzfm     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2f
            r3 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r2, r3)     // Catch: java.lang.Throwable -> L2f
        L16:
            java.util.HashMap r1 = r5.zzd     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2a
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.util.HashMap r2 = r5.zzd     // Catch: java.lang.Throwable -> L2f
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L2f
        L2a:
            r1.addAndGet(r7)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r6
    }

    public final void zzd() {
            r4 = this;
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            java.util.HashMap r1 = r4.zzd     // Catch: java.lang.Throwable -> L34
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L34
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L34
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L34
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L34
            r4.zza(r3, r2)     // Catch: java.lang.Throwable -> L34
            goto Ld
        L2d:
            java.util.HashMap r1 = r4.zzd     // Catch: java.lang.Throwable -> L34
            r1.clear()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r1
    }
}
