package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbo {
    private static com.google.android.gms.internal.ads.zzaqf zza;
    private static final java.lang.Object zzb = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.ads.internal.util.zzbo.zzb = r0
            return
    }

    public zzbo(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
        Ld:
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.zzbo.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzaqf r1 = com.google.android.gms.ads.internal.util.zzbo.zza     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3b
            com.google.android.gms.internal.ads.zzbcv.zza(r4)     // Catch: java.lang.Throwable -> L3d
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L34
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzeo     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L34
            com.google.android.gms.internal.ads.zzaqf r4 = com.google.android.gms.ads.internal.util.zzaz.zzb(r4)     // Catch: java.lang.Throwable -> L3d
            goto L39
        L34:
            r1 = 0
            com.google.android.gms.internal.ads.zzaqf r4 = com.google.android.gms.internal.ads.zzarj.zza(r4, r1)     // Catch: java.lang.Throwable -> L3d
        L39:
            com.google.android.gms.ads.internal.util.zzbo.zza = r4     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.String r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzcas r0 = new com.google.android.gms.internal.ads.zzcas
            r0.<init>()
            com.google.android.gms.internal.ads.zzaqf r1 = com.google.android.gms.ads.internal.util.zzbo.zza
            com.google.android.gms.ads.internal.util.zzbn r2 = new com.google.android.gms.ads.internal.util.zzbn
            r3 = 0
            r2.<init>(r5, r3, r0)
            r1.zza(r2)
            return r0
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(int r15, java.lang.String r16, java.util.Map r17, byte[] r18) {
            r14 = this;
            r0 = r16
            com.google.android.gms.ads.internal.util.zzbl r10 = new com.google.android.gms.ads.internal.util.zzbl
            r1 = 0
            r10.<init>(r1)
            com.google.android.gms.ads.internal.util.zzbi r6 = new com.google.android.gms.ads.internal.util.zzbi
            r11 = r14
            r6.<init>(r14, r0, r10)
            com.google.android.gms.ads.internal.util.client.zzl r12 = new com.google.android.gms.ads.internal.util.client.zzl
            r12.<init>(r1)
            com.google.android.gms.ads.internal.util.zzbj r13 = new com.google.android.gms.ads.internal.util.zzbj
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r10
            r7 = r18
            r8 = r17
            r9 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = com.google.android.gms.ads.internal.util.client.zzl.zzk()
            if (r1 == 0) goto L3f
            java.lang.String r1 = "GET"
            java.util.Map r2 = r13.zzl()     // Catch: com.google.android.gms.internal.ads.zzapk -> L37
            byte[] r3 = r13.zzx()     // Catch: com.google.android.gms.internal.ads.zzapk -> L37
            r12.zzd(r0, r1, r2, r3)     // Catch: com.google.android.gms.internal.ads.zzapk -> L37
            goto L3f
        L37:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L3f:
            com.google.android.gms.internal.ads.zzaqf r0 = com.google.android.gms.ads.internal.util.zzbo.zza
            r0.zza(r13)
            return r10
    }
}
