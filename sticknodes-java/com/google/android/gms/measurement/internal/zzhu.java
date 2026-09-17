package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzhu implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ android.content.ServiceConnection zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhv zzc;

    zzhu(com.google.android.gms.measurement.internal.zzhv r1, com.google.android.gms.internal.measurement.zzbr r2, android.content.ServiceConnection r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            com.google.android.gms.measurement.internal.zzhv r0 = r12.zzc
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzhv.zza(r0)
            com.google.android.gms.measurement.internal.zzhw r0 = r0.zza
            com.google.android.gms.measurement.internal.zzio r2 = r0.zza
            com.google.android.gms.measurement.internal.zzil r3 = r2.zzaX()
            r3.zzg()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "package_name"
            r3.putString(r4, r1)
            com.google.android.gms.internal.measurement.zzbr r4 = r12.zza
            r5 = 0
            android.os.Bundle r3 = r4.zze(r3)     // Catch: java.lang.Exception -> L34
            if (r3 != 0) goto L32
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Exception -> L34
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Exception -> L34
            java.lang.String r3 = "Install Referrer Service returned a null response"
            r2.zza(r3)     // Catch: java.lang.Exception -> L34
            goto L48
        L32:
            r5 = r3
            goto L48
        L34:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r0.zza
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r2 = r2.getMessage()
            java.lang.String r4 = "Exception occurred while retrieving the Install Referrer"
            r3.zzb(r4, r2)
        L48:
            com.google.android.gms.measurement.internal.zzio r0 = r0.zza
            com.google.android.gms.measurement.internal.zzil r2 = r0.zzaX()
            r2.zzg()
            com.google.android.gms.measurement.internal.zzio.zzP()
            if (r5 != 0) goto L58
            goto L12f
        L58:
            java.lang.String r2 = "install_begin_timestamp_seconds"
            r3 = 0
            long r6 = r5.getLong(r2, r3)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L77
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = "Service response is missing Install Referrer install timestamp"
            r1.zza(r2)
            goto L12f
        L77:
            java.lang.String r2 = "install_referrer"
            java.lang.String r2 = r5.getString(r2)
            if (r2 == 0) goto L122
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L87
            goto L122
        L87:
            com.google.android.gms.measurement.internal.zzhe r10 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzj()
            java.lang.String r11 = "InstallReferrer API result"
            r10.zzb(r11, r2)
            com.google.android.gms.measurement.internal.zzqf r10 = r0.zzw()
            java.lang.String r11 = "?"
            java.lang.String r2 = r11.concat(r2)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.os.Bundle r2 = r10.zzu(r2)
            if (r2 != 0) goto Lb7
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "No campaign params defined in Install Referrer result"
            r1.zza(r2)
            goto L12f
        Lb7:
            java.lang.String r10 = "gclid"
            boolean r10 = r2.containsKey(r10)
            if (r10 != 0) goto Lc7
            java.lang.String r10 = "gbraid"
            boolean r10 = r2.containsKey(r10)
            if (r10 == 0) goto Ld8
        Lc7:
            java.lang.String r10 = "referrer_click_timestamp_server_seconds"
            long r10 = r5.getLong(r10, r3)
            long r10 = r10 * r8
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 <= 0) goto Ld8
            java.lang.String r3 = "click_timestamp"
            r2.putLong(r3, r10)
        Ld8:
            com.google.android.gms.measurement.internal.zzht r3 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r3 = r3.zzd
            long r3 = r3.zza()
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 != 0) goto Lf3
            com.google.android.gms.measurement.internal.zzhe r3 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            java.lang.String r4 = "Logging Install Referrer campaign from module while it may have already been logged."
            r3.zza(r4)
        Lf3:
            boolean r3 = r0.zzJ()
            if (r3 == 0) goto L12f
            com.google.android.gms.measurement.internal.zzht r3 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r3 = r3.zzd
            r3.zzb(r6)
            com.google.android.gms.measurement.internal.zzhe r3 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            java.lang.String r4 = "Logging Install Referrer campaign from gmscore with "
            java.lang.String r5 = "referrer API v2"
            r3.zzb(r4, r5)
            java.lang.String r3 = "_cis"
            r2.putString(r3, r5)
            com.google.android.gms.measurement.internal.zzlw r3 = r0.zzq()
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_cmp"
            r3.zzQ(r4, r5, r2, r1)
            goto L12f
        L122:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "No referrer defined in Install Referrer response"
            r1.zza(r2)
        L12f:
            android.content.ServiceConnection r1 = r12.zzb
            com.google.android.gms.common.stats.ConnectionTracker r2 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()
            android.content.Context r0 = r0.zzaT()
            r2.unbindService(r0, r1)
            return
    }
}
