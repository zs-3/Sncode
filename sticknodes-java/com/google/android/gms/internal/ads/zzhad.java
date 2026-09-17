package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhad implements com.google.android.gms.internal.ads.zzhdc {
    private final com.google.android.gms.internal.ads.zzhac zza;
    private int zzb;
    private int zzc;
    private int zzd;

    private zzhad(com.google.android.gms.internal.ads.zzhac r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            java.lang.String r0 = "input"
            com.google.android.gms.internal.ads.zzhbr.zzc(r2, r0)
            r1.zza = r2
            r2.zzc = r1
            return
    }

    private final void zzO(java.lang.Object r3, com.google.android.gms.internal.ads.zzhdk r4, com.google.android.gms.internal.ads.zzhao r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r2.zzb
            int r1 = r1 >>> 3
            int r1 = r1 << 3
            r1 = r1 | 4
            r2.zzc = r1
            r4.zzh(r3, r2, r5)     // Catch: java.lang.Throwable -> L20
            int r3 = r2.zzb     // Catch: java.lang.Throwable -> L20
            int r4 = r2.zzc     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L18
            r2.zzc = r0
            return
        L18:
            com.google.android.gms.internal.ads.zzhbt r3 = new com.google.android.gms.internal.ads.zzhbt     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "Failed to parse the message."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        L20:
            r3 = move-exception
            r2.zzc = r0
            throw r3
    }

    private final void zzP(java.lang.Object r5, com.google.android.gms.internal.ads.zzhdk r6, com.google.android.gms.internal.ads.zzhao r7) throws java.io.IOException {
            r4 = this;
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            int r1 = r0.zzm()
            int r2 = r0.zza
            int r3 = r0.zzb
            if (r2 >= r3) goto L2d
            int r0 = r0.zzd(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r2 = r1.zza
            int r2 = r2 + 1
            r1.zza = r2
            r6.zzh(r5, r4, r7)
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            r6 = 0
            r5.zzy(r6)
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            int r6 = r5.zza
            int r6 = r6 + (-1)
            r5.zza = r6
            r5.zzz(r0)
            return
        L2d:
            com.google.android.gms.internal.ads.zzhbt r5 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r6 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            r5.<init>(r6)
            throw r5
    }

    private final void zzQ(int r2) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            int r0 = r0.zzc()
            if (r0 != r2) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzhbt r2 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r2.<init>(r0)
            throw r2
    }

    private final void zzR(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzb
            r0 = r0 & 7
            if (r0 != r2) goto L7
            return
        L7:
            com.google.android.gms.internal.ads.zzhbs r2 = new com.google.android.gms.internal.ads.zzhbs
            java.lang.String r0 = "Protocol message tag had invalid wire type."
            r2.<init>(r0)
            throw r2
    }

    private static final void zzS(int r1) throws java.io.IOException {
            r1 = r1 & 3
            if (r1 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzhbt r1 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "Failed to parse the message."
            r1.<init>(r0)
            throw r1
    }

    private static final void zzT(int r1) throws java.io.IOException {
            r1 = r1 & 7
            if (r1 != 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzhbt r1 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r0 = "Failed to parse the message."
            r1.<init>(r0)
            throw r1
    }

    public static com.google.android.gms.internal.ads.zzhad zzq(com.google.android.gms.internal.ads.zzhac r1) {
            com.google.android.gms.internal.ads.zzhad r0 = r1.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.ads.zzhad r0 = new com.google.android.gms.internal.ads.zzhad
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzA(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhce
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L59
            r0 = r5
            com.google.android.gms.internal.ads.zzhce r0 = (com.google.android.gms.internal.ads.zzhce) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r3) goto L3c
            if (r5 != r2) goto L36
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            int r5 = r5.zzm()
            zzT(r5)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            int r5 = r5 + r1
        L23:
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            long r1 = r1.zzn()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            if (r1 < r5) goto L23
            goto Laf
        L36:
            com.google.android.gms.internal.ads.zzhbs r5 = new com.google.android.gms.internal.ads.zzhbs
            r5.<init>(r1)
            throw r5
        L3c:
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            long r1 = r5.zzn()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            boolean r5 = r5.zzA()
            if (r5 == 0) goto L4e
            goto Laf
        L4e:
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            int r5 = r5.zzl()
            int r1 = r4.zzb
            if (r5 == r1) goto L3c
            goto Lad
        L59:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r3) goto L8d
            if (r0 != r2) goto L87
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            int r0 = r0.zzm()
            zzT(r0)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            int r0 = r0 + r1
        L71:
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            long r1 = r1.zzn()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L71
            goto Laf
        L87:
            com.google.android.gms.internal.ads.zzhbs r5 = new com.google.android.gms.internal.ads.zzhbs
            r5.<init>(r1)
            throw r5
        L8d:
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            long r0 = r0.zzn()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto Laf
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            int r0 = r0.zzl()
            int r1 = r4.zzb
            if (r0 == r1) goto L8d
            r5 = r0
        Lad:
            r4.zzd = r5
        Laf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzB(java.util.List r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzhav
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 5
            r3 = 2
            if (r0 == 0) goto L5a
            r0 = r6
            com.google.android.gms.internal.ads.zzhav r0 = (com.google.android.gms.internal.ads.zzhav) r0
            int r6 = r5.zzb
            r6 = r6 & 7
            if (r6 == r3) goto L37
            if (r6 != r2) goto L31
        L13:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            float r6 = r6.zzb()
            r0.zzh(r6)
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            boolean r6 = r6.zzA()
            if (r6 == 0) goto L26
            goto Lb0
        L26:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzl()
            int r1 = r5.zzb
            if (r6 == r1) goto L13
            goto L82
        L31:
            com.google.android.gms.internal.ads.zzhbs r6 = new com.google.android.gms.internal.ads.zzhbs
            r6.<init>(r1)
            throw r6
        L37:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzm()
            zzS(r6)
            com.google.android.gms.internal.ads.zzhac r1 = r5.zza
            int r1 = r1.zzc()
            int r4 = r1 + r6
        L48:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            float r6 = r6.zzb()
            r0.zzh(r6)
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzc()
            if (r6 < r4) goto L48
            goto Lb0
        L5a:
            int r0 = r5.zzb
            r0 = r0 & 7
            if (r0 == r3) goto L8b
            if (r0 != r2) goto L85
        L62:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            float r0 = r0.zzb()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto Lb0
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzl()
            int r1 = r5.zzb
            if (r0 == r1) goto L62
            r6 = r0
        L82:
            r5.zzd = r6
            return
        L85:
            com.google.android.gms.internal.ads.zzhbs r6 = new com.google.android.gms.internal.ads.zzhbs
            r6.<init>(r1)
            throw r6
        L8b:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzm()
            zzS(r0)
            com.google.android.gms.internal.ads.zzhac r1 = r5.zza
            int r1 = r1.zzc()
            int r1 = r1 + r0
        L9b:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            float r0 = r0.zzb()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzc()
            if (r0 < r1) goto L9b
        Lb0:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @java.lang.Deprecated
    public final void zzC(java.util.List r4, com.google.android.gms.internal.ads.zzhdk r5, com.google.android.gms.internal.ads.zzhao r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzb
            r1 = r0 & 7
            r2 = 3
            if (r1 != r2) goto L2c
        L7:
            java.lang.Object r1 = r5.zze()
            r3.zzO(r1, r5, r6)
            r5.zzf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            boolean r1 = r1.zzA()
            if (r1 != 0) goto L2b
            int r1 = r3.zzd
            if (r1 == 0) goto L21
            goto L2b
        L21:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzl()
            if (r1 == r0) goto L7
            r3.zzd = r1
        L2b:
            return
        L2c:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            java.lang.String r5 = "Protocol message tag had invalid wire type."
            r4.<init>(r5)
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzD(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhbf
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            if (r0 == 0) goto L55
            r0 = r4
            com.google.android.gms.internal.ads.zzhbf r0 = (com.google.android.gms.internal.ads.zzhbf) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L38
            if (r4 != r2) goto L32
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r1 = r4.zzm()
            int r4 = r4.zzc()
            int r4 = r4 + r1
        L1d:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzg()
            r0.zzi(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r4) goto L1d
            r3.zzQ(r4)
            return
        L32:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L38:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzg()
            r0.zzi(r4)
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzA()
            if (r4 == 0) goto L4a
            goto La9
        L4a:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzl()
            int r1 = r3.zzb
            if (r4 == r1) goto L38
            goto La7
        L55:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r2) goto L81
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r1 = r0.zzm()
            int r0 = r0.zzc()
            int r0 = r0 + r1
        L68:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzg()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L68
            r3.zzQ(r0)
            return
        L81:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L87:
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzg()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto La9
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzl()
            int r1 = r3.zzb
            if (r0 == r1) goto L87
            r4 = r0
        La7:
            r3.zzd = r4
        La9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzE(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhce
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            if (r0 == 0) goto L55
            r0 = r4
            com.google.android.gms.internal.ads.zzhce r0 = (com.google.android.gms.internal.ads.zzhce) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L38
            if (r4 != r2) goto L32
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r1 = r4.zzm()
            int r4 = r4.zzc()
            int r4 = r4 + r1
        L1d:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            long r1 = r1.zzo()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r4) goto L1d
            r3.zzQ(r4)
            return
        L32:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L38:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            long r1 = r4.zzo()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzA()
            if (r4 == 0) goto L4a
            goto La9
        L4a:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzl()
            int r1 = r3.zzb
            if (r4 == r1) goto L38
            goto La7
        L55:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r2) goto L81
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r1 = r0.zzm()
            int r0 = r0.zzc()
            int r0 = r0 + r1
        L68:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            long r1 = r1.zzo()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L68
            r3.zzQ(r0)
            return
        L81:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L87:
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            long r0 = r0.zzo()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto La9
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzl()
            int r1 = r3.zzb
            if (r0 == r1) goto L87
            r4 = r0
        La7:
            r3.zzd = r4
        La9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzF(java.util.List r4, com.google.android.gms.internal.ads.zzhdk r5, com.google.android.gms.internal.ads.zzhao r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzb
            r1 = r0 & 7
            r2 = 2
            if (r1 != r2) goto L2c
        L7:
            java.lang.Object r1 = r5.zze()
            r3.zzP(r1, r5, r6)
            r5.zzf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            boolean r1 = r1.zzA()
            if (r1 != 0) goto L2b
            int r1 = r3.zzd
            if (r1 == 0) goto L21
            goto L2b
        L21:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzl()
            if (r1 == r0) goto L7
            r3.zzd = r1
        L2b:
            return
        L2c:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            java.lang.String r5 = "Protocol message tag had invalid wire type."
            r4.<init>(r5)
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzG(java.util.List r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzhbf
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 5
            r3 = 2
            if (r0 == 0) goto L5a
            r0 = r6
            com.google.android.gms.internal.ads.zzhbf r0 = (com.google.android.gms.internal.ads.zzhbf) r0
            int r6 = r5.zzb
            r6 = r6 & 7
            if (r6 == r3) goto L37
            if (r6 != r2) goto L31
        L13:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzj()
            r0.zzi(r6)
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            boolean r6 = r6.zzA()
            if (r6 == 0) goto L26
            goto Lb0
        L26:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzl()
            int r1 = r5.zzb
            if (r6 == r1) goto L13
            goto L82
        L31:
            com.google.android.gms.internal.ads.zzhbs r6 = new com.google.android.gms.internal.ads.zzhbs
            r6.<init>(r1)
            throw r6
        L37:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzm()
            zzS(r6)
            com.google.android.gms.internal.ads.zzhac r1 = r5.zza
            int r1 = r1.zzc()
            int r4 = r1 + r6
        L48:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzj()
            r0.zzi(r6)
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzc()
            if (r6 < r4) goto L48
            goto Lb0
        L5a:
            int r0 = r5.zzb
            r0 = r0 & 7
            if (r0 == r3) goto L8b
            if (r0 != r2) goto L85
        L62:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzj()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto Lb0
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzl()
            int r1 = r5.zzb
            if (r0 == r1) goto L62
            r6 = r0
        L82:
            r5.zzd = r6
            return
        L85:
            com.google.android.gms.internal.ads.zzhbs r6 = new com.google.android.gms.internal.ads.zzhbs
            r6.<init>(r1)
            throw r6
        L8b:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzm()
            zzS(r0)
            com.google.android.gms.internal.ads.zzhac r1 = r5.zza
            int r1 = r1.zzc()
            int r1 = r1 + r0
        L9b:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzj()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzc()
            if (r0 < r1) goto L9b
        Lb0:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzH(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhce
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L59
            r0 = r5
            com.google.android.gms.internal.ads.zzhce r0 = (com.google.android.gms.internal.ads.zzhce) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r3) goto L3c
            if (r5 != r2) goto L36
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            int r5 = r5.zzm()
            zzT(r5)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            int r5 = r5 + r1
        L23:
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            long r1 = r1.zzs()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            if (r1 < r5) goto L23
            goto Laf
        L36:
            com.google.android.gms.internal.ads.zzhbs r5 = new com.google.android.gms.internal.ads.zzhbs
            r5.<init>(r1)
            throw r5
        L3c:
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            long r1 = r5.zzs()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            boolean r5 = r5.zzA()
            if (r5 == 0) goto L4e
            goto Laf
        L4e:
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            int r5 = r5.zzl()
            int r1 = r4.zzb
            if (r5 == r1) goto L3c
            goto Lad
        L59:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r3) goto L8d
            if (r0 != r2) goto L87
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            int r0 = r0.zzm()
            zzT(r0)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            int r0 = r0 + r1
        L71:
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            long r1 = r1.zzs()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L71
            goto Laf
        L87:
            com.google.android.gms.internal.ads.zzhbs r5 = new com.google.android.gms.internal.ads.zzhbs
            r5.<init>(r1)
            throw r5
        L8d:
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            long r0 = r0.zzs()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto Laf
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            int r0 = r0.zzl()
            int r1 = r4.zzb
            if (r0 == r1) goto L8d
            r5 = r0
        Lad:
            r4.zzd = r5
        Laf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzI(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhbf
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            if (r0 == 0) goto L55
            r0 = r4
            com.google.android.gms.internal.ads.zzhbf r0 = (com.google.android.gms.internal.ads.zzhbf) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L38
            if (r4 != r2) goto L32
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r1 = r4.zzm()
            int r4 = r4.zzc()
            int r4 = r4 + r1
        L1d:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzk()
            r0.zzi(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r4) goto L1d
            r3.zzQ(r4)
            return
        L32:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L38:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzk()
            r0.zzi(r4)
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzA()
            if (r4 == 0) goto L4a
            goto La9
        L4a:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzl()
            int r1 = r3.zzb
            if (r4 == r1) goto L38
            goto La7
        L55:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r2) goto L81
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r1 = r0.zzm()
            int r0 = r0.zzc()
            int r0 = r0 + r1
        L68:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzk()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L68
            r3.zzQ(r0)
            return
        L81:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L87:
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzk()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto La9
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzl()
            int r1 = r3.zzb
            if (r0 == r1) goto L87
            r4 = r0
        La7:
            r3.zzd = r4
        La9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzJ(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhce
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            if (r0 == 0) goto L55
            r0 = r4
            com.google.android.gms.internal.ads.zzhce r0 = (com.google.android.gms.internal.ads.zzhce) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L38
            if (r4 != r2) goto L32
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r1 = r4.zzm()
            int r4 = r4.zzc()
            int r4 = r4 + r1
        L1d:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            long r1 = r1.zzt()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r4) goto L1d
            r3.zzQ(r4)
            return
        L32:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L38:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            long r1 = r4.zzt()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzA()
            if (r4 == 0) goto L4a
            goto La9
        L4a:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzl()
            int r1 = r3.zzb
            if (r4 == r1) goto L38
            goto La7
        L55:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r2) goto L81
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r1 = r0.zzm()
            int r0 = r0.zzc()
            int r0 = r0 + r1
        L68:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            long r1 = r1.zzt()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L68
            r3.zzQ(r0)
            return
        L81:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L87:
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            long r0 = r0.zzt()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto La9
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzl()
            int r1 = r3.zzb
            if (r0 == r1) goto L87
            r4 = r0
        La7:
            r3.zzd = r4
        La9:
            return
    }

    public final void zzK(java.util.List r3, boolean r4) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzb
            r0 = r0 & 7
            r1 = 2
            if (r0 != r1) goto L4e
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzhcb
            if (r0 != 0) goto Lc
            goto L29
        Lc:
            if (r4 != 0) goto L29
            com.google.android.gms.internal.ads.zzhcb r3 = (com.google.android.gms.internal.ads.zzhcb) r3
        L10:
            r2.zzp()
            r3.zzb()
            com.google.android.gms.internal.ads.zzhac r4 = r2.zza
            boolean r4 = r4.zzA()
            if (r4 != 0) goto L3f
            com.google.android.gms.internal.ads.zzhac r4 = r2.zza
            int r4 = r4.zzl()
            int r0 = r2.zzb
            if (r4 == r0) goto L10
            goto L4b
        L29:
            if (r4 == 0) goto L30
            java.lang.String r0 = r2.zzs()
            goto L34
        L30:
            java.lang.String r0 = r2.zzr()
        L34:
            r3.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            boolean r0 = r0.zzA()
            if (r0 == 0) goto L40
        L3f:
            return
        L40:
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            int r0 = r0.zzl()
            int r1 = r2.zzb
            if (r0 == r1) goto L29
            r4 = r0
        L4b:
            r2.zzd = r4
            return
        L4e:
            com.google.android.gms.internal.ads.zzhbs r3 = new com.google.android.gms.internal.ads.zzhbs
            java.lang.String r4 = "Protocol message tag had invalid wire type."
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzL(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhbf
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            if (r0 == 0) goto L55
            r0 = r4
            com.google.android.gms.internal.ads.zzhbf r0 = (com.google.android.gms.internal.ads.zzhbf) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L38
            if (r4 != r2) goto L32
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r1 = r4.zzm()
            int r4 = r4.zzc()
            int r4 = r4 + r1
        L1d:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzm()
            r0.zzi(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r4) goto L1d
            r3.zzQ(r4)
            return
        L32:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L38:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzm()
            r0.zzi(r4)
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzA()
            if (r4 == 0) goto L4a
            goto La9
        L4a:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzl()
            int r1 = r3.zzb
            if (r4 == r1) goto L38
            goto La7
        L55:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r2) goto L81
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r1 = r0.zzm()
            int r0 = r0.zzc()
            int r0 = r0 + r1
        L68:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzm()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L68
            r3.zzQ(r0)
            return
        L81:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L87:
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzm()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto La9
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzl()
            int r1 = r3.zzb
            if (r0 == r1) goto L87
            r4 = r0
        La7:
            r3.zzd = r4
        La9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzM(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhce
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            if (r0 == 0) goto L55
            r0 = r4
            com.google.android.gms.internal.ads.zzhce r0 = (com.google.android.gms.internal.ads.zzhce) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L38
            if (r4 != r2) goto L32
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r1 = r4.zzm()
            int r4 = r4.zzc()
            int r4 = r4 + r1
        L1d:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            long r1 = r1.zzu()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r4) goto L1d
            r3.zzQ(r4)
            return
        L32:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L38:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            long r1 = r4.zzu()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzA()
            if (r4 == 0) goto L4a
            goto La9
        L4a:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzl()
            int r1 = r3.zzb
            if (r4 == r1) goto L38
            goto La7
        L55:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r2) goto L81
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r1 = r0.zzm()
            int r0 = r0.zzc()
            int r0 = r0 + r1
        L68:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            long r1 = r1.zzu()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L68
            r3.zzQ(r0)
            return
        L81:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L87:
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            long r0 = r0.zzu()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto La9
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzl()
            int r1 = r3.zzb
            if (r0 == r1) goto L87
            r4 = r0
        La7:
            r3.zzd = r4
        La9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final boolean zzN() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            boolean r0 = r0.zzB()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final double zza() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            double r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final float zzb() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            float r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzc() throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzd
            if (r0 == 0) goto La
            r2.zzb = r0
            r1 = 0
            r2.zzd = r1
            goto L12
        La:
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            int r0 = r0.zzl()
            r2.zzb = r0
        L12:
            if (r0 == 0) goto L1c
            int r1 = r2.zzc
            if (r0 != r1) goto L19
            goto L1c
        L19:
            int r0 = r0 >>> 3
            return r0
        L1c:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zze() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            int r0 = r0.zze()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzf() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            int r0 = r0.zzf()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzg() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            int r0 = r0.zzg()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzh() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            int r0 = r0.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzi() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            int r0 = r0.zzk()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzj() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            int r0 = r0.zzm()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzk() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            long r0 = r0.zzn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzl() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            long r0 = r0.zzo()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzm() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            long r0 = r0.zzs()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzn() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            long r0 = r0.zzt()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzo() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            long r0 = r0.zzu()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final com.google.android.gms.internal.ads.zzgzs zzp() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            com.google.android.gms.internal.ads.zzgzs r0 = r0.zzv()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final java.lang.String zzr() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            java.lang.String r0 = r0.zzw()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final java.lang.String zzs() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.zzR(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r1.zza
            java.lang.String r0 = r0.zzx()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzt(java.lang.Object r2, com.google.android.gms.internal.ads.zzhdk r3, com.google.android.gms.internal.ads.zzhao r4) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.zzR(r0)
            r1.zzO(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzu(java.lang.Object r2, com.google.android.gms.internal.ads.zzhdk r3, com.google.android.gms.internal.ads.zzhao r4) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.zzR(r0)
            r1.zzP(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzv(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzgzi
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            if (r0 == 0) goto L55
            r0 = r4
            com.google.android.gms.internal.ads.zzgzi r0 = (com.google.android.gms.internal.ads.zzgzi) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L38
            if (r4 != r2) goto L32
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r1 = r4.zzm()
            int r4 = r4.zzc()
            int r4 = r4 + r1
        L1d:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            boolean r1 = r1.zzB()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r4) goto L1d
            r3.zzQ(r4)
            return
        L32:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L38:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzB()
            r0.zzg(r4)
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzA()
            if (r4 == 0) goto L4a
            goto La9
        L4a:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzl()
            int r1 = r3.zzb
            if (r4 == r1) goto L38
            goto La7
        L55:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r2) goto L81
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r1 = r0.zzm()
            int r0 = r0.zzc()
            int r0 = r0 + r1
        L68:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            boolean r1 = r1.zzB()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L68
            r3.zzQ(r0)
            return
        L81:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L87:
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzB()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto La9
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzl()
            int r1 = r3.zzb
            if (r0 == r1) goto L87
            r4 = r0
        La7:
            r3.zzd = r4
        La9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzw(java.util.List r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzb
            r0 = r0 & 7
            r1 = 2
            if (r0 != r1) goto L24
        L7:
            com.google.android.gms.internal.ads.zzgzs r0 = r2.zzp()
            r3.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            boolean r0 = r0.zzA()
            if (r0 == 0) goto L17
            return
        L17:
            com.google.android.gms.internal.ads.zzhac r0 = r2.zza
            int r0 = r0.zzl()
            int r1 = r2.zzb
            if (r0 == r1) goto L7
            r2.zzd = r0
            return
        L24:
            com.google.android.gms.internal.ads.zzhbs r3 = new com.google.android.gms.internal.ads.zzhbs
            java.lang.String r0 = "Protocol message tag had invalid wire type."
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzx(java.util.List r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhal
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L59
            r0 = r5
            com.google.android.gms.internal.ads.zzhal r0 = (com.google.android.gms.internal.ads.zzhal) r0
            int r5 = r4.zzb
            r5 = r5 & 7
            if (r5 == r3) goto L3c
            if (r5 != r2) goto L36
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            int r5 = r5.zzm()
            zzT(r5)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            int r5 = r5 + r1
        L23:
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            double r1 = r1.zza()
            r0.zzh(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            if (r1 < r5) goto L23
            goto Laf
        L36:
            com.google.android.gms.internal.ads.zzhbs r5 = new com.google.android.gms.internal.ads.zzhbs
            r5.<init>(r1)
            throw r5
        L3c:
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            double r1 = r5.zza()
            r0.zzh(r1)
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            boolean r5 = r5.zzA()
            if (r5 == 0) goto L4e
            goto Laf
        L4e:
            com.google.android.gms.internal.ads.zzhac r5 = r4.zza
            int r5 = r5.zzl()
            int r1 = r4.zzb
            if (r5 == r1) goto L3c
            goto Lad
        L59:
            int r0 = r4.zzb
            r0 = r0 & 7
            if (r0 == r3) goto L8d
            if (r0 != r2) goto L87
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            int r0 = r0.zzm()
            zzT(r0)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            int r0 = r0 + r1
        L71:
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            double r1 = r1.zza()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r5.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r4.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L71
            goto Laf
        L87:
            com.google.android.gms.internal.ads.zzhbs r5 = new com.google.android.gms.internal.ads.zzhbs
            r5.<init>(r1)
            throw r5
        L8d:
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            double r0 = r0.zza()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto Laf
            com.google.android.gms.internal.ads.zzhac r0 = r4.zza
            int r0 = r0.zzl()
            int r1 = r4.zzb
            if (r0 == r1) goto L8d
            r5 = r0
        Lad:
            r4.zzd = r5
        Laf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzy(java.util.List r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzhbf
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 2
            if (r0 == 0) goto L55
            r0 = r4
            com.google.android.gms.internal.ads.zzhbf r0 = (com.google.android.gms.internal.ads.zzhbf) r0
            int r4 = r3.zzb
            r4 = r4 & 7
            if (r4 == 0) goto L38
            if (r4 != r2) goto L32
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r1 = r4.zzm()
            int r4 = r4.zzc()
            int r4 = r4 + r1
        L1d:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zze()
            r0.zzi(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r4) goto L1d
            r3.zzQ(r4)
            return
        L32:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L38:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zze()
            r0.zzi(r4)
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            boolean r4 = r4.zzA()
            if (r4 == 0) goto L4a
            goto La9
        L4a:
            com.google.android.gms.internal.ads.zzhac r4 = r3.zza
            int r4 = r4.zzl()
            int r1 = r3.zzb
            if (r4 == r1) goto L38
            goto La7
        L55:
            int r0 = r3.zzb
            r0 = r0 & 7
            if (r0 == 0) goto L87
            if (r0 != r2) goto L81
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r1 = r0.zzm()
            int r0 = r0.zzc()
            int r0 = r0 + r1
        L68:
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zze()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.add(r1)
            com.google.android.gms.internal.ads.zzhac r1 = r3.zza
            int r1 = r1.zzc()
            if (r1 < r0) goto L68
            r3.zzQ(r0)
            return
        L81:
            com.google.android.gms.internal.ads.zzhbs r4 = new com.google.android.gms.internal.ads.zzhbs
            r4.<init>(r1)
            throw r4
        L87:
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zze()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto La9
            com.google.android.gms.internal.ads.zzhac r0 = r3.zza
            int r0 = r0.zzl()
            int r1 = r3.zzb
            if (r0 == r1) goto L87
            r4 = r0
        La7:
            r3.zzd = r4
        La9:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzz(java.util.List r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzhbf
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r2 = 5
            r3 = 2
            if (r0 == 0) goto L5a
            r0 = r6
            com.google.android.gms.internal.ads.zzhbf r0 = (com.google.android.gms.internal.ads.zzhbf) r0
            int r6 = r5.zzb
            r6 = r6 & 7
            if (r6 == r3) goto L37
            if (r6 != r2) goto L31
        L13:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzf()
            r0.zzi(r6)
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            boolean r6 = r6.zzA()
            if (r6 == 0) goto L26
            goto Lb0
        L26:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzl()
            int r1 = r5.zzb
            if (r6 == r1) goto L13
            goto L82
        L31:
            com.google.android.gms.internal.ads.zzhbs r6 = new com.google.android.gms.internal.ads.zzhbs
            r6.<init>(r1)
            throw r6
        L37:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzm()
            zzS(r6)
            com.google.android.gms.internal.ads.zzhac r1 = r5.zza
            int r1 = r1.zzc()
            int r4 = r1 + r6
        L48:
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzf()
            r0.zzi(r6)
            com.google.android.gms.internal.ads.zzhac r6 = r5.zza
            int r6 = r6.zzc()
            if (r6 < r4) goto L48
            goto Lb0
        L5a:
            int r0 = r5.zzb
            r0 = r0 & 7
            if (r0 == r3) goto L8b
            if (r0 != r2) goto L85
        L62:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzf()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            boolean r0 = r0.zzA()
            if (r0 != 0) goto Lb0
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzl()
            int r1 = r5.zzb
            if (r0 == r1) goto L62
            r6 = r0
        L82:
            r5.zzd = r6
            return
        L85:
            com.google.android.gms.internal.ads.zzhbs r6 = new com.google.android.gms.internal.ads.zzhbs
            r6.<init>(r1)
            throw r6
        L8b:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzm()
            zzS(r0)
            com.google.android.gms.internal.ads.zzhac r1 = r5.zza
            int r1 = r1.zzc()
            int r1 = r1 + r0
        L9b:
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzf()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            com.google.android.gms.internal.ads.zzhac r0 = r5.zza
            int r0 = r0.zzc()
            if (r0 < r1) goto L9b
        Lb0:
            return
    }
}
