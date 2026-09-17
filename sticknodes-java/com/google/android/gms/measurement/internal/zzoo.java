package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzoo {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzop zza;

    zzoo(com.google.android.gms.measurement.internal.zzop r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    final void zza() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzop r0 = r4.zza
            r0.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.common.util.Clock r2 = r0.zzaU()
            long r2 = r2.currentTimeMillis()
            boolean r1 = r1.zzp(r2)
            if (r1 == 0) goto L4a
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhn r1 = r1.zzg
            r2 = 1
            r1.zza(r2)
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            android.app.ActivityManager.getMyMemoryState(r1)
            int r1 = r1.importance
            r2 = 100
            if (r1 != r2) goto L4a
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Detected application was in foreground"
            r1.zza(r2)
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r0 = r0.currentTimeMillis()
            r2 = 0
            r4.zzc(r0, r2)
        L4a:
            return
    }

    final void zzb(long r5, boolean r7) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzop r0 = r4.zza
            r0.zzg()
            com.google.android.gms.measurement.internal.zzop.zzi(r0)
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            boolean r2 = r2.zzp(r5)
            if (r2 == 0) goto L27
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhn r2 = r2.zzg
            r3 = 1
            r2.zza(r3)
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzh()
            r0.zzq()
        L27:
            com.google.android.gms.measurement.internal.zzht r0 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhp r0 = r0.zzk
            r0.zzb(r5)
            com.google.android.gms.measurement.internal.zzht r0 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhn r0 = r0.zzg
            boolean r0 = r0.zzb()
            if (r0 == 0) goto L3f
            r4.zzc(r5, r7)
        L3f:
            return
    }

    final void zzc(long r11, boolean r13) {
            r10 = this;
            com.google.android.gms.measurement.internal.zzop r13 = r10.zza
            r13.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r13.zzu
            boolean r0 = r0.zzJ()
            if (r0 != 0) goto Lf
            goto La0
        Lf:
            com.google.android.gms.measurement.internal.zzio r0 = r13.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r1 = r1.zzk
            r1.zzb(r11)
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzhe r3 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Session started, time"
            r3.zzb(r2, r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r1 = r11 / r1
            com.google.android.gms.measurement.internal.zzio r13 = r13.zzu
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.google.android.gms.measurement.internal.zzlw r3 = r13.zzq()
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_sid"
            r6 = r1
            r7 = r11
            r3.zzan(r4, r5, r6, r7)
            com.google.android.gms.measurement.internal.zzht r2 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r2 = r2.zzl
            long r3 = r1.longValue()
            r2.zzb(r3)
            com.google.android.gms.measurement.internal.zzht r2 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhn r2 = r2.zzg
            r3 = 0
            r2.zza(r3)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            long r1 = r1.longValue()
            java.lang.String r3 = "_sid"
            r9.putLong(r3, r1)
            com.google.android.gms.measurement.internal.zzlw r4 = r13.zzq()
            java.lang.String r5 = "auto"
            java.lang.String r6 = "_s"
            r4.zzS(r5, r6, r7, r9)
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhr r0 = r0.zzq
            java.lang.String r0 = r0.zza()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto La0
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r1 = "_ffr"
            r7.putString(r1, r0)
            com.google.android.gms.measurement.internal.zzlw r2 = r13.zzq()
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_ssr"
            r5 = r11
            r2.zzS(r3, r4, r5, r7)
        La0:
            return
    }
}
