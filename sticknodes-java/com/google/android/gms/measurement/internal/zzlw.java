package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzlw extends com.google.android.gms.measurement.internal.zzg {
    protected com.google.android.gms.measurement.internal.zzlv zza;
    final com.google.android.gms.measurement.internal.zzx zzb;
    protected boolean zzc;
    private com.google.android.gms.measurement.internal.zzkb zzd;
    private final java.util.Set zze;
    private boolean zzf;
    private final java.util.concurrent.atomic.AtomicReference zzg;
    private final java.lang.Object zzh;
    private boolean zzi;
    private int zzj;
    private com.google.android.gms.measurement.internal.zzaz zzk;
    private com.google.android.gms.measurement.internal.zzaz zzl;
    private java.util.PriorityQueue zzm;
    private boolean zzn;
    private com.google.android.gms.measurement.internal.zzjx zzo;
    private final java.util.concurrent.atomic.AtomicLong zzp;
    private long zzq;
    private com.google.android.gms.measurement.internal.zzaz zzr;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private com.google.android.gms.measurement.internal.zzaz zzt;
    private final com.google.android.gms.measurement.internal.zzqe zzv;

    protected zzlw(com.google.android.gms.measurement.internal.zzio r4) {
            r3 = this;
            r3.<init>(r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r3.zze = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzh = r0
            r0 = 0
            r3.zzi = r0
            r0 = 1
            r3.zzj = r0
            r3.zzc = r0
            com.google.android.gms.measurement.internal.zzlk r0 = new com.google.android.gms.measurement.internal.zzlk
            r0.<init>(r3)
            r3.zzv = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.zzg = r0
            com.google.android.gms.measurement.internal.zzjx r0 = com.google.android.gms.measurement.internal.zzjx.zza
            r3.zzo = r0
            r0 = -1
            r3.zzq = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.zzp = r0
            com.google.android.gms.measurement.internal.zzx r0 = new com.google.android.gms.measurement.internal.zzx
            r0.<init>(r4)
            r3.zzb = r0
            return
    }

    public static /* synthetic */ void zzA(com.google.android.gms.measurement.internal.zzlw r5, android.content.SharedPreferences r6, java.lang.String r7) {
            com.google.android.gms.measurement.internal.zzio r6 = r5.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r6.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzbj
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.String r3 = "IABTCF_TCString change picked up in listener."
            java.lang.String r4 = "IABTCF_TCString"
            if (r0 != 0) goto L32
            boolean r7 = java.util.Objects.equals(r7, r4)
            if (r7 == 0) goto L49
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()
            r6.zza(r3)
            com.google.android.gms.measurement.internal.zzaz r5 = r5.zzt
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.measurement.internal.zzaz r5 = (com.google.android.gms.measurement.internal.zzaz) r5
            r5.zzd(r1)
            return
        L32:
            boolean r0 = java.util.Objects.equals(r7, r4)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "IABTCF_gdprApplies"
            boolean r0 = java.util.Objects.equals(r7, r0)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "IABTCF_EnableAdvertiserConsentMode"
            boolean r7 = java.util.Objects.equals(r7, r0)
            if (r7 == 0) goto L49
            goto L4a
        L49:
            return
        L4a:
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()
            r6.zza(r3)
            com.google.android.gms.measurement.internal.zzaz r5 = r5.zzt
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.measurement.internal.zzaz r5 = (com.google.android.gms.measurement.internal.zzaz) r5
            r5.zzd(r1)
            return
    }

    static /* bridge */ /* synthetic */ void zzB(com.google.android.gms.measurement.internal.zzlw r0, boolean r1) {
            r1 = 0
            r0.zzi = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzC(com.google.android.gms.measurement.internal.zzlw r0, int r1) {
            r0.zzj = r1
            return
    }

    static /* synthetic */ void zzD(com.google.android.gms.measurement.internal.zzlw r6, com.google.android.gms.measurement.internal.zzjx r7, long r8, boolean r10, boolean r11) {
            r6.zzg()
            r6.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzjx r1 = r1.zzh()
            long r2 = r6.zzq
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 > 0) goto L33
            int r1 = r1.zzb()
            int r2 = r7.zzb()
            boolean r1 = com.google.android.gms.measurement.internal.zzjx.zzs(r1, r2)
            if (r1 != 0) goto L25
            goto L33
        L25:
            com.google.android.gms.measurement.internal.zzhe r6 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzi()
            java.lang.String r8 = "Dropped out-of-date consent setting, proposed settings"
            r6.zzb(r8, r7)
            return
        L33:
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            r1.zzg()
            int r2 = r7.zzb()
            boolean r3 = r1.zzq(r2)
            if (r3 == 0) goto L98
            com.google.android.gms.measurement.internal.zzio r3 = r6.zzu
            android.content.SharedPreferences r1 = r1.zzb()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r4 = r7.zzq()
            java.lang.String r5 = "consent_settings"
            r1.putString(r5, r4)
            java.lang.String r4 = "consent_source"
            r1.putInt(r4, r2)
            r1.apply()
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "Setting storage consent(FE)"
            r0.zzb(r1, r7)
            r6.zzq = r8
            com.google.android.gms.measurement.internal.zzny r6 = r3.zzu()
            boolean r6 = r6.zzac()
            if (r6 == 0) goto L82
            com.google.android.gms.measurement.internal.zzny r6 = r3.zzu()
            r6.zzX(r10)
            goto L89
        L82:
            com.google.android.gms.measurement.internal.zzny r6 = r3.zzu()
            r6.zzR(r10)
        L89:
            if (r11 == 0) goto L97
            com.google.android.gms.measurement.internal.zzny r6 = r3.zzu()
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r7.<init>()
            r6.zzE(r7)
        L97:
            return
        L98:
            com.google.android.gms.measurement.internal.zzhe r6 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzi()
            int r7 = r7.zzb()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Lower precedence consent source ignored, proposed source"
            r6.zzb(r8, r7)
            return
    }

    static /* bridge */ /* synthetic */ void zzE(com.google.android.gms.measurement.internal.zzlw r0, java.lang.Boolean r1, boolean r2) {
            r2 = 1
            r0.zzas(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ void zzF(com.google.android.gms.measurement.internal.zzlw r4, int r5) {
            com.google.android.gms.measurement.internal.zzaz r0 = r4.zzk
            if (r0 != 0) goto Ld
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzku r1 = new com.google.android.gms.measurement.internal.zzku
            r1.<init>(r4, r0)
            r4.zzk = r1
        Ld:
            com.google.android.gms.measurement.internal.zzaz r4 = r4.zzk
            long r0 = (long) r5
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r4.zzd(r0)
            return
    }

    static /* bridge */ /* synthetic */ void zzG(com.google.android.gms.measurement.internal.zzlw r0) {
            r0.zzat()
            return
    }

    static /* bridge */ /* synthetic */ int zzaq(com.google.android.gms.measurement.internal.zzlw r5, java.lang.Throwable r6) {
            java.lang.String r0 = r6.getMessage()
            r1 = 0
            r5.zzn = r1
            r1 = 1
            r2 = 2
            if (r0 != 0) goto Ld
        Lb:
            r1 = 2
            goto L41
        Ld:
            boolean r3 = r6 instanceof java.lang.IllegalStateException
            if (r3 != 0) goto L39
            java.lang.String r3 = "garbage collected"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L39
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r4 = "ServiceUnavailableException"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2a
            goto L39
        L2a:
            boolean r5 = r6 instanceof java.lang.SecurityException
            if (r5 == 0) goto Lb
            java.lang.String r5 = "READ_DEVICE_CONFIG"
            boolean r5 = r0.endsWith(r5)
            if (r5 == 0) goto L37
            goto Lb
        L37:
            r5 = 3
            return r5
        L39:
            java.lang.String r6 = "Background"
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L42
        L41:
            return r1
        L42:
            r5.zzn = r1
            return r1
    }

    private final com.google.android.gms.measurement.internal.zzme zzar(com.google.android.gms.measurement.internal.zzpa r11) {
            r10 = this;
            java.net.URI r0 = new java.net.URI     // Catch: java.net.MalformedURLException -> Lef java.net.URISyntaxException -> Lf1
            java.lang.String r1 = r11.zzc     // Catch: java.net.MalformedURLException -> Lef java.net.URISyntaxException -> Lf1
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> Lef java.net.URISyntaxException -> Lf1
            java.net.URL r5 = r0.toURL()     // Catch: java.net.MalformedURLException -> Lef java.net.URISyntaxException -> Lf1
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.measurement.internal.zzio r1 = r10.zzu
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()
            java.lang.String r4 = r1.zzn()
            com.google.android.gms.measurement.internal.zzio r1 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            long r6 = r11.zza
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = r11.zzc
            byte[] r7 = r11.zzb
            int r7 = r7.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "[sgtm] Uploading data from app. row_id, url, uncompressed size"
            r2.zzd(r8, r3, r6, r7)
            java.lang.String r2 = r11.zzg
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L4f
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r6 = r11.zzg
            java.lang.String r7 = "[sgtm] Uploading data from app. row_id"
            r2.zzc(r7, r3, r6)
        L4f:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            android.os.Bundle r2 = r11.zzd
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L5e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r2.getString(r6)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L5e
            r7.put(r6, r8)
            goto L5e
        L78:
            com.google.android.gms.measurement.internal.zzmb r3 = r1.zzr()
            byte[] r6 = r11.zzb
            com.google.android.gms.measurement.internal.zzkn r8 = new com.google.android.gms.measurement.internal.zzkn
            r8.<init>(r10, r0, r11)
            r3.zzv()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.measurement.internal.zzio r11 = r3.zzu
            com.google.android.gms.measurement.internal.zzil r11 = r11.zzaX()
            com.google.android.gms.measurement.internal.zzma r9 = new com.google.android.gms.measurement.internal.zzma
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.zzp(r9)
            com.google.android.gms.measurement.internal.zzqf r11 = r1.zzw()     // Catch: java.lang.InterruptedException -> Ld0
            com.google.android.gms.measurement.internal.zzio r11 = r11.zzu     // Catch: java.lang.InterruptedException -> Ld0
            com.google.android.gms.common.util.Clock r1 = r11.zzaU()     // Catch: java.lang.InterruptedException -> Ld0
            long r1 = r1.currentTimeMillis()     // Catch: java.lang.InterruptedException -> Ld0
            r3 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 + r3
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> Ld0
        Lb1:
            java.lang.Object r5 = r0.get()     // Catch: java.lang.Throwable -> Lcd
            if (r5 != 0) goto Lcb
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lcb
            r0.wait(r3)     // Catch: java.lang.Throwable -> Lcd
            com.google.android.gms.common.util.Clock r3 = r11.zzaU()     // Catch: java.lang.Throwable -> Lcd
            long r3 = r3.currentTimeMillis()     // Catch: java.lang.Throwable -> Lcd
            long r3 = r1 - r3
            goto Lb1
        Lcb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            goto Ldf
        Lcd:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            throw r11     // Catch: java.lang.InterruptedException -> Ld0
        Ld0:
            com.google.android.gms.measurement.internal.zzio r11 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r11 = r11.zzaW()
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zzk()
            java.lang.String r1 = "[sgtm] Interrupted waiting for uploading batch"
            r11.zza(r1)
        Ldf:
            java.lang.Object r11 = r0.get()
            if (r11 != 0) goto Le8
            com.google.android.gms.measurement.internal.zzme r11 = com.google.android.gms.measurement.internal.zzme.zza
            goto Lee
        Le8:
            java.lang.Object r11 = r0.get()
            com.google.android.gms.measurement.internal.zzme r11 = (com.google.android.gms.measurement.internal.zzme) r11
        Lee:
            return r11
        Lef:
            r0 = move-exception
            goto Lf2
        Lf1:
            r0 = move-exception
        Lf2:
            com.google.android.gms.measurement.internal.zzio r1 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = r11.zzc
            long r3 = r11.zza
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "[sgtm] Bad upload url for row_id"
            r1.zzd(r3, r2, r11, r0)
            com.google.android.gms.measurement.internal.zzme r11 = com.google.android.gms.measurement.internal.zzme.zzc
            return r11
    }

    private final void zzas(java.lang.Boolean r4, boolean r5) {
            r3 = this;
            r3.zzg()
            r3.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            java.lang.String r2 = "Setting app measurement enabled (FE)"
            r1.zzb(r2, r4)
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            r1.zzm(r4)
            if (r5 == 0) goto L41
            com.google.android.gms.measurement.internal.zzht r5 = r0.zzm()
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            r5.zzg()
            android.content.SharedPreferences r5 = r5.zzb()
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r0 = "measurement_enabled_from_api"
            if (r4 == 0) goto L3b
            boolean r1 = r4.booleanValue()
            r5.putBoolean(r0, r1)
            goto L3e
        L3b:
            r5.remove(r0)
        L3e:
            r5.apply()
        L41:
            com.google.android.gms.measurement.internal.zzio r5 = r3.zzu
            boolean r5 = r5.zzK()
            if (r5 != 0) goto L53
            if (r4 == 0) goto L52
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L52
            goto L53
        L52:
            return
        L53:
            r3.zzat()
            return
    }

    private final void zzat() {
            r9 = this;
            r9.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhr r1 = r1.zzh
            java.lang.String r1 = r1.zza()
            if (r1 == 0) goto L4d
            java.lang.String r2 = "unset"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L2b
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r6 = r1.currentTimeMillis()
            r5 = 0
            java.lang.String r3 = "app"
            java.lang.String r4 = "_npa"
            r2 = r9
            r2.zzan(r3, r4, r5, r6)
            goto L4d
        L2b:
            r2 = 1
            java.lang.String r3 = "true"
            boolean r1 = r3.equals(r1)
            if (r2 == r1) goto L37
            r1 = 0
            goto L39
        L37:
            r1 = 1
        L39:
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r7 = r1.currentTimeMillis()
            java.lang.String r4 = "app"
            java.lang.String r5 = "_npa"
            r3 = r9
            r3.zzan(r4, r5, r6, r7)
        L4d:
            com.google.android.gms.measurement.internal.zzio r1 = r9.zzu
            boolean r1 = r1.zzJ()
            if (r1 == 0) goto L81
            boolean r1 = r9.zzc
            if (r1 == 0) goto L81
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            java.lang.String r2 = "Recording app launch after enabling measurement for the first time (FE)"
            r1.zza(r2)
            r9.zzH()
            com.google.android.gms.measurement.internal.zzio r1 = r9.zzu
            com.google.android.gms.measurement.internal.zzop r1 = r1.zzv()
            com.google.android.gms.measurement.internal.zzoo r1 = r1.zza
            r1.zza()
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzkw r1 = new com.google.android.gms.measurement.internal.zzkw
            r1.<init>(r9)
            r0.zzq(r1)
            return
        L81:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r1 = "Updating Scion state (FE)"
            r0.zza(r1)
            com.google.android.gms.measurement.internal.zzio r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzny r0 = r0.zzu()
            r0.zzV()
            return
    }

    static /* bridge */ /* synthetic */ int zzh(com.google.android.gms.measurement.internal.zzlw r0) {
            int r0 = r0.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzaz zzj(com.google.android.gms.measurement.internal.zzlw r0) {
            com.google.android.gms.measurement.internal.zzaz r0 = r0.zzr
            return r0
    }

    public static /* synthetic */ void zzz(com.google.android.gms.measurement.internal.zzlw r14, android.os.Bundle r15) {
            boolean r0 = r15.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            r2 = r15
            goto Lee
        La:
            com.google.android.gms.measurement.internal.zzio r0 = r14.zzu
            android.os.Bundle r2 = new android.os.Bundle
            com.google.android.gms.measurement.internal.zzht r3 = r0.zzm()
            com.google.android.gms.measurement.internal.zzho r3 = r3.zzt
            android.os.Bundle r3 = r3.zza()
            r2.<init>(r3)
            java.util.Set r3 = r15.keySet()
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L9f
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r15.get(r4)
            if (r6 == 0) goto L69
            boolean r7 = r6 instanceof java.lang.String
            if (r7 != 0) goto L69
            boolean r7 = r6 instanceof java.lang.Long
            if (r7 != 0) goto L69
            boolean r7 = r6 instanceof java.lang.Double
            if (r7 != 0) goto L69
            com.google.android.gms.measurement.internal.zzqf r5 = r0.zzw()
            boolean r5 = r5.zzal(r6)
            if (r5 == 0) goto L5b
            com.google.android.gms.measurement.internal.zzqf r7 = r0.zzw()
            com.google.android.gms.measurement.internal.zzqe r8 = r14.zzv
            r9 = 0
            r10 = 27
            r11 = 0
            r12 = 0
            r13 = 0
            r7.zzR(r8, r9, r10, r11, r12, r13)
        L5b:
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzl()
            java.lang.String r7 = "Invalid default event parameter type. Name, value"
            r5.zzc(r7, r4, r6)
            goto L23
        L69:
            boolean r7 = com.google.android.gms.measurement.internal.zzqf.zzap(r4)
            if (r7 == 0) goto L7d
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzl()
            java.lang.String r6 = "Invalid default event parameter name. Name"
            r5.zzb(r6, r4)
            goto L23
        L7d:
            if (r6 != 0) goto L83
            r2.remove(r4)
            goto L23
        L83:
            com.google.android.gms.measurement.internal.zzqf r7 = r0.zzw()
            com.google.android.gms.measurement.internal.zzam r8 = r0.zzf()
            int r5 = r8.zzc(r1, r5)
            java.lang.String r8 = "param"
            boolean r5 = r7.zzaf(r8, r4, r5, r6)
            if (r5 == 0) goto L23
            com.google.android.gms.measurement.internal.zzqf r5 = r0.zzw()
            r5.zzS(r2, r4, r6)
            goto L23
        L9f:
            r0.zzw()
            com.google.android.gms.measurement.internal.zzam r3 = r0.zzf()
            int r3 = r3.zze()
            int r4 = r2.size()
            if (r4 > r3) goto Lb1
            goto Lee
        Lb1:
            java.util.TreeSet r4 = new java.util.TreeSet
            java.util.Set r6 = r2.keySet()
            r4.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        Lbe:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Ld2
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r5 + 1
            if (r5 <= r3) goto Lbe
            r2.remove(r6)
            goto Lbe
        Ld2:
            com.google.android.gms.measurement.internal.zzqf r7 = r0.zzw()
            com.google.android.gms.measurement.internal.zzqe r8 = r14.zzv
            r9 = 0
            r10 = 26
            r11 = 0
            r12 = 0
            r13 = 0
            r7.zzR(r8, r9, r10, r11, r12, r13)
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzl()
            java.lang.String r3 = "Too many default event parameters set. Discarding beyond event parameter limit"
            r0.zza(r3)
        Lee:
            com.google.android.gms.measurement.internal.zzio r0 = r14.zzu
            com.google.android.gms.measurement.internal.zzht r3 = r0.zzm()
            com.google.android.gms.measurement.internal.zzho r3 = r3.zzt
            r3.zzb(r2)
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L10d
            com.google.android.gms.measurement.internal.zzam r15 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzbd
            boolean r15 = r15.zzx(r1, r0)
            if (r15 == 0) goto L10c
            goto L10d
        L10c:
            return
        L10d:
            com.google.android.gms.measurement.internal.zzio r14 = r14.zzu
            com.google.android.gms.measurement.internal.zzny r14 = r14.zzu()
            r14.zzT(r2)
            return
    }

    public final void zzH() {
            r6 = this;
            r6.zzg()
            r6.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            boolean r0 = r0.zzM()
            if (r0 != 0) goto L10
            goto La9
        L10:
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            r2.zzaV()
            java.lang.String r2 = "google_analytics_deferred_deep_link_enabled"
            java.lang.Boolean r1 = r1.zzn(r2)
            if (r1 == 0) goto L42
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L42
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            java.lang.String r2 = "Deferred Deep Link feature enabled."
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzko r2 = new com.google.android.gms.measurement.internal.zzko
            r2.<init>(r6)
            r1.zzq(r2)
        L42:
            com.google.android.gms.measurement.internal.zzio r1 = r6.zzu
            com.google.android.gms.measurement.internal.zzny r1 = r1.zzu()
            r1.zzA()
            r1 = 0
            r6.zzc = r1
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            r1.zzg()
            android.content.SharedPreferences r2 = r1.zzb()
            r3 = 0
            java.lang.String r4 = "previous_os_version"
            java.lang.String r2 = r2.getString(r4, r3)
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu
            com.google.android.gms.measurement.internal.zzbb r3 = r3.zzg()
            r3.zzv()
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L85
            boolean r5 = r3.equals(r2)
            if (r5 != 0) goto L85
            android.content.SharedPreferences r1 = r1.zzb()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r4, r3)
            r1.apply()
        L85:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto La9
            com.google.android.gms.measurement.internal.zzbb r0 = r0.zzg()
            r0.zzv()
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto La9
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "_po"
            r0.putString(r1, r2)
            java.lang.String r1 = "auto"
            java.lang.String r2 = "_ou"
            r6.zzR(r1, r2, r0)
        La9:
            return
    }

    final void zzI() {
            r1 = this;
            r1.zzg()
            com.google.android.gms.measurement.internal.zzaz r0 = r1.zzl
            if (r0 == 0) goto La
            r0.zzb()
        La:
            return
    }

    public final void zzJ(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
            r5 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.currentTimeMillis()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "name"
            r3.putString(r4, r6)
            java.lang.String r6 = "creation_timestamp"
            r3.putLong(r6, r1)
            if (r7 == 0) goto L28
            java.lang.String r6 = "expired_event_name"
            r3.putString(r6, r7)
            java.lang.String r6 = "expired_event_params"
            r3.putBundle(r6, r8)
        L28:
            com.google.android.gms.measurement.internal.zzil r6 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzlg r7 = new com.google.android.gms.measurement.internal.zzlg
            r7.<init>(r5, r3)
            r6.zzq(r7)
            return
    }

    public final void zzK() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r1 = r0.zzaT()
            android.content.Context r1 = r1.getApplicationContext()
            boolean r1 = r1 instanceof android.app.Application
            if (r1 == 0) goto L21
            com.google.android.gms.measurement.internal.zzlv r1 = r2.zza
            if (r1 == 0) goto L21
            android.content.Context r0 = r0.zzaT()
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            com.google.android.gms.measurement.internal.zzlv r1 = r2.zza
            r0.unregisterActivityLifecycleCallbacks(r1)
        L21:
            return
    }

    final void zzL() {
            r9 = this;
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaW
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 == 0) goto L89
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            boolean r1 = r1.zzu()
            if (r1 != 0) goto L7c
            r0.zzaV()
            boolean r1 = com.google.android.gms.measurement.internal.zzaf.zza()
            if (r1 != 0) goto L6e
            r9.zza()
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Getting trigger URIs (FE)"
            r1.zza(r2)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzil r3 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzki r8 = new com.google.android.gms.measurement.internal.zzki
            r8.<init>(r9, r1)
            r5 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r7 = "get trigger URIs"
            r4 = r1
            r3.zze(r4, r5, r7, r8)
            java.lang.Object r1 = r1.get()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L61
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Timed out waiting for get trigger URIs"
            r0.zza(r1)
            return
        L61:
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzkj r2 = new com.google.android.gms.measurement.internal.zzkj
            r2.<init>(r9, r1)
            r0.zzq(r2)
            return
        L6e:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Cannot get trigger URIs from main thread"
            r0.zza(r1)
            return
        L7c:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Cannot get trigger URIs from analytics worker thread"
            r0.zza(r1)
        L89:
            return
    }

    public final void zzM() {
            r6 = this;
            r6.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhn r1 = r1.zzo
            boolean r1 = r1.zzb()
            if (r1 != 0) goto L5d
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r1 = r1.zzp
            long r1 = r1.zza()
            com.google.android.gms.measurement.internal.zzht r3 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r3 = r3.zzp
            r4 = 1
            long r4 = r4 + r1
            r3.zzb(r4)
            r0.zzf()
            r3 = 5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L48
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhn r0 = r0.zzo
            r1 = 1
            r0.zza(r1)
            return
        L48:
            com.google.android.gms.measurement.internal.zzaz r0 = r6.zzr
            if (r0 != 0) goto L55
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzld r1 = new com.google.android.gms.measurement.internal.zzld
            r1.<init>(r6, r0)
            r6.zzr = r1
        L55:
            com.google.android.gms.measurement.internal.zzaz r0 = r6.zzr
            r1 = 0
            r0.zzd(r1)
            return
        L5d:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r1 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.zza(r1)
            return
    }

    public final void zzN() {
            r32 = this;
            r0 = r32
            r32.zzg()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzd()
            java.lang.String r3 = "Handle tcf update."
            r2.zza(r3)
            com.google.android.gms.measurement.internal.zzht r2 = r1.zzm()
            android.content.SharedPreferences r2 = r2.zza()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzbj
            r5 = 0
            java.lang.Object r6 = r4.zza(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r7 = "IABTCF_PurposeConsents"
            java.lang.String r8 = "IABTCF_EnableAdvertiserConsentMode"
            java.lang.String r9 = "IABTCF_gdprApplies"
            java.lang.String r10 = "IABTCF_PolicyVersion"
            java.lang.String r11 = "IABTCF_CmpSdkID"
            java.lang.String r12 = "IABTCF_VendorConsents"
            java.lang.String r14 = ""
            r5 = 1
            r16 = 0
            if (r6 == 0) goto L17c
            int r3 = com.google.android.gms.measurement.internal.zzot.zzb
            r3 = 7
            java.util.Map$Entry[] r3 = new java.util.Map.Entry[r3]
            com.google.android.gms.internal.measurement.zzkl r6 = com.google.android.gms.internal.measurement.zzkl.zzb
            com.google.android.gms.measurement.internal.zzos r15 = com.google.android.gms.measurement.internal.zzos.zza
            java.util.Map$Entry r6 = com.google.android.gms.measurement.internal.zzor.zza(r6, r15)
            r3[r16] = r6
            com.google.android.gms.internal.measurement.zzkl r6 = com.google.android.gms.internal.measurement.zzkl.zzc
            com.google.android.gms.measurement.internal.zzos r13 = com.google.android.gms.measurement.internal.zzos.zzd
            java.util.Map$Entry r6 = com.google.android.gms.measurement.internal.zzor.zza(r6, r13)
            r3[r5] = r6
            com.google.android.gms.internal.measurement.zzkl r6 = com.google.android.gms.internal.measurement.zzkl.zzd
            java.util.Map$Entry r6 = com.google.android.gms.measurement.internal.zzor.zza(r6, r15)
            r17 = 2
            r3[r17] = r6
            r6 = 3
            com.google.android.gms.internal.measurement.zzkl r5 = com.google.android.gms.internal.measurement.zzkl.zze
            java.util.Map$Entry r5 = com.google.android.gms.measurement.internal.zzor.zza(r5, r15)
            r3[r6] = r5
            r5 = 4
            com.google.android.gms.internal.measurement.zzkl r6 = com.google.android.gms.internal.measurement.zzkl.zzh
            java.util.Map$Entry r6 = com.google.android.gms.measurement.internal.zzor.zza(r6, r13)
            r3[r5] = r6
            com.google.android.gms.internal.measurement.zzkl r5 = com.google.android.gms.internal.measurement.zzkl.zzj
            java.util.Map$Entry r5 = com.google.android.gms.measurement.internal.zzor.zza(r5, r13)
            r6 = 5
            r3[r6] = r5
            r5 = 6
            com.google.android.gms.internal.measurement.zzkl r15 = com.google.android.gms.internal.measurement.zzkl.zzk
            java.util.Map$Entry r13 = com.google.android.gms.measurement.internal.zzor.zza(r15, r13)
            r3[r5] = r13
            com.google.common.collect.ImmutableMap r18 = com.google.common.collect.ImmutableMap.ofEntries(r3)
            java.lang.String r3 = "CH"
            com.google.common.collect.ImmutableSet r20 = com.google.common.collect.ImmutableSet.of(r3)
            char[] r3 = new char[r6]
            int r22 = com.google.android.gms.measurement.internal.zzot.zza(r2, r11)
            int r25 = com.google.android.gms.measurement.internal.zzot.zza(r2, r10)
            int r24 = com.google.android.gms.measurement.internal.zzot.zza(r2, r9)
            java.lang.String r5 = "IABTCF_PurposeOneTreatment"
            int r26 = com.google.android.gms.measurement.internal.zzot.zza(r2, r5)
            int r23 = com.google.android.gms.measurement.internal.zzot.zza(r2, r8)
            java.lang.String r5 = "IABTCF_PublisherCC"
            java.lang.String r27 = com.google.android.gms.measurement.internal.zzot.zzb(r2, r5)
            com.google.common.collect.ImmutableMap$Builder r5 = com.google.common.collect.ImmutableMap.builder()
            com.google.common.collect.ImmutableSet r6 = r18.keySet()
            com.google.common.collect.UnmodifiableIterator r6 = r6.iterator()
        Lbc:
            boolean r8 = r6.hasNext()
            r9 = 755(0x2f3, float:1.058E-42)
            if (r8 == 0) goto L120
            java.lang.Object r8 = r6.next()
            com.google.android.gms.internal.measurement.zzkl r8 = (com.google.android.gms.internal.measurement.zzkl) r8
            int r10 = r8.zza()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "IABTCF_PublisherRestrictions"
            r11.append(r13)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r10 = com.google.android.gms.measurement.internal.zzot.zzb(r2, r10)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L11a
            int r11 = r10.length()
            if (r11 >= r9) goto Lf0
            goto L11a
        Lf0:
            r9 = 754(0x2f2, float:1.057E-42)
            char r10 = r10.charAt(r9)
            r9 = 10
            int r9 = java.lang.Character.digit(r10, r9)
            if (r9 < 0) goto L117
            com.google.android.gms.internal.measurement.zzkm[] r10 = com.google.android.gms.internal.measurement.zzkm.values()
            int r10 = r10.length
            if (r9 <= r10) goto L106
            goto L117
        L106:
            if (r9 == 0) goto L117
            r10 = 1
            if (r9 == r10) goto L114
            r10 = 2
            if (r9 == r10) goto L111
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.internal.measurement.zzkm.zzd
            goto L11c
        L111:
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.internal.measurement.zzkm.zzc
            goto L11c
        L114:
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.internal.measurement.zzkm.zzb
            goto L11c
        L117:
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.internal.measurement.zzkm.zza
            goto L11c
        L11a:
            com.google.android.gms.internal.measurement.zzkm r9 = com.google.android.gms.internal.measurement.zzkm.zzd
        L11c:
            r5.put(r8, r9)
            goto Lbc
        L120:
            com.google.common.collect.ImmutableMap r19 = r5.buildOrThrow()
            java.lang.String r28 = com.google.android.gms.measurement.internal.zzot.zzb(r2, r7)
            java.lang.String r5 = com.google.android.gms.measurement.internal.zzot.zzb(r2, r12)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            r7 = 49
            if (r6 != 0) goto L145
            int r6 = r5.length()
            if (r6 < r9) goto L145
            r6 = 754(0x2f2, float:1.057E-42)
            char r5 = r5.charAt(r6)
            if (r5 != r7) goto L145
            r30 = 1
            goto L147
        L145:
            r30 = 0
        L147:
            java.lang.String r5 = "IABTCF_PurposeLegitimateInterests"
            java.lang.String r29 = com.google.android.gms.measurement.internal.zzot.zzb(r2, r5)
            java.lang.String r5 = "IABTCF_VendorLegitimateInterests"
            java.lang.String r2 = com.google.android.gms.measurement.internal.zzot.zzb(r2, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L16a
            int r5 = r2.length()
            if (r5 < r9) goto L16a
            r5 = 754(0x2f2, float:1.057E-42)
            char r2 = r2.charAt(r5)
            if (r2 != r7) goto L16a
            r31 = 1
            goto L16c
        L16a:
            r31 = 0
        L16c:
            r2 = 50
            r3[r16] = r2
            com.google.android.gms.measurement.internal.zzoq r2 = new com.google.android.gms.measurement.internal.zzoq
            r21 = r3
            java.util.Map r3 = com.google.android.gms.measurement.internal.zzot.zzc(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r2.<init>(r3)
            goto L1ec
        L17c:
            java.lang.String r5 = com.google.android.gms.measurement.internal.zzot.zzb(r2, r12)
            boolean r6 = r14.equals(r5)
            if (r6 != 0) goto L19b
            int r6 = r5.length()
            r12 = 754(0x2f2, float:1.057E-42)
            if (r6 <= r12) goto L19b
            char r5 = r5.charAt(r12)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "GoogleConsent"
            r3.put(r6, r5)
        L19b:
            int r5 = com.google.android.gms.measurement.internal.zzot.zza(r2, r9)
            r6 = -1
            if (r5 == r6) goto L1ab
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r9 = "gdprApplies"
            r3.put(r9, r5)
        L1ab:
            int r5 = com.google.android.gms.measurement.internal.zzot.zza(r2, r8)
            if (r5 == r6) goto L1ba
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = "EnableAdvertiserConsentMode"
            r3.put(r8, r5)
        L1ba:
            int r5 = com.google.android.gms.measurement.internal.zzot.zza(r2, r10)
            if (r5 == r6) goto L1c9
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r8 = "PolicyVersion"
            r3.put(r8, r5)
        L1c9:
            java.lang.String r5 = com.google.android.gms.measurement.internal.zzot.zzb(r2, r7)
            boolean r7 = r14.equals(r5)
            if (r7 != 0) goto L1d8
            java.lang.String r7 = "PurposeConsents"
            r3.put(r7, r5)
        L1d8:
            int r2 = com.google.android.gms.measurement.internal.zzot.zza(r2, r11)
            if (r2 == r6) goto L1e7
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "CmpSdkID"
            r3.put(r5, r2)
        L1e7:
            com.google.android.gms.measurement.internal.zzoq r2 = new com.google.android.gms.measurement.internal.zzoq
            r2.<init>(r3)
        L1ec:
            com.google.android.gms.measurement.internal.zzhe r3 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            java.lang.String r5 = "Tcf preferences read"
            r3.zzb(r5, r2)
            com.google.android.gms.measurement.internal.zzam r3 = r1.zzf()
            r5 = 0
            boolean r3 = r3.zzx(r5, r4)
            r4 = -30
            java.lang.String r5 = "_tcf"
            java.lang.String r6 = "auto"
            java.lang.String r7 = "_tcfd"
            java.lang.String r8 = "Consent generated from Tcf"
            if (r3 == 0) goto L2ac
            com.google.android.gms.measurement.internal.zzht r3 = r1.zzm()
            r3.zzg()
            android.content.SharedPreferences r3 = r3.zzb()
            java.lang.String r9 = "stored_tcf_param"
            java.lang.String r3 = r3.getString(r9, r14)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 == 0) goto L230
            com.google.android.gms.measurement.internal.zzoq r3 = new com.google.android.gms.measurement.internal.zzoq
            r3.<init>(r9)
            goto L262
        L230:
            java.lang.String r10 = ";"
            java.lang.String[] r3 = r3.split(r10)
            int r10 = r3.length
            r11 = 0
        L238:
            if (r11 >= r10) goto L25d
            r12 = r3[r11]
            java.lang.String r13 = "="
            java.lang.String[] r12 = r12.split(r13)
            int r13 = r12.length
            r14 = 2
            if (r13 < r14) goto L259
            com.google.common.collect.ImmutableList r13 = com.google.android.gms.measurement.internal.zzot.zza
            r15 = r12[r16]
            boolean r13 = r13.contains(r15)
            if (r13 == 0) goto L259
            r13 = r12[r16]
            r15 = 1
            r12 = r12[r15]
            r9.put(r13, r12)
            goto L25a
        L259:
            r15 = 1
        L25a:
            int r11 = r11 + 1
            goto L238
        L25d:
            com.google.android.gms.measurement.internal.zzoq r3 = new com.google.android.gms.measurement.internal.zzoq
            r3.<init>(r9)
        L262:
            com.google.android.gms.measurement.internal.zzht r9 = r1.zzm()
            boolean r9 = r9.zzr(r2)
            if (r9 == 0) goto L2e3
            android.os.Bundle r9 = r2.zza()
            com.google.android.gms.measurement.internal.zzhe r10 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzj()
            r10.zzb(r8, r9)
            android.os.Bundle r8 = android.os.Bundle.EMPTY
            if (r9 == r8) goto L28a
            com.google.android.gms.common.util.Clock r1 = r1.zzaU()
            long r10 = r1.currentTimeMillis()
            r0.zzaf(r9, r4, r10)
        L28a:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r2.zzc(r3)
            java.lang.String r4 = "_tcfm"
            r1.putString(r4, r3)
            java.lang.String r3 = r2.zzb()
            java.lang.String r4 = "_tcfd2"
            r1.putString(r4, r3)
            java.lang.String r2 = r2.zzd()
            r1.putString(r7, r2)
            r0.zzR(r6, r5, r1)
            return
        L2ac:
            com.google.android.gms.measurement.internal.zzht r3 = r1.zzm()
            boolean r3 = r3.zzr(r2)
            if (r3 == 0) goto L2e3
            android.os.Bundle r3 = r2.zza()
            com.google.android.gms.measurement.internal.zzhe r9 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzj()
            r9.zzb(r8, r3)
            android.os.Bundle r8 = android.os.Bundle.EMPTY
            if (r3 == r8) goto L2d4
            com.google.android.gms.common.util.Clock r1 = r1.zzaU()
            long r8 = r1.currentTimeMillis()
            r0.zzaf(r3, r4, r8)
        L2d4:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r2.zzd()
            r1.putString(r7, r2)
            r0.zzR(r6, r5, r1)
        L2e3:
            return
    }

    public final void zzO(java.lang.String r10, java.lang.String r11, android.os.Bundle r12) {
            r9 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r9.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r7 = r0.currentTimeMillis()
            r5 = 1
            r6 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.zzP(r2, r3, r4, r5, r6, r7)
            return
    }

    public final void zzP(java.lang.String r12, java.lang.String r13, android.os.Bundle r14, boolean r15, boolean r16, long r17) {
            r11 = this;
            r10 = r11
            if (r14 != 0) goto La
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r5 = r0
            goto Lb
        La:
            r5 = r14
        Lb:
            java.lang.String r0 = "screen_view"
            r2 = r13
            boolean r0 = java.util.Objects.equals(r13, r0)
            if (r0 == 0) goto L20
            com.google.android.gms.measurement.internal.zzio r0 = r10.zzu
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            r3 = r17
            r0.zzy(r5, r3)
            return
        L20:
            r3 = r17
            r0 = 1
            if (r16 == 0) goto L33
            com.google.android.gms.measurement.internal.zzkb r1 = r10.zzd
            if (r1 == 0) goto L33
            boolean r1 = com.google.android.gms.measurement.internal.zzqf.zzap(r13)
            if (r1 == 0) goto L30
            goto L33
        L30:
            r0 = 0
            r7 = 0
            goto L34
        L33:
            r7 = 1
        L34:
            if (r12 != 0) goto L3a
            java.lang.String r0 = "app"
            r1 = r0
            goto L3b
        L3a:
            r1 = r12
        L3b:
            r9 = 0
            r0 = r11
            r2 = r13
            r3 = r17
            r6 = r16
            r8 = r15
            r0.zzZ(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    public final void zzQ(java.lang.String r11, java.lang.String r12, android.os.Bundle r13, java.lang.String r14) {
            r10 = this;
            com.google.android.gms.measurement.internal.zzio.zzP()
            com.google.android.gms.measurement.internal.zzio r11 = r10.zzu
            com.google.android.gms.common.util.Clock r11 = r11.zzaU()
            long r3 = r11.currentTimeMillis()
            java.lang.String r1 = "auto"
            r6 = 0
            r7 = 1
            r8 = 1
            r0 = r10
            r2 = r12
            r5 = r13
            r9 = r14
            r0.zzZ(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    final void zzR(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
            r7 = this;
            r7.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r4 = r0.currentTimeMillis()
            r1 = r7
            r2 = r8
            r3 = r9
            r6 = r10
            r1.zzS(r2, r3, r4, r6)
            return
    }

    final void zzS(java.lang.String r12, java.lang.String r13, long r14, android.os.Bundle r16) {
            r11 = this;
            r11.zzg()
            r10 = r11
            com.google.android.gms.measurement.internal.zzkb r0 = r10.zzd
            r1 = 1
            if (r0 == 0) goto L13
            boolean r0 = com.google.android.gms.measurement.internal.zzqf.zzap(r13)
            if (r0 == 0) goto L10
            goto L13
        L10:
            r0 = 0
            r7 = 0
            goto L14
        L13:
            r7 = 1
        L14:
            r6 = 1
            r8 = 1
            r9 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r0.zzT(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    protected final void zzT(java.lang.String r25, java.lang.String r26, long r27, android.os.Bundle r29, boolean r30, boolean r31, boolean r32, java.lang.String r33) {
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r29
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r25)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r29)
            r24.zzg()
            r24.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            boolean r1 = r0.zzJ()
            if (r1 == 0) goto L4ad
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzgs r1 = r1.zzh()
            java.util.List r1 = r1.zzp()
            if (r1 == 0) goto L41
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L31
            goto L41
        L31:
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.zzc(r1, r9, r8)
            return
        L41:
            boolean r1 = r7.zzf
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L9f
            r7.zzf = r15
            boolean r0 = r0.zzN()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L61
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu     // Catch: java.lang.ClassNotFoundException -> L90
            android.content.Context r0 = r0.zzaT()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.Class r0 = java.lang.Class.forName(r1, r15, r0)     // Catch: java.lang.ClassNotFoundException -> L90
            goto L65
        L61:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L90
        L65:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch: java.lang.Exception -> L7f
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r14] = r3     // Catch: java.lang.Exception -> L7f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L7f
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L7f
            com.google.android.gms.measurement.internal.zzio r2 = r7.zzu     // Catch: java.lang.Exception -> L7f
            android.content.Context r2 = r2.zzaT()     // Catch: java.lang.Exception -> L7f
            r1[r14] = r2     // Catch: java.lang.Exception -> L7f
            r0.invoke(r13, r1)     // Catch: java.lang.Exception -> L7f
            goto L9f
        L7f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu     // Catch: java.lang.ClassNotFoundException -> L90
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.ClassNotFoundException -> L90
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()     // Catch: java.lang.ClassNotFoundException -> L90
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.zzb(r2, r0)     // Catch: java.lang.ClassNotFoundException -> L90
            goto L9f
        L90:
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzi()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.zza(r1)
        L9f:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto Lc9
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto Lc9
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            r1.zzaV()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.Clock r0 = r1.zzaU()
            long r5 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r24
            r1.zzan(r2, r3, r4, r5)
        Lc9:
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            r0.zzaV()
            if (r30 == 0) goto Le7
            boolean r1 = com.google.android.gms.measurement.internal.zzqf.zzau(r26)
            if (r1 == 0) goto Le7
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            com.google.android.gms.measurement.internal.zzht r2 = r0.zzm()
            com.google.android.gms.measurement.internal.zzho r2 = r2.zzt
            android.os.Bundle r2 = r2.zza()
            r1.zzO(r12, r2)
        Le7:
            r1 = 40
            if (r32 != 0) goto L163
            r0.zzaV()
            java.lang.String r2 = "_iap"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L163
            com.google.android.gms.measurement.internal.zzio r2 = r7.zzu
            com.google.android.gms.measurement.internal.zzqf r3 = r2.zzw()
            java.lang.String r4 = "event"
            boolean r5 = r3.zzah(r4, r9)
            if (r5 != 0) goto L106
        L104:
            r6 = 2
            goto L120
        L106:
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.zzjy.zza
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.zzjy.zzb
            boolean r5 = r3.zzae(r4, r5, r6, r9)
            if (r5 != 0) goto L113
            r6 = 13
            goto L120
        L113:
            com.google.android.gms.measurement.internal.zzio r5 = r3.zzu
            r5.zzf()
            boolean r3 = r3.zzad(r4, r1, r9)
            if (r3 != 0) goto L11f
            goto L104
        L11f:
            r6 = 0
        L120:
            if (r6 == 0) goto L163
            com.google.android.gms.measurement.internal.zzhe r3 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzf()
            com.google.android.gms.measurement.internal.zzgx r0 = r0.zzj()
            java.lang.String r0 = r0.zzd(r9)
            java.lang.String r4 = "Invalid public event name. Event will not be logged (FE)"
            r3.zzb(r4, r0)
            com.google.android.gms.measurement.internal.zzqf r0 = r2.zzw()
            r2.zzf()
            java.lang.String r0 = r0.zzG(r9, r1, r15)
            if (r9 == 0) goto L148
            int r14 = r26.length()
        L148:
            com.google.android.gms.measurement.internal.zzqf r1 = r2.zzw()
            com.google.android.gms.measurement.internal.zzqe r2 = r7.zzv
            r3 = 0
            java.lang.String r4 = "_ev"
            r25 = r1
            r26 = r2
            r27 = r3
            r28 = r6
            r29 = r4
            r30 = r0
            r31 = r14
            r25.zzR(r26, r27, r28, r29, r30, r31)
            return
        L163:
            r0.zzaV()
            com.google.android.gms.measurement.internal.zzio r6 = r7.zzu
            com.google.android.gms.measurement.internal.zzmo r2 = r6.zzt()
            com.google.android.gms.measurement.internal.zzmh r2 = r2.zzj(r14)
            java.lang.String r3 = "_sc"
            if (r2 == 0) goto L17c
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L17c
            r2.zzd = r15
        L17c:
            if (r30 == 0) goto L182
            if (r32 != 0) goto L182
            r4 = 1
            goto L183
        L182:
            r4 = 0
        L183:
            com.google.android.gms.measurement.internal.zzqf.zzN(r2, r12, r4)
            java.lang.String r2 = "am"
            boolean r2 = r2.equals(r8)
            boolean r4 = com.google.android.gms.measurement.internal.zzqf.zzap(r26)
            if (r30 == 0) goto L1cd
            com.google.android.gms.measurement.internal.zzkb r5 = r7.zzd
            if (r5 == 0) goto L1cd
            if (r4 != 0) goto L1cd
            if (r2 == 0) goto L19d
            r16 = 1
            goto L1cf
        L19d:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzgx r2 = r0.zzj()
            java.lang.String r2 = r2.zzd(r9)
            com.google.android.gms.measurement.internal.zzgx r0 = r0.zzj()
            java.lang.String r0 = r0.zzb(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r1.zzc(r3, r2, r0)
            com.google.android.gms.measurement.internal.zzkb r0 = r7.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzkb r1 = r7.zzd
            r2 = r25
            r3 = r26
            r4 = r29
            r5 = r27
            r1.interceptEvent(r2, r3, r4, r5)
            return
        L1cd:
            r16 = r2
        L1cf:
            com.google.android.gms.measurement.internal.zzio r5 = r7.zzu
            boolean r2 = r5.zzM()
            if (r2 != 0) goto L1d9
            goto L4ac
        L1d9:
            com.google.android.gms.measurement.internal.zzqf r2 = r0.zzw()
            int r2 = r2.zzf(r9)
            if (r2 == 0) goto L223
            com.google.android.gms.measurement.internal.zzhe r3 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzf()
            com.google.android.gms.measurement.internal.zzgx r4 = r0.zzj()
            java.lang.String r4 = r4.zzd(r9)
            java.lang.String r6 = "Invalid event name. Event will not be logged (FE)"
            r3.zzb(r6, r4)
            com.google.android.gms.measurement.internal.zzqf r3 = r0.zzw()
            r0.zzf()
            java.lang.String r0 = r3.zzG(r9, r1, r15)
            if (r9 == 0) goto L209
            int r14 = r26.length()
        L209:
            com.google.android.gms.measurement.internal.zzqf r1 = r5.zzw()
            com.google.android.gms.measurement.internal.zzqe r3 = r7.zzv
            java.lang.String r4 = "_ev"
            r25 = r1
            r26 = r3
            r27 = r33
            r28 = r2
            r29 = r4
            r30 = r0
            r31 = r14
            r25.zzR(r26, r27, r28, r29, r30, r31)
            return
        L223:
            java.lang.String r4 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r2 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r4, r1, r3, r2}
            java.util.List r17 = com.google.android.gms.common.util.CollectionUtils.listOf(r1)
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            r2 = r33
            r3 = r26
            r18 = r4
            r4 = r29
            r12 = r5
            r5 = r17
            r17 = r6
            r6 = r32
            android.os.Bundle r5 = r1.zzA(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r0.zzaV()
            com.google.android.gms.measurement.internal.zzmo r1 = r17.zzt()
            com.google.android.gms.measurement.internal.zzmh r1 = r1.zzj(r14)
            java.lang.String r6 = "_ae"
            if (r1 == 0) goto L285
            boolean r1 = r6.equals(r9)
            if (r1 == 0) goto L285
            com.google.android.gms.measurement.internal.zzop r1 = r17.zzv()
            com.google.android.gms.measurement.internal.zzon r1 = r1.zzb
            com.google.android.gms.measurement.internal.zzop r2 = r1.zzc
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.common.util.Clock r2 = r2.zzaU()
            long r14 = r2.elapsedRealtime()
            long r3 = r1.zzb
            long r2 = r14 - r3
            r1.zzb = r14
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 <= 0) goto L285
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            r1.zzL(r5, r2)
        L285:
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L2d7
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L2d7
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            java.lang.String r2 = r5.getString(r2)
            boolean r3 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r2)
            if (r3 == 0) goto L2a7
            r2 = r13
            goto L2ad
        L2a7:
            if (r2 == 0) goto L2ad
            java.lang.String r2 = r2.trim()
        L2ad:
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzht r3 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhr r3 = r3.zzq
            java.lang.String r3 = r3.zza()
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L2c9
            com.google.android.gms.measurement.internal.zzht r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhr r1 = r1.zzq
            r1.zzb(r2)
            goto L2f6
        L2c9:
            com.google.android.gms.measurement.internal.zzhe r0 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.zza(r1)
            return
        L2d7:
            boolean r1 = r6.equals(r9)
            if (r1 == 0) goto L2f6
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhr r1 = r1.zzq
            java.lang.String r1 = r1.zza()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L2f6
            r5.putString(r2, r1)
        L2f6:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r5)
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzba
            boolean r1 = r1.zzx(r13, r2)
            if (r1 == 0) goto L313
            com.google.android.gms.measurement.internal.zzop r1 = r17.zzv()
            boolean r1 = r1.zzp()
            goto L31d
        L313:
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhn r1 = r1.zzn
            boolean r1 = r1.zzb()
        L31d:
            com.google.android.gms.measurement.internal.zzht r2 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r2 = r2.zzk
            long r2 = r2.zza()
            r19 = 0
            int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r4 <= 0) goto L38d
            com.google.android.gms.measurement.internal.zzht r2 = r0.zzm()
            boolean r2 = r2.zzp(r10)
            if (r2 == 0) goto L38d
            if (r1 == 0) goto L38d
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.zza(r2)
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r21 = r1.currentTimeMillis()
            r4 = 0
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r24
            r29 = r14
            r13 = r19
            r15 = r5
            r23 = r6
            r5 = r21
            r1.zzan(r2, r3, r4, r5)
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r24
            r1.zzan(r2, r3, r4, r5)
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r24
            r1.zzan(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhp r1 = r1.zzl
            r1.zzb(r13)
            goto L394
        L38d:
            r15 = r5
            r23 = r6
            r29 = r14
            r13 = r19
        L394:
            java.lang.String r1 = "extend_session"
            long r1 = r15.getLong(r1, r13)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L3b7
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzop r1 = r12.zzv()
            com.google.android.gms.measurement.internal.zzoo r1 = r1.zza
            r2 = 1
            r1.zzb(r10, r2)
        L3b7:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r15.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L3c8:
            if (r3 >= r2) goto L414
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L411
            r0.zzw()
            java.lang.Object r5 = r15.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L3e6
            r6 = 1
            android.os.Bundle[] r12 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r12[r6] = r5
            goto L40c
        L3e6:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L3f7
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r12 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r12)
            r12 = r5
            android.os.Bundle[] r12 = (android.os.Bundle[]) r12
            goto L40c
        L3f7:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L40b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r12 = r5
            android.os.Bundle[] r12 = (android.os.Bundle[]) r12
            goto L40c
        L40b:
            r12 = 0
        L40c:
            if (r12 == 0) goto L411
            r15.putParcelableArray(r4, r12)
        L411:
            int r3 = r3 + 1
            goto L3c8
        L414:
            r12 = 0
        L415:
            int r1 = r29.size()
            if (r12 >= r1) goto L484
            r13 = r29
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L428
            java.lang.String r2 = "_ep"
            goto L429
        L428:
            r2 = r9
        L429:
            r14 = r18
            r1.putString(r14, r8)
            if (r31 == 0) goto L43a
            com.google.android.gms.measurement.internal.zzqf r3 = r0.zzw()
            r15 = 0
            android.os.Bundle r1 = r3.zzz(r1, r15)
            goto L43b
        L43a:
            r15 = 0
        L43b:
            r5 = r1
            com.google.android.gms.measurement.internal.zzbh r6 = new com.google.android.gms.measurement.internal.zzbh
            com.google.android.gms.measurement.internal.zzbf r3 = new com.google.android.gms.measurement.internal.zzbf
            r3.<init>(r5)
            r1 = r6
            r4 = r25
            r8 = r5
            r15 = r6
            r5 = r27
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzny r1 = r17.zzu()
            r5 = r33
            r1.zzM(r15, r5)
            if (r16 != 0) goto L47b
            java.util.Set r1 = r7.zze
            java.util.Iterator r15 = r1.iterator()
        L45e:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L47b
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.zzkc r1 = (com.google.android.gms.measurement.internal.zzkc) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r8)
            r2 = r25
            r3 = r26
            r5 = r27
            r1.onEvent(r2, r3, r4, r5)
            r5 = r33
            goto L45e
        L47b:
            int r12 = r12 + 1
            r8 = r25
            r29 = r13
            r18 = r14
            goto L415
        L484:
            r0.zzaV()
            com.google.android.gms.measurement.internal.zzmo r1 = r17.zzt()
            r2 = 0
            com.google.android.gms.measurement.internal.zzmh r1 = r1.zzj(r2)
            if (r1 == 0) goto L4ac
            r1 = r23
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L4ac
            com.google.android.gms.measurement.internal.zzop r1 = r17.zzv()
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r2 = r0.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzon r0 = r1.zzb
            r1 = 1
            r0.zzd(r1, r1, r2)
        L4ac:
            return
        L4ad:
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.zza(r1)
            return
    }

    @android.annotation.TargetApi(30)
    final void zzU() {
            r6 = this;
            r6.zzg()
            r0 = 0
            r6.zzn = r0
            java.util.PriorityQueue r1 = r6.zzy()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L60
            boolean r1 = r6.zzi
            if (r1 == 0) goto L15
            goto L60
        L15:
            java.util.PriorityQueue r1 = r6.zzy()
            java.lang.Object r1 = r1.poll()
            com.google.android.gms.measurement.internal.zzov r1 = (com.google.android.gms.measurement.internal.zzov) r1
            if (r1 == 0) goto L60
            com.google.android.gms.measurement.internal.zzio r2 = r6.zzu
            com.google.android.gms.measurement.internal.zzqf r3 = r2.zzw()
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r3 = r3.zzB()
            if (r3 == 0) goto L60
            r4 = 1
            r6.zzi = r4
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r4 = r1.zza
            java.lang.String r5 = "Registering trigger URI"
            r2.zzb(r5, r4)
            android.net.Uri r2 = android.net.Uri.parse(r4)
            com.google.common.util.concurrent.ListenableFuture r2 = r3.registerTriggerAsync(r2)
            if (r2 != 0) goto L53
            r6.zzi = r0
            java.util.PriorityQueue r0 = r6.zzy()
            r0.add(r1)
            return
        L53:
            com.google.android.gms.measurement.internal.zzks r0 = new com.google.android.gms.measurement.internal.zzks
            r0.<init>(r6)
            com.google.android.gms.measurement.internal.zzkt r3 = new com.google.android.gms.measurement.internal.zzkt
            r3.<init>(r6, r1)
            com.google.common.util.concurrent.Futures.addCallback(r2, r3, r0)
        L60:
            return
    }

    public final void zzV(com.google.android.gms.measurement.internal.zzkc r2) {
            r1 = this;
            r1.zza()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.Set r0 = r1.zze
            boolean r2 = r0.add(r2)
            if (r2 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.String r0 = "OnEventListener already registered"
            r2.zza(r0)
        L1d:
            return
    }

    public final void zzW() {
            r3 = this;
            r3.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            java.lang.String r2 = "Register tcfPrefChangeListener."
            r1.zza(r2)
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = r3.zzs
            if (r1 != 0) goto L26
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            com.google.android.gms.measurement.internal.zzky r2 = new com.google.android.gms.measurement.internal.zzky
            r2.<init>(r3, r1)
            r3.zzt = r2
            com.google.android.gms.measurement.internal.zzkp r1 = new com.google.android.gms.measurement.internal.zzkp
            r1.<init>(r3)
            r3.zzs = r1
        L26:
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            android.content.SharedPreferences r0 = r0.zza()
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r1 = r3.zzs
            r0.registerOnSharedPreferenceChangeListener(r1)
            return
    }

    public final void zzX(long r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzg
            r1 = 0
            r0.set(r1)
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzle r1 = new com.google.android.gms.measurement.internal.zzle
            r1.<init>(r2, r3)
            r0.zzq(r1)
            return
    }

    final void zzY(java.lang.Runnable r13) {
            r12 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r12.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaR
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 == 0) goto Lf5
            r12.zza()
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            boolean r1 = r1.zzu()
            if (r1 != 0) goto Le8
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            boolean r1 = r1.zzt()
            if (r1 != 0) goto Lda
            r0.zzaV()
            boolean r1 = com.google.android.gms.measurement.internal.zzaf.zza()
            if (r1 != 0) goto Lcc
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "[sgtm] Started client-side batch upload work."
            r1.zza(r2)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L40:
            if (r2 != 0) goto Lb3
            com.google.android.gms.measurement.internal.zzhe r2 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r5 = "[sgtm] Getting upload batches from service (FE)"
            r2.zza(r5)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            com.google.android.gms.measurement.internal.zzil r6 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzkl r11 = new com.google.android.gms.measurement.internal.zzkl
            r11.<init>(r12, r2)
            r8 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r10 = "[sgtm] Getting upload batches"
            r7 = r2
            r6.zze(r7, r8, r10, r11)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.measurement.internal.zzpe r2 = (com.google.android.gms.measurement.internal.zzpe) r2
            if (r2 == 0) goto Lb3
            java.util.List r2 = r2.zza
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L76
            goto Lb3
        L76:
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzj()
            int r6 = r2.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "[sgtm] Retrieved upload batches. count"
            r5.zzb(r7, r6)
            int r5 = r2.size()
            int r3 = r3 + r5
            java.util.Iterator r2 = r2.iterator()
        L94:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lb1
            java.lang.Object r5 = r2.next()
            com.google.android.gms.measurement.internal.zzpa r5 = (com.google.android.gms.measurement.internal.zzpa) r5
            com.google.android.gms.measurement.internal.zzme r5 = r12.zzar(r5)
            com.google.android.gms.measurement.internal.zzme r6 = com.google.android.gms.measurement.internal.zzme.zzb
            if (r5 != r6) goto Lab
            int r4 = r4 + 1
            goto L94
        Lab:
            com.google.android.gms.measurement.internal.zzme r6 = com.google.android.gms.measurement.internal.zzme.zzd
            if (r5 != r6) goto L94
            r2 = 1
            goto L40
        Lb1:
            r2 = 0
            goto L40
        Lb3:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r3 = "[sgtm] Completed client-side batch upload work. total, success"
            r0.zzc(r3, r1, r2)
            r13.run()
            return
        Lcc:
            com.google.android.gms.measurement.internal.zzhe r13 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zze()
            java.lang.String r0 = "Cannot retrieve and upload batches from main thread"
            r13.zza(r0)
            return
        Lda:
            com.google.android.gms.measurement.internal.zzhe r13 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zze()
            java.lang.String r0 = "Cannot retrieve and upload batches from analytics network thread"
            r13.zza(r0)
            return
        Le8:
            com.google.android.gms.measurement.internal.zzhe r13 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zze()
            java.lang.String r0 = "Cannot retrieve and upload batches from analytics worker thread"
            r13.zza(r0)
        Lf5:
            return
    }

    protected final void zzZ(java.lang.String r15, java.lang.String r16, long r17, android.os.Bundle r19, boolean r20, boolean r21, boolean r22, java.lang.String r23) {
            r14 = this;
            int r0 = com.google.android.gms.measurement.internal.zzqf.zza
            android.os.Bundle r7 = new android.os.Bundle
            r0 = r19
            r7.<init>(r0)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L30
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r2 = (android.os.Bundle) r2
            r3.<init>(r2)
            r7.putBundle(r1, r3)
            goto L11
        L30:
            boolean r1 = r2 instanceof android.os.Parcelable[]
            r3 = 0
            if (r1 == 0) goto L4c
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
        L37:
            int r1 = r2.length
            if (r3 >= r1) goto L11
            r1 = r2[r3]
            boolean r4 = r1 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            android.os.Bundle r4 = new android.os.Bundle
            android.os.Bundle r1 = (android.os.Bundle) r1
            r4.<init>(r1)
            r2[r3] = r4
        L49:
            int r3 = r3 + 1
            goto L37
        L4c:
            boolean r1 = r2 instanceof java.util.List
            if (r1 == 0) goto L11
            java.util.List r2 = (java.util.List) r2
        L52:
            int r1 = r2.size()
            if (r3 >= r1) goto L11
            java.lang.Object r1 = r2.get(r3)
            boolean r4 = r1 instanceof android.os.Bundle
            if (r4 == 0) goto L6a
            android.os.Bundle r4 = new android.os.Bundle
            android.os.Bundle r1 = (android.os.Bundle) r1
            r4.<init>(r1)
            r2.set(r3, r4)
        L6a:
            int r3 = r3 + 1
            goto L52
        L6d:
            r12 = r14
            com.google.android.gms.measurement.internal.zzio r0 = r12.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzkz r13 = new com.google.android.gms.measurement.internal.zzkz
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r0.zzq(r13)
            return
    }

    final void zzaa(java.lang.String r10, java.lang.String r11, long r12, java.lang.Object r14) {
            r9 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzla r8 = new com.google.android.gms.measurement.internal.zzla
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r14
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.zzq(r8)
            return
    }

    final void zzab(long r3) {
            r2 = this;
            r2.zzg()
            com.google.android.gms.measurement.internal.zzaz r0 = r2.zzl
            if (r0 != 0) goto L10
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzkr r1 = new com.google.android.gms.measurement.internal.zzkr
            r1.<init>(r2, r0)
            r2.zzl = r1
        L10:
            com.google.android.gms.measurement.internal.zzaz r0 = r2.zzl
            r0.zzd(r3)
            return
    }

    final void zzac(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzg
            r0.set(r2)
            return
    }

    public final void zzad(android.os.Bundle r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r0 = r0.currentTimeMillis()
            r2.zzae(r3, r0)
            return
    }

    public final void zzae(android.os.Bundle r12, long r13) {
            r11 = this;
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r12)
            java.lang.String r12 = "app_id"
            java.lang.String r3 = r2.getString(r12)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L27
            com.google.android.gms.measurement.internal.zzio r3 = r11.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.String r4 = "Package name should be null when calling setConditionalUserProperty"
            r3.zza(r4)
        L27:
            r2.remove(r12)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r3 = 0
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r12, r1, r3)
            java.lang.String r12 = "origin"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r12, r1, r3)
            java.lang.String r4 = "name"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r4, r1, r3)
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.String r6 = "value"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r6, r5, r3)
            java.lang.String r5 = "trigger_event_name"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r5, r1, r3)
            r7 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "trigger_timeout"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r8, r0, r7)
            java.lang.String r9 = "timed_out_event_name"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r9, r1, r3)
            java.lang.Class<android.os.Bundle> r9 = android.os.Bundle.class
            java.lang.String r10 = "timed_out_event_params"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r10, r9, r3)
            java.lang.String r9 = "triggered_event_name"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r9, r1, r3)
            java.lang.Class<android.os.Bundle> r9 = android.os.Bundle.class
            java.lang.String r10 = "triggered_event_params"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r10, r9, r3)
            java.lang.String r9 = "time_to_live"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r9, r0, r7)
            java.lang.String r0 = "expired_event_name"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r0, r1, r3)
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.String r1 = "expired_event_params"
            com.google.android.gms.measurement.internal.zzjt.zza(r2, r1, r0, r3)
            java.lang.String r0 = r2.getString(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r12 = r2.getString(r12)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            java.lang.Object r12 = r2.get(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            java.lang.String r12 = "creation_timestamp"
            r2.putLong(r12, r13)
            java.lang.String r12 = r2.getString(r4)
            java.lang.Object r13 = r2.get(r6)
            com.google.android.gms.measurement.internal.zzio r14 = r11.zzu
            com.google.android.gms.measurement.internal.zzqf r0 = r14.zzw()
            int r0 = r0.zzj(r12)
            if (r0 != 0) goto L15d
            com.google.android.gms.measurement.internal.zzqf r0 = r14.zzw()
            int r0 = r0.zzd(r12, r13)
            if (r0 != 0) goto L147
            com.google.android.gms.measurement.internal.zzqf r0 = r14.zzw()
            java.lang.Object r0 = r0.zzE(r12, r13)
            if (r0 != 0) goto Ld3
            com.google.android.gms.measurement.internal.zzhe r0 = r14.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            com.google.android.gms.measurement.internal.zzgx r14 = r14.zzj()
            java.lang.String r12 = r14.zzf(r12)
            java.lang.String r14 = "Unable to normalize conditional user property value"
            r0.zzc(r14, r12, r13)
            return
        Ld3:
            com.google.android.gms.measurement.internal.zzjt.zzb(r2, r0)
            long r0 = r2.getLong(r8)
            java.lang.String r13 = r2.getString(r5)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            r3 = 1
            r5 = 15552000000(0x39ef8b000, double:7.683708924E-314)
            if (r13 != 0) goto L110
            r14.zzf()
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 > 0) goto Lf6
            int r13 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r13 >= 0) goto L110
        Lf6:
            com.google.android.gms.measurement.internal.zzhe r13 = r14.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zze()
            com.google.android.gms.measurement.internal.zzgx r14 = r14.zzj()
            java.lang.String r12 = r14.zzf(r12)
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "Invalid conditional user property timeout"
            r13.zzc(r0, r12, r14)
            return
        L110:
            long r0 = r2.getLong(r9)
            r14.zzf()
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 > 0) goto L12d
            int r13 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r13 >= 0) goto L120
            goto L12d
        L120:
            com.google.android.gms.measurement.internal.zzil r12 = r14.zzaX()
            com.google.android.gms.measurement.internal.zzlf r13 = new com.google.android.gms.measurement.internal.zzlf
            r13.<init>(r11, r2)
            r12.zzq(r13)
            return
        L12d:
            com.google.android.gms.measurement.internal.zzhe r13 = r14.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zze()
            com.google.android.gms.measurement.internal.zzgx r14 = r14.zzj()
            java.lang.String r12 = r14.zzf(r12)
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "Invalid conditional user property time to live"
            r13.zzc(r0, r12, r14)
            return
        L147:
            com.google.android.gms.measurement.internal.zzhe r0 = r14.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            com.google.android.gms.measurement.internal.zzgx r14 = r14.zzj()
            java.lang.String r12 = r14.zzf(r12)
            java.lang.String r14 = "Invalid conditional user property value"
            r0.zzc(r14, r12, r13)
            return
        L15d:
            com.google.android.gms.measurement.internal.zzhe r13 = r14.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zze()
            com.google.android.gms.measurement.internal.zzgx r14 = r14.zzj()
            java.lang.String r12 = r14.zzf(r12)
            java.lang.String r14 = "Invalid conditional user property name"
            r13.zzb(r14, r12)
            return
    }

    final void zzaf(android.os.Bundle r9, int r10, long r11) {
            r8 = this;
            r8.zza()
            com.google.android.gms.measurement.internal.zzjx r0 = com.google.android.gms.measurement.internal.zzjx.zza
            com.google.android.gms.measurement.internal.zzjv r0 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r0 = com.google.android.gms.measurement.internal.zzjv.zza(r0)
            int r1 = r0.length
            r2 = 0
        Ld:
            r3 = 0
            if (r2 >= r1) goto L3c
            r4 = r0[r2]
            java.lang.String r4 = r4.zze
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L39
            java.lang.String r4 = r9.getString(r4)
            if (r4 == 0) goto L39
            java.lang.String r5 = "granted"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L2b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L35
        L2b:
            java.lang.String r5 = "denied"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L35
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L35:
            if (r3 != 0) goto L39
            r3 = r4
            goto L3c
        L39:
            int r2 = r2 + 1
            goto Ld
        L3c:
            if (r3 == 0) goto L5a
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzl()
            java.lang.String r2 = "Ignoring invalid consent setting"
            r1.zzb(r2, r3)
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzl()
            java.lang.String r1 = "Valid consent values are 'granted', 'denied'"
            r0.zza(r1)
        L5a:
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            boolean r0 = r0.zzu()
            com.google.android.gms.measurement.internal.zzjx r1 = com.google.android.gms.measurement.internal.zzjx.zzi(r9, r10)
            boolean r2 = r1.zzt()
            if (r2 == 0) goto L71
            r8.zzak(r1, r0)
        L71:
            com.google.android.gms.measurement.internal.zzba r1 = com.google.android.gms.measurement.internal.zzba.zzc(r9, r10)
            boolean r2 = r1.zzk()
            if (r2 == 0) goto L7e
            r8.zzag(r1, r0)
        L7e:
            java.lang.Boolean r9 = com.google.android.gms.measurement.internal.zzba.zzg(r9)
            if (r9 == 0) goto La8
            r1 = -30
            if (r10 != r1) goto L8b
            java.lang.String r10 = "tcf"
            goto L8d
        L8b:
            java.lang.String r10 = "app"
        L8d:
            r2 = r10
            if (r0 == 0) goto L9c
            java.lang.String r4 = r9.toString()
            java.lang.String r3 = "allow_personalized_ads"
            r1 = r8
            r5 = r11
            r1.zzan(r2, r3, r4, r5)
            return
        L9c:
            java.lang.String r4 = r9.toString()
            r5 = 0
            java.lang.String r3 = "allow_personalized_ads"
            r1 = r8
            r6 = r11
            r1.zzam(r2, r3, r4, r5, r6)
        La8:
            return
    }

    final void zzag(com.google.android.gms.measurement.internal.zzba r2, boolean r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzlq r0 = new com.google.android.gms.measurement.internal.zzlq
            r0.<init>(r1, r2)
            if (r3 == 0) goto Le
            r1.zzg()
            r0.run()
            return
        Le:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzil r2 = r2.zzaX()
            r2.zzq(r0)
            return
    }

    public final void zzah(com.google.android.gms.measurement.internal.zzkb r3) {
            r2 = this;
            r2.zzg()
            r2.zza()
            if (r3 == 0) goto L16
            com.google.android.gms.measurement.internal.zzkb r0 = r2.zzd
            if (r3 == r0) goto L16
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = "EventInterceptor already set."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
        L16:
            r2.zzd = r3
            return
    }

    public final void zzai(java.lang.Boolean r3) {
            r2 = this;
            r2.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzlp r1 = new com.google.android.gms.measurement.internal.zzlp
            r1.<init>(r2, r3)
            r0.zzq(r1)
            return
    }

    final void zzaj(com.google.android.gms.measurement.internal.zzjx r6) {
            r5 = this;
            r5.zzg()
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r0 = r6.zzr(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zza
            boolean r6 = r6.zzr(r0)
            if (r6 != 0) goto L21
        L15:
            com.google.android.gms.measurement.internal.zzio r6 = r5.zzu
            com.google.android.gms.measurement.internal.zzny r6 = r6.zzu()
            boolean r6 = r6.zzab()
            if (r6 == 0) goto L23
        L21:
            r6 = 1
            goto L24
        L23:
            r6 = 0
        L24:
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            boolean r3 = r0.zzK()
            if (r6 == r3) goto L65
            r0.zzG(r6)
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzio r3 = r0.zzu
            r0.zzg()
            android.content.SharedPreferences r3 = r0.zzb()
            java.lang.String r4 = "measurement_enabled_from_api"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L53
            android.content.SharedPreferences r0 = r0.zzb()
            boolean r0 = r0.getBoolean(r4, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L54
        L53:
            r0 = 0
        L54:
            if (r6 == 0) goto L5e
            if (r0 == 0) goto L5e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L65
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.zzas(r6, r1)
        L65:
            return
    }

    public final void zzak(com.google.android.gms.measurement.internal.zzjx r10, boolean r11) {
            r9 = this;
            r9.zza()
            int r0 = r10.zzb()
            r1 = -10
            if (r0 == r1) goto L2a
            com.google.android.gms.measurement.internal.zzju r2 = r10.zze()
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.zza
            if (r2 != r3) goto L2a
            com.google.android.gms.measurement.internal.zzju r2 = r10.zzf()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzl()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.zza(r11)
            return
        L2a:
            java.lang.Object r2 = r9.zzh
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzjx r3 = r9.zzo     // Catch: java.lang.Throwable -> Lc7
            int r3 = r3.zzb()     // Catch: java.lang.Throwable -> Lc7
            boolean r3 = com.google.android.gms.measurement.internal.zzjx.zzs(r0, r3)     // Catch: java.lang.Throwable -> Lc7
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L5d
            com.google.android.gms.measurement.internal.zzjx r3 = r9.zzo     // Catch: java.lang.Throwable -> Lc7
            boolean r3 = r10.zzu(r3)     // Catch: java.lang.Throwable -> Lc7
            com.google.android.gms.measurement.internal.zzjw r6 = com.google.android.gms.measurement.internal.zzjw.zzb     // Catch: java.lang.Throwable -> Lc7
            boolean r7 = r10.zzr(r6)     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto L52
            com.google.android.gms.measurement.internal.zzjx r7 = r9.zzo     // Catch: java.lang.Throwable -> Lc7
            boolean r6 = r7.zzr(r6)     // Catch: java.lang.Throwable -> Lc7
            if (r6 != 0) goto L52
            r5 = 1
        L52:
            com.google.android.gms.measurement.internal.zzjx r6 = r9.zzo     // Catch: java.lang.Throwable -> Lc7
            com.google.android.gms.measurement.internal.zzjx r10 = r10.zzm(r6)     // Catch: java.lang.Throwable -> Lc7
            r9.zzo = r10     // Catch: java.lang.Throwable -> Lc7
            r8 = r5
            r5 = r10
            goto L61
        L5d:
            r5 = r10
            r3 = 0
            r4 = 0
            r8 = 0
        L61:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc7
            if (r4 != 0) goto L74
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzi()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.zzb(r11, r5)
            return
        L74:
            java.util.concurrent.atomic.AtomicLong r10 = r9.zzp
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto L9c
            java.util.concurrent.atomic.AtomicReference r10 = r9.zzg
            r0 = 0
            r10.set(r0)
            com.google.android.gms.measurement.internal.zzlr r10 = new com.google.android.gms.measurement.internal.zzlr
            r3 = r10
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L92
            r9.zzg()
            r10.run()
            return
        L92:
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzil r11 = r11.zzaX()
            r11.zzr(r10)
            return
        L9c:
            com.google.android.gms.measurement.internal.zzls r10 = new com.google.android.gms.measurement.internal.zzls
            r3 = r10
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lac
            r9.zzg()
            r10.run()
            return
        Lac:
            r11 = 30
            if (r0 == r11) goto Lbd
            if (r0 != r1) goto Lb3
            goto Lbd
        Lb3:
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzil r11 = r11.zzaX()
            r11.zzq(r10)
            return
        Lbd:
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzil r11 = r11.zzaX()
            r11.zzr(r10)
            return
        Lc7:
            r10 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc7
            throw r10
    }

    public final void zzal(java.lang.String r9, java.lang.String r10, java.lang.Object r11, boolean r12) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r6 = r0.currentTimeMillis()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.zzam(r2, r3, r4, r5, r6)
            return
    }

    public final void zzam(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
            r16 = this;
            r6 = r16
            r2 = r18
            r0 = r19
            r1 = 6
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L18
            com.google.android.gms.measurement.internal.zzio r1 = r6.zzu
            com.google.android.gms.measurement.internal.zzqf r1 = r1.zzw()
            int r1 = r1.zzj(r2)
            r10 = r1
            goto L43
        L18:
            com.google.android.gms.measurement.internal.zzio r5 = r6.zzu
            com.google.android.gms.measurement.internal.zzqf r5 = r5.zzw()
            java.lang.String r7 = "user property"
            boolean r8 = r5.zzah(r7, r2)
            if (r8 != 0) goto L28
        L26:
            r10 = 6
            goto L43
        L28:
            java.lang.String[] r8 = com.google.android.gms.measurement.internal.zzka.zza
            r9 = 0
            boolean r8 = r5.zzae(r7, r8, r9, r2)
            if (r8 != 0) goto L36
            r1 = 15
            r10 = 15
            goto L43
        L36:
            com.google.android.gms.measurement.internal.zzio r8 = r5.zzu
            r8.zzf()
            boolean r5 = r5.zzad(r7, r4, r2)
            if (r5 != 0) goto L42
            goto L26
        L42:
            r10 = 0
        L43:
            r1 = 1
            if (r10 == 0) goto L6b
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzqf r5 = r0.zzw()
            r0.zzf()
            java.lang.String r12 = r5.zzG(r2, r4, r1)
            if (r2 == 0) goto L5b
            int r3 = r18.length()
            r13 = r3
            goto L5c
        L5b:
            r13 = 0
        L5c:
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzqe r8 = r6.zzv
            com.google.android.gms.measurement.internal.zzqf r7 = r0.zzw()
            r9 = 0
            java.lang.String r11 = "_ev"
            r7.zzR(r8, r9, r10, r11, r12, r13)
            return
        L6b:
            if (r17 != 0) goto L70
            java.lang.String r5 = "app"
            goto L72
        L70:
            r5 = r17
        L72:
            if (r0 == 0) goto Lc4
            com.google.android.gms.measurement.internal.zzio r7 = r6.zzu
            com.google.android.gms.measurement.internal.zzqf r8 = r7.zzw()
            int r12 = r8.zzd(r2, r0)
            if (r12 == 0) goto Lae
            com.google.android.gms.measurement.internal.zzqf r5 = r7.zzw()
            r7.zzf()
            java.lang.String r14 = r5.zzG(r2, r4, r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L96
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L94
            goto L96
        L94:
            r15 = 0
            goto L9f
        L96:
            java.lang.String r0 = r19.toString()
            int r3 = r0.length()
            r15 = r3
        L9f:
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzqe r10 = r6.zzv
            com.google.android.gms.measurement.internal.zzqf r9 = r0.zzw()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.zzR(r10, r11, r12, r13, r14, r15)
            return
        Lae:
            com.google.android.gms.measurement.internal.zzqf r1 = r7.zzw()
            java.lang.Object r7 = r1.zzE(r2, r0)
            if (r7 == 0) goto Lc3
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.zzaa(r1, r2, r3, r5)
        Lc3:
            return
        Lc4:
            r7 = 0
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.zzaa(r1, r2, r3, r5)
            return
    }

    final void zzan(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r9.zzg()
            r9.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L74
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            com.google.android.gms.measurement.internal.zzio r4 = r9.zzu
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.zzht r12 = r4.zzm()
            com.google.android.gms.measurement.internal.zzhr r12 = r12.zzh
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r12.zzb(r0)
            r12 = r11
            goto L62
        L53:
            if (r12 != 0) goto L63
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzht r11 = r11.zzm()
            com.google.android.gms.measurement.internal.zzhr r11 = r11.zzh
            java.lang.String r0 = "unset"
            r11.zzb(r0)
        L62:
            r11 = r1
        L63:
            com.google.android.gms.measurement.internal.zzio r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.zzc(r1, r2, r12)
        L74:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            boolean r12 = r11.zzJ()
            if (r12 != 0) goto L8e
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzj()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.zza(r11)
            return
        L8e:
            boolean r11 = r11.zzM()
            if (r11 != 0) goto L95
            return
        L95:
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzqb r12 = new com.google.android.gms.measurement.internal.zzqb
            r3 = r12
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.zzny r10 = r11.zzu()
            r10.zzY(r12)
            return
    }

    public final void zzao(com.google.android.gms.measurement.internal.zzkc r2) {
            r1 = this;
            r1.zza()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.Set r0 = r1.zze
            boolean r2 = r0.remove(r2)
            if (r2 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.String r0 = "OnEventListener had not been registered"
            r2.zza(r0)
        L1d:
            return
    }

    final boolean zzap() {
            r1 = this;
            boolean r0 = r1.zzn
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final int zzi(java.lang.String r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            r1.zzf()
            r1 = 25
            return r1
    }

    public final java.lang.Boolean zzl() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzlb r5 = new com.google.android.gms.measurement.internal.zzlb
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "boolean test flag value"
            java.lang.Object r0 = r0.zze(r1, r2, r4, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
    }

    public final java.lang.Double zzm() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzlo r5 = new com.google.android.gms.measurement.internal.zzlo
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "double test flag value"
            java.lang.Object r0 = r0.zze(r1, r2, r4, r5)
            java.lang.Double r0 = (java.lang.Double) r0
            return r0
    }

    public final java.lang.Integer zzp() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzln r5 = new com.google.android.gms.measurement.internal.zzln
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "int test flag value"
            java.lang.Object r0 = r0.zze(r1, r2, r4, r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
    }

    public final java.lang.Long zzq() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzlm r5 = new com.google.android.gms.measurement.internal.zzlm
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "long test flag value"
            java.lang.Object r0 = r0.zze(r1, r2, r4, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            return r0
    }

    public final java.lang.String zzr() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzg
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.lang.String zzs() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            com.google.android.gms.measurement.internal.zzmh r0 = r0.zzi()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zzb
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final java.lang.String zzt() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            com.google.android.gms.measurement.internal.zzmh r0 = r0.zzi()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.zza
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final java.lang.String zzu() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzll r5 = new com.google.android.gms.measurement.internal.zzll
            r5.<init>(r6, r1)
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.String r4 = "String test flag value"
            java.lang.Object r0 = r0.zze(r1, r2, r4, r5)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.util.ArrayList zzv(java.lang.String r11, java.lang.String r12) {
            r10 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r10.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            boolean r1 = r1.zzu()
            r2 = 0
            if (r1 == 0) goto L20
            com.google.android.gms.measurement.internal.zzhe r11 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zze()
            java.lang.String r12 = "Cannot get conditional user properties from analytics worker thread"
            r11.zza(r12)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r2)
            goto L7c
        L20:
            r0.zzaV()
            boolean r1 = com.google.android.gms.measurement.internal.zzaf.zza()
            if (r1 == 0) goto L3c
            com.google.android.gms.measurement.internal.zzhe r11 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zze()
            java.lang.String r12 = "Cannot get conditional user properties from main thread"
            r11.zza(r12)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r2)
            goto L7c
        L3c:
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            com.google.android.gms.measurement.internal.zzio r2 = r10.zzu
            com.google.android.gms.measurement.internal.zzil r2 = r2.zzaX()
            com.google.android.gms.measurement.internal.zzlh r9 = new com.google.android.gms.measurement.internal.zzlh
            r6 = 0
            r3 = r9
            r4 = r10
            r5 = r1
            r7 = r11
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r7 = "get conditional user properties"
            r3 = r2
            r4 = r1
            r8 = r9
            r3.zze(r4, r5, r7, r8)
            java.lang.Object r11 = r1.get()
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L78
            com.google.android.gms.measurement.internal.zzhe r11 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zze()
            r12 = 0
            java.lang.String r0 = "Timed out waiting for get conditional user properties"
            r11.zzb(r0, r12)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            goto L7c
        L78:
            java.util.ArrayList r11 = com.google.android.gms.measurement.internal.zzqf.zzK(r11)
        L7c:
            return r11
    }

    public final java.util.List zzw(boolean r9) {
            r8 = this;
            r8.zza()
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Getting user properties (FE)"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            boolean r1 = r1.zzu()
            if (r1 != 0) goto L6e
            r0.zzaV()
            boolean r1 = com.google.android.gms.measurement.internal.zzaf.zza()
            if (r1 == 0) goto L37
            com.google.android.gms.measurement.internal.zzhe r9 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.String r0 = "Cannot get all user properties from main thread"
            r9.zza(r0)
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        L37:
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r7.<init>()
            com.google.android.gms.measurement.internal.zzio r1 = r8.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            com.google.android.gms.measurement.internal.zzlc r6 = new com.google.android.gms.measurement.internal.zzlc
            r6.<init>(r8, r7, r9)
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r5 = "get user properties"
            r2 = r7
            r1.zze(r2, r3, r5, r6)
            java.lang.Object r1 = r7.get()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L6d
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r1 = "Timed out waiting for get user properties, includeInternal"
            r0.zzb(r1, r9)
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        L6d:
            return r1
        L6e:
            com.google.android.gms.measurement.internal.zzhe r9 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.String r0 = "Cannot get all user properties from analytics worker thread"
            r9.zza(r0)
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
    }

    public final java.util.Map zzx(java.lang.String r12, java.lang.String r13, boolean r14) {
            r11 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r11.zzu
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            boolean r1 = r1.zzu()
            if (r1 == 0) goto L1f
            com.google.android.gms.measurement.internal.zzhe r12 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zze()
            java.lang.String r13 = "Cannot get user properties from analytics worker thread"
            r12.zza(r13)
            java.util.Map r12 = java.util.Collections.emptyMap()
            goto La0
        L1f:
            r0.zzaV()
            boolean r1 = com.google.android.gms.measurement.internal.zzaf.zza()
            if (r1 == 0) goto L3b
            com.google.android.gms.measurement.internal.zzhe r12 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zze()
            java.lang.String r13 = "Cannot get user properties from main thread"
            r12.zza(r13)
            java.util.Map r12 = java.util.Collections.emptyMap()
            goto La0
        L3b:
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference
            r8.<init>()
            com.google.android.gms.measurement.internal.zzio r1 = r11.zzu
            com.google.android.gms.measurement.internal.zzil r9 = r1.zzaX()
            com.google.android.gms.measurement.internal.zzli r10 = new com.google.android.gms.measurement.internal.zzli
            r4 = 0
            r1 = r10
            r2 = r11
            r3 = r8
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r5 = "get user properties"
            r1 = r9
            r2 = r8
            r6 = r10
            r1.zze(r2, r3, r5, r6)
            java.lang.Object r12 = r8.get()
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L7a
            com.google.android.gms.measurement.internal.zzhe r12 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zze()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r14)
            java.lang.String r14 = "Timed out waiting for handle get user properties, includeInternal"
            r12.zzb(r14, r13)
            java.util.Map r12 = java.util.Collections.emptyMap()
            goto La0
        L7a:
            androidx.collection.ArrayMap r13 = new androidx.collection.ArrayMap
            int r14 = r12.size()
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        L87:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L9f
            java.lang.Object r14 = r12.next()
            com.google.android.gms.measurement.internal.zzqb r14 = (com.google.android.gms.measurement.internal.zzqb) r14
            java.lang.Object r0 = r14.zza()
            if (r0 == 0) goto L87
            java.lang.String r14 = r14.zzb
            r13.put(r14, r0)
            goto L87
        L9f:
            r12 = r13
        La0:
            return r12
    }

    @android.annotation.TargetApi(30)
    final java.util.PriorityQueue zzy() {
            r3 = this;
            java.util.PriorityQueue r0 = r3.zzm
            if (r0 != 0) goto L19
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            com.google.android.gms.measurement.internal.zzkf r1 = new com.google.android.gms.measurement.internal.zzkf
            r1.<init>()
            com.google.android.gms.measurement.internal.zzkh r2 = new com.google.android.gms.measurement.internal.zzkh
            r2.<init>()
            java.util.Comparator r1 = java.util.Comparator.comparing(r1, r2)
            r0.<init>(r1)
            r3.zzm = r0
        L19:
            java.util.PriorityQueue r0 = r3.zzm
            return r0
    }
}
