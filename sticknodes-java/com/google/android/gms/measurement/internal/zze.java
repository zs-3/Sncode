package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zze {
    private final com.google.android.gms.measurement.internal.zzju zza;

    zze(com.google.android.gms.measurement.internal.zzju r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static com.google.android.gms.measurement.internal.zze zza(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L18
            int r0 = r2.length()
            r1 = 1
            if (r0 <= r1) goto Le
            goto L18
        Le:
            r0 = 0
            char r2 = r2.charAt(r0)
            com.google.android.gms.measurement.internal.zzju r2 = com.google.android.gms.measurement.internal.zzjx.zzg(r2)
            goto L1a
        L18:
            com.google.android.gms.measurement.internal.zzju r2 = com.google.android.gms.measurement.internal.zzju.zza
        L1a:
            com.google.android.gms.measurement.internal.zze r0 = new com.google.android.gms.measurement.internal.zze
            r0.<init>(r2)
            return r0
    }

    final com.google.android.gms.measurement.internal.zzju zzb() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzju r0 = r1.zza
            return r0
    }

    final java.lang.String zzc() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzju r0 = r1.zza
            char r0 = com.google.android.gms.measurement.internal.zzjx.zza(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
