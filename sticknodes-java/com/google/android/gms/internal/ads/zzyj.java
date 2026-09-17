package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzyj extends com.google.android.gms.internal.ads.zzyo implements com.google.android.gms.internal.ads.zzlt {
    public static final /* synthetic */ int zzb = 0;
    private static final com.google.android.gms.internal.ads.zzgci zzc = null;
    public final android.content.Context zza;
    private final java.lang.Object zzd;
    private final boolean zze;
    private com.google.android.gms.internal.ads.zzxy zzf;
    private com.google.android.gms.internal.ads.zzyc zzg;
    private com.google.android.gms.internal.ads.zzh zzh;
    private final com.google.android.gms.internal.ads.zzxe zzi;

    static {
            com.google.android.gms.internal.ads.zzxi r0 = new com.google.android.gms.internal.ads.zzxi
            r0.<init>()
            com.google.android.gms.internal.ads.zzgci r0 = com.google.android.gms.internal.ads.zzgci.zzb(r0)
            com.google.android.gms.internal.ads.zzyj.zzc = r0
            return
    }

    public zzyj(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzxe r0 = new com.google.android.gms.internal.ads.zzxe
            r0.<init>()
            com.google.android.gms.internal.ads.zzxy r1 = com.google.android.gms.internal.ads.zzxy.zzd(r4)
            r3.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r3.zzd = r2
            if (r4 == 0) goto L1a
            android.content.Context r2 = r4.getApplicationContext()
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r3.zza = r2
            r3.zzi = r0
            r3.zzf = r1
            com.google.android.gms.internal.ads.zzh r0 = com.google.android.gms.internal.ads.zzh.zza
            r3.zzh = r0
            r0 = 0
            if (r4 == 0) goto L2f
            boolean r1 = com.google.android.gms.internal.ads.zzeu.zzL(r4)
            if (r1 == 0) goto L2f
            r0 = 1
        L2f:
            r3.zze = r0
            if (r0 != 0) goto L41
            if (r4 == 0) goto L41
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 32
            if (r0 < r1) goto L41
            com.google.android.gms.internal.ads.zzyc r0 = com.google.android.gms.internal.ads.zzyc.zza(r4)
            r3.zzg = r0
        L41:
            com.google.android.gms.internal.ads.zzxy r0 = r3.zzf
            boolean r0 = r0.zzM
            if (r0 == 0) goto L50
            if (r4 != 0) goto L50
            java.lang.String r4 = "DefaultTrackSelector"
            java.lang.String r0 = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
        L50:
            return
    }

    static /* bridge */ /* synthetic */ int zzb(int r0, int r1) {
            if (r0 == 0) goto L8
            if (r0 != r1) goto L8
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L8:
            r0 = r0 & r1
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    protected static int zzc(com.google.android.gms.internal.ads.zzaf r2, java.lang.String r3, boolean r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L11
            java.lang.String r0 = r2.zzd
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r2 = 4
            return r2
        L11:
            java.lang.String r3 = zzh(r3)
            java.lang.String r2 = r2.zzd
            java.lang.String r2 = zzh(r2)
            r0 = 0
            if (r2 == 0) goto L49
            if (r3 != 0) goto L21
            goto L49
        L21:
            boolean r4 = r2.startsWith(r3)
            if (r4 != 0) goto L47
            boolean r4 = r3.startsWith(r2)
            if (r4 == 0) goto L2e
            goto L47
        L2e:
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r4 = "-"
            r1 = 2
            java.lang.String[] r2 = r2.split(r4, r1)
            r2 = r2[r0]
            java.lang.String[] r3 = r3.split(r4, r1)
            r3 = r3[r0]
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L46
            return r1
        L46:
            return r0
        L47:
            r2 = 3
            return r2
        L49:
            if (r4 == 0) goto L4f
            if (r2 != 0) goto L4f
            r2 = 1
            return r2
        L4f:
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgci zzg() {
            com.google.android.gms.internal.ads.zzgci r0 = com.google.android.gms.internal.ads.zzyj.zzc
            return r0
    }

    protected static java.lang.String zzh(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            return r1
        L10:
            r1 = 0
            return r1
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzyj r0) {
            r0.zzu()
            return
    }

    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzyj r8, com.google.android.gms.internal.ads.zzaf r9) {
            java.lang.Object r0 = r8.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzxy r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzM     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8b
            boolean r1 = r8.zze     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L8b
            int r1 = r9.zzB     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            if (r1 <= r4) goto L8b
            java.lang.String r1 = r9.zzn     // Catch: java.lang.Throwable -> L8e
            r5 = 32
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r3) goto L56
            if (r1 == r4) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8b
            com.google.android.gms.internal.ads.zzyc r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8b
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L8b
        L65:
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r5) goto L8c
            com.google.android.gms.internal.ads.zzyc r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r4 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzyc r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzyc r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzh r8 = r8.zzh     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
        L8b:
            r2 = 1
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L8e:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
    }

    private static void zzt(com.google.android.gms.internal.ads.zzwy r2, com.google.android.gms.internal.ads.zzci r3, java.util.Map r4) {
            r4 = 0
        L1:
            int r0 = r2.zzb
            if (r4 >= r0) goto L18
            com.google.android.gms.internal.ads.zzcd r0 = r2.zzb(r4)
            com.google.android.gms.internal.ads.zzgba r1 = r3.zzA
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.ads.zzce r0 = (com.google.android.gms.internal.ads.zzce) r0
            if (r0 != 0) goto L16
            int r4 = r4 + 1
            goto L1
        L16:
            r2 = 0
            throw r2
        L18:
            return
    }

    private final void zzu() {
            r4 = this;
            java.lang.Object r0 = r4.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzxy r1 = r4.zzf     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.zzM     // Catch: java.lang.Throwable -> L26
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r4.zze     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L1f
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L26
            r3 = 32
            if (r1 < r3) goto L1f
            com.google.android.gms.internal.ads.zzyc r1 = r4.zzg     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            r2 = 1
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L25
            r4.zzs()
        L25:
            return
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    private static final android.util.Pair zzv(int r16, com.google.android.gms.internal.ads.zzyn r17, int[][][] r18, com.google.android.gms.internal.ads.zzye r19, java.util.Comparator r20) {
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L8:
            r4 = 2
            if (r3 >= r4) goto L8f
            int r5 = r0.zzc(r3)
            r6 = r16
            if (r6 != r5) goto L87
            com.google.android.gms.internal.ads.zzwy r5 = r0.zzd(r3)
            r7 = 0
        L18:
            int r8 = r5.zzb
            if (r7 >= r8) goto L87
            com.google.android.gms.internal.ads.zzcd r8 = r5.zzb(r7)
            r9 = r18[r3]
            r9 = r9[r7]
            r10 = r19
            java.util.List r9 = r10.zza(r3, r8, r9)
            int r11 = r8.zza
            boolean[] r11 = new boolean[r11]
            r12 = 0
        L2f:
            int r13 = r8.zza
            if (r12 >= r13) goto L82
            int r13 = r12 + 1
            java.lang.Object r14 = r9.get(r12)
            com.google.android.gms.internal.ads.zzyf r14 = (com.google.android.gms.internal.ads.zzyf) r14
            int r15 = r14.zzb()
            boolean r12 = r11[r12]
            if (r12 != 0) goto L7e
            if (r15 != 0) goto L46
            goto L7e
        L46:
            r12 = 1
            if (r15 != r12) goto L4e
            com.google.android.gms.internal.ads.zzgax r12 = com.google.android.gms.internal.ads.zzgax.zzo(r14)
            goto L7b
        L4e:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r14)
            r2 = r13
        L57:
            int r12 = r8.zza
            if (r2 >= r12) goto L7a
            java.lang.Object r12 = r9.get(r2)
            com.google.android.gms.internal.ads.zzyf r12 = (com.google.android.gms.internal.ads.zzyf) r12
            int r0 = r12.zzb()
            if (r0 != r4) goto L74
            boolean r0 = r14.zzc(r12)
            if (r0 == 0) goto L74
            r15.add(r12)
            r0 = 1
            r11[r2] = r0
            goto L75
        L74:
            r0 = 1
        L75:
            int r2 = r2 + 1
            r0 = r17
            goto L57
        L7a:
            r12 = r15
        L7b:
            r1.add(r12)
        L7e:
            r0 = r17
            r12 = r13
            goto L2f
        L82:
            int r7 = r7 + 1
            r0 = r17
            goto L18
        L87:
            r10 = r19
            int r3 = r3 + 1
            r0 = r17
            goto L8
        L8f:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L97
            r0 = 0
            return r0
        L97:
            r0 = r20
            java.lang.Object r0 = java.util.Collections.max(r1, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            int[] r1 = new int[r1]
            r2 = 0
        La6:
            int r3 = r0.size()
            if (r2 >= r3) goto Lb9
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.ads.zzyf r3 = (com.google.android.gms.internal.ads.zzyf) r3
            int r3 = r3.zzc
            r1[r2] = r3
            int r2 = r2 + 1
            goto La6
        Lb9:
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzyf r0 = (com.google.android.gms.internal.ads.zzyf) r0
            com.google.android.gms.internal.ads.zzyk r3 = new com.google.android.gms.internal.ads.zzyk
            com.google.android.gms.internal.ads.zzcd r4 = r0.zzb
            r3.<init>(r4, r1, r2)
            int r0 = r0.zza
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r3, r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zza(com.google.android.gms.internal.ads.zzlr r2) {
            r1 = this;
            java.lang.Object r2 = r1.zzd
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzxy r0 = r1.zzf     // Catch: java.lang.Throwable -> L9
            boolean r0 = r0.zzQ     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    protected final android.util.Pair zzd(com.google.android.gms.internal.ads.zzyn r27, int[][][] r28, int[] r29, com.google.android.gms.internal.ads.zzuy r30, com.google.android.gms.internal.ads.zzcc r31) throws com.google.android.gms.internal.ads.zzij {
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            r3 = r29
            java.lang.Object r4 = r1.zzd
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzxy r5 = r1.zzf     // Catch: java.lang.Throwable -> L24e
            boolean r6 = r5.zzM     // Catch: java.lang.Throwable -> L24e
            if (r6 == 0) goto L25
            int r6 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L24e
            r7 = 32
            if (r6 < r7) goto L25
            com.google.android.gms.internal.ads.zzyc r6 = r1.zzg     // Catch: java.lang.Throwable -> L24e
            if (r6 == 0) goto L25
            android.os.Looper r7 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L24e
            com.google.android.gms.internal.ads.zzdi.zzb(r7)     // Catch: java.lang.Throwable -> L24e
            r6.zzb(r1, r7)     // Catch: java.lang.Throwable -> L24e
        L25:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24e
            r4 = 2
            com.google.android.gms.internal.ads.zzyk[] r6 = new com.google.android.gms.internal.ads.zzyk[r4]
            com.google.android.gms.internal.ads.zzxo r7 = new com.google.android.gms.internal.ads.zzxo
            r7.<init>(r5, r3)
            com.google.android.gms.internal.ads.zzxp r8 = new com.google.android.gms.internal.ads.zzxp
            r8.<init>()
            android.util.Pair r7 = zzv(r4, r0, r2, r7, r8)
            r8 = 4
            if (r7 != 0) goto L49
            com.google.android.gms.internal.ads.zzxk r10 = new com.google.android.gms.internal.ads.zzxk
            r10.<init>(r5)
            com.google.android.gms.internal.ads.zzxl r11 = new com.google.android.gms.internal.ads.zzxl
            r11.<init>()
            android.util.Pair r10 = zzv(r8, r0, r2, r10, r11)
            goto L4a
        L49:
            r10 = 0
        L4a:
            r11 = 0
            if (r10 == 0) goto L5d
            java.lang.Object r7 = r10.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r10 = r10.first
            com.google.android.gms.internal.ads.zzyk r10 = (com.google.android.gms.internal.ads.zzyk) r10
            r6[r7] = r10
        L5b:
            r7 = 0
            goto L6e
        L5d:
            if (r7 == 0) goto L5b
            java.lang.Object r10 = r7.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r7 = r7.first
            com.google.android.gms.internal.ads.zzyk r7 = (com.google.android.gms.internal.ads.zzyk) r7
            r6[r10] = r7
            goto L5b
        L6e:
            r10 = 1
            if (r7 >= r4) goto L84
            int r12 = r0.zzc(r7)
            if (r12 != r4) goto L81
            com.google.android.gms.internal.ads.zzwy r12 = r0.zzd(r7)
            int r12 = r12.zzb
            if (r12 <= 0) goto L81
            r7 = 1
            goto L85
        L81:
            int r7 = r7 + 1
            goto L6e
        L84:
            r7 = 0
        L85:
            com.google.android.gms.internal.ads.zzxm r12 = new com.google.android.gms.internal.ads.zzxm
            r12.<init>(r1, r5, r7, r3)
            com.google.android.gms.internal.ads.zzxn r3 = new com.google.android.gms.internal.ads.zzxn
            r3.<init>()
            android.util.Pair r3 = zzv(r10, r0, r2, r12, r3)
            if (r3 == 0) goto La3
            java.lang.Object r7 = r3.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r12 = r3.first
            com.google.android.gms.internal.ads.zzyk r12 = (com.google.android.gms.internal.ads.zzyk) r12
            r6[r7] = r12
        La3:
            if (r3 != 0) goto La7
            r3 = 0
            goto Lba
        La7:
            java.lang.Object r3 = r3.first
            r7 = r3
            com.google.android.gms.internal.ads.zzyk r7 = (com.google.android.gms.internal.ads.zzyk) r7
            com.google.android.gms.internal.ads.zzcd r7 = r7.zza
            com.google.android.gms.internal.ads.zzyk r3 = (com.google.android.gms.internal.ads.zzyk) r3
            int[] r3 = r3.zzb
            r3 = r3[r11]
            com.google.android.gms.internal.ads.zzaf r3 = r7.zzb(r3)
            java.lang.String r3 = r3.zzd
        Lba:
            com.google.android.gms.internal.ads.zzxq r7 = new com.google.android.gms.internal.ads.zzxq
            r7.<init>(r5, r3)
            com.google.android.gms.internal.ads.zzxr r3 = new com.google.android.gms.internal.ads.zzxr
            r3.<init>()
            r12 = 3
            android.util.Pair r3 = zzv(r12, r0, r2, r7, r3)
            if (r3 == 0) goto Ld9
            java.lang.Object r7 = r3.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r3 = r3.first
            com.google.android.gms.internal.ads.zzyk r3 = (com.google.android.gms.internal.ads.zzyk) r3
            r6[r7] = r3
        Ld9:
            r3 = 0
        Lda:
            if (r3 >= r4) goto L14d
            int r7 = r0.zzc(r3)
            if (r7 == r4) goto L145
            if (r7 == r10) goto L145
            if (r7 == r12) goto L145
            if (r7 == r8) goto L145
            com.google.android.gms.internal.ads.zzwy r7 = r0.zzd(r3)
            r13 = r2[r3]
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        Lf4:
            int r8 = r7.zzb
            if (r14 >= r8) goto L134
            com.google.android.gms.internal.ads.zzcd r8 = r7.zzb(r14)
            r18 = r13[r14]
            r12 = r17
            r9 = 0
        L101:
            int r4 = r8.zza
            if (r9 >= r4) goto L12b
            r4 = r18[r9]
            boolean r11 = r5.zzN
            boolean r4 = com.google.android.gms.internal.ads.zzls.zza(r4, r11)
            if (r4 == 0) goto L126
            com.google.android.gms.internal.ads.zzaf r4 = r8.zzb(r9)
            com.google.android.gms.internal.ads.zzxu r11 = new com.google.android.gms.internal.ads.zzxu
            r10 = r18[r9]
            r11.<init>(r4, r10)
            if (r12 == 0) goto L122
            int r4 = r11.zza(r12)
            if (r4 <= 0) goto L126
        L122:
            r15 = r8
            r16 = r9
            r12 = r11
        L126:
            int r9 = r9 + 1
            r10 = 1
            r11 = 0
            goto L101
        L12b:
            int r14 = r14 + 1
            r17 = r12
            r4 = 2
            r10 = 1
            r11 = 0
            r12 = 3
            goto Lf4
        L134:
            if (r15 != 0) goto L138
            r4 = 0
            goto L143
        L138:
            com.google.android.gms.internal.ads.zzyk r4 = new com.google.android.gms.internal.ads.zzyk
            r7 = 1
            int[] r8 = new int[r7]
            r7 = 0
            r8[r7] = r16
            r4.<init>(r15, r8, r7)
        L143:
            r6[r3] = r4
        L145:
            int r3 = r3 + 1
            r4 = 2
            r8 = 4
            r10 = 1
            r11 = 0
            r12 = 3
            goto Lda
        L14d:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 2
            r7 = 0
        L154:
            if (r7 >= r3) goto L160
            com.google.android.gms.internal.ads.zzwy r4 = r0.zzd(r7)
            zzt(r4, r5, r2)
            int r7 = r7 + 1
            goto L154
        L160:
            com.google.android.gms.internal.ads.zzwy r4 = r27.zze()
            zzt(r4, r5, r2)
            r7 = 0
        L168:
            if (r7 >= r3) goto L17f
            int r4 = r0.zzc(r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r2.get(r4)
            com.google.android.gms.internal.ads.zzce r4 = (com.google.android.gms.internal.ads.zzce) r4
            if (r4 != 0) goto L17d
            int r7 = r7 + 1
            goto L168
        L17d:
            r4 = 0
            throw r4
        L17f:
            r4 = 0
            r7 = 0
        L181:
            if (r7 >= r3) goto L19b
            com.google.android.gms.internal.ads.zzwy r2 = r0.zzd(r7)
            boolean r3 = r5.zzg(r7, r2)
            if (r3 != 0) goto L18e
            goto L196
        L18e:
            com.google.android.gms.internal.ads.zzxz r2 = r5.zze(r7, r2)
            if (r2 != 0) goto L19a
            r6[r7] = r4
        L196:
            int r7 = r7 + 1
            r3 = 2
            goto L181
        L19a:
            throw r4
        L19b:
            r2 = 2
            r7 = 0
        L19d:
            if (r7 >= r2) goto L1bf
            int r2 = r0.zzc(r7)
            boolean r3 = r5.zzf(r7)
            if (r3 != 0) goto L1b8
            com.google.android.gms.internal.ads.zzgbc r3 = r5.zzB
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L1b6
            goto L1b8
        L1b6:
            r4 = 0
            goto L1bb
        L1b8:
            r4 = 0
            r6[r7] = r4
        L1bb:
            int r7 = r7 + 1
            r2 = 2
            goto L19d
        L1bf:
            r4 = 0
            com.google.android.gms.internal.ads.zzxe r2 = r1.zzi
            com.google.android.gms.internal.ads.zzyz r3 = r26.zzq()
            com.google.android.gms.internal.ads.zzgax r7 = com.google.android.gms.internal.ads.zzxf.zzf(r6)
            r8 = 2
            com.google.android.gms.internal.ads.zzyl[] r14 = new com.google.android.gms.internal.ads.zzyl[r8]
            r15 = 0
        L1ce:
            if (r15 >= r8) goto L217
            r8 = r6[r15]
            if (r8 == 0) goto L20f
            int[] r10 = r8.zzb
            int r9 = r10.length
            if (r9 != 0) goto L1da
            goto L20f
        L1da:
            r13 = 1
            if (r9 != r13) goto L1f5
            com.google.android.gms.internal.ads.zzcd r8 = r8.zza
            com.google.android.gms.internal.ads.zzym r9 = new com.google.android.gms.internal.ads.zzym
            r16 = 0
            r22 = r10[r16]
            r23 = 0
            r24 = 0
            r25 = 0
            r20 = r9
            r21 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            r19 = 1
            goto L20c
        L1f5:
            r16 = 0
            com.google.android.gms.internal.ads.zzcd r9 = r8.zza
            r11 = 0
            java.lang.Object r8 = r7.get(r15)
            r18 = r8
            com.google.android.gms.internal.ads.zzgax r18 = (com.google.android.gms.internal.ads.zzgax) r18
            r8 = r2
            r12 = r3
            r19 = 1
            r13 = r18
            com.google.android.gms.internal.ads.zzxf r9 = r8.zza(r9, r10, r11, r12, r13)
        L20c:
            r14[r15] = r9
            goto L213
        L20f:
            r16 = 0
            r19 = 1
        L213:
            int r15 = r15 + 1
            r8 = 2
            goto L1ce
        L217:
            r16 = 0
            com.google.android.gms.internal.ads.zzlv[] r2 = new com.google.android.gms.internal.ads.zzlv[r8]
            r11 = 0
        L21c:
            if (r11 >= r8) goto L249
            int r3 = r0.zzc(r11)
            boolean r6 = r5.zzf(r11)
            if (r6 != 0) goto L243
            com.google.android.gms.internal.ads.zzgbc r6 = r5.zzB
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L235
            goto L243
        L235:
            int r3 = r0.zzc(r11)
            r6 = -2
            if (r3 == r6) goto L240
            r3 = r14[r11]
            if (r3 == 0) goto L243
        L240:
            com.google.android.gms.internal.ads.zzlv r3 = com.google.android.gms.internal.ads.zzlv.zza
            goto L244
        L243:
            r3 = r4
        L244:
            r2[r11] = r3
            int r11 = r11 + 1
            goto L21c
        L249:
            android.util.Pair r0 = android.util.Pair.create(r2, r14)
            return r0
        L24e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24e
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final com.google.android.gms.internal.ads.zzlt zze() {
            r0 = this;
            return r0
    }

    public final com.google.android.gms.internal.ads.zzxy zzf() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzxy r1 = r2.zzf     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzj() {
            r3 = this;
            java.lang.Object r0 = r3.zzd
            monitor-enter(r0)
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L15
            r2 = 32
            if (r1 < r2) goto L10
            com.google.android.gms.internal.ads.zzyc r1 = r3.zzg     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L10
            r1.zzc()     // Catch: java.lang.Throwable -> L15
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            super.zzj()
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzk(com.google.android.gms.internal.ads.zzh r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzh r1 = r2.zzh     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L14
            r1 = r1 ^ 1
            r2.zzh = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L13
            r2.zzu()
        L13:
            return
        L14:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    public final void zzl(com.google.android.gms.internal.ads.zzxw r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzxy r0 = new com.google.android.gms.internal.ads.zzxy
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.Object r3 = r2.zzd
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzxy r1 = r2.zzf     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L29
            r1 = r1 ^ 1
            r2.zzf = r0     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L28
            boolean r3 = r0.zzM
            if (r3 == 0) goto L25
            android.content.Context r3 = r2.zza
            if (r3 != 0) goto L25
            java.lang.String r3 = "DefaultTrackSelector"
            java.lang.String r0 = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument."
            com.google.android.gms.internal.ads.zzea.zzf(r3, r0)
        L25:
            r2.zzs()
        L28:
            return
        L29:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzn() {
            r1 = this;
            r0 = 1
            return r0
    }
}
