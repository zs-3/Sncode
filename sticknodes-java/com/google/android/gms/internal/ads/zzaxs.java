package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxs extends com.google.android.gms.internal.ads.zzayc {
    private java.util.List zzh;
    private final android.content.Context zzi;

    public zzaxs(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13, android.content.Context r14) {
            r7 = this;
            java.lang.String r2 = "mh3tdFapbE/sJv8Vo+tGtSqGob+34XuR/yQkwrU1NOisAE1Jls0cSJi5Lk8Oid+3"
            java.lang.String r3 = "sgSNHgqJ9EwYu8w2dMx3zRGSIiO9D1spUgPO3F51srA="
            r6 = 31
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = 0
            r7.zzh = r8
            r7.zzi = r14
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r6 = this;
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd
            r1 = -1
            r0.zzW(r1)
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd
            r0.zzS(r1)
            android.content.Context r0 = r6.zzi
            if (r0 != 0) goto L16
            com.google.android.gms.internal.ads.zzawo r0 = r6.zza
            android.content.Context r0 = r0.zzb()
        L16:
            java.util.List r1 = r6.zzh
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2b
            java.lang.reflect.Method r1 = r6.zze
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r0
            java.lang.Object r0 = r1.invoke(r4, r5)
            java.util.List r0 = (java.util.List) r0
            r6.zzh = r0
        L2b:
            java.util.List r0 = r6.zzh
            if (r0 == 0) goto L60
            int r0 = r0.size()
            r1 = 2
            if (r0 != r1) goto L60
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasm r1 = r6.zzd     // Catch: java.lang.Throwable -> L5d
            java.util.List r4 = r6.zzh     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L5d
            long r4 = r2.longValue()     // Catch: java.lang.Throwable -> L5d
            r1.zzW(r4)     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.internal.ads.zzasm r1 = r6.zzd     // Catch: java.lang.Throwable -> L5d
            java.util.List r2 = r6.zzh     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> L5d
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L5d
            r1.zzS(r2)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5d
            throw r1
        L60:
            return
    }
}
