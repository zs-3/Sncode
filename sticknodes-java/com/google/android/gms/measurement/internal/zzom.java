package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzom extends com.google.android.gms.measurement.internal.zzaz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzon zza;

    zzom(com.google.android.gms.measurement.internal.zzon r1, com.google.android.gms.measurement.internal.zzjs r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzon r0 = r6.zza
            com.google.android.gms.measurement.internal.zzop r1 = r0.zzc
            r1.zzg()
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.common.util.Clock r3 = r2.zzaU()
            long r3 = r3.elapsedRealtime()
            r5 = 0
            r0.zzd(r5, r5, r3)
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzd r0 = r0.zzd()
            com.google.android.gms.common.util.Clock r1 = r2.zzaU()
            long r1 = r1.elapsedRealtime()
            r0.zzf(r1)
            return
    }
}
