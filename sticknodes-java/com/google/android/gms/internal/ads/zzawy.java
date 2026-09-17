package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzawy extends com.google.android.gms.internal.ads.zzayc {
    private final android.app.Activity zzh;
    private final android.view.View zzi;

    public zzawy(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13, android.view.View r14, android.app.Activity r15) {
            r7 = this;
            java.lang.String r2 = "3ikNbWzMTIqU222KtrzzFiiUcpXtNPU8upxs9wXDAJYxbW4sx23+rx4eBiJjRteZ"
            java.lang.String r3 = "TdQDsqdcAU8jyTN6NihYJULAUxAJpTfNWWUTPnMXLns="
            r6 = 62
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zzi = r14
            r7.zzh = r15
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r8 = this;
            android.view.View r0 = r8.zzi
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcF
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.reflect.Method r1 = r8.zze
            android.view.View r2 = r8.zzi
            r3 = 0
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r2
            android.app.Activity r2 = r8.zzh
            r6 = 1
            r4[r6] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r7 = 2
            r4[r7] = r2
            java.lang.Object r1 = r1.invoke(r3, r4)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            com.google.android.gms.internal.ads.zzasm r2 = r8.zzd
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzasm r3 = r8.zzd     // Catch: java.lang.Throwable -> L5c
            r4 = r1[r5]     // Catch: java.lang.Throwable -> L5c
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L5c
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            r3.zzc(r4)     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.zzasm r3 = r8.zzd     // Catch: java.lang.Throwable -> L5c
            r4 = r1[r6]     // Catch: java.lang.Throwable -> L5c
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L5c
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L5c
            r3.zze(r4)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5a
            com.google.android.gms.internal.ads.zzasm r0 = r8.zzd     // Catch: java.lang.Throwable -> L5c
            r1 = r1[r7]     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5c
            r0.zzd(r1)     // Catch: java.lang.Throwable -> L5c
        L5a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5c
            return
        L5c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5c
            throw r0
    }
}
