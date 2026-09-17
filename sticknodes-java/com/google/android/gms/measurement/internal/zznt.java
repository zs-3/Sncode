package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zza;

    zznt(com.google.android.gms.measurement.internal.zznx r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.zznx r0 = r4.zza
            com.google.android.gms.measurement.internal.zzny r0 = r0.zza
            android.content.ComponentName r1 = new android.content.ComponentName
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            android.content.Context r3 = r2.zzaT()
            r2.zzaV()
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r3, r2)
            com.google.android.gms.measurement.internal.zzny.zzx(r0, r1)
            return
    }
}
