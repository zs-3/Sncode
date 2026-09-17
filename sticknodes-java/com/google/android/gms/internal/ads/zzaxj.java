package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxj extends com.google.android.gms.internal.ads.zzayc {
    private final java.util.Map zzh;
    private final android.view.View zzi;
    private final android.content.Context zzj;

    public zzaxj(com.google.android.gms.internal.ads.zzawo r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.internal.ads.zzasm r12, int r13, int r14, java.util.Map r15, android.view.View r16, android.content.Context r17) {
            r8 = this;
            r7 = r8
            java.lang.String r2 = "8HOKLqLOucCjn3kWyyKimNsF6Dcutdd9y3ap015kDIWZNsgYbLJqzHSzKo+jDSQ4"
            java.lang.String r3 = "ikPkuPQbpnIYaQGo6Ao4zzPX0Qaf9HhmEZeT4ZfFQOg="
            r6 = 85
            r0 = r8
            r1 = r9
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r15
            r7.zzh = r0
            r0 = r16
            r7.zzi = r0
            r0 = r17
            r7.zzj = r0
            return
    }

    private final long zzc(int r3) {
            r2 = this;
            java.util.Map r0 = r2.zzh
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L19
            java.util.Map r0 = r2.zzh
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            return r0
        L19:
            r0 = -9223372036854775808
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r10 = this;
            r0 = 2
            long[] r1 = new long[r0]
            r2 = 1
            long r3 = r10.zzc(r2)
            r5 = 0
            r1[r5] = r3
            long r3 = r10.zzc(r0)
            r1[r2] = r3
            android.content.Context r3 = r10.zzj
            if (r3 != 0) goto L1b
            com.google.android.gms.internal.ads.zzawo r3 = r10.zza
            android.content.Context r3 = r3.zzb()
        L1b:
            java.lang.reflect.Method r4 = r10.zze
            r6 = 0
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r5] = r1
            r8[r2] = r3
            android.view.View r1 = r10.zzi
            r8[r0] = r1
            java.lang.Object r1 = r4.invoke(r6, r8)
            long[] r1 = (long[]) r1
            r3 = r1[r5]
            java.util.Map r5 = r10.zzh
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = r1[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r5.put(r6, r2)
            r5 = r1[r0]
            java.util.Map r2 = r10.zzh
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = r1[r7]
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r2.put(r0, r1)
            com.google.android.gms.internal.ads.zzasm r0 = r10.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasm r1 = r10.zzd     // Catch: java.lang.Throwable -> L60
            r1.zzv(r3)     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.internal.ads.zzasm r1 = r10.zzd     // Catch: java.lang.Throwable -> L60
            r1.zzu(r5)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            return
        L60:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r1
    }
}
