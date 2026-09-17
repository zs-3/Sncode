package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzay implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjs zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzaz zzb;

    zzay(com.google.android.gms.measurement.internal.zzaz r1, com.google.android.gms.measurement.internal.zzjs r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzjs r0 = r4.zza
            r0.zzaV()
            boolean r1 = com.google.android.gms.measurement.internal.zzaf.zza()
            if (r1 == 0) goto L13
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            r0.zzq(r4)
            return
        L13:
            com.google.android.gms.measurement.internal.zzaz r0 = r4.zzb
            boolean r1 = r0.zze()
            r2 = 0
            com.google.android.gms.measurement.internal.zzaz.zza(r0, r2)
            if (r1 == 0) goto L23
            r0.zzc()
        L23:
            return
    }
}
