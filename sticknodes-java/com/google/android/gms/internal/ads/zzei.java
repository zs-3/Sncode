package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzei {
    private static com.google.android.gms.internal.ads.zzei zza;
    private final android.os.Handler zzb;
    private final java.util.concurrent.CopyOnWriteArrayList zzc;
    private final java.lang.Object zzd;
    private int zze;

    private zzei(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r3.zzb = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.zzc = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzd = r0
            r0 = 0
            r3.zze = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.addAction(r1)
            com.google.android.gms.internal.ads.zzeh r1 = new com.google.android.gms.internal.ads.zzeh
            r2 = 0
            r1.<init>(r3, r2)
            r4.registerReceiver(r1, r0)
            return
    }

    public static synchronized com.google.android.gms.internal.ads.zzei zzb(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.internal.ads.zzei> r0 = com.google.android.gms.internal.ads.zzei.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzei r1 = com.google.android.gms.internal.ads.zzei.zza     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.gms.internal.ads.zzei r1 = new com.google.android.gms.internal.ads.zzei     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzei.zza = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.gms.internal.ads.zzei r2 = com.google.android.gms.internal.ads.zzei.zza     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    static /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzei r3, int r4) {
            java.lang.Object r0 = r3.zzd
            monitor-enter(r0)
            int r1 = r3.zze     // Catch: java.lang.Throwable -> L33
            if (r1 != r4) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L9:
            r3.zze = r4     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.zzc
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.google.android.gms.internal.ads.zzzb r2 = (com.google.android.gms.internal.ads.zzzb) r2
            if (r2 == 0) goto L2c
            com.google.android.gms.internal.ads.zzzd r1 = r2.zza
            com.google.android.gms.internal.ads.zzzd.zzi(r1, r4)
            goto L12
        L2c:
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.zzc
            r2.remove(r1)
            goto L12
        L32:
            return
        L33:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
    }

    public final int zza() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            int r1 = r2.zze     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final void zzd(com.google.android.gms.internal.ads.zzzb r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.zzc
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            if (r2 != 0) goto L6
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.zzc
            r2.remove(r1)
            goto L6
        L1e:
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.zzc
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.add(r1)
            android.os.Handler r0 = r3.zzb
            com.google.android.gms.internal.ads.zzee r1 = new com.google.android.gms.internal.ads.zzee
            r1.<init>(r3, r4)
            r0.post(r1)
            return
    }
}
