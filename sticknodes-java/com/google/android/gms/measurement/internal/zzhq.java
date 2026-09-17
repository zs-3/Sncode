package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhq {
    final java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final long zze;

    /* synthetic */ zzhq(com.google.android.gms.measurement.internal.zzht r1, java.lang.String r2, long r3, com.google.android.gms.measurement.internal.zzhs r5) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            java.lang.String r1 = "health_monitor"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r1 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            java.lang.String r1 = "health_monitor:start"
            r0.zza = r1
            java.lang.String r1 = "health_monitor:count"
            r0.zzc = r1
            java.lang.String r1 = "health_monitor:value"
            r0.zzd = r1
            r0.zze = r3
            return
    }

    private final long zzc() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r4.zzb
            android.content.SharedPreferences r0 = r0.zzb()
            java.lang.String r1 = r4.zza
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    private final void zzd() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r4.zzb
            r0.zzg()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.common.util.Clock r1 = r1.zzaU()
            long r1 = r1.currentTimeMillis()
            android.content.SharedPreferences r0 = r0.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = r4.zzc
            r0.remove(r3)
            java.lang.String r3 = r4.zzd
            r0.remove(r3)
            java.lang.String r3 = r4.zza
            r0.putLong(r3, r1)
            r0.apply()
            return
    }

    public final android.util.Pair zza() {
            r9 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r9.zzb
            r0.zzg()
            r0.zzg()
            long r1 = r9.zzc()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L17
            r9.zzd()
            r1 = r3
            goto L26
        L17:
            com.google.android.gms.measurement.internal.zzio r5 = r0.zzu
            com.google.android.gms.common.util.Clock r5 = r5.zzaU()
            long r5 = r5.currentTimeMillis()
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
        L26:
            long r5 = r9.zze
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 >= 0) goto L2e
            return r7
        L2e:
            long r5 = r5 + r5
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 <= 0) goto L37
            r9.zzd()
            return r7
        L37:
            java.lang.String r1 = r9.zzd
            android.content.SharedPreferences r2 = r0.zzb()
            java.lang.String r1 = r2.getString(r1, r7)
            java.lang.String r2 = r9.zzc
            android.content.SharedPreferences r0 = r0.zzb()
            long r5 = r0.getLong(r2, r3)
            r9.zzd()
            if (r1 == 0) goto L5f
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L55
            goto L5f
        L55:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.<init>(r1, r2)
            return r0
        L5f:
            android.util.Pair r0 = com.google.android.gms.measurement.internal.zzht.zza
            return r0
    }

    public final void zzb(java.lang.String r11, long r12) {
            r10 = this;
            com.google.android.gms.measurement.internal.zzht r12 = r10.zzb
            r12.zzg()
            long r0 = r10.zzc()
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L12
            r10.zzd()
        L12:
            if (r11 != 0) goto L16
            java.lang.String r11 = ""
        L16:
            android.content.SharedPreferences r13 = r12.zzb()
            java.lang.String r0 = r10.zzc
            long r4 = r13.getLong(r0, r2)
            r6 = 1
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 > 0) goto L3a
            android.content.SharedPreferences r12 = r12.zzb()
            android.content.SharedPreferences$Editor r12 = r12.edit()
            java.lang.String r13 = r10.zzd
            r12.putString(r13, r11)
            r12.putLong(r0, r6)
            r12.apply()
            return
        L3a:
            com.google.android.gms.measurement.internal.zzio r13 = r12.zzu
            com.google.android.gms.measurement.internal.zzqf r13 = r13.zzw()
            java.security.SecureRandom r13 = r13.zzJ()
            long r1 = r13.nextLong()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = r1 & r8
            long r4 = r4 + r6
            long r8 = r8 / r4
            android.content.SharedPreferences r12 = r12.zzb()
            android.content.SharedPreferences$Editor r12 = r12.edit()
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 >= 0) goto L61
            java.lang.String r13 = r10.zzd
            r12.putString(r13, r11)
        L61:
            r12.putLong(r0, r4)
            r12.apply()
            return
    }
}
