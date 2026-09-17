package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzlj {
    private final com.google.android.gms.internal.ads.zzom zza;
    private final java.util.List zzb;
    private final java.util.IdentityHashMap zzc;
    private final java.util.Map zzd;
    private final com.google.android.gms.internal.ads.zzli zze;
    private final java.util.HashMap zzf;
    private final java.util.Set zzg;
    private final com.google.android.gms.internal.ads.zzma zzh;
    private final com.google.android.gms.internal.ads.zzdt zzi;
    private boolean zzj;
    private com.google.android.gms.internal.ads.zzhh zzk;
    private com.google.android.gms.internal.ads.zzwq zzl;

    public zzlj(com.google.android.gms.internal.ads.zzli r1, com.google.android.gms.internal.ads.zzma r2, com.google.android.gms.internal.ads.zzdt r3, com.google.android.gms.internal.ads.zzom r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r4
            r0.zze = r1
            com.google.android.gms.internal.ads.zzwq r1 = new com.google.android.gms.internal.ads.zzwq
            r4 = 0
            r1.<init>(r4)
            r0.zzl = r1
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            r0.zzc = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzd = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzb = r1
            r0.zzh = r2
            r0.zzi = r3
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzf = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.zzg = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdt zzd(com.google.android.gms.internal.ads.zzlj r0) {
            com.google.android.gms.internal.ads.zzdt r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzma zze(com.google.android.gms.internal.ads.zzlj r0) {
            com.google.android.gms.internal.ads.zzma r0 = r0.zzh
            return r0
    }

    private final void zzr(int r3, int r4) {
            r2 = this;
        L0:
            java.util.List r0 = r2.zzb
            int r0 = r0.size()
            if (r3 >= r0) goto L18
            java.util.List r0 = r2.zzb
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.zzlh r0 = (com.google.android.gms.internal.ads.zzlh) r0
            int r1 = r0.zzd
            int r1 = r1 + r4
            r0.zzd = r1
            int r3 = r3 + 1
            goto L0
        L18:
            return
    }

    private final void zzs(com.google.android.gms.internal.ads.zzlh r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzf
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzlg r2 = (com.google.android.gms.internal.ads.zzlg) r2
            if (r2 == 0) goto L11
            com.google.android.gms.internal.ads.zzva r0 = r2.zza
            com.google.android.gms.internal.ads.zzuz r2 = r2.zzb
            r0.zzi(r2)
        L11:
            return
    }

    private final void zzt() {
            r3 = this;
            java.util.Set r0 = r3.zzg
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzlh r1 = (com.google.android.gms.internal.ads.zzlh) r1
            java.util.List r2 = r1.zzc
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6
            r3.zzs(r1)
            r0.remove()
            goto L6
        L21:
            return
    }

    private final void zzu(com.google.android.gms.internal.ads.zzlh r4) {
            r3 = this;
            boolean r0 = r4.zze
            if (r0 == 0) goto L31
            java.util.List r0 = r4.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            java.util.HashMap r0 = r3.zzf
            java.lang.Object r0 = r0.remove(r4)
            com.google.android.gms.internal.ads.zzlg r0 = (com.google.android.gms.internal.ads.zzlg) r0
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzva r1 = r0.zza
            com.google.android.gms.internal.ads.zzuz r2 = r0.zzb
            r1.zzp(r2)
            com.google.android.gms.internal.ads.zzva r1 = r0.zza
            com.google.android.gms.internal.ads.zzlf r2 = r0.zzc
            r1.zzs(r2)
            com.google.android.gms.internal.ads.zzva r1 = r0.zza
            com.google.android.gms.internal.ads.zzlf r0 = r0.zzc
            r1.zzr(r0)
            java.util.Set r0 = r3.zzg
            r0.remove(r4)
        L31:
            return
    }

    private final void zzv(com.google.android.gms.internal.ads.zzlh r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzut r0 = r6.zza
            com.google.android.gms.internal.ads.zzkz r1 = new com.google.android.gms.internal.ads.zzkz
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzlf r2 = new com.google.android.gms.internal.ads.zzlf
            r2.<init>(r5, r6)
            com.google.android.gms.internal.ads.zzlg r3 = new com.google.android.gms.internal.ads.zzlg
            r3.<init>(r0, r1, r2)
            java.util.HashMap r4 = r5.zzf
            r4.put(r6, r3)
            android.os.Looper r6 = com.google.android.gms.internal.ads.zzeu.zzy()
            android.os.Handler r3 = new android.os.Handler
            r4 = 0
            r3.<init>(r6, r4)
            r0.zzh(r3, r2)
            android.os.Looper r6 = com.google.android.gms.internal.ads.zzeu.zzy()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r6, r4)
            r0.zzg(r3, r2)
            com.google.android.gms.internal.ads.zzhh r6 = r5.zzk
            com.google.android.gms.internal.ads.zzom r2 = r5.zza
            r0.zzm(r1, r6, r2)
            return
    }

    private final void zzw(int r4, int r5) {
            r3 = this;
        L0:
            int r5 = r5 + (-1)
            if (r5 < r4) goto L2c
            java.util.List r0 = r3.zzb
            java.lang.Object r0 = r0.remove(r5)
            com.google.android.gms.internal.ads.zzlh r0 = (com.google.android.gms.internal.ads.zzlh) r0
            java.util.Map r1 = r3.zzd
            java.lang.Object r2 = r0.zzb
            r1.remove(r2)
            com.google.android.gms.internal.ads.zzut r1 = r0.zza
            com.google.android.gms.internal.ads.zzcc r1 = r1.zzC()
            int r1 = r1.zzc()
            int r1 = -r1
            r3.zzr(r5, r1)
            r1 = 1
            r0.zze = r1
            boolean r1 = r3.zzj
            if (r1 == 0) goto L0
            r3.zzu(r0)
            goto L0
        L2c:
            return
    }

    public final int zza() {
            r1 = this;
            java.util.List r0 = r1.zzb
            int r0 = r0.size()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzcc zzb() {
            r3 = this;
            java.util.List r0 = r3.zzb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L34
            r0 = 0
            r1 = 0
        La:
            java.util.List r2 = r3.zzb
            int r2 = r2.size()
            if (r0 >= r2) goto L2a
            java.util.List r2 = r3.zzb
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.ads.zzlh r2 = (com.google.android.gms.internal.ads.zzlh) r2
            r2.zzd = r1
            com.google.android.gms.internal.ads.zzut r2 = r2.zza
            com.google.android.gms.internal.ads.zzcc r2 = r2.zzC()
            int r2 = r2.zzc()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto La
        L2a:
            java.util.List r0 = r3.zzb
            com.google.android.gms.internal.ads.zzlp r1 = new com.google.android.gms.internal.ads.zzlp
            com.google.android.gms.internal.ads.zzwq r2 = r3.zzl
            r1.<init>(r0, r2)
            return r1
        L34:
            com.google.android.gms.internal.ads.zzcc r0 = com.google.android.gms.internal.ads.zzcc.zza
            return r0
    }

    public final com.google.android.gms.internal.ads.zzcc zzc(int r5, int r6, java.util.List r7) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 < 0) goto Le
            if (r5 > r6) goto Le
            int r2 = r4.zza()
            if (r6 > r2) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            com.google.android.gms.internal.ads.zzdi.zzd(r2)
            int r2 = r7.size()
            int r3 = r6 - r5
            if (r2 != r3) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r0 = r5
        L20:
            if (r0 >= r6) goto L3a
            java.util.List r1 = r4.zzb
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzlh r1 = (com.google.android.gms.internal.ads.zzlh) r1
            com.google.android.gms.internal.ads.zzut r1 = r1.zza
            int r2 = r0 - r5
            java.lang.Object r2 = r7.get(r2)
            com.google.android.gms.internal.ads.zzbc r2 = (com.google.android.gms.internal.ads.zzbc) r2
            r1.zzt(r2)
            int r0 = r0 + 1
            goto L20
        L3a:
            com.google.android.gms.internal.ads.zzcc r5 = r4.zzb()
            return r5
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzva r1, com.google.android.gms.internal.ads.zzcc r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzli r1 = r0.zze
            r1.zzg()
            return
    }

    public final void zzg(com.google.android.gms.internal.ads.zzhh r4) {
            r3 = this;
            boolean r0 = r3.zzj
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r3.zzk = r4
            r4 = 0
        La:
            java.util.List r0 = r3.zzb
            int r0 = r0.size()
            if (r4 >= r0) goto L25
            java.util.List r0 = r3.zzb
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.ads.zzlh r0 = (com.google.android.gms.internal.ads.zzlh) r0
            r3.zzv(r0)
            java.util.Set r2 = r3.zzg
            r2.add(r0)
            int r4 = r4 + 1
            goto La
        L25:
            r3.zzj = r1
            return
    }

    public final void zzh() {
            r5 = this;
            java.util.HashMap r0 = r5.zzf
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzlg r1 = (com.google.android.gms.internal.ads.zzlg) r1
            com.google.android.gms.internal.ads.zzva r2 = r1.zza     // Catch: java.lang.RuntimeException -> L1e
            com.google.android.gms.internal.ads.zzuz r3 = r1.zzb     // Catch: java.lang.RuntimeException -> L1e
            r2.zzp(r3)     // Catch: java.lang.RuntimeException -> L1e
            goto L26
        L1e:
            r2 = move-exception
            java.lang.String r3 = "MediaSourceList"
            java.lang.String r4 = "Failed to release child source."
            com.google.android.gms.internal.ads.zzea.zzd(r3, r4, r2)
        L26:
            com.google.android.gms.internal.ads.zzva r2 = r1.zza
            com.google.android.gms.internal.ads.zzlf r3 = r1.zzc
            r2.zzs(r3)
            com.google.android.gms.internal.ads.zzva r2 = r1.zza
            com.google.android.gms.internal.ads.zzlf r1 = r1.zzc
            r2.zzr(r1)
            goto La
        L35:
            java.util.HashMap r0 = r5.zzf
            r0.clear()
            java.util.Set r0 = r5.zzg
            r0.clear()
            r0 = 0
            r5.zzj = r0
            return
    }

    public final void zzi(com.google.android.gms.internal.ads.zzuw r3) {
            r2 = this;
            java.util.IdentityHashMap r0 = r2.zzc
            java.lang.Object r0 = r0.remove(r3)
            com.google.android.gms.internal.ads.zzlh r0 = (com.google.android.gms.internal.ads.zzlh) r0
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzut r1 = r0.zza
            r1.zzG(r3)
            java.util.List r1 = r0.zzc
            com.google.android.gms.internal.ads.zzuq r3 = (com.google.android.gms.internal.ads.zzuq) r3
            com.google.android.gms.internal.ads.zzuy r3 = r3.zza
            r1.remove(r3)
            java.util.IdentityHashMap r3 = r2.zzc
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L24
            r2.zzt()
        L24:
            r2.zzu(r0)
            return
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zzj
            return r0
    }

    public final com.google.android.gms.internal.ads.zzcc zzk(int r4, java.util.List r5, com.google.android.gms.internal.ads.zzwq r6) {
            r3 = this;
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L6d
            r3.zzl = r6
            r6 = r4
        L9:
            int r0 = r5.size()
            int r0 = r0 + r4
            if (r6 >= r0) goto L6d
            int r0 = r6 - r4
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.internal.ads.zzlh r0 = (com.google.android.gms.internal.ads.zzlh) r0
            if (r6 <= 0) goto L35
            java.util.List r1 = r3.zzb
            int r2 = r6 + (-1)
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.internal.ads.zzlh r1 = (com.google.android.gms.internal.ads.zzlh) r1
            com.google.android.gms.internal.ads.zzut r2 = r1.zza
            com.google.android.gms.internal.ads.zzcc r2 = r2.zzC()
            int r1 = r1.zzd
            int r2 = r2.zzc()
            int r1 = r1 + r2
            r0.zzc(r1)
            goto L39
        L35:
            r1 = 0
            r0.zzc(r1)
        L39:
            com.google.android.gms.internal.ads.zzut r1 = r0.zza
            com.google.android.gms.internal.ads.zzcc r1 = r1.zzC()
            int r1 = r1.zzc()
            r3.zzr(r6, r1)
            java.util.List r1 = r3.zzb
            r1.add(r6, r0)
            java.util.Map r1 = r3.zzd
            java.lang.Object r2 = r0.zzb
            r1.put(r2, r0)
            boolean r1 = r3.zzj
            if (r1 == 0) goto L6a
            r3.zzv(r0)
            java.util.IdentityHashMap r1 = r3.zzc
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L67
            java.util.Set r1 = r3.zzg
            r1.add(r0)
            goto L6a
        L67:
            r3.zzs(r0)
        L6a:
            int r6 = r6 + 1
            goto L9
        L6d:
            com.google.android.gms.internal.ads.zzcc r4 = r3.zzb()
            return r4
    }

    public final com.google.android.gms.internal.ads.zzcc zzl(int r1, int r2, int r3, com.google.android.gms.internal.ads.zzwq r4) {
            r0 = this;
            int r1 = r0.zza()
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            r1 = 0
            r0.zzl = r1
            com.google.android.gms.internal.ads.zzcc r1 = r0.zzb()
            return r1
    }

    public final com.google.android.gms.internal.ads.zzcc zzm(int r3, int r4, com.google.android.gms.internal.ads.zzwq r5) {
            r2 = this;
            r0 = 0
            if (r3 < 0) goto Lc
            if (r3 > r4) goto Lc
            int r1 = r2.zza()
            if (r4 > r1) goto Lc
            r0 = 1
        Lc:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r2.zzl = r5
            r2.zzw(r3, r4)
            com.google.android.gms.internal.ads.zzcc r3 = r2.zzb()
            return r3
    }

    public final com.google.android.gms.internal.ads.zzcc zzn(java.util.List r3, com.google.android.gms.internal.ads.zzwq r4) {
            r2 = this;
            java.util.List r0 = r2.zzb
            int r0 = r0.size()
            r1 = 0
            r2.zzw(r1, r0)
            java.util.List r0 = r2.zzb
            int r0 = r0.size()
            com.google.android.gms.internal.ads.zzcc r3 = r2.zzk(r0, r3, r4)
            return r3
    }

    public final com.google.android.gms.internal.ads.zzcc zzo(com.google.android.gms.internal.ads.zzwq r3) {
            r2 = this;
            int r0 = r2.zza()
            int r1 = r3.zzc()
            if (r1 == r0) goto L13
            com.google.android.gms.internal.ads.zzwq r3 = r3.zzf()
            r1 = 0
            com.google.android.gms.internal.ads.zzwq r3 = r3.zzg(r1, r0)
        L13:
            r2.zzl = r3
            com.google.android.gms.internal.ads.zzcc r3 = r2.zzb()
            return r3
    }

    public final com.google.android.gms.internal.ads.zzuw zzp(com.google.android.gms.internal.ads.zzuy r4, com.google.android.gms.internal.ads.zzza r5, long r6) {
            r3 = this;
            int r0 = com.google.android.gms.internal.ads.zzlp.zzb
            java.lang.Object r0 = r4.zza
            r1 = r0
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.first
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            com.google.android.gms.internal.ads.zzuy r4 = r4.zza(r0)
            java.util.Map r0 = r3.zzd
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzlh r0 = (com.google.android.gms.internal.ads.zzlh) r0
            java.util.Objects.requireNonNull(r0)
            java.util.Set r1 = r3.zzg
            r1.add(r0)
            java.util.HashMap r1 = r3.zzf
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzlg r1 = (com.google.android.gms.internal.ads.zzlg) r1
            if (r1 == 0) goto L32
            com.google.android.gms.internal.ads.zzva r2 = r1.zza
            com.google.android.gms.internal.ads.zzuz r1 = r1.zzb
            r2.zzk(r1)
        L32:
            java.util.List r1 = r0.zzc
            r1.add(r4)
            com.google.android.gms.internal.ads.zzut r1 = r0.zza
            com.google.android.gms.internal.ads.zzuq r4 = r1.zzH(r4, r5, r6)
            java.util.IdentityHashMap r5 = r3.zzc
            r5.put(r4, r0)
            r3.zzt()
            return r4
    }

    public final com.google.android.gms.internal.ads.zzwq zzq() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwq r0 = r1.zzl
            return r0
    }
}
