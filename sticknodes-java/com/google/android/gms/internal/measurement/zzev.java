package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzev extends com.google.android.gms.internal.measurement.zzdd {
    private final com.google.android.gms.measurement.internal.zzkb zza;

    zzev(com.google.android.gms.measurement.internal.zzkb r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final int zze() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzkb r0 = r1.zza
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzde
    public final void zzf(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, long r10) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzkb r0 = r6.zza
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.interceptEvent(r1, r2, r3, r4)
            return
    }
}
