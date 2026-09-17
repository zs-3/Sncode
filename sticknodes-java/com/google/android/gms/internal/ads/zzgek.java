package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgek extends com.google.android.gms.internal.ads.zzgfe implements java.lang.Runnable {
    public static final /* synthetic */ int zzc = 0;
    com.google.common.util.concurrent.ListenableFuture zza;
    java.lang.Object zzb;

    zzgek(com.google.common.util.concurrent.ListenableFuture r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r6.zza
            java.lang.Object r1 = r6.zzb
            boolean r2 = r6.isCancelled()
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Le
            r5 = 1
            goto Lf
        Le:
            r5 = 0
        Lf:
            r2 = r2 | r5
            if (r1 != 0) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            r2 = r2 | r3
            if (r2 == 0) goto L18
            return
        L18:
            r2 = 0
            r6.zza = r2
            boolean r3 = r0.isCancelled()
            if (r3 == 0) goto L25
            r6.zzs(r0)
            return
        L25:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgfo.zzp(r0)     // Catch: java.lang.Error -> L41 java.lang.Exception -> L46 java.util.concurrent.ExecutionException -> L4b java.util.concurrent.CancellationException -> L54
            java.lang.Object r0 = r6.zze(r1, r0)     // Catch: java.lang.Throwable -> L33
            r6.zzb = r2
            r6.zzf(r0)
            return
        L33:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzggg.zza(r0)     // Catch: java.lang.Throwable -> L3d
            r6.zzd(r0)     // Catch: java.lang.Throwable -> L3d
            r6.zzb = r2
            return
        L3d:
            r0 = move-exception
            r6.zzb = r2
            throw r0
        L41:
            r0 = move-exception
            r6.zzd(r0)
            return
        L46:
            r0 = move-exception
            r6.zzd(r0)
            return
        L4b:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            r6.zzd(r0)
            return
        L54:
            r6.cancel(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final java.lang.String zza() {
            r5 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r5.zza
            java.lang.Object r1 = r5.zzb
            java.lang.String r2 = super.zza()
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "inputFuture=["
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "], "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L27
        L25:
            java.lang.String r0 = ""
        L27:
            if (r1 == 0) goto L47
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "function=["
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L47:
            if (r2 == 0) goto L4e
            java.lang.String r0 = r0.concat(r2)
            return r0
        L4e:
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
            return
    }

    abstract java.lang.Object zze(java.lang.Object r1, java.lang.Object r2) throws java.lang.Exception;

    abstract void zzf(java.lang.Object r1);
}
