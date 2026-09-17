package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzkf {
    final android.net.Uri zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final boolean zzd;
    final boolean zze;

    public zzkf(android.net.Uri r11) {
            r10 = this;
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private zzkf(java.lang.String r1, android.net.Uri r2, java.lang.String r3, java.lang.String r4, boolean r5, boolean r6, boolean r7, boolean r8, com.google.common.base.Function r9) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            java.lang.String r1 = ""
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r5
            r0.zze = r7
            return
    }

    public final com.google.android.gms.internal.measurement.zzkf zza() {
            r11 = this;
            android.net.Uri r2 = r11.zza
            java.lang.String r3 = r11.zzb
            java.lang.String r4 = r11.zzc
            boolean r5 = r11.zzd
            com.google.android.gms.internal.measurement.zzkf r10 = new com.google.android.gms.internal.measurement.zzkf
            r1 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public final com.google.android.gms.internal.measurement.zzkf zzb() {
            r11 = this;
            java.lang.String r3 = r11.zzb
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1a
            android.net.Uri r2 = r11.zza
            java.lang.String r4 = r11.zzc
            boolean r7 = r11.zze
            com.google.android.gms.internal.measurement.zzkf r10 = new com.google.android.gms.internal.measurement.zzkf
            r1 = 0
            r5 = 1
            r6 = 0
            r8 = 0
            r9 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot set GServices prefix and skip GServices"
            r0.<init>(r1)
            throw r0
    }

    public final com.google.android.gms.internal.measurement.zzki zzc(java.lang.String r2, double r3) {
            r1 = this;
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            int r3 = com.google.android.gms.internal.measurement.zzki.zzc
            com.google.android.gms.internal.measurement.zzkd r3 = new com.google.android.gms.internal.measurement.zzkd
            java.lang.String r4 = "measurement.test.double_flag"
            r0 = 1
            r3.<init>(r1, r4, r2, r0)
            return r3
    }

    public final com.google.android.gms.internal.measurement.zzki zzd(java.lang.String r2, long r3) {
            r1 = this;
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            int r4 = com.google.android.gms.internal.measurement.zzki.zzc
            com.google.android.gms.internal.measurement.zzkb r4 = new com.google.android.gms.internal.measurement.zzkb
            r0 = 1
            r4.<init>(r1, r2, r3, r0)
            return r4
    }

    public final com.google.android.gms.internal.measurement.zzki zze(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = com.google.android.gms.internal.measurement.zzki.zzc
            com.google.android.gms.internal.measurement.zzke r0 = new com.google.android.gms.internal.measurement.zzke
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzki zzf(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            int r0 = com.google.android.gms.internal.measurement.zzki.zzc
            com.google.android.gms.internal.measurement.zzkc r0 = new com.google.android.gms.internal.measurement.zzkc
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            return r0
    }
}
