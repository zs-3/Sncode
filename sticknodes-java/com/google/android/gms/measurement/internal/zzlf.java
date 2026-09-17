package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlf implements java.lang.Runnable {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlf(com.google.android.gms.measurement.internal.zzlw r1, android.os.Bundle r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r24 = this;
            r0 = r24
            java.lang.String r1 = "app_id"
            com.google.android.gms.measurement.internal.zzlw r2 = r0.zzb
            r2.zzg()
            r2.zza()
            android.os.Bundle r3 = r0.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r4 = "name"
            java.lang.String r6 = r3.getString(r4)
            java.lang.String r4 = "origin"
            java.lang.String r4 = r3.getString(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            java.lang.String r5 = "value"
            java.lang.Object r7 = r3.get(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.measurement.internal.zzio r7 = r2.zzu
            boolean r7 = r7.zzJ()
            if (r7 != 0) goto L44
            com.google.android.gms.measurement.internal.zzio r1 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Conditional property not set since app measurement is disabled"
            r1.zza(r2)
            return
        L44:
            com.google.android.gms.measurement.internal.zzqb r16 = new com.google.android.gms.measurement.internal.zzqb
            java.lang.String r7 = "triggered_timestamp"
            long r7 = r3.getLong(r7)
            java.lang.Object r9 = r3.get(r5)
            r5 = r16
            r10 = r4
            r5.<init>(r6, r7, r9, r10)
            com.google.android.gms.measurement.internal.zzio r5 = r2.zzu     // Catch: java.lang.IllegalArgumentException -> Le3
            com.google.android.gms.measurement.internal.zzqf r7 = r5.zzw()     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r8 = r3.getString(r1)     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r6 = "triggered_event_name"
            java.lang.String r9 = r3.getString(r6)     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r6 = "triggered_event_params"
            android.os.Bundle r10 = r3.getBundle(r6)     // Catch: java.lang.IllegalArgumentException -> Le3
            r12 = 0
            r14 = 1
            r15 = 1
            r11 = r4
            com.google.android.gms.measurement.internal.zzbh r18 = r7.zzC(r8, r9, r10, r11, r12, r14, r15)     // Catch: java.lang.IllegalArgumentException -> Le3
            com.google.android.gms.measurement.internal.zzqf r7 = r5.zzw()     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r8 = r3.getString(r1)     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r6 = "timed_out_event_name"
            java.lang.String r9 = r3.getString(r6)     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r6 = "timed_out_event_params"
            android.os.Bundle r10 = r3.getBundle(r6)     // Catch: java.lang.IllegalArgumentException -> Le3
            r12 = 0
            r14 = 1
            r15 = 1
            r11 = r4
            com.google.android.gms.measurement.internal.zzbh r6 = r7.zzC(r8, r9, r10, r11, r12, r14, r15)     // Catch: java.lang.IllegalArgumentException -> Le3
            com.google.android.gms.measurement.internal.zzqf r7 = r5.zzw()     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r8 = r3.getString(r1)     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r5 = "expired_event_name"
            java.lang.String r9 = r3.getString(r5)     // Catch: java.lang.IllegalArgumentException -> Le3
            java.lang.String r5 = "expired_event_params"
            android.os.Bundle r10 = r3.getBundle(r5)     // Catch: java.lang.IllegalArgumentException -> Le3
            r12 = 0
            r14 = 1
            r15 = 1
            r11 = r4
            com.google.android.gms.measurement.internal.zzbh r21 = r7.zzC(r8, r9, r10, r11, r12, r14, r15)     // Catch: java.lang.IllegalArgumentException -> Le3
            com.google.android.gms.measurement.internal.zzai r5 = new com.google.android.gms.measurement.internal.zzai
            java.lang.String r8 = r3.getString(r1)
            java.lang.String r1 = "creation_timestamp"
            long r11 = r3.getLong(r1)
            r13 = 0
            java.lang.String r1 = "trigger_event_name"
            java.lang.String r14 = r3.getString(r1)
            java.lang.String r1 = "trigger_timeout"
            long r19 = r3.getLong(r1)
            java.lang.String r1 = "time_to_live"
            long r22 = r3.getLong(r1)
            r7 = r5
            r9 = r4
            r10 = r16
            r15 = r6
            r16 = r19
            r19 = r22
            r7.<init>(r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r21)
            com.google.android.gms.measurement.internal.zzio r1 = r2.zzu
            com.google.android.gms.measurement.internal.zzny r1 = r1.zzu()
            r1.zzQ(r5)
        Le3:
            return
    }
}
