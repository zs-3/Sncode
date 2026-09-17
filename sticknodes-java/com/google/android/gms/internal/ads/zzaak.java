package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaak implements com.google.android.gms.internal.ads.zzco {
    private static final java.util.concurrent.Executor zza = null;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzaai zzc;
    private final com.google.android.gms.internal.ads.zzaaz zzd;
    private final com.google.android.gms.internal.ads.zzabe zze;
    private final com.google.android.gms.internal.ads.zzbx zzf;
    private final com.google.android.gms.internal.ads.zzdj zzg;
    private final java.util.concurrent.CopyOnWriteArraySet zzh;
    private com.google.android.gms.internal.ads.zzaf zzi;
    private com.google.android.gms.internal.ads.zzaaw zzj;
    private com.google.android.gms.internal.ads.zzdt zzk;
    private android.util.Pair zzl;
    private int zzm;
    private int zzn;

    static {
            com.google.android.gms.internal.ads.zzzv r0 = new com.google.android.gms.internal.ads.zzzv
            r0.<init>()
            com.google.android.gms.internal.ads.zzaak.zza = r0
            return
    }

    /* synthetic */ zzaak(com.google.android.gms.internal.ads.zzzx r5, com.google.android.gms.internal.ads.zzaaj r6) {
            r4 = this;
            r4.<init>()
            android.content.Context r6 = com.google.android.gms.internal.ads.zzzx.zza(r5)
            r4.zzb = r6
            com.google.android.gms.internal.ads.zzaai r0 = new com.google.android.gms.internal.ads.zzaai
            r0.<init>(r4, r6)
            r4.zzc = r0
            com.google.android.gms.internal.ads.zzdj r6 = com.google.android.gms.internal.ads.zzzx.zzc(r5)
            r4.zzg = r6
            com.google.android.gms.internal.ads.zzaaz r1 = com.google.android.gms.internal.ads.zzzx.zzf(r5)
            r4.zzd = r1
            r1.zzk(r6)
            com.google.android.gms.internal.ads.zzabe r6 = new com.google.android.gms.internal.ads.zzabe
            com.google.android.gms.internal.ads.zzzz r2 = new com.google.android.gms.internal.ads.zzzz
            r3 = 0
            r2.<init>(r4, r3)
            r6.<init>(r2, r1)
            r4.zze = r6
            com.google.android.gms.internal.ads.zzbx r5 = com.google.android.gms.internal.ads.zzzx.zzb(r5)
            com.google.android.gms.internal.ads.zzdi.zzb(r5)
            r4.zzf = r5
            java.util.concurrent.CopyOnWriteArraySet r5 = new java.util.concurrent.CopyOnWriteArraySet
            r5.<init>()
            r4.zzh = r5
            r6 = 0
            r4.zzn = r6
            r5.add(r0)
            return
    }

    static /* bridge */ /* synthetic */ android.util.Pair zza(com.google.android.gms.internal.ads.zzaak r0) {
            android.util.Pair r0 = r0.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzo zzb(com.google.android.gms.internal.ads.zzo r0) {
            com.google.android.gms.internal.ads.zzo r0 = zzw(r0)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaf zzc(com.google.android.gms.internal.ads.zzaak r0) {
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcn zzd(com.google.android.gms.internal.ads.zzaak r11, com.google.android.gms.internal.ads.zzaf r12) {
            int r0 = r11.zzn
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzo r0 = r12.zzA
            com.google.android.gms.internal.ads.zzo r0 = zzw(r0)
            int r1 = r0.zzd
            r2 = 7
            if (r1 != r2) goto L27
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2 = 34
            if (r1 >= r2) goto L27
            com.google.android.gms.internal.ads.zzm r0 = r0.zzc()
            r1 = 6
            r0.zzd(r1)
            com.google.android.gms.internal.ads.zzo r0 = r0.zzg()
        L27:
            r3 = r0
            com.google.android.gms.internal.ads.zzdj r0 = r11.zzg
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            r10 = 0
            com.google.android.gms.internal.ads.zzdt r0 = r0.zzd(r1, r10)
            r11.zzk = r0
            com.google.android.gms.internal.ads.zzbx r1 = r11.zzf     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            android.content.Context r2 = r11.zzb     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            com.google.android.gms.internal.ads.zzr r4 = com.google.android.gms.internal.ads.zzr.zza     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            java.util.Objects.requireNonNull(r0)     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            com.google.android.gms.internal.ads.zzzu r6 = new com.google.android.gms.internal.ads.zzzu     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            r6.<init>(r0)     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            com.google.android.gms.internal.ads.zzgax r7 = com.google.android.gms.internal.ads.zzgax.zzn()     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            r8 = 0
            r5 = r11
            r1.zza(r2, r3, r4, r5, r6, r7, r8)     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            android.util.Pair r11 = r11.zzl     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            if (r11 == 0) goto L62
            java.lang.Object r0 = r11.first     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            android.view.Surface r0 = (android.view.Surface) r0     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            java.lang.Object r11 = r11.second     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            com.google.android.gms.internal.ads.zzel r11 = (com.google.android.gms.internal.ads.zzel) r11     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            r11.zzb()     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
            r11.zza()     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
        L62:
            throw r10     // Catch: com.google.android.gms.internal.ads.zzcl -> L63
        L63:
            r11 = move-exception
            com.google.android.gms.internal.ads.zzabu r0 = new com.google.android.gms.internal.ads.zzabu
            r0.<init>(r11, r12)
            throw r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdj zze(com.google.android.gms.internal.ads.zzaak r0) {
            com.google.android.gms.internal.ads.zzdj r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaaw zzf(com.google.android.gms.internal.ads.zzaak r0) {
            com.google.android.gms.internal.ads.zzaaw r0 = r0.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaaz zzg(com.google.android.gms.internal.ads.zzaak r0) {
            com.google.android.gms.internal.ads.zzaaz r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.CopyOnWriteArraySet zzi(com.google.android.gms.internal.ads.zzaak r0) {
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzj() {
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzaak.zza
            return r0
    }

    public static /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzaak r1) {
            int r0 = r1.zzm
            int r0 = r0 + (-1)
            r1.zzm = r0
            if (r0 <= 0) goto L9
            return
        L9:
            if (r0 < 0) goto L11
            com.google.android.gms.internal.ads.zzabe r1 = r1.zze
            r1.zza()
            return
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r0)
            throw r1
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzaak r0, com.google.android.gms.internal.ads.zzaf r1) {
            r0.zzi = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzaak r2) {
            int r0 = r2.zzn
            r1 = 1
            if (r0 != r1) goto L1c
            int r0 = r2.zzm
            int r0 = r0 + r1
            r2.zzm = r0
            com.google.android.gms.internal.ads.zzabe r0 = r2.zze
            r0.zza()
            com.google.android.gms.internal.ads.zzdt r0 = r2.zzk
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            com.google.android.gms.internal.ads.zzzw r1 = new com.google.android.gms.internal.ads.zzzw
            r1.<init>(r2)
            r0.zzh(r1)
        L1c:
            return
    }

    static /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzaak r0, long r1, long r3, long r5) {
            com.google.android.gms.internal.ads.zzabe r0 = r0.zze
            r0.zzb(r3, r5)
            return
    }

    static /* bridge */ /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzaak r1, long r2, long r4) {
            int r0 = r1.zzm
            if (r0 != 0) goto L9
            com.google.android.gms.internal.ads.zzabe r1 = r1.zze
            r1.zzc(r2, r4)
        L9:
            return
    }

    static /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzaak r0, float r1) {
            com.google.android.gms.internal.ads.zzabe r0 = r0.zze
            r0.zzd(r1)
            return
    }

    static /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzaak r0, com.google.android.gms.internal.ads.zzaaw r1) {
            r0.zzj = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean zzu(com.google.android.gms.internal.ads.zzaak r1, long r2) {
            int r0 = r1.zzm
            if (r0 != 0) goto Le
            com.google.android.gms.internal.ads.zzabe r1 = r1.zze
            boolean r1 = r1.zze(r2)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    static /* bridge */ /* synthetic */ boolean zzv(com.google.android.gms.internal.ads.zzaak r0, boolean r1) {
            com.google.android.gms.internal.ads.zzabe r0 = r0.zze
            r1 = 0
            boolean r0 = r0.zzf(r1)
            return r0
    }

    private static com.google.android.gms.internal.ads.zzo zzw(com.google.android.gms.internal.ads.zzo r1) {
            if (r1 == 0) goto La
            boolean r0 = r1.zzf()
            if (r0 != 0) goto L9
            goto La
        L9:
            return r1
        La:
            com.google.android.gms.internal.ads.zzo r1 = com.google.android.gms.internal.ads.zzo.zza
            return r1
    }

    public final com.google.android.gms.internal.ads.zzabv zzh() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaai r0 = r1.zzc
            return r0
    }

    public final void zzr() {
            r1 = this;
            com.google.android.gms.internal.ads.zzel r0 = com.google.android.gms.internal.ads.zzel.zza
            r0.zzb()
            r0.zza()
            r0 = 0
            r1.zzl = r0
            return
    }

    public final void zzs() {
            r3 = this;
            int r0 = r3.zzn
            r1 = 2
            if (r0 != r1) goto L6
            return
        L6:
            com.google.android.gms.internal.ads.zzdt r0 = r3.zzk
            r2 = 0
            if (r0 == 0) goto Le
            r0.zze(r2)
        Le:
            r3.zzl = r2
            r3.zzn = r1
            return
    }

    public final void zzt(android.view.Surface r2, com.google.android.gms.internal.ads.zzel r3) {
            r1 = this;
            android.util.Pair r0 = r1.zzl
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.first
            android.view.Surface r0 = (android.view.Surface) r0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1b
            android.util.Pair r0 = r1.zzl
            java.lang.Object r0 = r0.second
            com.google.android.gms.internal.ads.zzel r0 = (com.google.android.gms.internal.ads.zzel) r0
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1b
            return
        L1b:
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r1.zzl = r2
            r3.zzb()
            r3.zza()
            return
    }
}
