package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzbb extends com.google.android.gms.measurement.internal.zzjr {
    private long zza;
    private java.lang.String zzb;

    zzbb(com.google.android.gms.measurement.internal.zzio r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final long zza() {
            r2 = this;
            r2.zzv()
            long r0 = r2.zza
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            r1.zzv()
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
            r4 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            r2 = 15
            int r2 = r0.get(r2)
            r3 = 16
            int r0 = r0.get(r3)
            int r2 = r2 + r0
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r1.convert(r2, r0)
            r4.zza = r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r0.getLanguage()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r0 = r0.getCountry()
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "-"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.zzb = r0
            r0 = 0
            return r0
    }
}
