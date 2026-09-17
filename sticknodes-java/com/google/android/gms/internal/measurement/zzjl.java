package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjl extends android.database.ContentObserver {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzjm zza;

    zzjl(com.google.android.gms.internal.measurement.zzjm r1, android.os.Handler r2) {
            r0 = this;
            r0.zza = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r1) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzjm r1 = r0.zza
            r1.zzf()
            return
    }
}
