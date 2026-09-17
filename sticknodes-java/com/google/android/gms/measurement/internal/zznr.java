package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznr implements java.lang.Runnable {
    final /* synthetic */ android.content.ComponentName zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzb;

    zznr(com.google.android.gms.measurement.internal.zznx r1, android.content.ComponentName r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.measurement.internal.zznx r0 = r2.zzb
            com.google.android.gms.measurement.internal.zzny r0 = r0.zza
            android.content.ComponentName r1 = r2.zza
            com.google.android.gms.measurement.internal.zzny.zzx(r0, r1)
            return
    }
}
