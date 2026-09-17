package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzks implements java.util.concurrent.Executor {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zza;

    zzks(com.google.android.gms.measurement.internal.zzlw r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r1.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            r0.zzq(r2)
            return
    }
}
