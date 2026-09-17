package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzon {
    protected long zza;
    protected long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzop zzc;
    private final com.google.android.gms.measurement.internal.zzaz zzd;

    public zzon(com.google.android.gms.measurement.internal.zzop r3) {
            r2 = this;
            r2.zzc = r3
            r2.<init>()
            com.google.android.gms.measurement.internal.zzom r0 = new com.google.android.gms.measurement.internal.zzom
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            r0.<init>(r2, r1)
            r2.zzd = r0
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu
            com.google.android.gms.common.util.Clock r3 = r3.zzaU()
            long r0 = r3.elapsedRealtime()
            r2.zza = r0
            r2.zzb = r0
            return
    }

    final void zza() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzaz r0 = r4.zzd
            r0.zzb()
            com.google.android.gms.measurement.internal.zzop r0 = r4.zzc
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzbb
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            r2 = 0
            if (r1 == 0) goto L20
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r2 = r0.elapsedRealtime()
        L20:
            r4.zza = r2
            r4.zzb = r2
            return
    }

    final void zzb(long r1) {
            r0 = this;
            com.google.android.gms.measurement.internal.zzaz r1 = r0.zzd
            r1.zzb()
            return
    }

    final void zzc(long r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzop r0 = r1.zzc
            r0.zzg()
            com.google.android.gms.measurement.internal.zzaz r0 = r1.zzd
            r0.zzb()
            r1.zza = r2
            r1.zzb = r2
            return
    }

    public final boolean zzd(boolean r7, boolean r8, long r9) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzop r0 = r6.zzc
            r0.zzg()
            r0.zza()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            boolean r1 = r1.zzJ()
            if (r1 == 0) goto L23
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhp r2 = r2.zzk
            com.google.android.gms.common.util.Clock r1 = r1.zzaU()
            long r3 = r1.currentTimeMillis()
            r2.zzb(r3)
        L23:
            long r1 = r6.zza
            long r1 = r9 - r1
            if (r7 != 0) goto L45
            r3 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L30
            goto L45
        L30:
            com.google.android.gms.measurement.internal.zzio r7 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzj()
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            java.lang.String r9 = "Screen exposed for less than 1000 ms. Event not sent. time"
            r7.zzb(r9, r8)
            r7 = 0
            return r7
        L45:
            if (r8 != 0) goto L4d
            long r1 = r6.zzb
            long r1 = r9 - r1
            r6.zzb = r9
        L4d:
            com.google.android.gms.measurement.internal.zzio r7 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r7.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r5 = "Recording user engagement, ms"
            r3.zzb(r5, r4)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "_et"
            r3.putLong(r4, r1)
            com.google.android.gms.measurement.internal.zzam r7 = r7.zzf()
            boolean r7 = r7.zzz()
            r1 = 1
            r7 = r7 ^ r1
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzmo r2 = r0.zzt()
            com.google.android.gms.measurement.internal.zzmh r7 = r2.zzj(r7)
            com.google.android.gms.measurement.internal.zzqf.zzN(r7, r3, r1)
            if (r8 != 0) goto L8e
            com.google.android.gms.measurement.internal.zzlw r7 = r0.zzq()
            java.lang.String r8 = "auto"
            java.lang.String r0 = "_e"
            r7.zzR(r8, r0, r3)
        L8e:
            r6.zza = r9
            com.google.android.gms.measurement.internal.zzaz r7 = r6.zzd
            r7.zzb()
            com.google.android.gms.measurement.internal.zzgg r8 = com.google.android.gms.measurement.internal.zzgi.zzap
            r9 = 0
            java.lang.Object r8 = r8.zza(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r7.zzd(r8)
            return r1
    }
}
