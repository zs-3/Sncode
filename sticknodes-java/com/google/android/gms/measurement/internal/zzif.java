package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzif extends com.google.android.gms.measurement.internal.zzpg implements com.google.android.gms.measurement.internal.zzal {
    final java.util.Map zza;
    final java.util.Map zzb;
    final java.util.Map zzc;
    final androidx.collection.LruCache zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final java.util.Map zzf;
    private final java.util.Map zzh;
    private final java.util.Map zzi;
    private final java.util.Map zzj;
    private final java.util.Map zzk;
    private final java.util.Map zzl;

    zzif(com.google.android.gms.measurement.internal.zzpv r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zzf = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zza = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zzb = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zzc = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zzh = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zzj = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zzk = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zzl = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.zzi = r2
            com.google.android.gms.measurement.internal.zzic r2 = new com.google.android.gms.measurement.internal.zzic
            r0 = 20
            r2.<init>(r1, r0)
            r1.zzd = r2
            com.google.android.gms.measurement.internal.zzid r2 = new com.google.android.gms.measurement.internal.zzid
            r2.<init>(r1)
            r1.zze = r2
            return
    }

    private final com.google.android.gms.internal.measurement.zzgo zzG(java.lang.String r8, byte[] r9) {
            r7 = this;
            java.lang.String r0 = "Unable to merge remote config. appId"
            if (r9 != 0) goto L9
            com.google.android.gms.internal.measurement.zzgo r8 = com.google.android.gms.internal.measurement.zzgo.zzh()
            return r8
        L9:
            com.google.android.gms.internal.measurement.zzgn r1 = com.google.android.gms.internal.measurement.zzgo.zzf()     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            com.google.android.gms.internal.measurement.zzng r9 = com.google.android.gms.measurement.internal.zzqa.zzp(r1, r9)     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            com.google.android.gms.internal.measurement.zzgn r9 = (com.google.android.gms.internal.measurement.zzgn) r9     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            com.google.android.gms.internal.measurement.zzmd r9 = r9.zzba()     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            com.google.android.gms.internal.measurement.zzgo r9 = (com.google.android.gms.internal.measurement.zzgo) r9     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            java.lang.String r2 = "Parsed config. version, gmp_app_id"
            boolean r3 = r9.zzw()     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            r4 = 0
            if (r3 == 0) goto L35
            long r5 = r9.zzc()     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            goto L36
        L35:
            r3 = r4
        L36:
            boolean r5 = r9.zzu()     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            if (r5 == 0) goto L40
            java.lang.String r4 = r9.zzj()     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
        L40:
            r1.zzc(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L44 com.google.android.gms.internal.measurement.zzmm -> L5b
            return r9
        L44:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)
            r1.zzc(r0, r8, r9)
            com.google.android.gms.internal.measurement.zzgo r8 = com.google.android.gms.internal.measurement.zzgo.zzh()
            return r8
        L5b:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)
            r1.zzc(r0, r8, r9)
            com.google.android.gms.internal.measurement.zzgo r8 = com.google.android.gms.internal.measurement.zzgo.zzh()
            return r8
    }

    private final void zzH(java.lang.String r10, com.google.android.gms.internal.measurement.zzgn r11) {
            r9 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            androidx.collection.ArrayMap r3 = new androidx.collection.ArrayMap
            r3.<init>()
            java.util.List r4 = r11.zzh()
            java.util.Iterator r4 = r4.iterator()
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L30
            java.lang.Object r5 = r4.next()
            com.google.android.gms.internal.measurement.zzgk r5 = (com.google.android.gms.internal.measurement.zzgk) r5
            java.lang.String r5 = r5.zzb()
            r0.add(r5)
            goto L1c
        L30:
            r4 = 0
        L31:
            int r5 = r11.zza()
            if (r4 >= r5) goto Le0
            com.google.android.gms.internal.measurement.zzgm r5 = r11.zzb(r4)
            com.google.android.gms.internal.measurement.zzlz r5 = r5.zzch()
            com.google.android.gms.internal.measurement.zzgl r5 = (com.google.android.gms.internal.measurement.zzgl) r5
            java.lang.String r6 = r5.zzc()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5c
            com.google.android.gms.measurement.internal.zzio r5 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzk()
            java.lang.String r6 = "EventConfig contained null event name"
            r5.zza(r6)
            goto Ldc
        L5c:
            java.lang.String r6 = r5.zzc()
            java.lang.String r7 = r5.zzc()
            java.lang.String r7 = com.google.android.gms.measurement.internal.zzjy.zzb(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L74
            r5.zzb(r7)
            r11.zze(r4, r5)
        L74:
            boolean r7 = r5.zzf()
            if (r7 == 0) goto L85
            boolean r7 = r5.zzd()
            if (r7 == 0) goto L85
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r1.put(r6, r7)
        L85:
            boolean r6 = r5.zzg()
            if (r6 == 0) goto L9a
            boolean r6 = r5.zze()
            if (r6 == 0) goto L9a
            java.lang.String r6 = r5.zzc()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r2.put(r6, r7)
        L9a:
            boolean r6 = r5.zzh()
            if (r6 == 0) goto Ldc
            int r6 = r5.zza()
            r7 = 2
            if (r6 < r7) goto Lc1
            int r6 = r5.zza()
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r6 <= r7) goto Lb1
            goto Lc1
        Lb1:
            java.lang.String r6 = r5.zzc()
            int r5 = r5.zza()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.put(r6, r5)
            goto Ldc
        Lc1:
            com.google.android.gms.measurement.internal.zzio r6 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            java.lang.String r7 = r5.zzc()
            int r5 = r5.zza()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r8 = "Invalid sampling rate. Event name, sample rate"
            r6.zzc(r8, r7, r5)
        Ldc:
            int r4 = r4 + 1
            goto L31
        Le0:
            java.util.Map r11 = r9.zza
            r11.put(r10, r0)
            java.util.Map r11 = r9.zzb
            r11.put(r10, r1)
            java.util.Map r11 = r9.zzc
            r11.put(r10, r2)
            java.util.Map r11 = r9.zzi
            r11.put(r10, r3)
            return
    }

    private final void zzI(java.lang.String r6) {
            r5 = this;
            r5.zzav()
            r5.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            java.util.Map r0 = r5.zzh
            java.lang.Object r1 = r0.get(r6)
            if (r1 != 0) goto L91
            com.google.android.gms.measurement.internal.zzpv r1 = r5.zzg
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzj()
            com.google.android.gms.measurement.internal.zzar r1 = r1.zzn(r6)
            if (r1 != 0) goto L4a
            java.util.Map r1 = r5.zzf
            r2 = 0
            r1.put(r6, r2)
            java.util.Map r1 = r5.zzb
            r1.put(r6, r2)
            java.util.Map r1 = r5.zza
            r1.put(r6, r2)
            java.util.Map r1 = r5.zzc
            r1.put(r6, r2)
            r0.put(r6, r2)
            java.util.Map r0 = r5.zzj
            r0.put(r6, r2)
            java.util.Map r0 = r5.zzk
            r0.put(r6, r2)
            java.util.Map r0 = r5.zzl
            r0.put(r6, r2)
            java.util.Map r0 = r5.zzi
            r0.put(r6, r2)
            return
        L4a:
            byte[] r2 = r1.zza
            com.google.android.gms.internal.measurement.zzgo r2 = r5.zzG(r6, r2)
            com.google.android.gms.internal.measurement.zzlz r2 = r2.zzch()
            com.google.android.gms.internal.measurement.zzgn r2 = (com.google.android.gms.internal.measurement.zzgn) r2
            r5.zzH(r6, r2)
            java.util.Map r3 = r5.zzf
            com.google.android.gms.internal.measurement.zzmd r4 = r2.zzba()
            com.google.android.gms.internal.measurement.zzgo r4 = (com.google.android.gms.internal.measurement.zzgo) r4
            java.util.Map r4 = zzK(r4)
            r3.put(r6, r4)
            com.google.android.gms.internal.measurement.zzmd r3 = r2.zzba()
            com.google.android.gms.internal.measurement.zzgo r3 = (com.google.android.gms.internal.measurement.zzgo) r3
            r0.put(r6, r3)
            com.google.android.gms.internal.measurement.zzmd r0 = r2.zzba()
            com.google.android.gms.internal.measurement.zzgo r0 = (com.google.android.gms.internal.measurement.zzgo) r0
            r5.zzJ(r6, r0)
            java.util.Map r0 = r5.zzj
            java.lang.String r2 = r2.zzf()
            r0.put(r6, r2)
            java.util.Map r0 = r5.zzk
            java.lang.String r2 = r1.zzb
            r0.put(r6, r2)
            java.util.Map r0 = r5.zzl
            java.lang.String r1 = r1.zzc
            r0.put(r6, r1)
        L91:
            return
    }

    private final void zzJ(java.lang.String r5, com.google.android.gms.internal.measurement.zzgo r6) {
            r4 = this;
            int r0 = r6.zza()
            if (r0 == 0) goto La7
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            int r2 = r6.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "EES programs found"
            r1.zzb(r3, r2)
            java.util.List r6 = r6.zzo()
            r1 = 0
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.zziv r6 = (com.google.android.gms.internal.measurement.zziv) r6
            com.google.android.gms.internal.measurement.zzc r1 = new com.google.android.gms.internal.measurement.zzc     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r1.<init>()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            java.lang.String r2 = "internal.remoteConfig"
            com.google.android.gms.measurement.internal.zzhy r3 = new com.google.android.gms.measurement.internal.zzhy     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r3.<init>(r4, r5)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r1.zzd(r2, r3)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            java.lang.String r2 = "internal.appMetadata"
            com.google.android.gms.measurement.internal.zzhz r3 = new com.google.android.gms.measurement.internal.zzhz     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r3.<init>(r4, r5)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r1.zzd(r2, r3)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            java.lang.String r2 = "internal.logger"
            com.google.android.gms.measurement.internal.zzia r3 = new com.google.android.gms.measurement.internal.zzia     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r3.<init>(r4)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r1.zzd(r2, r3)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r1.zzc(r6)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            androidx.collection.LruCache r2 = r4.zzd     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r2.put(r5, r1)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            java.lang.String r2 = "EES program loaded for appId, activities"
            com.google.android.gms.internal.measurement.zzir r3 = r6.zza()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            int r3 = r3.zza()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r1.zzc(r2, r5, r3)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            com.google.android.gms.internal.measurement.zzir r6 = r6.zza()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            java.util.List r6 = r6.zzd()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            java.util.Iterator r6 = r6.iterator()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
        L78:
            boolean r1 = r6.hasNext()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            if (r1 == 0) goto L96
            java.lang.Object r1 = r6.next()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            com.google.android.gms.internal.measurement.zzit r1 = (com.google.android.gms.internal.measurement.zzit) r1     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            com.google.android.gms.measurement.internal.zzhe r2 = r0.zzaW()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            java.lang.String r3 = "EES program activity"
            java.lang.String r1 = r1.zzb()     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            r2.zzb(r3, r1)     // Catch: com.google.android.gms.internal.measurement.zzd -> L97
            goto L78
        L96:
            return
        L97:
            com.google.android.gms.measurement.internal.zzio r6 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()
            java.lang.String r0 = "Failed to load EES program. appId"
            r6.zzb(r0, r5)
            return
        La7:
            androidx.collection.LruCache r6 = r4.zzd
            r6.remove(r5)
            return
    }

    private static final java.util.Map zzK(com.google.android.gms.internal.measurement.zzgo r3) {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            if (r3 == 0) goto L27
            java.util.List r3 = r3.zzp()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            com.google.android.gms.internal.measurement.zzgw r1 = (com.google.android.gms.internal.measurement.zzgw) r1
            java.lang.String r2 = r1.zzb()
            java.lang.String r1 = r1.zzc()
            r0.put(r2, r1)
            goto Lf
        L27:
            return r0
    }

    private static final com.google.android.gms.measurement.internal.zzjw zzL(int r1) {
            int r1 = r1 + (-1)
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L13
            r0 = 4
            if (r1 == r0) goto L10
            r1 = 0
            return r1
        L10:
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzd
            return r1
        L13:
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzc
            return r1
        L16:
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzb
            return r1
        L19:
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zza
            return r1
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(com.google.android.gms.measurement.internal.zzif r2, java.lang.String r3) {
            r2.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            boolean r0 = r2.zzs(r3)
            if (r0 != 0) goto Le
            r2 = 0
            goto L35
        Le:
            java.util.Map r0 = r2.zzh
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L26
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzgo r0 = (com.google.android.gms.internal.measurement.zzgo) r0
            r2.zzJ(r3, r0)
            goto L29
        L26:
            r2.zzI(r3)
        L29:
            androidx.collection.LruCache r2 = r2.zzd
            java.util.Map r2 = r2.snapshot()
            java.lang.Object r2 = r2.get(r3)
            com.google.android.gms.internal.measurement.zzc r2 = (com.google.android.gms.internal.measurement.zzc) r2
        L35:
            return r2
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zze(com.google.android.gms.measurement.internal.zzif r3, java.lang.String r4) {
            r3.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            com.google.android.gms.measurement.internal.zzpv r0 = r3.zzg
            com.google.android.gms.measurement.internal.zzaw r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzar r0 = r0.zzn(r4)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Populate EES config from database on cache miss. appId"
            r1.zzb(r2, r4)
            byte[] r0 = r0.zza
            com.google.android.gms.internal.measurement.zzgo r0 = r3.zzG(r4, r0)
            r3.zzJ(r4, r0)
            androidx.collection.LruCache r3 = r3.zzd
            java.util.Map r3 = r3.snapshot()
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.internal.measurement.zzc r3 = (com.google.android.gms.internal.measurement.zzc) r3
            return r3
    }

    static /* bridge */ /* synthetic */ java.util.Map zzn(com.google.android.gms.measurement.internal.zzif r0) {
            java.util.Map r0 = r0.zzf
            return r0
    }

    final boolean zzA(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            java.util.Map r0 = r2.zza
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r0 = "app_instance_id"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    final boolean zzB(java.lang.String r6) {
            r5 = this;
            r5.zzg()
            r5.zzI(r6)
            java.util.Map r0 = r5.zza
            java.lang.Object r1 = r0.get(r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.get(r6)
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r4 = "device_model"
            boolean r1 = r1.contains(r4)
            if (r1 != 0) goto L2f
            java.lang.Object r6 = r0.get(r6)
            java.util.Set r6 = (java.util.Set) r6
            java.lang.String r0 = "device_info"
            boolean r6 = r6.contains(r0)
            if (r6 != 0) goto L2d
            goto L2e
        L2d:
            return r2
        L2e:
            r2 = 0
        L2f:
            return r2
    }

    final boolean zzC(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            java.util.Map r0 = r2.zza
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r0 = "enhanced_user_id"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    final boolean zzD(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            java.util.Map r0 = r2.zza
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r0 = "google_signals"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    final boolean zzE(java.lang.String r6) {
            r5 = this;
            r5.zzg()
            r5.zzI(r6)
            java.util.Map r0 = r5.zza
            java.lang.Object r1 = r0.get(r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.get(r6)
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r4 = "os_version"
            boolean r1 = r1.contains(r4)
            if (r1 != 0) goto L2f
            java.lang.Object r6 = r0.get(r6)
            java.util.Set r6 = (java.util.Set) r6
            java.lang.String r0 = "device_info"
            boolean r6 = r6.contains(r0)
            if (r6 != 0) goto L2d
            goto L2e
        L2d:
            return r2
        L2e:
            r2 = 0
        L2f:
            return r2
    }

    final boolean zzF(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            java.util.Map r0 = r2.zza
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r0 = "user_id"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzal
    public final java.lang.String zza(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.zzg()
            r1.zzI(r2)
            java.util.Map r0 = r1.zzf
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L17
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L17:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    final int zzc(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.zzg()
            r1.zzI(r2)
            java.util.Map r0 = r1.zzi
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L19
            goto L1e
        L19:
            int r2 = r2.intValue()
            return r2
        L1e:
            r2 = 1
            return r2
    }

    final com.google.android.gms.measurement.internal.zzju zzf(java.lang.String r3, com.google.android.gms.measurement.internal.zzjw r4) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            com.google.android.gms.internal.measurement.zzgi r3 = r2.zzi(r3)
            if (r3 != 0) goto Lf
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.zza
            return r3
        Lf:
            java.util.List r3 = r3.zzf()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.next()
            com.google.android.gms.internal.measurement.zzfz r0 = (com.google.android.gms.internal.measurement.zzfz) r0
            int r1 = r0.zzc()
            com.google.android.gms.measurement.internal.zzjw r1 = zzL(r1)
            if (r1 != r4) goto L17
            int r3 = r0.zzb()
            int r3 = r3 + (-1)
            r4 = 1
            if (r3 == r4) goto L3f
            r4 = 2
            if (r3 == r4) goto L3c
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.zza
            return r3
        L3c:
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.zzc
            return r3
        L3f:
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.zzd
            return r3
        L42:
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.zza
            return r3
    }

    final com.google.android.gms.measurement.internal.zzjw zzh(java.lang.String r3, com.google.android.gms.measurement.internal.zzjw r4) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            com.google.android.gms.internal.measurement.zzgi r3 = r2.zzi(r3)
            if (r3 != 0) goto Ld
            goto L34
        Ld:
            java.util.List r3 = r3.zze()
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.next()
            com.google.android.gms.internal.measurement.zzgb r0 = (com.google.android.gms.internal.measurement.zzgb) r0
            int r1 = r0.zzc()
            com.google.android.gms.measurement.internal.zzjw r1 = zzL(r1)
            if (r4 != r1) goto L15
            int r3 = r0.zzb()
            com.google.android.gms.measurement.internal.zzjw r3 = zzL(r3)
            return r3
        L34:
            r3 = 0
            return r3
    }

    final com.google.android.gms.internal.measurement.zzgi zzi(java.lang.String r2) {
            r1 = this;
            r1.zzg()
            r1.zzI(r2)
            com.google.android.gms.internal.measurement.zzgo r2 = r1.zzj(r2)
            if (r2 == 0) goto L18
            boolean r0 = r2.zzt()
            if (r0 != 0) goto L13
            goto L18
        L13:
            com.google.android.gms.internal.measurement.zzgi r2 = r2.zzd()
            return r2
        L18:
            r2 = 0
            return r2
    }

    protected final com.google.android.gms.internal.measurement.zzgo zzj(java.lang.String r2) {
            r1 = this;
            r1.zzav()
            r1.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r1.zzI(r2)
            java.util.Map r0 = r1.zzh
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzgo r2 = (com.google.android.gms.internal.measurement.zzgo) r2
            return r2
    }

    protected final java.lang.String zzk(java.lang.String r2) {
            r1 = this;
            r1.zzg()
            java.util.Map r0 = r1.zzl
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    protected final java.lang.String zzl(java.lang.String r2) {
            r1 = this;
            r1.zzg()
            java.util.Map r0 = r1.zzk
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    final java.lang.String zzm(java.lang.String r2) {
            r1 = this;
            r1.zzg()
            r1.zzI(r2)
            java.util.Map r0 = r1.zzj
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    final java.util.Set zzo(java.lang.String r2) {
            r1 = this;
            r1.zzg()
            r1.zzI(r2)
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            return r2
    }

    final java.util.SortedSet zzp(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            com.google.android.gms.internal.measurement.zzgi r3 = r2.zzi(r3)
            if (r3 != 0) goto L12
            goto L2e
        L12:
            java.util.List r3 = r3.zzc()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            com.google.android.gms.internal.measurement.zzgh r1 = (com.google.android.gms.internal.measurement.zzgh) r1
            java.lang.String r1 = r1.zzb()
            r0.add(r1)
            goto L1a
        L2e:
            return r0
    }

    protected final void zzq(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            java.util.Map r0 = r2.zzk
            r1 = 0
            r0.put(r3, r1)
            return
    }

    final void zzr(java.lang.String r2) {
            r1 = this;
            r1.zzg()
            java.util.Map r0 = r1.zzh
            r0.remove(r2)
            return
    }

    public final boolean zzs(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Map r0 = r2.zzh
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzgo r3 = (com.google.android.gms.internal.measurement.zzgo) r3
            if (r3 != 0) goto L13
            return r1
        L13:
            int r3 = r3.zza()
            if (r3 == 0) goto L1b
            r3 = 1
            return r3
        L1b:
            return r1
    }

    final boolean zzt(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "measurement.upload.blacklist_internal"
            java.lang.String r2 = r1.zza(r2, r0)
            java.lang.String r0 = "1"
            boolean r2 = r0.equals(r2)
            return r2
    }

    final boolean zzu(java.lang.String r4, com.google.android.gms.measurement.internal.zzjw r5) {
            r3 = this;
            r3.zzg()
            r3.zzI(r4)
            com.google.android.gms.internal.measurement.zzgi r4 = r3.zzi(r4)
            r0 = 0
            if (r4 != 0) goto Le
            return r0
        Le:
            java.util.List r4 = r4.zzd()
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()
            com.google.android.gms.internal.measurement.zzfz r1 = (com.google.android.gms.internal.measurement.zzfz) r1
            int r2 = r1.zzc()
            com.google.android.gms.measurement.internal.zzjw r2 = zzL(r2)
            if (r5 != r2) goto L16
            int r4 = r1.zzb()
            r5 = 2
            if (r4 != r5) goto L35
            r4 = 1
            return r4
        L35:
            return r0
    }

    final boolean zzv(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            com.google.android.gms.internal.measurement.zzgi r3 = r2.zzi(r3)
            r0 = 1
            if (r3 != 0) goto Le
            return r0
        Le:
            boolean r1 = r3.zzh()
            if (r1 == 0) goto L1d
            boolean r3 = r3.zzg()
            if (r3 == 0) goto L1b
            goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            return r0
    }

    final boolean zzw(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            java.lang.String r0 = "ecommerce_purchase"
            boolean r0 = r0.equals(r4)
            r1 = 1
            if (r0 == 0) goto L10
            return r1
        L10:
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "refund"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L21
            goto L3b
        L21:
            java.util.Map r0 = r2.zzc
            java.lang.Object r3 = r0.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 0
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r3.get(r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 != 0) goto L35
            return r0
        L35:
            boolean r3 = r3.booleanValue()
            return r3
        L3a:
            return r0
        L3b:
            return r1
    }

    final boolean zzx(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r2.zzg()
            r2.zzI(r3)
            boolean r0 = r2.zzt(r3)
            r1 = 1
            if (r0 == 0) goto L15
            boolean r0 = com.google.android.gms.measurement.internal.zzqf.zzap(r4)
            if (r0 != 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            boolean r0 = r2.zzy(r3)
            if (r0 == 0) goto L23
            boolean r0 = com.google.android.gms.measurement.internal.zzqf.zzaq(r4)
            if (r0 != 0) goto L22
            goto L23
        L22:
            return r1
        L23:
            java.util.Map r0 = r2.zzb
            java.lang.Object r3 = r0.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            r0 = 0
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r3.get(r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 != 0) goto L37
            return r0
        L37:
            boolean r3 = r3.booleanValue()
            return r3
        L3c:
            return r0
    }

    final boolean zzy(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "measurement.upload.blacklist_public"
            java.lang.String r2 = r1.zza(r2, r0)
            java.lang.String r0 = "1"
            boolean r2 = r0.equals(r2)
            return r2
    }

    protected final boolean zzz(java.lang.String r7, byte[] r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r6.zzav()
            r6.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            com.google.android.gms.internal.measurement.zzgo r0 = r6.zzG(r7, r8)
            com.google.android.gms.internal.measurement.zzlz r0 = r0.zzch()
            com.google.android.gms.internal.measurement.zzgn r0 = (com.google.android.gms.internal.measurement.zzgn) r0
            r6.zzH(r7, r0)
            com.google.android.gms.internal.measurement.zzmd r1 = r0.zzba()
            com.google.android.gms.internal.measurement.zzgo r1 = (com.google.android.gms.internal.measurement.zzgo) r1
            r6.zzJ(r7, r1)
            com.google.android.gms.internal.measurement.zzmd r1 = r0.zzba()
            com.google.android.gms.internal.measurement.zzgo r1 = (com.google.android.gms.internal.measurement.zzgo) r1
            java.util.Map r2 = r6.zzh
            r2.put(r7, r1)
            java.lang.String r1 = r0.zzf()
            java.util.Map r2 = r6.zzj
            r2.put(r7, r1)
            java.util.Map r1 = r6.zzk
            r1.put(r7, r9)
            java.util.Map r1 = r6.zzl
            r1.put(r7, r10)
            com.google.android.gms.internal.measurement.zzmd r1 = r0.zzba()
            com.google.android.gms.internal.measurement.zzgo r1 = (com.google.android.gms.internal.measurement.zzgo) r1
            java.util.Map r1 = zzK(r1)
            java.util.Map r2 = r6.zzf
            r2.put(r7, r1)
            com.google.android.gms.measurement.internal.zzpv r1 = r6.zzg
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzj()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r3 = r0.zzg()
            r2.<init>(r3)
            r1.zzR(r7, r2)
            r0.zzc()     // Catch: java.lang.RuntimeException -> L6c
            com.google.android.gms.internal.measurement.zzmd r1 = r0.zzba()     // Catch: java.lang.RuntimeException -> L6c
            com.google.android.gms.internal.measurement.zzgo r1 = (com.google.android.gms.internal.measurement.zzgo) r1     // Catch: java.lang.RuntimeException -> L6c
            byte[] r8 = r1.zzcd()     // Catch: java.lang.RuntimeException -> L6c
            goto L80
        L6c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            java.lang.String r4 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r2.zzc(r4, r3, r1)
        L80:
            com.google.android.gms.measurement.internal.zzpv r1 = r6.zzg
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzj()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r1.zzg()
            r1.zzav()
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = "remote_config"
            r2.put(r3, r8)
            java.lang.String r8 = "config_last_modified_time"
            r2.put(r8, r9)
            java.lang.String r8 = "e_tag"
            r2.put(r8, r10)
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r1.zzj()     // Catch: android.database.sqlite.SQLiteException -> Ld0
            java.lang.String r10 = "apps"
            java.lang.String r3 = "app_id = ?"
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch: android.database.sqlite.SQLiteException -> Ld0
            r5 = 0
            r4[r5] = r7     // Catch: android.database.sqlite.SQLiteException -> Ld0
            int r9 = r9.update(r10, r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> Ld0
            long r9 = (long) r9     // Catch: android.database.sqlite.SQLiteException -> Ld0
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto Le4
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> Ld0
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Ld0
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()     // Catch: android.database.sqlite.SQLiteException -> Ld0
            java.lang.String r10 = "Failed to update remote config (got 0). appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)     // Catch: android.database.sqlite.SQLiteException -> Ld0
            r9.zzb(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> Ld0
            goto Le4
        Ld0:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzio r10 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zze()
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            java.lang.String r2 = "Error storing remote config. appId"
            r10.zzc(r2, r1, r9)
        Le4:
            com.google.android.gms.measurement.internal.zzio r9 = r6.zzu
            com.google.android.gms.measurement.internal.zzam r9 = r9.zzf()
            r10 = 0
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzbn
            boolean r9 = r9.zzx(r10, r1)
            if (r9 == 0) goto Lf6
            r0.zzd()
        Lf6:
            java.util.Map r9 = r6.zzh
            com.google.android.gms.internal.measurement.zzmd r10 = r0.zzba()
            com.google.android.gms.internal.measurement.zzgo r10 = (com.google.android.gms.internal.measurement.zzgo) r10
            r9.put(r7, r10)
            return r8
    }
}
