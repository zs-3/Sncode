package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgea extends com.google.android.gms.internal.ads.zzgfe implements java.lang.Runnable {
    com.google.common.util.concurrent.ListenableFuture zza;
    java.lang.Class zzb;
    java.lang.Object zzc;

    zzgea(com.google.common.util.concurrent.ListenableFuture r1, java.lang.Class r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r9.zza
            java.lang.Class r1 = r9.zzb
            java.lang.Object r2 = r9.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto La5
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L22
            goto La5
        L22:
            r3 = 0
            r9.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzggr     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzggr r4 = (com.google.android.gms.internal.ads.zzggr) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            java.lang.Throwable r4 = r4.zzl()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3a
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgfo.zzp(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L78
        L39:
            r4 = move-exception
        L3a:
            r5 = r3
            goto L78
        L3c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L76
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Future type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L76:
            r4 = r5
            goto L3a
        L78:
            if (r4 != 0) goto L7e
            r9.zzc(r5)
            return
        L7e:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto La2
            java.lang.Object r0 = r9.zze(r2, r4)     // Catch: java.lang.Throwable -> L90
            r9.zzb = r3
            r9.zzc = r3
            r9.zzf(r0)
            return
        L90:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzggg.zza(r0)     // Catch: java.lang.Throwable -> L9c
            r9.zzd(r0)     // Catch: java.lang.Throwable -> L9c
            r9.zzb = r3
            r9.zzc = r3
            return
        L9c:
            r0 = move-exception
            r9.zzb = r3
            r9.zzc = r3
            throw r0
        La2:
            r9.zzs(r0)
        La5:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final java.lang.String zza() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r6.zza
            java.lang.Class r1 = r6.zzb
            java.lang.Object r2 = r6.zzc
            java.lang.String r3 = super.zza()
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "inputFuture=["
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = "], "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L29
        L27:
            java.lang.String r0 = ""
        L29:
            if (r1 == 0) goto L58
            if (r2 != 0) goto L2e
            goto L58
        L2e:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "exceptionType=["
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "], fallback=["
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L58:
            if (r3 == 0) goto L5f
            java.lang.String r0 = r0.concat(r3)
            return r0
        L5f:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final void zzb() {
            r1 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zza
            r1.zzr(r0)
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzc = r0
            return
    }

    abstract java.lang.Object zze(java.lang.Object r1, java.lang.Throwable r2) throws java.lang.Exception;

    abstract void zzf(java.lang.Object r1);
}
