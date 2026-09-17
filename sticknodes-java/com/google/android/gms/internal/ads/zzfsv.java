package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfsv {
    private static final java.lang.Object zza = null;
    private final android.content.Context zzb;
    private final android.content.SharedPreferences zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzfsc zze;
    private boolean zzf;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzfsv.zza = r0
            return
    }

    public zzfsv(android.content.Context r2, int r3, com.google.android.gms.internal.ads.zzfsc r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzf = r0
            r1.zzb = r2
            int r3 = r3 + (-1)
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r1.zzd = r3
            java.lang.String r3 = "pcvmspf"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r0)
            r1.zzc = r2
            r1.zze = r4
            r1.zzf = r5
            return
    }

    private final java.io.File zze(java.lang.String r5) {
            r4 = this;
            android.content.Context r0 = r4.zzb
            java.lang.String r1 = "pccache"
            r2 = 0
            java.io.File r0 = r0.getDir(r1, r2)
            java.lang.String r1 = r4.zzd
            java.io.File r2 = new java.io.File
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r1)
            r2.<init>(r3, r5)
            return r2
    }

    private static java.lang.String zzf(com.google.android.gms.internal.ads.zzayh r3) {
            com.google.android.gms.internal.ads.zzayj r0 = com.google.android.gms.internal.ads.zzayk.zze()
            com.google.android.gms.internal.ads.zzayk r1 = r3.zzd()
            java.lang.String r1 = r1.zzk()
            r0.zze(r1)
            com.google.android.gms.internal.ads.zzayk r1 = r3.zzd()
            java.lang.String r1 = r1.zzj()
            r0.zza(r1)
            com.google.android.gms.internal.ads.zzayk r1 = r3.zzd()
            long r1 = r1.zza()
            r0.zzb(r1)
            com.google.android.gms.internal.ads.zzayk r1 = r3.zzd()
            long r1 = r1.zzd()
            r0.zzd(r1)
            com.google.android.gms.internal.ads.zzayk r3 = r3.zzd()
            long r1 = r3.zzc()
            r0.zzc(r1)
            com.google.android.gms.internal.ads.zzhbe r3 = r0.zzbn()
            com.google.android.gms.internal.ads.zzayk r3 = (com.google.android.gms.internal.ads.zzayk) r3
            byte[] r3 = r3.zzaV()
            java.lang.String r3 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r3)
            return r3
    }

    private final java.lang.String zzg() {
            r2 = this;
            java.lang.String r0 = r2.zzd
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "FBAMTD"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    private final java.lang.String zzh() {
            r2 = this;
            java.lang.String r0 = r2.zzd
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "LATMTD"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    private final void zzi(int r2, long r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfsc r0 = r1.zze
            r0.zza(r2, r3)
            return
    }

    private final void zzj(int r2, long r3, java.lang.String r5) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfsc r0 = r1.zze
            r0.zzb(r2, r3, r5)
            return
    }

    private final com.google.android.gms.internal.ads.zzayk zzk(int r6) {
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 != r1) goto Lf
            android.content.SharedPreferences r6 = r5.zzc
            java.lang.String r1 = r5.zzh()
            java.lang.String r6 = r6.getString(r1, r0)
            goto L19
        Lf:
            android.content.SharedPreferences r6 = r5.zzc
            java.lang.String r1 = r5.zzg()
            java.lang.String r6 = r6.getString(r1, r0)
        L19:
            if (r6 != 0) goto L1c
            return r0
        L1c:
            long r1 = java.lang.System.currentTimeMillis()
            byte[] r6 = com.google.android.gms.common.util.Hex.stringToBytes(r6)     // Catch: java.lang.RuntimeException -> L3e java.lang.NullPointerException -> L44 com.google.android.gms.internal.ads.zzhbt -> L49
            com.google.android.gms.internal.ads.zzgzs r3 = com.google.android.gms.internal.ads.zzgzs.zzb     // Catch: java.lang.RuntimeException -> L3e java.lang.NullPointerException -> L44 com.google.android.gms.internal.ads.zzhbt -> L49
            r3 = 0
            int r4 = r6.length     // Catch: java.lang.RuntimeException -> L3e java.lang.NullPointerException -> L44 com.google.android.gms.internal.ads.zzhbt -> L49
            com.google.android.gms.internal.ads.zzgzs r6 = com.google.android.gms.internal.ads.zzgzs.zzv(r6, r3, r4)     // Catch: java.lang.RuntimeException -> L3e java.lang.NullPointerException -> L44 com.google.android.gms.internal.ads.zzhbt -> L49
            boolean r3 = r5.zzf     // Catch: java.lang.RuntimeException -> L3e java.lang.NullPointerException -> L44 com.google.android.gms.internal.ads.zzhbt -> L49
            if (r3 == 0) goto L35
            com.google.android.gms.internal.ads.zzhao r3 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: java.lang.RuntimeException -> L3e java.lang.NullPointerException -> L44 com.google.android.gms.internal.ads.zzhbt -> L49
            goto L39
        L35:
            com.google.android.gms.internal.ads.zzhao r3 = com.google.android.gms.internal.ads.zzhao.zzb()     // Catch: java.lang.RuntimeException -> L3e java.lang.NullPointerException -> L44 com.google.android.gms.internal.ads.zzhbt -> L49
        L39:
            com.google.android.gms.internal.ads.zzayk r6 = com.google.android.gms.internal.ads.zzayk.zzi(r6, r3)     // Catch: java.lang.RuntimeException -> L3e java.lang.NullPointerException -> L44 com.google.android.gms.internal.ads.zzhbt -> L49
            return r6
        L3e:
            r6 = 2032(0x7f0, float:2.847E-42)
            r5.zzi(r6, r1)
            goto L49
        L44:
            r6 = 2029(0x7ed, float:2.843E-42)
            r5.zzi(r6, r1)
        L49:
            return r0
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzayh r7) {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzfsv.zza
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzayk r3 = r7.zzd()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r3.zzk()     // Catch: java.lang.Throwable -> L54
            java.io.File r3 = r6.zze(r3)     // Catch: java.lang.Throwable -> L54
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L54
            com.google.android.gms.internal.ads.zzgzs r3 = r7.zze()     // Catch: java.lang.Throwable -> L54
            byte[] r3 = r3.zzA()     // Catch: java.lang.Throwable -> L54
            boolean r3 = com.google.android.gms.internal.ads.zzfsp.zze(r4, r3)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L30
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.zzi(r7, r0)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            r7 = 0
            return r7
        L30:
            java.lang.String r7 = zzf(r7)     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences r3 = r6.zzc     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = r6.zzh()     // Catch: java.lang.Throwable -> L54
            r3.putString(r4, r7)     // Catch: java.lang.Throwable -> L54
            boolean r7 = r3.commit()     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L4d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.zzi(r3, r0)     // Catch: java.lang.Throwable -> L54
            goto L52
        L4d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.zzi(r3, r0)     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            return r7
        L54:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L54
            throw r7
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzayh r17, com.google.android.gms.internal.ads.zzfsu r18) {
            r16 = this;
            r1 = r16
            r0 = r18
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzfsv.zza
            monitor-enter(r4)
            r5 = 1
            com.google.android.gms.internal.ads.zzayk r6 = r1.zzk(r5)     // Catch: java.lang.Throwable -> L168
            com.google.android.gms.internal.ads.zzayk r7 = r17.zzd()     // Catch: java.lang.Throwable -> L168
            java.lang.String r7 = r7.zzk()     // Catch: java.lang.Throwable -> L168
            r8 = 0
            if (r6 == 0) goto L2c
            java.lang.String r6 = r6.zzk()     // Catch: java.lang.Throwable -> L168
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L168
            if (r6 == 0) goto L2c
            r0 = 4014(0xfae, float:5.625E-42)
            r1.zzi(r0, r2)     // Catch: java.lang.Throwable -> L168
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L168
            return r8
        L2c:
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L168
            java.io.File r6 = r1.zze(r7)     // Catch: java.lang.Throwable -> L168
            boolean r11 = r6.exists()     // Catch: java.lang.Throwable -> L168
            r12 = 4015(0xfaf, float:5.626E-42)
            if (r11 == 0) goto L74
            boolean r11 = r6.isDirectory()     // Catch: java.lang.Throwable -> L168
            java.lang.String r13 = "1"
            java.lang.String r14 = "0"
            if (r5 == r11) goto L47
            r13 = r14
        L47:
            boolean r6 = r6.isFile()     // Catch: java.lang.Throwable -> L168
            java.lang.String r11 = "1"
            java.lang.String r14 = "0"
            if (r5 == r6) goto L52
            r11 = r14
        L52:
            r6 = 4023(0xfb7, float:5.637E-42)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L168
            r14.<init>()     // Catch: java.lang.Throwable -> L168
            java.lang.String r15 = "d:"
            r14.append(r15)     // Catch: java.lang.Throwable -> L168
            r14.append(r13)     // Catch: java.lang.Throwable -> L168
            java.lang.String r13 = ",f:"
            r14.append(r13)     // Catch: java.lang.Throwable -> L168
            r14.append(r11)     // Catch: java.lang.Throwable -> L168
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L168
            r1.zzj(r6, r9, r11)     // Catch: java.lang.Throwable -> L168
            r1.zzi(r12, r9)     // Catch: java.lang.Throwable -> L168
            goto L95
        L74:
            boolean r11 = r6.mkdirs()     // Catch: java.lang.Throwable -> L168
            if (r11 != 0) goto L95
            boolean r0 = r6.canWrite()     // Catch: java.lang.Throwable -> L168
            java.lang.String r2 = "1"
            java.lang.String r3 = "0"
            if (r5 == r0) goto L85
            r2 = r3
        L85:
            r0 = 4024(0xfb8, float:5.639E-42)
            java.lang.String r3 = "cw:"
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L168
            r1.zzj(r0, r9, r2)     // Catch: java.lang.Throwable -> L168
            r1.zzi(r12, r9)     // Catch: java.lang.Throwable -> L168
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L168
            return r8
        L95:
            java.io.File r6 = r1.zze(r7)     // Catch: java.lang.Throwable -> L168
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L168
            java.lang.String r9 = "pcam.jar"
            r7.<init>(r6, r9)     // Catch: java.lang.Throwable -> L168
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L168
            java.lang.String r10 = "pcbc"
            r9.<init>(r6, r10)     // Catch: java.lang.Throwable -> L168
            com.google.android.gms.internal.ads.zzgzs r10 = r17.zzf()     // Catch: java.lang.Throwable -> L168
            byte[] r10 = r10.zzA()     // Catch: java.lang.Throwable -> L168
            boolean r10 = com.google.android.gms.internal.ads.zzfsp.zze(r7, r10)     // Catch: java.lang.Throwable -> L168
            if (r10 != 0) goto Lbc
            r0 = 4016(0xfb0, float:5.628E-42)
            r1.zzi(r0, r2)     // Catch: java.lang.Throwable -> L168
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L168
            return r8
        Lbc:
            com.google.android.gms.internal.ads.zzgzs r10 = r17.zze()     // Catch: java.lang.Throwable -> L168
            byte[] r10 = r10.zzA()     // Catch: java.lang.Throwable -> L168
            boolean r9 = com.google.android.gms.internal.ads.zzfsp.zze(r9, r10)     // Catch: java.lang.Throwable -> L168
            if (r9 != 0) goto Ld1
            r0 = 4017(0xfb1, float:5.629E-42)
            r1.zzi(r0, r2)     // Catch: java.lang.Throwable -> L168
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L168
            return r8
        Ld1:
            if (r0 == 0) goto Le3
            boolean r0 = r0.zza(r7)     // Catch: java.lang.Throwable -> L168
            if (r0 != 0) goto Le3
            r0 = 4018(0xfb2, float:5.63E-42)
            r1.zzi(r0, r2)     // Catch: java.lang.Throwable -> L168
            com.google.android.gms.internal.ads.zzfsp.zzd(r6)     // Catch: java.lang.Throwable -> L168
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L168
            return r8
        Le3:
            java.lang.String r0 = zzf(r17)     // Catch: java.lang.Throwable -> L168
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L168
            android.content.SharedPreferences r9 = r1.zzc     // Catch: java.lang.Throwable -> L168
            java.lang.String r10 = r16.zzh()     // Catch: java.lang.Throwable -> L168
            r11 = 0
            java.lang.String r9 = r9.getString(r10, r11)     // Catch: java.lang.Throwable -> L168
            android.content.SharedPreferences r10 = r1.zzc     // Catch: java.lang.Throwable -> L168
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> L168
            java.lang.String r11 = r16.zzh()     // Catch: java.lang.Throwable -> L168
            r10.putString(r11, r0)     // Catch: java.lang.Throwable -> L168
            if (r9 == 0) goto L10c
            java.lang.String r0 = r16.zzg()     // Catch: java.lang.Throwable -> L168
            r10.putString(r0, r9)     // Catch: java.lang.Throwable -> L168
        L10c:
            boolean r0 = r10.commit()     // Catch: java.lang.Throwable -> L168
            if (r0 != 0) goto L119
            r0 = 4019(0xfb3, float:5.632E-42)
            r1.zzi(r0, r6)     // Catch: java.lang.Throwable -> L168
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L168
            return r8
        L119:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L168
            r0.<init>()     // Catch: java.lang.Throwable -> L168
            com.google.android.gms.internal.ads.zzayk r6 = r1.zzk(r5)     // Catch: java.lang.Throwable -> L168
            if (r6 == 0) goto L12b
            java.lang.String r6 = r6.zzk()     // Catch: java.lang.Throwable -> L168
            r0.add(r6)     // Catch: java.lang.Throwable -> L168
        L12b:
            r6 = 2
            com.google.android.gms.internal.ads.zzayk r6 = r1.zzk(r6)     // Catch: java.lang.Throwable -> L168
            if (r6 == 0) goto L139
            java.lang.String r6 = r6.zzk()     // Catch: java.lang.Throwable -> L168
            r0.add(r6)     // Catch: java.lang.Throwable -> L168
        L139:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L168
            android.content.Context r7 = r1.zzb     // Catch: java.lang.Throwable -> L168
            java.lang.String r9 = "pccache"
            java.io.File r7 = r7.getDir(r9, r8)     // Catch: java.lang.Throwable -> L168
            java.lang.String r9 = r1.zzd     // Catch: java.lang.Throwable -> L168
            r6.<init>(r7, r9)     // Catch: java.lang.Throwable -> L168
            java.io.File[] r6 = r6.listFiles()     // Catch: java.lang.Throwable -> L168
            int r7 = r6.length     // Catch: java.lang.Throwable -> L168
        L14d:
            if (r8 >= r7) goto L161
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L168
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> L168
            boolean r10 = r0.contains(r10)     // Catch: java.lang.Throwable -> L168
            if (r10 != 0) goto L15e
            com.google.android.gms.internal.ads.zzfsp.zzd(r9)     // Catch: java.lang.Throwable -> L168
        L15e:
            int r8 = r8 + 1
            goto L14d
        L161:
            r0 = 5014(0x1396, float:7.026E-42)
            r1.zzi(r0, r2)     // Catch: java.lang.Throwable -> L168
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L168
            return r5
        L168:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L168
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzfsn zzc(int r9) {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzfsv.zza
            monitor-enter(r9)
            r2 = 1
            com.google.android.gms.internal.ads.zzayk r2 = r8.zzk(r2)     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L16
            r2 = 4022(0xfb6, float:5.636E-42)
            r8.zzi(r2, r0)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4c
            r9 = 0
            return r9
        L16:
            java.lang.String r3 = r2.zzk()     // Catch: java.lang.Throwable -> L4c
            java.io.File r3 = r8.zze(r3)     // Catch: java.lang.Throwable -> L4c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "pcam.jar"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L32
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "pcam"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L4c
        L32:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "pcbc"
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L4c
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "pcopt"
            r6.<init>(r3, r7)     // Catch: java.lang.Throwable -> L4c
            r3 = 5016(0x1398, float:7.029E-42)
            r8.zzi(r3, r0)     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzfsn r0 = new com.google.android.gms.internal.ads.zzfsn     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4c
            return r0
        L4c:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4c
            throw r0
    }

    public final boolean zzd(int r8) {
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzfsv.zza
            monitor-enter(r8)
            r2 = 1
            com.google.android.gms.internal.ads.zzayk r3 = r7.zzk(r2)     // Catch: java.lang.Throwable -> L4d
            r4 = 0
            if (r3 != 0) goto L16
            r2 = 4025(0xfb9, float:5.64E-42)
            r7.zzi(r2, r0)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4d
            return r4
        L16:
            java.lang.String r3 = r3.zzk()     // Catch: java.lang.Throwable -> L4d
            java.io.File r3 = r7.zze(r3)     // Catch: java.lang.Throwable -> L4d
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4d
            java.lang.String r6 = "pcam.jar"
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L4d
            boolean r5 = r5.exists()     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L32
            r2 = 4026(0xfba, float:5.642E-42)
            r7.zzi(r2, r0)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4d
            return r4
        L32:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4d
            java.lang.String r6 = "pcbc"
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r5.exists()     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L46
            r2 = 4027(0xfbb, float:5.643E-42)
            r7.zzi(r2, r0)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4d
            return r4
        L46:
            r3 = 5019(0x139b, float:7.033E-42)
            r7.zzi(r3, r0)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4d
            return r2
        L4d:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4d
            throw r0
    }
}
