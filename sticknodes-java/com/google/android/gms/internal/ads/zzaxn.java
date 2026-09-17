package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxn extends com.google.android.gms.internal.ads.zzayc {
    private final com.google.android.gms.internal.ads.zzavr zzh;
    private final long zzi;
    private final long zzj;

    public zzaxn(com.google.android.gms.internal.ads.zzawo r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.internal.ads.zzasm r12, int r13, int r14, com.google.android.gms.internal.ads.zzavr r15, long r16, long r18) {
            r8 = this;
            r7 = r8
            java.lang.String r2 = "AFi1XUlQ2wB7zUl3EOk1zuEn8ZOxUh72pRw/0ERKEaN1JtcMwtQuK14gG9CY64a/"
            java.lang.String r3 = "Q54q2JslusSv8X8AsH7nKgnoWyF6GsnL4uj/9o5E5cc="
            r6 = 11
            r0 = r8
            r1 = r9
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r15
            r7.zzh = r0
            r0 = r16
            r7.zzi = r0
            r0 = r18
            r7.zzj = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r8 = this;
            com.google.android.gms.internal.ads.zzavr r0 = r8.zzh
            if (r0 == 0) goto L6d
            java.lang.reflect.Method r1 = r8.zze
            r2 = 0
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            android.net.NetworkCapabilities r0 = r0.zzb()
            r3[r4] = r0
            r0 = 1
            long r4 = r8.zzi
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r0] = r4
            r0 = 2
            long r4 = r8.zzj
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r0] = r4
            java.lang.Object r0 = r1.invoke(r2, r3)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.ads.zzavp r1 = new com.google.android.gms.internal.ads.zzavp
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzasm r0 = r8.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasm r2 = r8.zzd     // Catch: java.lang.Throwable -> L6a
            java.lang.Long r3 = r1.zza     // Catch: java.lang.Throwable -> L6a
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L6a
            r2.zzz(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.Long r2 = r1.zzb     // Catch: java.lang.Throwable -> L6a
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L6a
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L53
            com.google.android.gms.internal.ads.zzasm r2 = r8.zzd     // Catch: java.lang.Throwable -> L6a
            java.lang.Long r3 = r1.zzb     // Catch: java.lang.Throwable -> L6a
            long r6 = r3.longValue()     // Catch: java.lang.Throwable -> L6a
            r2.zzQ(r6)     // Catch: java.lang.Throwable -> L6a
        L53:
            java.lang.Long r2 = r1.zzc     // Catch: java.lang.Throwable -> L6a
            long r2 = r2.longValue()     // Catch: java.lang.Throwable -> L6a
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L68
            com.google.android.gms.internal.ads.zzasm r2 = r8.zzd     // Catch: java.lang.Throwable -> L6a
            java.lang.Long r1 = r1.zzc     // Catch: java.lang.Throwable -> L6a
            long r3 = r1.longValue()     // Catch: java.lang.Throwable -> L6a
            r2.zzf(r3)     // Catch: java.lang.Throwable -> L6a
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            return
        L6a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r1
        L6d:
            return
    }
}
