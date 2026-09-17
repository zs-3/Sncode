package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzkd implements com.google.android.gms.measurement.internal.zzgw {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzio zza;

    zzkd(com.google.android.gms.measurement.internal.zzke r1, com.google.android.gms.measurement.internal.zzio r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final boolean zza() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zza
            boolean r1 = r0.zzL()
            if (r1 == 0) goto L19
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            java.lang.String r0 = r0.zzr()
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L19
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
    }
}
