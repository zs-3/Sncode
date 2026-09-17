package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzapr implements java.util.concurrent.Executor {
    final /* synthetic */ android.os.Handler zza;

    zzapr(com.google.android.gms.internal.ads.zzapt r1, android.os.Handler r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.zza
            r0.post(r2)
            return
    }
}
