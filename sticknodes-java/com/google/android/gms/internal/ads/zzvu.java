package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzvu implements com.google.android.gms.internal.ads.zzzk, com.google.android.gms.internal.ads.zzun {
    final /* synthetic */ com.google.android.gms.internal.ads.zzvz zza;
    private final long zzb;
    private final android.net.Uri zzc;
    private final com.google.android.gms.internal.ads.zzhg zzd;
    private final com.google.android.gms.internal.ads.zzvo zze;
    private final com.google.android.gms.internal.ads.zzade zzf;
    private final com.google.android.gms.internal.ads.zzdm zzg;
    private final com.google.android.gms.internal.ads.zzadx zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private com.google.android.gms.internal.ads.zzgm zzl;
    private com.google.android.gms.internal.ads.zzaeh zzm;
    private boolean zzn;

    public zzvu(com.google.android.gms.internal.ads.zzvz r1, android.net.Uri r2, com.google.android.gms.internal.ads.zzgg r3, com.google.android.gms.internal.ads.zzvo r4, com.google.android.gms.internal.ads.zzade r5, com.google.android.gms.internal.ads.zzdm r6) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzc = r2
            com.google.android.gms.internal.ads.zzhg r1 = new com.google.android.gms.internal.ads.zzhg
            r1.<init>(r3)
            r0.zzd = r1
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            com.google.android.gms.internal.ads.zzadx r1 = new com.google.android.gms.internal.ads.zzadx
            r1.<init>()
            r0.zzh = r1
            r1 = 1
            r0.zzj = r1
            long r1 = com.google.android.gms.internal.ads.zzup.zza()
            r0.zzb = r1
            r1 = 0
            com.google.android.gms.internal.ads.zzgm r1 = r0.zzi(r1)
            r0.zzl = r1
            return
    }

    static /* bridge */ /* synthetic */ long zzb(com.google.android.gms.internal.ads.zzvu r2) {
            long r0 = r2.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ long zzc(com.google.android.gms.internal.ads.zzvu r2) {
            long r0 = r2.zzk
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgm zzd(com.google.android.gms.internal.ads.zzvu r0) {
            com.google.android.gms.internal.ads.zzgm r0 = r0.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhg zze(com.google.android.gms.internal.ads.zzvu r0) {
            com.google.android.gms.internal.ads.zzhg r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzvu r1, long r2, long r4) {
            com.google.android.gms.internal.ads.zzadx r0 = r1.zzh
            r0.zza = r2
            r1.zzk = r4
            r2 = 1
            r1.zzj = r2
            r2 = 0
            r1.zzn = r2
            return
    }

    private final com.google.android.gms.internal.ads.zzgm zzi(long r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgk r0 = new com.google.android.gms.internal.ads.zzgk
            r0.<init>()
            android.net.Uri r1 = r2.zzc
            r0.zzd(r1)
            r0.zzc(r3)
            r3 = 6
            r0.zza(r3)
            java.util.Map r3 = com.google.android.gms.internal.ads.zzvz.zzz()
            r0.zzb(r3)
            com.google.android.gms.internal.ads.zzgm r3 = r0.zze()
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zza(com.google.android.gms.internal.ads.zzek r12) {
            r11 = this;
            boolean r0 = r11.zzn
            r1 = 1
            if (r0 != 0) goto L8
            long r2 = r11.zzk
            goto L14
        L8:
            com.google.android.gms.internal.ads.zzvz r0 = r11.zza
            long r2 = com.google.android.gms.internal.ads.zzvz.zzr(r0, r1)
            long r4 = r11.zzk
            long r2 = java.lang.Math.max(r2, r4)
        L14:
            r5 = r2
            int r8 = r12.zzb()
            com.google.android.gms.internal.ads.zzaeh r4 = r11.zzm
            java.util.Objects.requireNonNull(r4)
            r4.zzq(r12, r8)
            r7 = 1
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            r11.zzn = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void zzg() {
            r1 = this;
            r0 = 1
            r1.zzi = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void zzh() throws java.io.IOException {
            r24 = this;
            r1 = r24
            java.lang.String r0 = "Invalid metadata interval: "
        L4:
            boolean r2 = r1.zzi
            if (r2 != 0) goto L227
            r2 = -1
            r5 = 0
            com.google.android.gms.internal.ads.zzadx r6 = r1.zzh     // Catch: java.lang.Throwable -> L207
            long r13 = r6.zza     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzgm r6 = r1.zzi(r13)     // Catch: java.lang.Throwable -> L207
            r1.zzl = r6     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzhg r7 = r1.zzd     // Catch: java.lang.Throwable -> L207
            long r6 = r7.zzb(r6)     // Catch: java.lang.Throwable -> L207
            boolean r8 = r1.zzi     // Catch: java.lang.Throwable -> L207
            if (r8 == 0) goto L37
            com.google.android.gms.internal.ads.zzvo r0 = r1.zze
            long r4 = r0.zzb()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L31
            com.google.android.gms.internal.ads.zzadx r2 = r1.zzh
            long r3 = r0.zzb()
            r2.zza = r3
        L31:
            com.google.android.gms.internal.ads.zzhg r0 = r1.zzd
            com.google.android.gms.internal.ads.zzgi.zza(r0)
            return
        L37:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L41
            long r6 = r6 + r13
            com.google.android.gms.internal.ads.zzvz r8 = r1.zza     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzvz.zzC(r8)     // Catch: java.lang.Throwable -> L207
        L41:
            r15 = r6
            com.google.android.gms.internal.ads.zzvz r6 = r1.zza     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzhg r7 = r1.zzd     // Catch: java.lang.Throwable -> L207
            java.util.Map r7 = r7.zze()     // Catch: java.lang.Throwable -> L207
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch: java.lang.Throwable -> L207
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L207
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L90
            java.lang.Object r8 = r8.get(r5)     // Catch: java.lang.Throwable -> L207
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L207
            int r11 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L7e java.lang.Throwable -> L207
            int r11 = r11 * 1000
            if (r11 <= 0) goto L69
            r18 = r11
            r2 = 1
            goto L93
        L69:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L7f java.lang.Throwable -> L207
            r12.<init>()     // Catch: java.lang.NumberFormatException -> L7f java.lang.Throwable -> L207
            java.lang.String r2 = "Invalid bitrate: "
            r12.append(r2)     // Catch: java.lang.NumberFormatException -> L7f java.lang.Throwable -> L207
            r12.append(r8)     // Catch: java.lang.NumberFormatException -> L7f java.lang.Throwable -> L207
            java.lang.String r2 = r12.toString()     // Catch: java.lang.NumberFormatException -> L7f java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzea.zzf(r9, r2)     // Catch: java.lang.NumberFormatException -> L7f java.lang.Throwable -> L207
            goto L90
        L7e:
            r11 = -1
        L7f:
            java.lang.String r2 = "Invalid bitrate header: "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L207
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzea.zzf(r9, r2)     // Catch: java.lang.Throwable -> L207
            r18 = r11
            r2 = 0
            goto L93
        L90:
            r2 = 0
            r18 = -1
        L93:
            java.lang.String r3 = "icy-genre"
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Throwable -> L207
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L207
            r8 = 0
            if (r3 == 0) goto La8
            java.lang.Object r2 = r3.get(r5)     // Catch: java.lang.Throwable -> L207
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L207
            r19 = r2
            r2 = 1
            goto Laa
        La8:
            r19 = r8
        Laa:
            java.lang.String r3 = "icy-name"
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Throwable -> L207
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L207
            if (r3 == 0) goto Lbe
            java.lang.Object r2 = r3.get(r5)     // Catch: java.lang.Throwable -> L207
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L207
            r20 = r2
            r2 = 1
            goto Lc0
        Lbe:
            r20 = r8
        Lc0:
            java.lang.String r3 = "icy-url"
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Throwable -> L207
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L207
            if (r3 == 0) goto Ld4
            java.lang.Object r2 = r3.get(r5)     // Catch: java.lang.Throwable -> L207
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L207
            r21 = r2
            r2 = 1
            goto Ld6
        Ld4:
            r21 = r8
        Ld6:
            java.lang.String r3 = "icy-pub"
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Throwable -> L207
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L207
            if (r3 == 0) goto Lf0
            java.lang.Object r2 = r3.get(r5)     // Catch: java.lang.Throwable -> L207
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L207
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L207
            r22 = r2
            r2 = 1
            goto Lf2
        Lf0:
            r22 = 0
        Lf2:
            java.lang.String r3 = "icy-metaint"
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Throwable -> L207
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L207
            if (r3 == 0) goto L12e
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L207
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L207
            int r7 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L11f java.lang.Throwable -> L207
            if (r7 <= 0) goto L10c
            r23 = r7
            r2 = 1
            goto L130
        L10c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L120 java.lang.Throwable -> L207
            r11.<init>()     // Catch: java.lang.NumberFormatException -> L120 java.lang.Throwable -> L207
            r11.append(r0)     // Catch: java.lang.NumberFormatException -> L120 java.lang.Throwable -> L207
            r11.append(r3)     // Catch: java.lang.NumberFormatException -> L120 java.lang.Throwable -> L207
            java.lang.String r11 = r11.toString()     // Catch: java.lang.NumberFormatException -> L120 java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzea.zzf(r9, r11)     // Catch: java.lang.NumberFormatException -> L120 java.lang.Throwable -> L207
            goto L12e
        L11f:
            r7 = -1
        L120:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L207
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzea.zzf(r9, r3)     // Catch: java.lang.Throwable -> L207
            r23 = r7
            goto L130
        L12e:
            r23 = -1
        L130:
            if (r2 == 0) goto L139
            com.google.android.gms.internal.ads.zzagf r8 = new com.google.android.gms.internal.ads.zzagf     // Catch: java.lang.Throwable -> L207
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L207
        L139:
            com.google.android.gms.internal.ads.zzvz.zzB(r6, r8)     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzhg r2 = r1.zzd     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzvz r3 = r1.zza     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzagf r6 = com.google.android.gms.internal.ads.zzvz.zzx(r3)     // Catch: java.lang.Throwable -> L207
            if (r6 == 0) goto L16a
            com.google.android.gms.internal.ads.zzagf r6 = com.google.android.gms.internal.ads.zzvz.zzx(r3)     // Catch: java.lang.Throwable -> L207
            int r6 = r6.zzf     // Catch: java.lang.Throwable -> L207
            if (r6 == r10) goto L16a
            com.google.android.gms.internal.ads.zzuo r6 = new com.google.android.gms.internal.ads.zzuo     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzagf r3 = com.google.android.gms.internal.ads.zzvz.zzx(r3)     // Catch: java.lang.Throwable -> L207
            int r3 = r3.zzf     // Catch: java.lang.Throwable -> L207
            r6.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzvz r2 = r1.zza     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzaeh r2 = r2.zzv()     // Catch: java.lang.Throwable -> L207
            r1.zzm = r2     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzaf r3 = com.google.android.gms.internal.ads.zzvz.zzt()     // Catch: java.lang.Throwable -> L207
            r2.zzl(r3)     // Catch: java.lang.Throwable -> L207
            r8 = r6
            goto L16b
        L16a:
            r8 = r2
        L16b:
            com.google.android.gms.internal.ads.zzvo r7 = r1.zze     // Catch: java.lang.Throwable -> L207
            android.net.Uri r9 = r1.zzc     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzhg r2 = r1.zzd     // Catch: java.lang.Throwable -> L207
            java.util.Map r10 = r2.zze()     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzade r2 = r1.zzf     // Catch: java.lang.Throwable -> L207
            r11 = r13
            r4 = r13
            r13 = r15
            r15 = r2
            r7.zzd(r8, r9, r10, r11, r13, r15)     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzvz r2 = r1.zza     // Catch: java.lang.Throwable -> L207
            com.google.android.gms.internal.ads.zzagf r2 = com.google.android.gms.internal.ads.zzvz.zzx(r2)     // Catch: java.lang.Throwable -> L207
            if (r2 == 0) goto L18b
            com.google.android.gms.internal.ads.zzvo r2 = r1.zze     // Catch: java.lang.Throwable -> L207
            r2.zzc()     // Catch: java.lang.Throwable -> L207
        L18b:
            boolean r2 = r1.zzj     // Catch: java.lang.Throwable -> L207
            if (r2 == 0) goto L19d
            com.google.android.gms.internal.ads.zzvo r2 = r1.zze     // Catch: java.lang.Throwable -> L207
            long r7 = r1.zzk     // Catch: java.lang.Throwable -> L207
            r2.zzf(r4, r7)     // Catch: java.lang.Throwable -> L207
            r2 = 0
            r1.zzj = r2     // Catch: java.lang.Throwable -> L19a
            goto L19e
        L19a:
            r0 = move-exception
            goto L209
        L19d:
            r2 = 0
        L19e:
            r13 = r4
            r4 = 0
        L1a0:
            if (r4 != 0) goto L1e5
            boolean r5 = r1.zzi     // Catch: java.lang.Throwable -> L1e1
            if (r5 != 0) goto L1de
            com.google.android.gms.internal.ads.zzdm r5 = r1.zzg     // Catch: java.lang.InterruptedException -> L1d8 java.lang.Throwable -> L1e1
            r5.zza()     // Catch: java.lang.InterruptedException -> L1d8 java.lang.Throwable -> L1e1
            com.google.android.gms.internal.ads.zzvo r5 = r1.zze     // Catch: java.lang.Throwable -> L1e1
            com.google.android.gms.internal.ads.zzadx r6 = r1.zzh     // Catch: java.lang.Throwable -> L1e1
            int r4 = r5.zza(r6)     // Catch: java.lang.Throwable -> L1e1
            com.google.android.gms.internal.ads.zzvo r5 = r1.zze     // Catch: java.lang.Throwable -> L1e1
            long r5 = r5.zzb()     // Catch: java.lang.Throwable -> L1e1
            com.google.android.gms.internal.ads.zzvz r7 = r1.zza     // Catch: java.lang.Throwable -> L1e1
            long r7 = com.google.android.gms.internal.ads.zzvz.zzn(r7)     // Catch: java.lang.Throwable -> L1e1
            long r7 = r7 + r13
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L1a0
            com.google.android.gms.internal.ads.zzdm r7 = r1.zzg     // Catch: java.lang.Throwable -> L1e1
            r7.zzc()     // Catch: java.lang.Throwable -> L1e1
            com.google.android.gms.internal.ads.zzvz r7 = r1.zza     // Catch: java.lang.Throwable -> L1e1
            android.os.Handler r8 = com.google.android.gms.internal.ads.zzvz.zzs(r7)     // Catch: java.lang.Throwable -> L1e1
            java.lang.Runnable r7 = com.google.android.gms.internal.ads.zzvz.zzy(r7)     // Catch: java.lang.Throwable -> L1e1
            r8.post(r7)     // Catch: java.lang.Throwable -> L1e1
            r13 = r5
            goto L1a0
        L1d8:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L1e1
            r0.<init>()     // Catch: java.lang.Throwable -> L1e1
            throw r0     // Catch: java.lang.Throwable -> L1e1
        L1de:
            r3 = 1
            r4 = 0
            goto L1e6
        L1e1:
            r0 = move-exception
            r5 = r4
            r2 = 1
            goto L20b
        L1e5:
            r3 = 1
        L1e6:
            if (r4 != r3) goto L1ea
            r5 = 0
            goto L1ff
        L1ea:
            com.google.android.gms.internal.ads.zzvo r2 = r1.zze
            long r5 = r2.zzb()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L1fe
            com.google.android.gms.internal.ads.zzadx r3 = r1.zzh
            long r5 = r2.zzb()
            r3.zza = r5
        L1fe:
            r5 = r4
        L1ff:
            com.google.android.gms.internal.ads.zzhg r2 = r1.zzd
            com.google.android.gms.internal.ads.zzgi.zza(r2)
            if (r5 == 0) goto L4
            goto L227
        L207:
            r0 = move-exception
            r2 = 0
        L209:
            r2 = 1
            r5 = 0
        L20b:
            if (r5 == r2) goto L221
            com.google.android.gms.internal.ads.zzvo r2 = r1.zze
            long r3 = r2.zzb()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L221
            com.google.android.gms.internal.ads.zzadx r3 = r1.zzh
            long r4 = r2.zzb()
            r3.zza = r4
        L221:
            com.google.android.gms.internal.ads.zzhg r2 = r1.zzd
            com.google.android.gms.internal.ads.zzgi.zza(r2)
            throw r0
        L227:
            return
    }
}
