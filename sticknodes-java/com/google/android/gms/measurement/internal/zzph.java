package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzph {
    private final java.lang.String zza;
    private final java.util.Map zzb;
    private final com.google.android.gms.measurement.internal.zzmf zzc;
    private final com.google.android.gms.internal.measurement.zzim zzd;

    zzph(java.lang.String r1, java.util.Map r2, com.google.android.gms.measurement.internal.zzmf r3, com.google.android.gms.internal.measurement.zzim r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final com.google.android.gms.measurement.internal.zzmf zza() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzmf r0 = r1.zzc
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzim zzb() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzim r0 = r1.zzd
            return r0
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.util.Map zzd() {
            r1 = this;
            java.util.Map r0 = r1.zzb
            if (r0 != 0) goto L8
            java.util.Map r0 = java.util.Collections.emptyMap()
        L8:
            return r0
    }
}
