package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzpr {
    com.google.android.gms.internal.measurement.zzhx zza;
    java.util.List zzb;
    java.util.List zzc;
    long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zze;

    /* synthetic */ zzpr(com.google.android.gms.measurement.internal.zzpv r1, com.google.android.gms.measurement.internal.zzpu r2) {
            r0 = this;
            r0.zze = r1
            r0.<init>()
            return
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzhm r4) {
            long r0 = r4.zzd()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 60
            long r0 = r0 / r2
            long r0 = r0 / r2
            return r0
    }

    public final boolean zza(long r9, com.google.android.gms.internal.measurement.zzhm r11) {
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            java.util.List r0 = r8.zzc
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.zzc = r0
        Le:
            java.util.List r0 = r8.zzb
            if (r0 != 0) goto L19
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.zzb = r0
        L19:
            java.util.List r0 = r8.zzc
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L38
            java.util.List r0 = r8.zzc
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            long r2 = zzb(r0)
            long r4 = zzb(r11)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L37
            goto L38
        L37:
            return r1
        L38:
            long r2 = r8.zzd
            int r0 = r11.zzcf()
            long r4 = (long) r0
            long r2 = r2 + r4
            com.google.android.gms.measurement.internal.zzpv r0 = r8.zze
            com.google.android.gms.measurement.internal.zzam r4 = r0.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzbq
            r6 = 0
            boolean r4 = r4.zzx(r6, r5)
            if (r4 == 0) goto L65
            java.util.List r4 = r8.zzc
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L72
            r0.zzi()
            int r4 = com.google.android.gms.measurement.internal.zzam.zzG()
            long r4 = (long) r4
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L64
            goto L72
        L64:
            return r1
        L65:
            r0.zzi()
            int r4 = com.google.android.gms.measurement.internal.zzam.zzG()
            long r4 = (long) r4
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L72
            return r1
        L72:
            r8.zzd = r2
            java.util.List r2 = r8.zzc
            r2.add(r11)
            java.util.List r11 = r8.zzb
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r11.add(r9)
            java.util.List r9 = r8.zzc
            int r9 = r9.size()
            r0.zzi()
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzj
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = 1
            int r10 = java.lang.Math.max(r11, r10)
            if (r9 < r10) goto L9f
            return r1
        L9f:
            return r11
    }
}
