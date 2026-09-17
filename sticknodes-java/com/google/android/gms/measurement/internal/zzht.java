package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzht extends com.google.android.gms.measurement.internal.zzjr {
    static final android.util.Pair zza = null;
    private long zzA;
    public com.google.android.gms.measurement.internal.zzhq zzb;
    public final com.google.android.gms.measurement.internal.zzhp zzc;
    public final com.google.android.gms.measurement.internal.zzhp zzd;
    public final com.google.android.gms.measurement.internal.zzhr zze;
    public final com.google.android.gms.measurement.internal.zzhp zzf;
    public final com.google.android.gms.measurement.internal.zzhn zzg;
    public final com.google.android.gms.measurement.internal.zzhr zzh;
    public final com.google.android.gms.measurement.internal.zzho zzi;
    public final com.google.android.gms.measurement.internal.zzhn zzj;
    public final com.google.android.gms.measurement.internal.zzhp zzk;
    public final com.google.android.gms.measurement.internal.zzhp zzl;
    public boolean zzm;
    public final com.google.android.gms.measurement.internal.zzhn zzn;
    public final com.google.android.gms.measurement.internal.zzhn zzo;
    public final com.google.android.gms.measurement.internal.zzhp zzp;
    public final com.google.android.gms.measurement.internal.zzhr zzq;
    public final com.google.android.gms.measurement.internal.zzhr zzr;
    public final com.google.android.gms.measurement.internal.zzhp zzs;
    public final com.google.android.gms.measurement.internal.zzho zzt;
    private android.content.SharedPreferences zzv;
    private final java.lang.Object zzw;
    private android.content.SharedPreferences zzx;
    private java.lang.String zzy;
    private boolean zzz;

    static {
            android.util.Pair r0 = new android.util.Pair
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = ""
            r0.<init>(r2, r1)
            com.google.android.gms.measurement.internal.zzht.zza = r0
            return
    }

    zzht(com.google.android.gms.measurement.internal.zzio r6) {
            r5 = this;
            r5.<init>(r6)
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            r5.zzw = r6
            com.google.android.gms.measurement.internal.zzhp r6 = new com.google.android.gms.measurement.internal.zzhp
            java.lang.String r0 = "session_timeout"
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            r6.<init>(r5, r0, r1)
            r5.zzf = r6
            com.google.android.gms.measurement.internal.zzhn r6 = new com.google.android.gms.measurement.internal.zzhn
            java.lang.String r0 = "start_new_session"
            r1 = 1
            r6.<init>(r5, r0, r1)
            r5.zzg = r6
            com.google.android.gms.measurement.internal.zzhp r6 = new com.google.android.gms.measurement.internal.zzhp
            java.lang.String r0 = "last_pause_time"
            r1 = 0
            r6.<init>(r5, r0, r1)
            r5.zzk = r6
            com.google.android.gms.measurement.internal.zzhp r6 = new com.google.android.gms.measurement.internal.zzhp
            java.lang.String r0 = "session_id"
            r6.<init>(r5, r0, r1)
            r5.zzl = r6
            com.google.android.gms.measurement.internal.zzhr r6 = new com.google.android.gms.measurement.internal.zzhr
            java.lang.String r0 = "non_personalized_ads"
            r3 = 0
            r6.<init>(r5, r0, r3)
            r5.zzh = r6
            com.google.android.gms.measurement.internal.zzho r6 = new com.google.android.gms.measurement.internal.zzho
            java.lang.String r0 = "last_received_uri_timestamps_by_source"
            r6.<init>(r5, r0, r3)
            r5.zzi = r6
            com.google.android.gms.measurement.internal.zzhn r6 = new com.google.android.gms.measurement.internal.zzhn
            java.lang.String r0 = "allow_remote_dynamite"
            r4 = 0
            r6.<init>(r5, r0, r4)
            r5.zzj = r6
            com.google.android.gms.measurement.internal.zzhp r6 = new com.google.android.gms.measurement.internal.zzhp
            java.lang.String r0 = "first_open_time"
            r6.<init>(r5, r0, r1)
            r5.zzc = r6
            com.google.android.gms.measurement.internal.zzhp r6 = new com.google.android.gms.measurement.internal.zzhp
            java.lang.String r0 = "app_install_time"
            r6.<init>(r5, r0, r1)
            r5.zzd = r6
            com.google.android.gms.measurement.internal.zzhr r6 = new com.google.android.gms.measurement.internal.zzhr
            java.lang.String r0 = "app_instance_id"
            r6.<init>(r5, r0, r3)
            r5.zze = r6
            com.google.android.gms.measurement.internal.zzhn r6 = new com.google.android.gms.measurement.internal.zzhn
            java.lang.String r0 = "app_backgrounded"
            r6.<init>(r5, r0, r4)
            r5.zzn = r6
            com.google.android.gms.measurement.internal.zzhn r6 = new com.google.android.gms.measurement.internal.zzhn
            java.lang.String r0 = "deep_link_retrieval_complete"
            r6.<init>(r5, r0, r4)
            r5.zzo = r6
            com.google.android.gms.measurement.internal.zzhp r6 = new com.google.android.gms.measurement.internal.zzhp
            java.lang.String r0 = "deep_link_retrieval_attempts"
            r6.<init>(r5, r0, r1)
            r5.zzp = r6
            com.google.android.gms.measurement.internal.zzhr r6 = new com.google.android.gms.measurement.internal.zzhr
            java.lang.String r0 = "firebase_feature_rollouts"
            r6.<init>(r5, r0, r3)
            r5.zzq = r6
            com.google.android.gms.measurement.internal.zzhr r6 = new com.google.android.gms.measurement.internal.zzhr
            java.lang.String r0 = "deferred_attribution_cache"
            r6.<init>(r5, r0, r3)
            r5.zzr = r6
            com.google.android.gms.measurement.internal.zzhp r6 = new com.google.android.gms.measurement.internal.zzhp
            java.lang.String r0 = "deferred_attribution_cache_timestamp"
            r6.<init>(r5, r0, r1)
            r5.zzs = r6
            com.google.android.gms.measurement.internal.zzho r6 = new com.google.android.gms.measurement.internal.zzho
            java.lang.String r0 = "default_event_parameters"
            r6.<init>(r5, r0, r3)
            r5.zzt = r6
            return
    }

    protected final android.content.SharedPreferences zza() {
            r5 = this;
            r5.zzg()
            r5.zzv()
            android.content.SharedPreferences r0 = r5.zzx
            if (r0 != 0) goto L49
            java.lang.Object r0 = r5.zzw
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r5.zzx     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L44
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu     // Catch: java.lang.Throwable -> L46
            android.content.Context r2 = r1.zzaT()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r3.<init>()     // Catch: java.lang.Throwable -> L46
            r3.append(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "_preferences"
            r3.append(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zzhe r3 = r1.zzaW()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "Default prefs file"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L46
            android.content.Context r1 = r1.zzaT()     // Catch: java.lang.Throwable -> L46
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L46
            r5.zzx = r1     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r1
        L49:
            android.content.SharedPreferences r0 = r5.zzx
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final void zzaZ() {
            r10 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r10.zzu
            android.content.Context r1 = r0.zzaT()
            java.lang.String r2 = "com.google.android.gms.measurement.prefs"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            r10.zzv = r1
            java.lang.String r2 = "has_been_opened"
            boolean r1 = r1.getBoolean(r2, r3)
            r10.zzm = r1
            if (r1 != 0) goto L26
            android.content.SharedPreferences r1 = r10.zzv
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r3 = 1
            r1.putBoolean(r2, r3)
            r1.apply()
        L26:
            com.google.android.gms.measurement.internal.zzhq r1 = new com.google.android.gms.measurement.internal.zzhq
            r0.zzf()
            r2 = 0
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzc
            r4 = 0
            java.lang.Object r0 = r0.zza(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            long r7 = java.lang.Math.max(r2, r4)
            r9 = 0
            java.lang.String r6 = "health_monitor"
            r4 = r1
            r5 = r10
            r4.<init>(r5, r6, r7, r9)
            r10.zzb = r1
            return
    }

    protected final android.content.SharedPreferences zzb() {
            r1 = this;
            r1.zzg()
            r1.zzv()
            android.content.SharedPreferences r0 = r1.zzv
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.SharedPreferences r0 = r1.zzv
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
            r1 = this;
            r0 = 1
            return r0
    }

    final android.util.Pair zzd(java.lang.String r9) {
            r8 = this;
            r8.zzg()
            com.google.android.gms.measurement.internal.zzjx r0 = r8.zzh()
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zza
            boolean r0 = r0.zzr(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L80
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.common.util.Clock r2 = r0.zzaU()
            long r2 = r2.elapsedRealtime()
            java.lang.String r4 = r8.zzy
            if (r4 == 0) goto L32
            long r5 = r8.zzA
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L32
        L26:
            android.util.Pair r9 = new android.util.Pair
            boolean r0 = r8.zzz
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.<init>(r4, r0)
            return r9
        L32:
            com.google.android.gms.measurement.internal.zzam r4 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zza
            long r4 = r4.zzk(r9, r5)
            long r2 = r2 + r4
            r8.zzA = r2
            r9 = 1
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r9)
            android.content.Context r9 = r0.zzaT()     // Catch: java.lang.Exception -> L5c
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r9)     // Catch: java.lang.Exception -> L5c
            r8.zzy = r1     // Catch: java.lang.Exception -> L5c
            java.lang.String r0 = r9.getId()     // Catch: java.lang.Exception -> L5c
            if (r0 == 0) goto L55
            r8.zzy = r0     // Catch: java.lang.Exception -> L5c
        L55:
            boolean r9 = r9.isLimitAdTrackingEnabled()     // Catch: java.lang.Exception -> L5c
            r8.zzz = r9     // Catch: java.lang.Exception -> L5c
            goto L6e
        L5c:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r2 = "Unable to get advertising id"
            r0.zzb(r2, r9)
            r8.zzy = r1
        L6e:
            r9 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r9)
            android.util.Pair r9 = new android.util.Pair
            java.lang.String r0 = r8.zzy
            boolean r1 = r8.zzz
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r9.<init>(r0, r1)
            return r9
        L80:
            android.util.Pair r9 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.<init>(r1, r0)
            return r9
    }

    final android.util.SparseArray zze() {
            r7 = this;
            com.google.android.gms.measurement.internal.zzho r0 = r7.zzi
            android.os.Bundle r0 = r0.zza()
            java.lang.String r1 = "uriSources"
            int[] r1 = r0.getIntArray(r1)
            java.lang.String r2 = "uriTimestamps"
            long[] r0 = r0.getLongArray(r2)
            if (r1 == 0) goto L48
            if (r0 != 0) goto L17
            goto L48
        L17:
            int r2 = r0.length
            int r3 = r1.length
            if (r3 == r2) goto L30
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Trigger URI source and timestamp array lengths do not match"
            r0.zza(r1)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            return r0
        L30:
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r3 = 0
        L36:
            int r4 = r1.length
            if (r3 >= r4) goto L47
            r4 = r1[r3]
            r5 = r0[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2.put(r4, r5)
            int r3 = r3 + 1
            goto L36
        L47:
            return r2
        L48:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            return r0
    }

    final com.google.android.gms.measurement.internal.zzba zzf() {
            r3 = this;
            r3.zzg()
            android.content.SharedPreferences r0 = r3.zzb()
            java.lang.String r1 = "dma_consent_settings"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            com.google.android.gms.measurement.internal.zzba r0 = com.google.android.gms.measurement.internal.zzba.zze(r0)
            return r0
    }

    final com.google.android.gms.measurement.internal.zzjx zzh() {
            r4 = this;
            r4.zzg()
            android.content.SharedPreferences r0 = r4.zzb()
            java.lang.String r1 = "consent_settings"
            java.lang.String r2 = "G1"
            java.lang.String r0 = r0.getString(r1, r2)
            android.content.SharedPreferences r1 = r4.zzb()
            java.lang.String r2 = "consent_source"
            r3 = 100
            int r1 = r1.getInt(r2, r3)
            com.google.android.gms.measurement.internal.zzjx r0 = com.google.android.gms.measurement.internal.zzjx.zzk(r0, r1)
            return r0
    }

    final java.lang.Boolean zzi() {
            r3 = this;
            r3.zzg()
            android.content.SharedPreferences r0 = r3.zzb()
            java.lang.String r1 = "measurement_enabled"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1d
            android.content.SharedPreferences r0 = r3.zzb()
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1d:
            r0 = 0
            return r0
    }

    final java.lang.String zzj() {
            r3 = this;
            r3.zzg()
            android.content.SharedPreferences r0 = r3.zzb()
            java.lang.String r1 = "gmp_app_id"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    final void zzl(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            android.content.SharedPreferences r0 = r2.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "admob_app_id"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    final void zzm(java.lang.Boolean r3) {
            r2 = this;
            r2.zzg()
            android.content.SharedPreferences r0 = r2.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "measurement_enabled"
            if (r3 == 0) goto L17
            boolean r3 = r3.booleanValue()
            r0.putBoolean(r1, r3)
            goto L1a
        L17:
            r0.remove(r1)
        L1a:
            r0.apply()
            return
    }

    final void zzn(boolean r4) {
            r3 = this;
            r3.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r2 = "App measurement setting deferred collection"
            r0.zzb(r2, r1)
            android.content.SharedPreferences r0 = r3.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "deferred_analytics_collection"
            r0.putBoolean(r1, r4)
            r0.apply()
            return
    }

    final boolean zzo() {
            r2 = this;
            android.content.SharedPreferences r0 = r2.zzv
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = "deferred_analytics_collection"
            boolean r0 = r0.contains(r1)
            return r0
    }

    final boolean zzp(long r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzhp r0 = r3.zzf
            long r0 = r0.zza()
            long r4 = r4 - r0
            com.google.android.gms.measurement.internal.zzhp r0 = r3.zzk
            long r0 = r0.zza()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            r4 = 1
            return r4
        L13:
            r4 = 0
            return r4
    }

    final boolean zzq(int r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.zzb()
            java.lang.String r1 = "consent_source"
            r2 = 100
            int r0 = r0.getInt(r1, r2)
            boolean r4 = com.google.android.gms.measurement.internal.zzjx.zzs(r4, r0)
            return r4
    }

    protected final boolean zzr(com.google.android.gms.measurement.internal.zzoq r4) {
            r3 = this;
            r3.zzg()
            android.content.SharedPreferences r0 = r3.zzb()
            java.lang.String r1 = "stored_tcf_param"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r4 = r4.zze()
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L29
            android.content.SharedPreferences r0 = r3.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putString(r1, r4)
            r0.apply()
            r4 = 1
            return r4
        L29:
            r4 = 0
            return r4
    }
}
