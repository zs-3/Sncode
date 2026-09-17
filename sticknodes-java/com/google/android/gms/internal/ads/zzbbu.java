package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbu {
    private final com.google.android.gms.internal.ads.zzbca zza;
    private final com.google.android.gms.internal.ads.zzbcb.zzt.zza zzb;
    private final boolean zzc;

    private zzbbu() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzbcb$zzt$zza r0 = com.google.android.gms.internal.ads.zzbcb.zzt.zzj()
            r1.zzb = r0
            r0 = 0
            r1.zzc = r0
            com.google.android.gms.internal.ads.zzbca r0 = new com.google.android.gms.internal.ads.zzbca
            r0.<init>()
            r1.zza = r0
            return
    }

    public zzbbu(com.google.android.gms.internal.ads.zzbca r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzbcb$zzt$zza r0 = com.google.android.gms.internal.ads.zzbcb.zzt.zzj()
            r1.zzb = r0
            r1.zza = r2
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzeO
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r0.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.zzc = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzbbu zza() {
            com.google.android.gms.internal.ads.zzbbu r0 = new com.google.android.gms.internal.ads.zzbbu
            r0.<init>()
            return r0
    }

    private final synchronized java.lang.String zzd(int r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L40
            r1 = 0
            com.google.android.gms.internal.ads.zzbcb$zzt$zza r2 = r4.zzb     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r2.zzah()     // Catch: java.lang.Throwable -> L40
            r0[r1] = r2     // Catch: java.lang.Throwable -> L40
            r1 = 1
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L40
            long r2 = r2.elapsedRealtime()     // Catch: java.lang.Throwable -> L40
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L40
            r0[r1] = r2     // Catch: java.lang.Throwable -> L40
            r1 = 2
            int r5 = r5 + (-1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L40
            r0[r1] = r5     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzbcb$zzt$zza r5 = r4.zzb     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzhbe r5 = r5.zzbn()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.internal.ads.zzbcb$zzt r5 = (com.google.android.gms.internal.ads.zzbcb.zzt) r5     // Catch: java.lang.Throwable -> L40
            byte[] r5 = r5.zzaV()     // Catch: java.lang.Throwable -> L40
            r1 = 3
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)     // Catch: java.lang.Throwable -> L40
            r0[r1] = r5     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "id=%s,timestamp=%s,event=%s,data=%s\n"
            java.lang.String r5 = java.lang.String.format(r5, r0)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r4)
            return r5
        L40:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final synchronized void zze(int r5) {
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L9
            monitor-exit(r4)
            return
        L9:
            java.lang.String r1 = "clearcut_events.txt"
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L59
            com.google.android.gms.internal.ads.zzftn r3 = com.google.android.gms.internal.ads.zzftl.zza()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = com.google.android.gms.internal.ads.zzftm.zza(r3, r0, r1)     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L52 java.lang.Throwable -> L59
            r1 = 1
            r0.<init>(r2, r1)     // Catch: java.io.FileNotFoundException -> L52 java.lang.Throwable -> L59
            java.lang.String r5 = r4.zzd(r5)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            r0.write(r5)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            r0.close()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L59
            monitor-exit(r4)
            return
        L2e:
            java.lang.String r5 = "Could not close Clearcut output stream."
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.io.FileNotFoundException -> L52 java.lang.Throwable -> L59
            monitor-exit(r4)
            return
        L35:
            r5 = move-exception
            goto L48
        L37:
            java.lang.String r5 = "Could not write Clearcut to file."
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.lang.Throwable -> L35
            r0.close()     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L59
            monitor-exit(r4)
            return
        L41:
            java.lang.String r5 = "Could not close Clearcut output stream."
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.io.FileNotFoundException -> L52 java.lang.Throwable -> L59
            monitor-exit(r4)
            return
        L48:
            r0.close()     // Catch: java.io.IOException -> L4c java.lang.Throwable -> L59
            goto L51
        L4c:
            java.lang.String r0 = "Could not close Clearcut output stream."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.io.FileNotFoundException -> L52 java.lang.Throwable -> L59
        L51:
            throw r5     // Catch: java.io.FileNotFoundException -> L52 java.lang.Throwable -> L59
        L52:
            java.lang.String r5 = "Could not find file for Clearcut"
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)
            return
        L59:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private final synchronized void zzf(int r5) {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbcb$zzt$zza r0 = r4.zzb     // Catch: java.lang.Throwable -> L3e
            r0.zzq()     // Catch: java.lang.Throwable -> L3e
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzt.zzd()     // Catch: java.lang.Throwable -> L3e
            r0.zzj(r1)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbcb$zzt$zza r0 = r4.zzb     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbn()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbcb$zzt r0 = (com.google.android.gms.internal.ads.zzbcb.zzt) r0     // Catch: java.lang.Throwable -> L3e
            byte[] r0 = r0.zzaV()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbbz r1 = new com.google.android.gms.internal.ads.zzbbz     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbca r2 = r4.zza     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L3e
            int r5 = r5 + (-1)
            r1.zza(r5)     // Catch: java.lang.Throwable -> L3e
            r1.zzc()     // Catch: java.lang.Throwable -> L3e
            r0 = 10
            java.lang.String r5 = java.lang.Integer.toString(r5, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "Logging Event with event code : "
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r4)
            return
        L3e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzbbt r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzc     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzbcb$zzt$zza r0 = r2.zzb     // Catch: java.lang.NullPointerException -> Lc java.lang.Throwable -> L1a
            r3.zza(r0)     // Catch: java.lang.NullPointerException -> Lc java.lang.Throwable -> L1a
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            java.lang.String r0 = "AdMobClearcutLogger.modify"
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.lang.Throwable -> L1a
            r1.zzw(r3, r0)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return
        L18:
            monitor-exit(r2)
            return
        L1a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzc(int r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzc     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzeP     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1e
            r2.zze(r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L1e:
            r2.zzf(r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L23:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
