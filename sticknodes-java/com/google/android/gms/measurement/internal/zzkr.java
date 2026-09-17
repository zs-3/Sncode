package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzkr extends com.google.android.gms.measurement.internal.zzaz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zza;

    zzkr(com.google.android.gms.measurement.internal.zzlw r1, com.google.android.gms.measurement.internal.zzjs r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
            r3 = this;
            java.lang.Thread r0 = new java.lang.Thread
            com.google.android.gms.measurement.internal.zzlw r1 = r3.zza
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzlw r1 = r1.zzq()
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.measurement.internal.zzkq r2 = new com.google.android.gms.measurement.internal.zzkq
            r2.<init>(r1)
            r0.<init>(r2)
            r0.start()
            return
    }
}
