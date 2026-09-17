package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzog implements com.google.android.gms.internal.ads.zzok {
    public static final com.google.android.gms.internal.ads.zzfyp zza = null;
    private static final java.util.Random zzb = null;
    private final com.google.android.gms.internal.ads.zzcb zzc;
    private final com.google.android.gms.internal.ads.zzca zzd;
    private final java.util.HashMap zze;
    private com.google.android.gms.internal.ads.zzoj zzf;
    private com.google.android.gms.internal.ads.zzcc zzg;
    private java.lang.String zzh;
    private long zzi;

    static {
            com.google.android.gms.internal.ads.zzoe r0 = new com.google.android.gms.internal.ads.zzoe
            r0.<init>()
            com.google.android.gms.internal.ads.zzog.zza = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            com.google.android.gms.internal.ads.zzog.zzb = r0
            return
    }

    public zzog() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzog(com.google.android.gms.internal.ads.zzfyp r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzcb r3 = new com.google.android.gms.internal.ads.zzcb
            r3.<init>()
            r2.zzc = r3
            com.google.android.gms.internal.ads.zzca r3 = new com.google.android.gms.internal.ads.zzca
            r3.<init>()
            r2.zzd = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.zze = r3
            com.google.android.gms.internal.ads.zzcc r3 = com.google.android.gms.internal.ads.zzcc.zza
            r2.zzg = r3
            r0 = -1
            r2.zzi = r0
            return
    }

    static /* bridge */ /* synthetic */ long zza(com.google.android.gms.internal.ads.zzog r2) {
            long r0 = r2.zzl()
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzca zzb(com.google.android.gms.internal.ads.zzog r0) {
            com.google.android.gms.internal.ads.zzca r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcb zzc(com.google.android.gms.internal.ads.zzog r0) {
            com.google.android.gms.internal.ads.zzcb r0 = r0.zzc
            return r0
    }

    public static /* synthetic */ java.lang.String zzd() {
            java.lang.String r0 = zzn()
            return r0
    }

    private final long zzl() {
            r6 = this;
            java.util.HashMap r0 = r6.zze
            java.lang.String r1 = r6.zzh
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzof r0 = (com.google.android.gms.internal.ads.zzof) r0
            if (r0 == 0) goto L1b
            long r1 = com.google.android.gms.internal.ads.zzof.zzb(r0)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L1b
            long r0 = com.google.android.gms.internal.ads.zzof.zzb(r0)
            goto L20
        L1b:
            long r0 = r6.zzi
            r2 = 1
            long r0 = r0 + r2
        L20:
            return r0
    }

    private final com.google.android.gms.internal.ads.zzof zzm(int r11, com.google.android.gms.internal.ads.zzuy r12) {
            r10 = this;
            java.util.HashMap r0 = r10.zze
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L49
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.ads.zzof r4 = (com.google.android.gms.internal.ads.zzof) r4
            r4.zzg(r11, r12)
            boolean r5 = r4.zzj(r11, r12)
            if (r5 == 0) goto L10
            long r5 = com.google.android.gms.internal.ads.zzof.zzb(r4)
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L46
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L34
            goto L46
        L34:
            if (r7 != 0) goto L10
            int r5 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzuy r5 = com.google.android.gms.internal.ads.zzof.zzc(r3)
            if (r5 == 0) goto L10
            com.google.android.gms.internal.ads.zzuy r5 = com.google.android.gms.internal.ads.zzof.zzc(r4)
            if (r5 == 0) goto L10
            r3 = r4
            goto L10
        L46:
            r3 = r4
            r1 = r5
            goto L10
        L49:
            if (r3 != 0) goto L5a
            java.lang.String r0 = zzn()
            com.google.android.gms.internal.ads.zzof r1 = new com.google.android.gms.internal.ads.zzof
            r1.<init>(r10, r0, r11, r12)
            java.util.HashMap r11 = r10.zze
            r11.put(r0, r1)
            return r1
        L5a:
            return r3
    }

    private static java.lang.String zzn() {
            r0 = 12
            byte[] r0 = new byte[r0]
            java.util.Random r1 = com.google.android.gms.internal.ads.zzog.zzb
            r1.nextBytes(r0)
            r1 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            return r0
    }

    private final void zzo(com.google.android.gms.internal.ads.zzof r6) {
            r5 = this;
            long r0 = com.google.android.gms.internal.ads.zzof.zzb(r6)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            long r0 = com.google.android.gms.internal.ads.zzof.zzb(r6)
            r5.zzi = r0
        L10:
            r6 = 0
            r5.zzh = r6
            return
    }

    private final void zzp(com.google.android.gms.internal.ads.zzmb r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzcc r0 = r8.zzb
            boolean r0 = r0.zzo()
            if (r0 == 0) goto L1b
            java.lang.String r8 = r7.zzh
            if (r8 == 0) goto L81
            java.util.HashMap r0 = r7.zze
            java.lang.Object r8 = r0.get(r8)
            com.google.android.gms.internal.ads.zzof r8 = (com.google.android.gms.internal.ads.zzof) r8
            java.util.Objects.requireNonNull(r8)
            r7.zzo(r8)
            return
        L1b:
            java.util.HashMap r0 = r7.zze
            java.lang.String r1 = r7.zzh
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzof r0 = (com.google.android.gms.internal.ads.zzof) r0
            int r1 = r8.zzc
            com.google.android.gms.internal.ads.zzuy r2 = r8.zzd
            com.google.android.gms.internal.ads.zzof r1 = r7.zzm(r1, r2)
            java.lang.String r2 = com.google.android.gms.internal.ads.zzof.zzd(r1)
            r7.zzh = r2
            r7.zzi(r8)
            com.google.android.gms.internal.ads.zzuy r2 = r8.zzd
            if (r2 == 0) goto L81
            boolean r3 = r2.zzb()
            if (r3 == 0) goto L81
            if (r0 == 0) goto L6a
            long r2 = r2.zzd
            long r4 = com.google.android.gms.internal.ads.zzof.zzb(r0)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L6a
            com.google.android.gms.internal.ads.zzuy r2 = com.google.android.gms.internal.ads.zzof.zzc(r0)
            if (r2 == 0) goto L6a
            com.google.android.gms.internal.ads.zzuy r2 = com.google.android.gms.internal.ads.zzof.zzc(r0)
            int r2 = r2.zzb
            com.google.android.gms.internal.ads.zzuy r3 = r8.zzd
            int r3 = r3.zzb
            if (r2 != r3) goto L6a
            com.google.android.gms.internal.ads.zzuy r0 = com.google.android.gms.internal.ads.zzof.zzc(r0)
            int r0 = r0.zzc
            com.google.android.gms.internal.ads.zzuy r2 = r8.zzd
            int r2 = r2.zzc
            if (r0 == r2) goto L81
        L6a:
            com.google.android.gms.internal.ads.zzuy r0 = r8.zzd
            com.google.android.gms.internal.ads.zzuy r2 = new com.google.android.gms.internal.ads.zzuy
            java.lang.Object r3 = r0.zza
            long r4 = r0.zzd
            r2.<init>(r3, r4)
            int r8 = r8.zzc
            com.google.android.gms.internal.ads.zzof r8 = r7.zzm(r8, r2)
            com.google.android.gms.internal.ads.zzof.zzd(r8)
            com.google.android.gms.internal.ads.zzof.zzd(r1)
        L81:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized java.lang.String zze() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zzh     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized java.lang.String zzf(com.google.android.gms.internal.ads.zzcc r3, com.google.android.gms.internal.ads.zzuy r4) {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r4.zza     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzca r1 = r2.zzd     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzca r3 = r3.zzn(r0, r1)     // Catch: java.lang.Throwable -> L15
            int r3 = r3.zzc     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.ads.zzof r3 = r2.zzm(r3, r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = com.google.android.gms.internal.ads.zzof.zzd(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzmb r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.zzh     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L13
            java.util.HashMap r1 = r4.zze     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.internal.ads.zzof r0 = (com.google.android.gms.internal.ads.zzof) r0     // Catch: java.lang.Throwable -> L41
            java.util.Objects.requireNonNull(r0)
            r4.zzo(r0)     // Catch: java.lang.Throwable -> L41
        L13:
            java.util.HashMap r0 = r4.zze     // Catch: java.lang.Throwable -> L41
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L41
        L1d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.internal.ads.zzof r1 = (com.google.android.gms.internal.ads.zzof) r1     // Catch: java.lang.Throwable -> L41
            r0.remove()     // Catch: java.lang.Throwable -> L41
            boolean r2 = com.google.android.gms.internal.ads.zzof.zzi(r1)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.ads.zzoj r2 = r4.zzf     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L1d
            java.lang.String r1 = com.google.android.gms.internal.ads.zzof.zzd(r1)     // Catch: java.lang.Throwable -> L41
            r3 = 0
            r2.zzd(r5, r1, r3)     // Catch: java.lang.Throwable -> L41
            goto L1d
        L3f:
            monitor-exit(r4)
            return
        L41:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final void zzh(com.google.android.gms.internal.ads.zzoj r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzmb r10) {
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzoj r0 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcc r0 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L10
            goto Lc4
        L10:
            com.google.android.gms.internal.ads.zzuy r0 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = r9.zzl()     // Catch: java.lang.Throwable -> Lc6
            long r3 = r0.zzd     // Catch: java.lang.Throwable -> Lc6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc4
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzof r0 = (com.google.android.gms.internal.ads.zzof) r0     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L3c
            long r1 = com.google.android.gms.internal.ads.zzof.zzb(r0)     // Catch: java.lang.Throwable -> Lc6
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L3c
            int r0 = com.google.android.gms.internal.ads.zzof.zza(r0)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            if (r0 != r1) goto Lc4
        L3c:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzuy r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzof r0 = r9.zzm(r0, r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto L4e
            java.lang.String r1 = com.google.android.gms.internal.ads.zzof.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r9.zzh = r1     // Catch: java.lang.Throwable -> Lc6
        L4e:
            com.google.android.gms.internal.ads.zzuy r1 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            r2 = 1
            if (r1 == 0) goto L98
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lc6
            if (r3 == 0) goto L98
            java.lang.Object r3 = r1.zza     // Catch: java.lang.Throwable -> Lc6
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> Lc6
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzuy r6 = new com.google.android.gms.internal.ads.zzuy     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> Lc6
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzof r1 = r9.zzm(r1, r6)     // Catch: java.lang.Throwable -> Lc6
            boolean r3 = com.google.android.gms.internal.ads.zzof.zzi(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r3 != 0) goto L98
            com.google.android.gms.internal.ads.zzof.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzcc r3 = r10.zzb     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzuy r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzca r5 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lc6
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzca r3 = r9.zzd     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzuy r4 = r10.zzd     // Catch: java.lang.Throwable -> Lc6
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lc6
            r3.zzg(r4)     // Catch: java.lang.Throwable -> Lc6
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzeu.zzu(r3)     // Catch: java.lang.Throwable -> Lc6
            long r7 = com.google.android.gms.internal.ads.zzeu.zzu(r3)     // Catch: java.lang.Throwable -> Lc6
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzof.zzd(r1)     // Catch: java.lang.Throwable -> Lc6
        L98:
            boolean r1 = com.google.android.gms.internal.ads.zzof.zzi(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto La4
            com.google.android.gms.internal.ads.zzof.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzof.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
        La4:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzof.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto Lc4
            boolean r1 = com.google.android.gms.internal.ads.zzof.zzh(r0)     // Catch: java.lang.Throwable -> Lc6
            if (r1 != 0) goto Lc4
            com.google.android.gms.internal.ads.zzof.zze(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            com.google.android.gms.internal.ads.zzoj r1 = r9.zzf     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = com.google.android.gms.internal.ads.zzof.zzd(r0)     // Catch: java.lang.Throwable -> Lc6
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r9)
            return
        Lc4:
            monitor-exit(r9)
            return
        Lc6:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzj(com.google.android.gms.internal.ads.zzmb r6, int r7) {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzoj r0 = r5.zzf     // Catch: java.lang.Throwable -> L55
            java.util.Objects.requireNonNull(r0)
            java.util.HashMap r0 = r5.zze     // Catch: java.lang.Throwable -> L55
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L55
        L10:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzof r1 = (com.google.android.gms.internal.ads.zzof) r1     // Catch: java.lang.Throwable -> L55
            boolean r2 = r1.zzk(r6)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L10
            r0.remove()     // Catch: java.lang.Throwable -> L55
            boolean r2 = com.google.android.gms.internal.ads.zzof.zzi(r1)     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L10
            java.lang.String r2 = com.google.android.gms.internal.ads.zzof.zzd(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r5.zzh     // Catch: java.lang.Throwable -> L55
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L55
            r3 = 0
            if (r7 != 0) goto L41
            if (r2 == 0) goto L41
            boolean r4 = com.google.android.gms.internal.ads.zzof.zzh(r1)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L41
            r3 = 1
        L41:
            if (r2 == 0) goto L46
            r5.zzo(r1)     // Catch: java.lang.Throwable -> L55
        L46:
            com.google.android.gms.internal.ads.zzoj r2 = r5.zzf     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = com.google.android.gms.internal.ads.zzof.zzd(r1)     // Catch: java.lang.Throwable -> L55
            r2.zzd(r6, r1, r3)     // Catch: java.lang.Throwable -> L55
            goto L10
        L50:
            r5.zzp(r6)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r5)
            return
        L55:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzk(com.google.android.gms.internal.ads.zzmb r6) {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzoj r0 = r5.zzf     // Catch: java.lang.Throwable -> L58
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcc r0 = r5.zzg     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.ads.zzcc r1 = r6.zzb     // Catch: java.lang.Throwable -> L58
            r5.zzg = r1     // Catch: java.lang.Throwable -> L58
            java.util.HashMap r1 = r5.zze     // Catch: java.lang.Throwable -> L58
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L58
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.ads.zzof r2 = (com.google.android.gms.internal.ads.zzof) r2     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.internal.ads.zzcc r3 = r5.zzg     // Catch: java.lang.Throwable -> L58
            boolean r3 = r2.zzl(r0, r3)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L30
            boolean r3 = r2.zzk(r6)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L16
        L30:
            r1.remove()     // Catch: java.lang.Throwable -> L58
            boolean r3 = com.google.android.gms.internal.ads.zzof.zzi(r2)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L16
            java.lang.String r3 = com.google.android.gms.internal.ads.zzof.zzd(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = r5.zzh     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L48
            r5.zzo(r2)     // Catch: java.lang.Throwable -> L58
        L48:
            com.google.android.gms.internal.ads.zzoj r3 = r5.zzf     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = com.google.android.gms.internal.ads.zzof.zzd(r2)     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r3.zzd(r6, r2, r4)     // Catch: java.lang.Throwable -> L58
            goto L16
        L53:
            r5.zzp(r6)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r5)
            return
        L58:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
