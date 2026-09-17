package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcak implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    zzcak() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.ads.internal.util.zzf r0 = new com.google.android.gms.ads.internal.util.zzf
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r3) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L22
            r3.run()     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.Context r0 = r0.zzd()
            com.google.android.gms.ads.internal.util.zzt.zzM(r0, r3)
            throw r3
        L22:
            android.os.Handler r0 = r2.zza
            r0.post(r3)
            return
    }
}
