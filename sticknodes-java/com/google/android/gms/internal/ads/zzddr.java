package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzddr {
    protected final java.util.Map zza;

    protected zzddr(java.util.Set r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            r1.zzp(r2)
            return
    }

    public final synchronized void zzk(com.google.android.gms.internal.ads.zzdfs r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r2.zza     // Catch: java.lang.Throwable -> La
            java.util.concurrent.Executor r2 = r2.zzb     // Catch: java.lang.Throwable -> La
            r1.zzo(r0, r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzo(java.lang.Object r2, java.util.concurrent.Executor r3) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zza     // Catch: java.lang.Throwable -> L8
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzp(java.util.Set r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L17
        L5:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L15
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.zzdfs r0 = (com.google.android.gms.internal.ads.zzdfs) r0     // Catch: java.lang.Throwable -> L17
            r1.zzk(r0)     // Catch: java.lang.Throwable -> L17
            goto L5
        L15:
            monitor-exit(r1)
            return
        L17:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    protected final synchronized void zzq(com.google.android.gms.internal.ads.zzddq r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r4.zza     // Catch: java.lang.Throwable -> L2c
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2c
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzddp r3 = new com.google.android.gms.internal.ads.zzddp     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r5, r2)     // Catch: java.lang.Throwable -> L2c
            r1.execute(r3)     // Catch: java.lang.Throwable -> L2c
            goto Lb
        L2a:
            monitor-exit(r4)
            return
        L2c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
