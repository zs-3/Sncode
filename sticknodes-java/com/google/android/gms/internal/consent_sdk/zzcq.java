package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzcq implements java.util.concurrent.Executor {
    private final java.util.concurrent.atomic.AtomicInteger zza;
    private final java.util.concurrent.ThreadPoolExecutor zzb;
    private java.lang.ref.WeakReference zzc;

    zzcq(java.lang.String r11) {
            r10 = this;
            r10.<init>()
            java.util.concurrent.atomic.AtomicInteger r11 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 1
            r11.<init>(r0)
            r10.zza = r11
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            r1 = 0
            r11.<init>(r1)
            r10.zzc = r11
            com.google.android.gms.internal.consent_sdk.zzcp r9 = new com.google.android.gms.internal.consent_sdk.zzcp
            java.lang.String r11 = "Google consent worker"
            r9.<init>(r10, r11)
            java.util.concurrent.ThreadPoolExecutor r11 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            r3 = 1
            r4 = 1
            r5 = 30
            r2 = r11
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r10.zzb = r11
            r11.allowCoreThreadTimeOut(r0)
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ref.WeakReference r1 = r2.zzc
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L10
            r3.run()
            return
        L10:
            java.util.concurrent.ThreadPoolExecutor r0 = r2.zzb
            r0.execute(r3)
            return
    }

    final /* synthetic */ java.lang.Thread zza(java.lang.String r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r4 = r3.zza
            java.lang.Thread r0 = new java.lang.Thread
            int r4 = r4.getAndIncrement()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google consent worker #"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r5, r4)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r0)
            r3.zzc = r4
            return r0
    }
}
