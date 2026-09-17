package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzoa extends com.google.android.gms.measurement.internal.zzpg {
    public final com.google.android.gms.measurement.internal.zzhp zza;
    public final com.google.android.gms.measurement.internal.zzhp zzb;
    public final com.google.android.gms.measurement.internal.zzhp zzc;
    public final com.google.android.gms.measurement.internal.zzhp zzd;
    public final com.google.android.gms.measurement.internal.zzhp zze;
    public final com.google.android.gms.measurement.internal.zzhp zzf;
    private final java.util.Map zzh;

    zzoa(com.google.android.gms.measurement.internal.zzpv r5) {
            r4 = this;
            r4.<init>(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.zzh = r5
            com.google.android.gms.measurement.internal.zzhp r5 = new com.google.android.gms.measurement.internal.zzhp
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "last_delete_stale"
            r2 = 0
            r5.<init>(r0, r1, r2)
            r4.zza = r5
            com.google.android.gms.measurement.internal.zzhp r5 = new com.google.android.gms.measurement.internal.zzhp
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "last_delete_stale_batch"
            r5.<init>(r0, r1, r2)
            r4.zzb = r5
            com.google.android.gms.measurement.internal.zzhp r5 = new com.google.android.gms.measurement.internal.zzhp
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "backoff"
            r5.<init>(r0, r1, r2)
            r4.zzc = r5
            com.google.android.gms.measurement.internal.zzhp r5 = new com.google.android.gms.measurement.internal.zzhp
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "last_upload"
            r5.<init>(r0, r1, r2)
            r4.zzd = r5
            com.google.android.gms.measurement.internal.zzhp r5 = new com.google.android.gms.measurement.internal.zzhp
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "last_upload_attempt"
            r5.<init>(r0, r1, r2)
            r4.zze = r5
            com.google.android.gms.measurement.internal.zzhp r5 = new com.google.android.gms.measurement.internal.zzhp
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "midnight_offset"
            r5.<init>(r0, r1, r2)
            r4.zzf = r5
            return
    }

    @java.lang.Deprecated
    final android.util.Pair zza(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = ""
            r13.zzg()
            com.google.android.gms.measurement.internal.zzio r1 = r13.zzu
            com.google.android.gms.common.util.Clock r2 = r1.zzaU()
            long r2 = r2.elapsedRealtime()
            java.util.Map r4 = r13.zzh
            java.lang.Object r4 = r4.get(r14)
            com.google.android.gms.measurement.internal.zznz r4 = (com.google.android.gms.measurement.internal.zznz) r4
            if (r4 == 0) goto L2e
            long r5 = r4.zzc
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L20
            goto L2e
        L20:
            java.lang.String r14 = r4.zza
            boolean r0 = r4.zzb
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.<init>(r14, r0)
            return r1
        L2e:
            r5 = 1
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r5)
            com.google.android.gms.measurement.internal.zzam r5 = r1.zzf()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zza
            long r5 = r5.zzk(r14, r6)
            long r5 = r5 + r2
            r7 = 0
            r8 = 0
            android.content.Context r1 = r1.zzaT()     // Catch: java.lang.Exception -> L48 android.content.pm.PackageManager.NameNotFoundException -> L4a
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r7 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r1)     // Catch: java.lang.Exception -> L48 android.content.pm.PackageManager.NameNotFoundException -> L4a
            goto L6e
        L48:
            r1 = move-exception
            goto L94
        L4a:
            if (r4 == 0) goto L6e
            long r9 = r4.zzc     // Catch: java.lang.Exception -> L48
            com.google.android.gms.measurement.internal.zzio r1 = r13.zzu     // Catch: java.lang.Exception -> L48
            com.google.android.gms.measurement.internal.zzam r1 = r1.zzf()     // Catch: java.lang.Exception -> L48
            com.google.android.gms.measurement.internal.zzgg r11 = com.google.android.gms.measurement.internal.zzgi.zzb     // Catch: java.lang.Exception -> L48
            long r11 = r1.zzk(r14, r11)     // Catch: java.lang.Exception -> L48
            long r9 = r9 + r11
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 >= 0) goto L6e
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = r4.zza     // Catch: java.lang.Exception -> L48
            boolean r3 = r4.zzb     // Catch: java.lang.Exception -> L48
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L48
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L48
            return r1
        L6e:
            if (r7 != 0) goto L7a
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = "00000000-0000-0000-0000-000000000000"
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L48
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L48
            return r1
        L7a:
            java.lang.String r1 = r7.getId()     // Catch: java.lang.Exception -> L48
            if (r1 == 0) goto L8a
            com.google.android.gms.measurement.internal.zznz r2 = new com.google.android.gms.measurement.internal.zznz     // Catch: java.lang.Exception -> L48
            boolean r3 = r7.isLimitAdTrackingEnabled()     // Catch: java.lang.Exception -> L48
            r2.<init>(r1, r3, r5)     // Catch: java.lang.Exception -> L48
            goto La8
        L8a:
            com.google.android.gms.measurement.internal.zznz r2 = new com.google.android.gms.measurement.internal.zznz     // Catch: java.lang.Exception -> L48
            boolean r1 = r7.isLimitAdTrackingEnabled()     // Catch: java.lang.Exception -> L48
            r2.<init>(r0, r1, r5)     // Catch: java.lang.Exception -> L48
            goto La8
        L94:
            com.google.android.gms.measurement.internal.zzio r2 = r13.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzd()
            java.lang.String r3 = "Unable to get advertising id"
            r2.zzb(r3, r1)
            com.google.android.gms.measurement.internal.zznz r2 = new com.google.android.gms.measurement.internal.zznz
            r2.<init>(r0, r8, r5)
        La8:
            java.util.Map r0 = r13.zzh
            r0.put(r14, r2)
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r8)
            android.util.Pair r14 = new android.util.Pair
            java.lang.String r0 = r2.zza
            boolean r1 = r2.zzb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r14.<init>(r0, r1)
            return r14
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    final android.util.Pair zzd(java.lang.String r2, com.google.android.gms.measurement.internal.zzjx r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zza
            boolean r3 = r3.zzr(r0)
            if (r3 == 0) goto Ld
            android.util.Pair r2 = r1.zza(r2)
            return r2
        Ld:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.String r0 = ""
            r2.<init>(r0, r3)
            return r2
    }

    @java.lang.Deprecated
    final java.lang.String zzf(java.lang.String r6, boolean r7) {
            r5 = this;
            r5.zzg()
            if (r7 == 0) goto Le
            android.util.Pair r6 = r5.zza(r6)
            java.lang.Object r6 = r6.first
            java.lang.String r6 = (java.lang.String) r6
            goto L10
        Le:
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
        L10:
            java.security.MessageDigest r7 = com.google.android.gms.measurement.internal.zzqf.zzI()
            if (r7 != 0) goto L18
            r6 = 0
            return r6
        L18:
            java.util.Locale r0 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.math.BigInteger r4 = new java.math.BigInteger
            byte[] r6 = r6.getBytes()
            byte[] r6 = r7.digest(r6)
            r4.<init>(r1, r6)
            r2[r3] = r4
            java.lang.String r6 = "%032X"
            java.lang.String r6 = java.lang.String.format(r0, r6, r2)
            return r6
    }
}
