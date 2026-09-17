package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjf extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzjh zza;

    zzjf(com.google.android.gms.internal.measurement.zzjh r1, android.os.Handler r2) {
            r0 = this;
            r0.zza = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzjh r2 = r1.zza
            java.util.concurrent.atomic.AtomicBoolean r2 = com.google.android.gms.internal.measurement.zzjh.zzb(r2)
            r0 = 1
            r2.set(r0)
            return
    }
}
