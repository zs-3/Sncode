package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzceb extends com.google.android.gms.internal.ads.zzcdv implements com.google.android.gms.internal.ads.zzhh {
    private java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzcci zze;
    private boolean zzf;
    private final com.google.android.gms.internal.ads.zzcea zzg;
    private final com.google.android.gms.internal.ads.zzcdf zzh;
    private java.nio.ByteBuffer zzi;
    private boolean zzj;
    private final java.lang.Object zzk;
    private final java.lang.String zzl;
    private final int zzm;
    private boolean zzn;

    public zzceb(com.google.android.gms.internal.ads.zzccj r2, com.google.android.gms.internal.ads.zzcci r3) {
            r1 = this;
            r1.<init>(r2)
            r1.zze = r3
            com.google.android.gms.internal.ads.zzcea r3 = new com.google.android.gms.internal.ads.zzcea
            r3.<init>()
            r1.zzg = r3
            com.google.android.gms.internal.ads.zzcdf r3 = new com.google.android.gms.internal.ads.zzcdf
            r3.<init>()
            r1.zzh = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r1.zzk = r3
            if (r2 == 0) goto L21
            java.lang.String r3 = r2.zzr()
            goto L22
        L21:
            r3 = 0
        L22:
            com.google.android.gms.internal.ads.zzfxx r3 = com.google.android.gms.internal.ads.zzfxx.zzd(r3)
            java.lang.String r0 = ""
            java.lang.Object r3 = r3.zzb(r0)
            java.lang.String r3 = (java.lang.String) r3
            r1.zzl = r3
            if (r2 == 0) goto L37
            int r2 = r2.zzf()
            goto L38
        L37:
            r2 = 0
        L38:
            r1.zzm = r2
            return
    }

    protected static final java.lang.String zzm(java.lang.String r1) {
            java.lang.String r1 = com.google.android.gms.ads.internal.util.client.zzf.zzf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "cache:"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    private final void zzv() {
            r14 = this;
            com.google.android.gms.internal.ads.zzcea r0 = r14.zzg
            long r0 = r0.zza()
            int r6 = (int) r0
            com.google.android.gms.internal.ads.zzcdf r0 = r14.zzh
            java.nio.ByteBuffer r1 = r14.zzi
            long r0 = r0.zza(r1)
            int r1 = (int) r0
            java.nio.ByteBuffer r0 = r14.zzi
            int r5 = r0.position()
            float r0 = (float) r5
            float r2 = (float) r6
            float r3 = (float) r1
            float r0 = r0 / r2
            float r3 = r3 * r0
            int r0 = java.lang.Math.round(r3)
            int r12 = com.google.android.gms.internal.ads.zzcca.zzs()
            int r13 = com.google.android.gms.internal.ads.zzcca.zzu()
            java.lang.String r3 = r14.zzd
            java.lang.String r4 = zzm(r3)
            long r7 = (long) r0
            if (r0 <= 0) goto L34
            r0 = 1
            r11 = 1
            goto L36
        L34:
            r0 = 0
            r11 = 0
        L36:
            long r9 = (long) r1
            r2 = r14
            r2.zzn(r3, r4, r5, r6, r7, r9, r11, r12, r13)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zza(com.google.android.gms.internal.ads.zzgg r1, com.google.android.gms.internal.ads.zzgm r2, boolean r3, int r4) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzb(com.google.android.gms.internal.ads.zzgg r1, com.google.android.gms.internal.ads.zzgm r2, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzc(com.google.android.gms.internal.ads.zzgg r1, com.google.android.gms.internal.ads.zzgm r2, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzd(com.google.android.gms.internal.ads.zzgg r1, com.google.android.gms.internal.ads.zzgm r2, boolean r3) {
            r0 = this;
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzgu
            if (r2 == 0) goto Lb
            com.google.android.gms.internal.ads.zzcea r2 = r0.zzg
            com.google.android.gms.internal.ads.zzgu r1 = (com.google.android.gms.internal.ads.zzgu) r1
            r2.zzb(r1)
        Lb:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final void zzf() {
            r1 = this;
            r0 = 1
            r1.zzf = r0
            return
    }

    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    public final java.nio.ByteBuffer zzk() {
            r4 = this;
            java.lang.Object r0 = r4.zzk
            monitor-enter(r0)
            java.nio.ByteBuffer r1 = r4.zzi     // Catch: java.lang.Throwable -> L17
            r2 = 1
            if (r1 == 0) goto L11
            boolean r3 = r4.zzj     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L11
            r1.flip()     // Catch: java.lang.Throwable -> L17
            r4.zzj = r2     // Catch: java.lang.Throwable -> L17
        L11:
            r4.zzf = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            java.nio.ByteBuffer r0 = r4.zzi
            return r0
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public final boolean zzl() {
            r1 = this;
            boolean r0 = r1.zzn
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcdv
    public final boolean zzt(java.lang.String r22) {
            r21 = this;
            r1 = r21
            r2 = r22
            r1.zzd = r2
            java.lang.String r3 = "error"
            java.lang.String r4 = zzm(r22)
            r5 = 0
            com.google.android.gms.internal.ads.zzgp r0 = new com.google.android.gms.internal.ads.zzgp     // Catch: java.lang.Exception -> L150
            r0.<init>()     // Catch: java.lang.Exception -> L150
            java.lang.String r6 = r1.zzb     // Catch: java.lang.Exception -> L150
            r0.zzf(r6)     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzcci r6 = r1.zze     // Catch: java.lang.Exception -> L150
            int r6 = r6.zzd     // Catch: java.lang.Exception -> L150
            r0.zzc(r6)     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzcci r6 = r1.zze     // Catch: java.lang.Exception -> L150
            int r6 = r6.zze     // Catch: java.lang.Exception -> L150
            r0.zzd(r6)     // Catch: java.lang.Exception -> L150
            r6 = 1
            r0.zzb(r6)     // Catch: java.lang.Exception -> L150
            r0.zze(r1)     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzgu r9 = r0.zzg()     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzcci r0 = r1.zze     // Catch: java.lang.Exception -> L150
            boolean r0 = r0.zzi     // Catch: java.lang.Exception -> L150
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.zzcdd r0 = new com.google.android.gms.internal.ads.zzcdd     // Catch: java.lang.Exception -> L150
            android.content.Context r8 = r1.zza     // Catch: java.lang.Exception -> L150
            java.lang.String r10 = r1.zzl     // Catch: java.lang.Exception -> L150
            int r11 = r1.zzm     // Catch: java.lang.Exception -> L150
            r12 = 0
            r13 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L150
            r9 = r0
        L45:
            android.net.Uri r11 = android.net.Uri.parse(r22)     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzgm r0 = new com.google.android.gms.internal.ads.zzgm     // Catch: java.lang.Exception -> L150
            r12 = 0
            r14 = -1
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r14, r16)     // Catch: java.lang.Exception -> L150
            r9.zzb(r0)     // Catch: java.lang.Exception -> L150
            java.lang.ref.WeakReference r0 = r1.zzc     // Catch: java.lang.Exception -> L150
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzccj r0 = (com.google.android.gms.internal.ads.zzccj) r0     // Catch: java.lang.Exception -> L150
            if (r0 == 0) goto L65
            r0.zzt(r4, r1)     // Catch: java.lang.Exception -> L150
        L65:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Exception -> L150
            long r7 = r0.currentTimeMillis()     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzF     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L150
            java.lang.Object r10 = r11.zza(r10)     // Catch: java.lang.Exception -> L150
            java.lang.Long r10 = (java.lang.Long) r10     // Catch: java.lang.Exception -> L150
            long r10 = r10.longValue()     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzE     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L150
            java.lang.Object r12 = r13.zza(r12)     // Catch: java.lang.Exception -> L150
            java.lang.Long r12 = (java.lang.Long) r12     // Catch: java.lang.Exception -> L150
            long r12 = r12.longValue()     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzcci r14 = r1.zze     // Catch: java.lang.Exception -> L150
            int r14 = r14.zzc     // Catch: java.lang.Exception -> L150
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocate(r14)     // Catch: java.lang.Exception -> L150
            r1.zzi = r14     // Catch: java.lang.Exception -> L150
            r14 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r14]     // Catch: java.lang.Exception -> L150
            r16 = r7
        L9d:
            java.nio.ByteBuffer r6 = r1.zzi     // Catch: java.lang.Exception -> L150
            int r6 = r6.remaining()     // Catch: java.lang.Exception -> L150
            int r6 = java.lang.Math.min(r6, r14)     // Catch: java.lang.Exception -> L150
            int r6 = r9.zza(r15, r5, r6)     // Catch: java.lang.Exception -> L150
            r14 = -1
            if (r6 != r14) goto Lc0
            r14 = 1
            r1.zzn = r14     // Catch: java.lang.Exception -> L150
            com.google.android.gms.internal.ads.zzcdf r0 = r1.zzh     // Catch: java.lang.Exception -> L150
            java.nio.ByteBuffer r6 = r1.zzi     // Catch: java.lang.Exception -> L150
            long r6 = r0.zza(r6)     // Catch: java.lang.Exception -> L150
            int r0 = (int) r6     // Catch: java.lang.Exception -> L150
            long r6 = (long) r0     // Catch: java.lang.Exception -> L150
            r1.zzj(r2, r4, r6)     // Catch: java.lang.Exception -> L150
        Lbe:
            r3 = 1
            goto Ldf
        Lc0:
            java.lang.Object r14 = r1.zzk     // Catch: java.lang.Exception -> L150
            monitor-enter(r14)     // Catch: java.lang.Exception -> L150
            boolean r5 = r1.zzf     // Catch: java.lang.Throwable -> L14b
            if (r5 != 0) goto Ld0
            java.nio.ByteBuffer r5 = r1.zzi     // Catch: java.lang.Throwable -> L14b
            r18 = r3
            r3 = 0
            r5.put(r15, r3, r6)     // Catch: java.lang.Throwable -> L149
            goto Ld2
        Ld0:
            r18 = r3
        Ld2:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L149
            java.nio.ByteBuffer r3 = r1.zzi     // Catch: java.lang.Exception -> L147
            int r3 = r3.remaining()     // Catch: java.lang.Exception -> L147
            if (r3 > 0) goto Le0
            r21.zzv()     // Catch: java.lang.Exception -> L147
            goto Lbe
        Ldf:
            return r3
        Le0:
            r3 = 1
            boolean r5 = r1.zzf     // Catch: java.lang.Exception -> L147
            if (r5 != 0) goto L123
            long r5 = r0.currentTimeMillis()     // Catch: java.lang.Exception -> L147
            long r19 = r5 - r16
            int r14 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r14 < 0) goto Lf4
            r21.zzv()     // Catch: java.lang.Exception -> L147
            r16 = r5
        Lf4:
            long r5 = r5 - r7
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r12
            int r14 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r14 > 0) goto L103
            r3 = r18
            r5 = 0
            r14 = 8192(0x2000, float:1.14794E-41)
            goto L9d
        L103:
            java.lang.String r3 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
            r0.<init>()     // Catch: java.lang.Exception -> L121
            java.lang.String r5 = "Timeout exceeded. Limit: "
            r0.append(r5)     // Catch: java.lang.Exception -> L121
            r0.append(r12)     // Catch: java.lang.Exception -> L121
            java.lang.String r5 = " sec"
            r0.append(r5)     // Catch: java.lang.Exception -> L121
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L121
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Exception -> L121
            r5.<init>(r0)     // Catch: java.lang.Exception -> L121
            throw r5     // Catch: java.lang.Exception -> L121
        L121:
            r0 = move-exception
            goto L155
        L123:
            java.lang.String r3 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Exception -> L121
            java.nio.ByteBuffer r5 = r1.zzi     // Catch: java.lang.Exception -> L121
            int r5 = r5.limit()     // Catch: java.lang.Exception -> L121
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
            r6.<init>()     // Catch: java.lang.Exception -> L121
            java.lang.String r7 = "Precache abort at "
            r6.append(r7)     // Catch: java.lang.Exception -> L121
            r6.append(r5)     // Catch: java.lang.Exception -> L121
            java.lang.String r5 = " bytes"
            r6.append(r5)     // Catch: java.lang.Exception -> L121
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L121
            r0.<init>(r5)     // Catch: java.lang.Exception -> L121
            throw r0     // Catch: java.lang.Exception -> L121
        L147:
            r0 = move-exception
            goto L153
        L149:
            r0 = move-exception
            goto L14e
        L14b:
            r0 = move-exception
            r18 = r3
        L14e:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L149
            throw r0     // Catch: java.lang.Exception -> L147
        L150:
            r0 = move-exception
            r18 = r3
        L153:
            r3 = r18
        L155:
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = ":"
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to preload url "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " Exception: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            r1.zzg(r2, r4, r3, r0)
            r2 = 0
            return r2
    }
}
