package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzmo extends com.google.android.gms.measurement.internal.zzg {
    protected com.google.android.gms.measurement.internal.zzmh zza;
    private volatile com.google.android.gms.measurement.internal.zzmh zzb;
    private volatile com.google.android.gms.measurement.internal.zzmh zzc;
    private final java.util.Map zzd;
    private com.google.android.gms.internal.measurement.zzdj zze;
    private volatile boolean zzf;
    private volatile com.google.android.gms.measurement.internal.zzmh zzg;
    private com.google.android.gms.measurement.internal.zzmh zzh;
    private boolean zzi;
    private final java.lang.Object zzj;

    public zzmo(com.google.android.gms.measurement.internal.zzio r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.zzj = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.zzd = r1
            return
    }

    private final void zzA(java.lang.String r17, com.google.android.gms.measurement.internal.zzmh r18, boolean r19) {
            r16 = this;
            r7 = r16
            r0 = r17
            r1 = r18
            com.google.android.gms.measurement.internal.zzmh r2 = r7.zzb
            if (r2 != 0) goto Ld
            com.google.android.gms.measurement.internal.zzmh r2 = r7.zzc
            goto Lf
        Ld:
            com.google.android.gms.measurement.internal.zzmh r2 = r7.zzb
        Lf:
            r3 = r2
            java.lang.String r2 = r1.zzb
            if (r2 != 0) goto L2f
            if (r0 == 0) goto L1d
            java.lang.String r2 = "Activity"
            java.lang.String r0 = r7.zzl(r0, r2)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r10 = r0
            com.google.android.gms.measurement.internal.zzmh r0 = new com.google.android.gms.measurement.internal.zzmh
            java.lang.String r9 = r1.zza
            long r11 = r1.zzc
            boolean r13 = r1.zze
            long r14 = r1.zzf
            r8 = r0
            r8.<init>(r9, r10, r11, r13, r14)
            r2 = r0
            goto L30
        L2f:
            r2 = r1
        L30:
            com.google.android.gms.measurement.internal.zzmh r0 = r7.zzb
            r7.zzc = r0
            r7.zzb = r2
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r4 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzil r8 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzmj r9 = new com.google.android.gms.measurement.internal.zzmj
            r0 = r9
            r1 = r16
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r6)
            r8.zzq(r9)
            return
    }

    private final void zzB(com.google.android.gms.measurement.internal.zzmh r16, com.google.android.gms.measurement.internal.zzmh r17, long r18, boolean r20, android.os.Bundle r21) {
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r15.zzg()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L2f
            long r8 = r1.zzc
            long r10 = r2.zzc
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 != 0) goto L2f
            java.lang.String r8 = r2.zzb
            java.lang.String r9 = r1.zzb
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L2f
            java.lang.String r8 = r2.zza
            java.lang.String r9 = r1.zza
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 != 0) goto L2d
            goto L2f
        L2d:
            r8 = 0
            goto L30
        L2f:
            r8 = 1
        L30:
            if (r20 == 0) goto L37
            com.google.android.gms.measurement.internal.zzmh r9 = r0.zza
            if (r9 == 0) goto L37
            r6 = 1
        L37:
            if (r8 == 0) goto Lc4
            if (r5 == 0) goto L41
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r5)
            goto L46
        L41:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L46:
            r14 = r8
            com.google.android.gms.measurement.internal.zzqf.zzN(r1, r14, r7)
            if (r2 == 0) goto L65
            java.lang.String r5 = r2.zza
            if (r5 == 0) goto L55
            java.lang.String r8 = "_pn"
            r14.putString(r8, r5)
        L55:
            java.lang.String r5 = r2.zzb
            if (r5 == 0) goto L5e
            java.lang.String r8 = "_pc"
            r14.putString(r8, r5)
        L5e:
            long r8 = r2.zzc
            java.lang.String r2 = "_pi"
            r14.putLong(r2, r8)
        L65:
            r8 = 0
            if (r6 == 0) goto L84
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzop r2 = r2.zzv()
            com.google.android.gms.measurement.internal.zzon r2 = r2.zzb
            long r10 = r2.zzb
            long r10 = r3 - r10
            r2.zzb = r3
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L84
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            r2.zzL(r14, r10)
        L84:
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r5 = r2.zzf()
            boolean r5 = r5.zzz()
            if (r5 != 0) goto L97
            r10 = 1
            java.lang.String r5 = "_mst"
            r14.putLong(r5, r10)
        L97:
            boolean r5 = r1.zze
            if (r7 == r5) goto L9e
            java.lang.String r10 = "auto"
            goto La0
        L9e:
            java.lang.String r10 = "app"
        La0:
            com.google.android.gms.common.util.Clock r2 = r2.zzaU()
            long r11 = r2.currentTimeMillis()
            if (r5 == 0) goto Lb5
            r20 = r11
            long r11 = r1.zzf
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 != 0) goto Lb3
            goto Lb7
        Lb3:
            r12 = r11
            goto Lb9
        Lb5:
            r20 = r11
        Lb7:
            r12 = r20
        Lb9:
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzlw r9 = r2.zzq()
            java.lang.String r11 = "_vs"
            r9.zzS(r10, r11, r12, r14)
        Lc4:
            if (r6 == 0) goto Lcb
            com.google.android.gms.measurement.internal.zzmh r2 = r0.zza
            r15.zzC(r2, r7, r3)
        Lcb:
            r0.zza = r1
            boolean r2 = r1.zze
            if (r2 == 0) goto Ld3
            r0.zzh = r1
        Ld3:
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzny r2 = r2.zzu()
            r2.zzS(r1)
            return
    }

    private final void zzC(com.google.android.gms.measurement.internal.zzmh r5, boolean r6, long r7) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzd r1 = r0.zzd()
            com.google.android.gms.common.util.Clock r2 = r0.zzaU()
            long r2 = r2.elapsedRealtime()
            r1.zzf(r2)
            r1 = 0
            if (r5 == 0) goto L1a
            boolean r2 = r5.zzd
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            com.google.android.gms.measurement.internal.zzop r0 = r0.zzv()
            com.google.android.gms.measurement.internal.zzon r0 = r0.zzb
            boolean r6 = r0.zzd(r2, r6, r7)
            if (r6 == 0) goto L2b
            if (r5 == 0) goto L2b
            r5.zzd = r1
        L2b:
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzmh zzh(com.google.android.gms.measurement.internal.zzmo r0) {
            com.google.android.gms.measurement.internal.zzmh r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ void zzm(com.google.android.gms.measurement.internal.zzmo r0, com.google.android.gms.measurement.internal.zzmh r1) {
            r1 = 0
            r0.zzh = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzp(com.google.android.gms.measurement.internal.zzmo r7, com.google.android.gms.measurement.internal.zzmh r8, com.google.android.gms.measurement.internal.zzmh r9, long r10, boolean r12, android.os.Bundle r13) {
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r0.zzB(r1, r2, r3, r5, r6)
            return
    }

    static /* bridge */ /* synthetic */ void zzq(com.google.android.gms.measurement.internal.zzmo r8, android.os.Bundle r9, com.google.android.gms.measurement.internal.zzmh r10, com.google.android.gms.measurement.internal.zzmh r11, long r12) {
            java.lang.String r0 = "screen_name"
            r9.remove(r0)
            java.lang.String r0 = "screen_class"
            r9.remove(r0)
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            r1 = 0
            java.lang.String r2 = "screen_view"
            r4 = 0
            r5 = 0
            r3 = r9
            android.os.Bundle r7 = r0.zzA(r1, r2, r3, r4, r5)
            r0 = 1
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r0
            r1.zzB(r2, r3, r4, r6, r7)
            return
    }

    static /* bridge */ /* synthetic */ void zzr(com.google.android.gms.measurement.internal.zzmo r0, com.google.android.gms.measurement.internal.zzmh r1, boolean r2, long r3) {
            r2 = 0
            r0.zzC(r1, r2, r3)
            return
    }

    private final com.google.android.gms.measurement.internal.zzmh zzz(com.google.android.gms.internal.measurement.zzdj r8) {
            r7 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            int r0 = r8.zza
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Map r1 = r7.zzd
            java.lang.Object r2 = r1.get(r0)
            com.google.android.gms.measurement.internal.zzmh r2 = (com.google.android.gms.measurement.internal.zzmh) r2
            if (r2 != 0) goto L2f
            java.lang.String r8 = r8.zzb
            java.lang.String r2 = "Activity"
            java.lang.String r8 = r7.zzl(r8, r2)
            com.google.android.gms.measurement.internal.zzio r2 = r7.zzu
            com.google.android.gms.measurement.internal.zzmh r3 = new com.google.android.gms.measurement.internal.zzmh
            r4 = 0
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            long r5 = r2.zzs()
            r3.<init>(r4, r8, r5)
            r1.put(r0, r3)
            r2 = r3
        L2f:
            com.google.android.gms.measurement.internal.zzmh r8 = r7.zzg
            if (r8 == 0) goto L36
            com.google.android.gms.measurement.internal.zzmh r8 = r7.zzg
            return r8
        L36:
            return r2
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzmh zzi() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzmh r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzmh zzj(boolean r1) {
            r0 = this;
            r0.zza()
            r0.zzg()
            if (r1 != 0) goto Lb
            com.google.android.gms.measurement.internal.zzmh r1 = r0.zza
            return r1
        Lb:
            com.google.android.gms.measurement.internal.zzmh r1 = r0.zza
            if (r1 == 0) goto L10
            return r1
        L10:
            com.google.android.gms.measurement.internal.zzmh r1 = r0.zzh
            return r1
    }

    final java.lang.String zzl(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            if (r5 != 0) goto L5
            java.lang.String r5 = "Activity"
            return r5
        L5:
            java.lang.String r6 = "\\."
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            if (r6 <= 0) goto L13
            int r6 = r6 + (-1)
            r5 = r5[r6]
            goto L15
        L13:
            java.lang.String r5 = ""
        L15:
            com.google.android.gms.measurement.internal.zzio r6 = r4.zzu
            int r0 = r5.length()
            com.google.android.gms.measurement.internal.zzam r1 = r6.zzf()
            r2 = 0
            r3 = 0
            int r1 = r1.zzc(r2, r3)
            if (r0 <= r1) goto L33
            com.google.android.gms.measurement.internal.zzam r6 = r6.zzf()
            int r6 = r6.zzc(r2, r3)
            java.lang.String r5 = r5.substring(r3, r6)
        L33:
            return r5
    }

    public final void zzs(com.google.android.gms.internal.measurement.zzdj r6, android.os.Bundle r7) {
            r5 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            boolean r0 = r0.zzz()
            if (r0 != 0) goto Ld
            goto L39
        Ld:
            if (r7 == 0) goto L39
            java.lang.String r0 = "com.google.app_measurement.screen_service"
            android.os.Bundle r7 = r7.getBundle(r0)
            if (r7 == 0) goto L39
            com.google.android.gms.measurement.internal.zzmh r0 = new com.google.android.gms.measurement.internal.zzmh
            java.lang.String r1 = "name"
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "referrer_name"
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r3 = "id"
            long r3 = r7.getLong(r3)
            r0.<init>(r1, r2, r3)
            java.util.Map r7 = r5.zzd
            int r6 = r6.zza
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.put(r6, r0)
        L39:
            return
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzdj r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzj
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzdj r1 = r2.zze     // Catch: java.lang.Throwable -> L28
            boolean r1 = java.util.Objects.equals(r1, r3)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto Le
            r1 = 0
            r2.zze = r1     // Catch: java.lang.Throwable -> L28
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            boolean r0 = r0.zzz()
            if (r0 != 0) goto L1c
            return
        L1c:
            java.util.Map r0 = r2.zzd
            int r3 = r3.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.remove(r3)
            return
        L28:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r3
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzdj r6) {
            r5 = this;
            java.lang.Object r0 = r5.zzj
            monitor-enter(r0)
            r1 = 0
            r5.zzi = r1     // Catch: java.lang.Throwable -> L45
            r1 = 1
            r5.zzf = r1     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzam r3 = r0.zzf()
            boolean r3 = r3.zzz()
            r4 = 0
            if (r3 != 0) goto L2e
            r5.zzb = r4
            com.google.android.gms.measurement.internal.zzil r6 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzml r0 = new com.google.android.gms.measurement.internal.zzml
            r0.<init>(r5, r1)
            r6.zzq(r0)
            return
        L2e:
            com.google.android.gms.measurement.internal.zzmh r6 = r5.zzz(r6)
            com.google.android.gms.measurement.internal.zzmh r3 = r5.zzb
            r5.zzc = r3
            r5.zzb = r4
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzmm r3 = new com.google.android.gms.measurement.internal.zzmm
            r3.<init>(r5, r6, r1)
            r0.zzq(r3)
            return
        L45:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r6
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzdj r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzj
            monitor-enter(r0)
            r1 = 1
            r4.zzi = r1     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.measurement.zzdj r1 = r4.zze     // Catch: java.lang.Throwable -> L78
            boolean r1 = java.util.Objects.equals(r5, r1)     // Catch: java.lang.Throwable -> L78
            r2 = 0
            if (r1 != 0) goto L34
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L78
            r4.zze = r5     // Catch: java.lang.Throwable -> L31
            r4.zzf = r2     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.measurement.internal.zzio r1 = r4.zzu     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.measurement.internal.zzam r3 = r1.zzf()     // Catch: java.lang.Throwable -> L78
            boolean r3 = r3.zzz()     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L34
            r3 = 0
            r4.zzg = r3     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.measurement.internal.zzmn r3 = new com.google.android.gms.measurement.internal.zzmn     // Catch: java.lang.Throwable -> L78
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L78
            r1.zzq(r3)     // Catch: java.lang.Throwable -> L78
            goto L34
        L31:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L78
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            boolean r1 = r1.zzz()
            if (r1 != 0) goto L52
            com.google.android.gms.measurement.internal.zzmh r5 = r4.zzg
            r4.zzb = r5
            com.google.android.gms.measurement.internal.zzil r5 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzmk r0 = new com.google.android.gms.measurement.internal.zzmk
            r0.<init>(r4)
            r5.zzq(r0)
            return
        L52:
            com.google.android.gms.measurement.internal.zzmh r0 = r4.zzz(r5)
            java.lang.String r5 = r5.zzb
            r4.zzA(r5, r0, r2)
            com.google.android.gms.measurement.internal.zzio r5 = r4.zzu
            com.google.android.gms.measurement.internal.zzd r5 = r5.zzd()
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzc r3 = new com.google.android.gms.measurement.internal.zzc
            r3.<init>(r5, r1)
            r0.zzq(r3)
            return
        L78:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L78
            throw r5
    }

    public final void zzw(com.google.android.gms.internal.measurement.zzdj r5, android.os.Bundle r6) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            boolean r0 = r0.zzz()
            if (r0 != 0) goto Ld
            goto L3e
        Ld:
            if (r6 == 0) goto L3e
            java.util.Map r0 = r4.zzd
            int r5 = r5.zza
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.measurement.internal.zzmh r5 = (com.google.android.gms.measurement.internal.zzmh) r5
            if (r5 == 0) goto L3e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            long r1 = r5.zzc
            java.lang.String r3 = "id"
            r0.putLong(r3, r1)
            java.lang.String r1 = r5.zza
            java.lang.String r2 = "name"
            r0.putString(r2, r1)
            java.lang.String r5 = r5.zzb
            java.lang.String r1 = "referrer_name"
            r0.putString(r1, r5)
            java.lang.String r5 = "com.google.app_measurement.screen_service"
            r6.putBundle(r5, r0)
        L3e:
            return
    }

    @java.lang.Deprecated
    public final void zzx(com.google.android.gms.internal.measurement.zzdj r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            boolean r1 = r1.zzz()
            if (r1 != 0) goto L1a
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()
            java.lang.String r9 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r8.zza(r9)
            return
        L1a:
            com.google.android.gms.measurement.internal.zzmh r1 = r7.zzb
            if (r1 != 0) goto L2c
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()
            java.lang.String r9 = "setCurrentScreen cannot be called while no activity active"
            r8.zza(r9)
            return
        L2c:
            java.util.Map r2 = r7.zzd
            int r3 = r8.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r2.get(r3)
            if (r4 != 0) goto L48
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()
            java.lang.String r9 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r8.zza(r9)
            return
        L48:
            if (r10 != 0) goto L52
            java.lang.String r10 = r8.zzb
            java.lang.String r4 = "Activity"
            java.lang.String r10 = r7.zzl(r10, r4)
        L52:
            java.lang.String r4 = r1.zzb
            java.lang.String r1 = r1.zza
            boolean r4 = java.util.Objects.equals(r4, r10)
            boolean r1 = java.util.Objects.equals(r1, r9)
            if (r4 == 0) goto L71
            if (r1 != 0) goto L63
            goto L71
        L63:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()
            java.lang.String r9 = "setCurrentScreen cannot be called with the same class and name"
            r8.zza(r9)
            return
        L71:
            r1 = 0
            r4 = 0
            if (r9 == 0) goto La0
            int r5 = r9.length()
            if (r5 <= 0) goto L8a
            int r5 = r9.length()
            com.google.android.gms.measurement.internal.zzam r6 = r0.zzf()
            int r6 = r6.zzc(r4, r1)
            if (r5 > r6) goto L8a
            goto La0
        L8a:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()
            int r9 = r9.length()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Invalid screen name length in setCurrentScreen. Length"
            r8.zzb(r10, r9)
            return
        La0:
            if (r10 == 0) goto Lcd
            int r5 = r10.length()
            if (r5 <= 0) goto Lb7
            int r5 = r10.length()
            com.google.android.gms.measurement.internal.zzam r6 = r0.zzf()
            int r1 = r6.zzc(r4, r1)
            if (r5 > r1) goto Lb7
            goto Lcd
        Lb7:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzl()
            int r9 = r10.length()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "Invalid class name length in setCurrentScreen. Length"
            r8.zzb(r10, r9)
            return
        Lcd:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            if (r9 != 0) goto Lda
            java.lang.String r4 = "null"
            goto Ldb
        Lda:
            r4 = r9
        Ldb:
            java.lang.String r5 = "Setting current screen to name, class"
            r1.zzc(r5, r4, r10)
            com.google.android.gms.measurement.internal.zzmh r1 = new com.google.android.gms.measurement.internal.zzmh
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            long r4 = r0.zzs()
            r1.<init>(r9, r10, r4)
            r2.put(r3, r1)
            java.lang.String r8 = r8.zzb
            r9 = 1
            r7.zzA(r8, r1, r9)
            return
    }

    public final void zzy(android.os.Bundle r13, long r14) {
            r12 = this;
            java.lang.Object r0 = r12.zzj
            monitor-enter(r0)
            boolean r1 = r12.zzi     // Catch: java.lang.Throwable -> L11b
            if (r1 != 0) goto L18
            com.google.android.gms.measurement.internal.zzio r13 = r12.zzu     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzl()     // Catch: java.lang.Throwable -> L11b
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.zza(r14)     // Catch: java.lang.Throwable -> L11b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11b
            return
        L18:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch: java.lang.Throwable -> L11b
            r1 = 0
            r2 = 0
            if (r3 == 0) goto L51
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L11b
            if (r4 <= 0) goto L38
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzio r5 = r12.zzu     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzam r5 = r5.zzf()     // Catch: java.lang.Throwable -> L11b
            int r5 = r5.zzc(r1, r2)     // Catch: java.lang.Throwable -> L11b
            if (r4 <= r5) goto L51
        L38:
            com.google.android.gms.measurement.internal.zzio r13 = r12.zzu     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzl()     // Catch: java.lang.Throwable -> L11b
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch: java.lang.Throwable -> L11b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L11b
            r13.zzb(r14, r15)     // Catch: java.lang.Throwable -> L11b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11b
            return
        L51:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r13.getString(r4)     // Catch: java.lang.Throwable -> L11b
            if (r4 == 0) goto L88
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L11b
            if (r5 <= 0) goto L6f
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzio r6 = r12.zzu     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzam r6 = r6.zzf()     // Catch: java.lang.Throwable -> L11b
            int r1 = r6.zzc(r1, r2)     // Catch: java.lang.Throwable -> L11b
            if (r5 <= r1) goto L88
        L6f:
            com.google.android.gms.measurement.internal.zzio r13 = r12.zzu     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzl()     // Catch: java.lang.Throwable -> L11b
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r4.length()     // Catch: java.lang.Throwable -> L11b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L11b
            r13.zzb(r14, r15)     // Catch: java.lang.Throwable -> L11b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11b
            return
        L88:
            if (r4 != 0) goto L9a
            com.google.android.gms.internal.measurement.zzdj r1 = r12.zze     // Catch: java.lang.Throwable -> L11b
            if (r1 == 0) goto L97
            java.lang.String r1 = r1.zzb     // Catch: java.lang.Throwable -> L11b
            java.lang.String r4 = "Activity"
            java.lang.String r1 = r12.zzl(r1, r4)     // Catch: java.lang.Throwable -> L11b
            goto L99
        L97:
            java.lang.String r1 = "Activity"
        L99:
            r4 = r1
        L9a:
            com.google.android.gms.measurement.internal.zzmh r1 = r12.zzb     // Catch: java.lang.Throwable -> L11b
            boolean r5 = r12.zzf     // Catch: java.lang.Throwable -> L11b
            if (r5 == 0) goto Lc5
            if (r1 == 0) goto Lc5
            r12.zzf = r2     // Catch: java.lang.Throwable -> L11b
            java.lang.String r2 = r1.zzb     // Catch: java.lang.Throwable -> L11b
            boolean r2 = java.util.Objects.equals(r2, r4)     // Catch: java.lang.Throwable -> L11b
            java.lang.String r1 = r1.zza     // Catch: java.lang.Throwable -> L11b
            boolean r1 = java.util.Objects.equals(r1, r3)     // Catch: java.lang.Throwable -> L11b
            if (r2 == 0) goto Lc5
            if (r1 == 0) goto Lc5
            com.google.android.gms.measurement.internal.zzio r13 = r12.zzu     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzl()     // Catch: java.lang.Throwable -> L11b
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.zza(r14)     // Catch: java.lang.Throwable -> L11b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11b
            return
        Lc5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11b
            com.google.android.gms.measurement.internal.zzio r0 = r12.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            if (r3 != 0) goto Ld5
            java.lang.String r2 = "null"
            goto Ld6
        Ld5:
            r2 = r3
        Ld6:
            if (r4 != 0) goto Ldb
            java.lang.String r5 = "null"
            goto Ldc
        Ldb:
            r5 = r4
        Ldc:
            java.lang.String r6 = "Logging screen view with name, class"
            r1.zzc(r6, r2, r5)
            com.google.android.gms.measurement.internal.zzmh r1 = r12.zzb
            if (r1 != 0) goto Le8
            com.google.android.gms.measurement.internal.zzmh r1 = r12.zzc
            goto Lea
        Le8:
            com.google.android.gms.measurement.internal.zzmh r1 = r12.zzb
        Lea:
            com.google.android.gms.measurement.internal.zzmh r10 = new com.google.android.gms.measurement.internal.zzmh
            com.google.android.gms.measurement.internal.zzqf r2 = r0.zzw()
            long r5 = r2.zzs()
            r7 = 1
            r2 = r10
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.zzb = r10
            r12.zzc = r1
            r12.zzg = r10
            com.google.android.gms.common.util.Clock r14 = r0.zzaU()
            long r14 = r14.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzmi r2 = new com.google.android.gms.measurement.internal.zzmi
            r5 = r2
            r6 = r12
            r7 = r13
            r8 = r10
            r9 = r1
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r0.zzq(r2)
            return
        L11b:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11b
            throw r13
    }
}
