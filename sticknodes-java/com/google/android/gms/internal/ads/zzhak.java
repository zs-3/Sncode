package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhak implements com.google.android.gms.internal.ads.zzhen {
    private final com.google.android.gms.internal.ads.zzhaj zza;

    private zzhak(com.google.android.gms.internal.ads.zzhaj r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "output"
            com.google.android.gms.internal.ads.zzhbr.zzc(r2, r0)
            r1.zza = r2
            r2.zze = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzhak zza(com.google.android.gms.internal.ads.zzhaj r1) {
            com.google.android.gms.internal.ads.zzhak r0 = r1.zze
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.ads.zzhak r0 = new com.google.android.gms.internal.ads.zzhak
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzA(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhce
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzhce r5 = (com.google.android.gms.internal.ads.zzhce) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zza(r4)
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            long r0 = r5.zza(r2)
            r4.zzk(r0)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            long r0 = r5.zza(r2)
            r6.zzj(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            r0.longValue()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zzk(r0)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6.zzj(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzB(int r2, int r3) throws java.io.IOException {
            r1 = this;
            int r0 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r0
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzt(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzC(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L5b
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            if (r6 == 0) goto L44
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L28
            int r0 = r5.zzd(r4)
            int r1 = r0 + r0
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L28:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L2d:
            int r4 = r5.size()
            if (r2 >= r4) goto Lc0
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            int r6 = r5.zzd(r2)
            int r0 = r6 + r6
            int r6 = r6 >> 31
            r6 = r6 ^ r0
            r4.zzu(r6)
            int r2 = r2 + 1
            goto L2d
        L44:
            int r6 = r5.size()
            if (r2 >= r6) goto Lc0
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            int r0 = r5.zzd(r2)
            int r1 = r0 + r0
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r6.zzt(r4, r0)
            int r2 = r2 + 1
            goto L44
        L5b:
            if (r6 == 0) goto La3
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L64:
            int r0 = r5.size()
            if (r4 >= r0) goto L81
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r0 + r0
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L64
        L81:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L86:
            int r4 = r5.size()
            if (r2 >= r4) goto Lc0
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r0 = r6 + r6
            int r6 = r6 >> 31
            r6 = r6 ^ r0
            r4.zzu(r6)
            int r2 = r2 + 1
            goto L86
        La3:
            int r6 = r5.size()
            if (r2 >= r6) goto Lc0
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r0 + r0
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r6.zzt(r4, r0)
            int r2 = r2 + 1
            goto La3
        Lc0:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzD(int r4, long r5) throws java.io.IOException {
            r3 = this;
            long r0 = r5 + r5
            r2 = 63
            long r5 = r5 >> r2
            long r5 = r5 ^ r0
            com.google.android.gms.internal.ads.zzhaj r0 = r3.zza
            r0.zzv(r4, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzE(int r7, java.util.List r8, boolean r9) throws java.io.IOException {
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzhce
            r1 = 2
            r2 = 63
            r3 = 0
            if (r0 == 0) goto L5a
            com.google.android.gms.internal.ads.zzhce r8 = (com.google.android.gms.internal.ads.zzhce) r8
            if (r9 == 0) goto L44
            com.google.android.gms.internal.ads.zzhaj r9 = r6.zza
            r9.zzs(r7, r1)
            r7 = 0
            r9 = 0
        L13:
            int r0 = r8.size()
            if (r7 >= r0) goto L29
            long r0 = r8.zza(r7)
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r9 = r9 + r0
            int r7 = r7 + 1
            goto L13
        L29:
            com.google.android.gms.internal.ads.zzhaj r7 = r6.zza
            r7.zzu(r9)
        L2e:
            int r7 = r8.size()
            if (r3 >= r7) goto Lbc
            com.google.android.gms.internal.ads.zzhaj r7 = r6.zza
            long r0 = r8.zza(r3)
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            r7.zzw(r0)
            int r3 = r3 + 1
            goto L2e
        L44:
            int r9 = r8.size()
            if (r3 >= r9) goto Lbc
            com.google.android.gms.internal.ads.zzhaj r9 = r6.zza
            long r0 = r8.zza(r3)
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            r9.zzv(r7, r0)
            int r3 = r3 + 1
            goto L44
        L5a:
            if (r9 == 0) goto La0
            com.google.android.gms.internal.ads.zzhaj r9 = r6.zza
            r9.zzs(r7, r1)
            r7 = 0
            r9 = 0
        L63:
            int r0 = r8.size()
            if (r7 >= r0) goto L7f
            java.lang.Object r0 = r8.get(r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r9 = r9 + r0
            int r7 = r7 + 1
            goto L63
        L7f:
            com.google.android.gms.internal.ads.zzhaj r7 = r6.zza
            r7.zzu(r9)
        L84:
            int r7 = r8.size()
            if (r3 >= r7) goto Lbc
            com.google.android.gms.internal.ads.zzhaj r7 = r6.zza
            java.lang.Object r9 = r8.get(r3)
            java.lang.Long r9 = (java.lang.Long) r9
            long r0 = r9.longValue()
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            r7.zzw(r0)
            int r3 = r3 + 1
            goto L84
        La0:
            int r9 = r8.size()
            if (r3 >= r9) goto Lbc
            com.google.android.gms.internal.ads.zzhaj r9 = r6.zza
            java.lang.Object r0 = r8.get(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r4 = r0 + r0
            long r0 = r0 >> r2
            long r0 = r0 ^ r4
            r9.zzv(r7, r0)
            int r3 = r3 + 1
            goto La0
        Lbc:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    @java.lang.Deprecated
    public final void zzF(int r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r2.zza
            r1 = 3
            r0.zzs(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzG(int r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzq(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzH(int r5, java.util.List r6) throws java.io.IOException {
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzhcb
            r1 = 0
            if (r0 == 0) goto L28
            r0 = r6
            com.google.android.gms.internal.ads.zzhcb r0 = (com.google.android.gms.internal.ads.zzhcb) r0
        L8:
            int r2 = r6.size()
            if (r1 >= r2) goto L3c
            java.lang.Object r2 = r0.zzc()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L1e
            com.google.android.gms.internal.ads.zzhaj r3 = r4.zza
            java.lang.String r2 = (java.lang.String) r2
            r3.zzq(r5, r2)
            goto L25
        L1e:
            com.google.android.gms.internal.ads.zzhaj r3 = r4.zza
            com.google.android.gms.internal.ads.zzgzs r2 = (com.google.android.gms.internal.ads.zzgzs) r2
            r3.zzN(r5, r2)
        L25:
            int r1 = r1 + 1
            goto L8
        L28:
            int r0 = r6.size()
            if (r1 >= r0) goto L3c
            com.google.android.gms.internal.ads.zzhaj r0 = r4.zza
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.zzq(r5, r2)
            int r1 = r1 + 1
            goto L28
        L3c:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzI(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzt(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzJ(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4c
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L23
            int r0 = r5.zzd(r4)
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L23:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L28:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            int r6 = r5.zzd(r2)
            r4.zzu(r6)
            int r2 = r2 + 1
            goto L28
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            int r0 = r5.zzd(r2)
            r6.zzt(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L4c:
            if (r6 == 0) goto L8a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L55:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L55
        L6d:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zzu(r6)
            int r2 = r2 + 1
            goto L72
        L8a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zzt(r4, r0)
            int r2 = r2 + 1
            goto L8a
        La2:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzK(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzv(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzL(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhce
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4c
            com.google.android.gms.internal.ads.zzhce r5 = (com.google.android.gms.internal.ads.zzhce) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L23
            long r0 = r5.zza(r4)
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L23:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L28:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            long r0 = r5.zza(r2)
            r4.zzw(r0)
            int r2 = r2 + 1
            goto L28
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            long r0 = r5.zza(r2)
            r6.zzv(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L4c:
            if (r6 == 0) goto L8a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L55:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L55
        L6d:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zzw(r0)
            int r2 = r2 + 1
            goto L72
        L8a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6.zzv(r4, r0)
            int r2 = r2 + 1
            goto L8a
        La2:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzb(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzM(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzc(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzi
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzgzi r5 = (com.google.android.gms.internal.ads.zzgzi) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zzh(r4)
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            boolean r6 = r5.zzh(r2)
            r4.zzL(r6)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            boolean r0 = r5.zzh(r2)
            r6.zzM(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4.zzL(r6)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6.zzM(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzd(int r2, com.google.android.gms.internal.ads.zzgzs r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzN(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zze(int r4, java.util.List r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r5.size()
            if (r0 >= r1) goto L15
            com.google.android.gms.internal.ads.zzhaj r1 = r3.zza
            java.lang.Object r2 = r5.get(r0)
            com.google.android.gms.internal.ads.zzgzs r2 = (com.google.android.gms.internal.ads.zzgzs) r2
            r1.zzN(r4, r2)
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzf(int r2, double r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r0.zzj(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzg(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhal
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L50
            com.google.android.gms.internal.ads.zzhal r5 = (com.google.android.gms.internal.ads.zzhal) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zzd(r4)
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto Laa
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            double r0 = r5.zzd(r2)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r4.zzk(r0)
            int r2 = r2 + 1
            goto L24
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto Laa
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            double r0 = r5.zzd(r2)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r6.zzj(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L50:
            if (r6 == 0) goto L8e
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L59:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Double r0 = (java.lang.Double) r0
            r0.doubleValue()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L59
        L6d:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto Laa
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r4.zzk(r0)
            int r2 = r2 + 1
            goto L72
        L8e:
            int r6 = r5.size()
            if (r2 >= r6) goto Laa
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r6.zzj(r4, r0)
            int r2 = r2 + 1
            goto L8e
        Laa:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    @java.lang.Deprecated
    public final void zzh(int r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r2.zza
            r1 = 4
            r0.zzs(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzi(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzl(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzj(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            if (r6 == 0) goto L3b
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L24
            int r0 = r5.zzd(r4)
            long r0 = (long) r0
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L24:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L29:
            int r4 = r5.size()
            if (r2 >= r4) goto La4
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            int r6 = r5.zzd(r2)
            r4.zzm(r6)
            int r2 = r2 + 1
            goto L29
        L3b:
            int r6 = r5.size()
            if (r2 >= r6) goto La4
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            int r0 = r5.zzd(r2)
            r6.zzl(r4, r0)
            int r2 = r2 + 1
            goto L3b
        L4d:
            if (r6 == 0) goto L8c
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L56:
            int r0 = r5.size()
            if (r4 >= r0) goto L6f
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L56
        L6f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L74:
            int r4 = r5.size()
            if (r2 >= r4) goto La4
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zzm(r6)
            int r2 = r2 + 1
            goto L74
        L8c:
            int r6 = r5.size()
            if (r2 >= r6) goto La4
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zzl(r4, r0)
            int r2 = r2 + 1
            goto L8c
        La4:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzk(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzh(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzl(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zzd(r4)
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            int r6 = r5.zzd(r2)
            r4.zzi(r6)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            int r0 = r5.zzd(r2)
            r6.zzh(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zzi(r6)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zzh(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzm(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzj(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzn(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhce
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzhce r5 = (com.google.android.gms.internal.ads.zzhce) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zza(r4)
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            long r0 = r5.zza(r2)
            r4.zzk(r0)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            long r0 = r5.zza(r2)
            r6.zzj(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            r0.longValue()
            int r6 = r6 + 8
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zzk(r0)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6.zzj(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzo(int r2, float r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            r0.zzh(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzp(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhav
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L50
            com.google.android.gms.internal.ads.zzhav r5 = (com.google.android.gms.internal.ads.zzhav) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zzd(r4)
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto Laa
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            float r6 = r5.zzd(r2)
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            r4.zzi(r6)
            int r2 = r2 + 1
            goto L24
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto Laa
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            float r0 = r5.zzd(r2)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r6.zzh(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L50:
            if (r6 == 0) goto L8e
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L59:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Float r0 = (java.lang.Float) r0
            r0.floatValue()
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L59
        L6d:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto Laa
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            r4.zzi(r6)
            int r2 = r2 + 1
            goto L72
        L8e:
            int r6 = r5.size()
            if (r2 >= r6) goto Laa
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r6.zzh(r4, r0)
            int r2 = r2 + 1
            goto L8e
        Laa:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzq(int r3, java.lang.Object r4, com.google.android.gms.internal.ads.zzhdk r5) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzhcp r4 = (com.google.android.gms.internal.ads.zzhcp) r4
            com.google.android.gms.internal.ads.zzhaj r0 = r2.zza
            r1 = 3
            r0.zzs(r3, r1)
            com.google.android.gms.internal.ads.zzhak r1 = r0.zze
            r5.zzj(r4, r1)
            r4 = 4
            r0.zzs(r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzr(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzl(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzs(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            if (r6 == 0) goto L3b
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L24
            int r0 = r5.zzd(r4)
            long r0 = (long) r0
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L24:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L29:
            int r4 = r5.size()
            if (r2 >= r4) goto La4
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            int r6 = r5.zzd(r2)
            r4.zzm(r6)
            int r2 = r2 + 1
            goto L29
        L3b:
            int r6 = r5.size()
            if (r2 >= r6) goto La4
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            int r0 = r5.zzd(r2)
            r6.zzl(r4, r0)
            int r2 = r2 + 1
            goto L3b
        L4d:
            if (r6 == 0) goto L8c
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L56:
            int r0 = r5.size()
            if (r4 >= r0) goto L6f
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L56
        L6f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L74:
            int r4 = r5.size()
            if (r2 >= r4) goto La4
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zzm(r6)
            int r2 = r2 + 1
            goto L74
        L8c:
            int r6 = r5.size()
            if (r2 >= r6) goto La4
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zzl(r4, r0)
            int r2 = r2 + 1
            goto L8c
        La4:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzt(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzv(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzu(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhce
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L4c
            com.google.android.gms.internal.ads.zzhce r5 = (com.google.android.gms.internal.ads.zzhce) r5
            if (r6 == 0) goto L3a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L23
            long r0 = r5.zza(r4)
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L11
        L23:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L28:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            long r0 = r5.zza(r2)
            r4.zzw(r0)
            int r2 = r2 + 1
            goto L28
        L3a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            long r0 = r5.zza(r2)
            r6.zzv(r4, r0)
            int r2 = r2 + 1
            goto L3a
        L4c:
            if (r6 == 0) goto L8a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L55:
            int r0 = r5.size()
            if (r4 >= r0) goto L6d
            java.lang.Object r0 = r5.get(r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzE(r0)
            int r6 = r6 + r0
            int r4 = r4 + 1
            goto L55
        L6d:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L72:
            int r4 = r5.size()
            if (r2 >= r4) goto La2
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            r4.zzw(r0)
            int r2 = r2 + 1
            goto L72
        L8a:
            int r6 = r5.size()
            if (r2 >= r6) goto La2
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r6.zzv(r4, r0)
            int r2 = r2 + 1
            goto L8a
        La2:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzv(int r2, java.lang.Object r3, com.google.android.gms.internal.ads.zzhdk r4) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhcp r3 = (com.google.android.gms.internal.ads.zzhcp) r3
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzn(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzw(int r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzgzs
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            com.google.android.gms.internal.ads.zzgzs r3 = (com.google.android.gms.internal.ads.zzgzs) r3
            r0.zzp(r2, r3)
            return
        Lc:
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            com.google.android.gms.internal.ads.zzhcp r3 = (com.google.android.gms.internal.ads.zzhcp) r3
            r0.zzo(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzx(int r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzh(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzy(int r4, java.util.List r5, boolean r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            if (r6 == 0) goto L36
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L11:
            int r0 = r5.size()
            if (r4 >= r0) goto L1f
            r5.zzd(r4)
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L11
        L1f:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L24:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            int r6 = r5.zzd(r2)
            r4.zzi(r6)
            int r2 = r2 + 1
            goto L24
        L36:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            int r0 = r5.zzd(r2)
            r6.zzh(r4, r0)
            int r2 = r2 + 1
            goto L36
        L48:
            if (r6 == 0) goto L82
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            r6.zzs(r4, r1)
            r4 = 0
            r6 = 0
        L51:
            int r0 = r5.size()
            if (r4 >= r0) goto L65
            java.lang.Object r0 = r5.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            int r6 = r6 + 4
            int r4 = r4 + 1
            goto L51
        L65:
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            r4.zzu(r6)
        L6a:
            int r4 = r5.size()
            if (r2 >= r4) goto L9a
            com.google.android.gms.internal.ads.zzhaj r4 = r3.zza
            java.lang.Object r6 = r5.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.zzi(r6)
            int r2 = r2 + 1
            goto L6a
        L82:
            int r6 = r5.size()
            if (r2 >= r6) goto L9a
            com.google.android.gms.internal.ads.zzhaj r6 = r3.zza
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.zzh(r4, r0)
            int r2 = r2 + 1
            goto L82
        L9a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhen
    public final void zzz(int r2, long r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhaj r0 = r1.zza
            r0.zzj(r2, r3)
            return
    }
}
