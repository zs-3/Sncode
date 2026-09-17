package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlg implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlg(com.google.android.gms.measurement.internal.zzlw r1, android.os.Bundle r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r22 = this;
            r0 = r22
            java.lang.String r1 = "creation_timestamp"
            java.lang.String r2 = "app_id"
            com.google.android.gms.measurement.internal.zzlw r3 = r0.zzb
            r3.zzg()
            r3.zza()
            android.os.Bundle r4 = r0.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r5 = "name"
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r7 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.measurement.internal.zzio r5 = r3.zzu
            boolean r5 = r5.zzJ()
            if (r5 != 0) goto L35
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Conditional property not cleared since app measurement is disabled"
            r1.zza(r2)
            return
        L35:
            com.google.android.gms.measurement.internal.zzqb r12 = new com.google.android.gms.measurement.internal.zzqb
            r8 = 0
            r10 = 0
            java.lang.String r11 = ""
            r6 = r12
            r6.<init>(r7, r8, r10, r11)
            com.google.android.gms.measurement.internal.zzio r5 = r3.zzu     // Catch: java.lang.IllegalArgumentException -> L9b
            com.google.android.gms.measurement.internal.zzqf r13 = r5.zzw()     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r14 = r4.getString(r2)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r5 = "expired_event_name"
            java.lang.String r15 = r4.getString(r5)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r5 = "expired_event_params"
            android.os.Bundle r16 = r4.getBundle(r5)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r17 = ""
            long r18 = r4.getLong(r1)     // Catch: java.lang.IllegalArgumentException -> L9b
            r20 = 1
            r21 = 1
            com.google.android.gms.measurement.internal.zzbh r18 = r13.zzC(r14, r15, r16, r17, r18, r20, r21)     // Catch: java.lang.IllegalArgumentException -> L9b
            com.google.android.gms.measurement.internal.zzai r15 = new com.google.android.gms.measurement.internal.zzai
            java.lang.String r5 = r4.getString(r2)
            long r8 = r4.getLong(r1)
            java.lang.String r1 = "active"
            boolean r10 = r4.getBoolean(r1)
            java.lang.String r1 = "trigger_event_name"
            java.lang.String r11 = r4.getString(r1)
            java.lang.String r1 = "trigger_timeout"
            long r13 = r4.getLong(r1)
            java.lang.String r1 = "time_to_live"
            long r16 = r4.getLong(r1)
            r1 = 0
            r2 = 0
            java.lang.String r6 = ""
            r4 = r15
            r7 = r12
            r12 = r1
            r1 = r15
            r15 = r2
            r4.<init>(r5, r6, r7, r8, r10, r11, r12, r13, r15, r16, r18)
            com.google.android.gms.measurement.internal.zzio r2 = r3.zzu
            com.google.android.gms.measurement.internal.zzny r2 = r2.zzu()
            r2.zzQ(r1)
        L9b:
            return
    }
}
