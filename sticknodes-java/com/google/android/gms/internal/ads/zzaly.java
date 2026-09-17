package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaly {
    private java.lang.String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private java.lang.String zzl;
    private int zzm;
    private int zzn;
    private android.text.Layout.Alignment zzo;
    private android.text.Layout.Alignment zzp;
    private int zzq;
    private com.google.android.gms.internal.ads.zzalr zzr;
    private float zzs;

    public zzaly() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zzf = r0
            r1.zzg = r0
            r1.zzh = r0
            r1.zzi = r0
            r1.zzj = r0
            r1.zzm = r0
            r1.zzn = r0
            r1.zzq = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.zzs = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzaly zzA(boolean r1) {
            r0 = this;
            r0.zzq = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzB(com.google.android.gms.internal.ads.zzalr r1) {
            r0 = this;
            r0.zzr = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzC(boolean r1) {
            r0 = this;
            r0.zzg = r1
            return r0
    }

    public final java.lang.String zzD() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.lang.String zzE() {
            r1 = this;
            java.lang.String r0 = r1.zzl
            return r0
    }

    public final boolean zzF() {
            r2 = this;
            int r0 = r2.zzq
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public final boolean zzG() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public final boolean zzH() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    public final boolean zzI() {
            r2 = this;
            int r0 = r2.zzf
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public final boolean zzJ() {
            r2 = this;
            int r0 = r2.zzg
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public final float zza() {
            r1 = this;
            float r0 = r1.zzk
            return r0
    }

    public final float zzb() {
            r1 = this;
            float r0 = r1.zzs
            return r0
    }

    public final int zzc() {
            r2 = this;
            boolean r0 = r2.zze
            if (r0 == 0) goto L7
            int r0 = r2.zzd
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color has not been defined."
            r0.<init>(r1)
            throw r0
    }

    public final int zzd() {
            r2 = this;
            boolean r0 = r2.zzc
            if (r0 == 0) goto L7
            int r0 = r2.zzb
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color has not been defined."
            r0.<init>(r1)
            throw r0
    }

    public final int zze() {
            r1 = this;
            int r0 = r1.zzj
            return r0
    }

    public final int zzf() {
            r1 = this;
            int r0 = r1.zzn
            return r0
    }

    public final int zzg() {
            r1 = this;
            int r0 = r1.zzm
            return r0
    }

    public final int zzh() {
            r4 = this;
            int r0 = r4.zzh
            r1 = -1
            if (r0 != r1) goto Lb
            int r2 = r4.zzi
            if (r2 == r1) goto La
            goto Lb
        La:
            return r1
        Lb:
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            int r3 = r4.zzi
            if (r3 != r2) goto L17
            r1 = 2
        L17:
            r0 = r0 | r1
            return r0
    }

    public final android.text.Layout.Alignment zzi() {
            r1 = this;
            android.text.Layout$Alignment r0 = r1.zzp
            return r0
    }

    public final android.text.Layout.Alignment zzj() {
            r1 = this;
            android.text.Layout$Alignment r0 = r1.zzo
            return r0
    }

    public final com.google.android.gms.internal.ads.zzalr zzk() {
            r1 = this;
            com.google.android.gms.internal.ads.zzalr r0 = r1.zzr
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzl(com.google.android.gms.internal.ads.zzaly r4) {
            r3 = this;
            if (r4 == 0) goto L96
            boolean r0 = r3.zzc
            if (r0 != 0) goto Lf
            boolean r0 = r4.zzc
            if (r0 == 0) goto Lf
            int r0 = r4.zzb
            r3.zzo(r0)
        Lf:
            int r0 = r3.zzh
            r1 = -1
            if (r0 != r1) goto L18
            int r0 = r4.zzh
            r3.zzh = r0
        L18:
            int r0 = r3.zzi
            if (r0 != r1) goto L20
            int r0 = r4.zzi
            r3.zzi = r0
        L20:
            java.lang.String r0 = r3.zza
            if (r0 != 0) goto L2a
            java.lang.String r0 = r4.zza
            if (r0 == 0) goto L2a
            r3.zza = r0
        L2a:
            int r0 = r3.zzf
            if (r0 != r1) goto L32
            int r0 = r4.zzf
            r3.zzf = r0
        L32:
            int r0 = r3.zzg
            if (r0 != r1) goto L3a
            int r0 = r4.zzg
            r3.zzg = r0
        L3a:
            int r0 = r3.zzn
            if (r0 != r1) goto L42
            int r0 = r4.zzn
            r3.zzn = r0
        L42:
            android.text.Layout$Alignment r0 = r3.zzo
            if (r0 != 0) goto L4c
            android.text.Layout$Alignment r0 = r4.zzo
            if (r0 == 0) goto L4c
            r3.zzo = r0
        L4c:
            android.text.Layout$Alignment r0 = r3.zzp
            if (r0 != 0) goto L56
            android.text.Layout$Alignment r0 = r4.zzp
            if (r0 == 0) goto L56
            r3.zzp = r0
        L56:
            int r0 = r3.zzq
            if (r0 != r1) goto L5e
            int r0 = r4.zzq
            r3.zzq = r0
        L5e:
            int r0 = r3.zzj
            if (r0 != r1) goto L6a
            int r0 = r4.zzj
            r3.zzj = r0
            float r0 = r4.zzk
            r3.zzk = r0
        L6a:
            com.google.android.gms.internal.ads.zzalr r0 = r3.zzr
            if (r0 != 0) goto L72
            com.google.android.gms.internal.ads.zzalr r0 = r4.zzr
            r3.zzr = r0
        L72:
            float r0 = r3.zzs
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7f
            float r0 = r4.zzs
            r3.zzs = r0
        L7f:
            boolean r0 = r3.zze
            if (r0 != 0) goto L8c
            boolean r0 = r4.zze
            if (r0 == 0) goto L8c
            int r0 = r4.zzd
            r3.zzm(r0)
        L8c:
            int r0 = r3.zzm
            if (r0 != r1) goto L96
            int r4 = r4.zzm
            if (r4 == r1) goto L96
            r3.zzm = r4
        L96:
            return r3
    }

    public final com.google.android.gms.internal.ads.zzaly zzm(int r1) {
            r0 = this;
            r0.zzd = r1
            r1 = 1
            r0.zze = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzn(boolean r1) {
            r0 = this;
            r0.zzh = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzo(int r1) {
            r0 = this;
            r0.zzb = r1
            r1 = 1
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzp(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzq(float r1) {
            r0 = this;
            r0.zzk = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzr(int r1) {
            r0 = this;
            r0.zzj = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzs(java.lang.String r1) {
            r0 = this;
            r0.zzl = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzt(boolean r1) {
            r0 = this;
            r0.zzi = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzu(boolean r1) {
            r0 = this;
            r0.zzf = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzv(android.text.Layout.Alignment r1) {
            r0 = this;
            r0.zzp = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzw(int r1) {
            r0 = this;
            r0.zzn = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzx(int r1) {
            r0 = this;
            r0.zzm = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzy(float r1) {
            r0 = this;
            r0.zzs = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaly zzz(android.text.Layout.Alignment r1) {
            r0 = this;
            r0.zzo = r1
            return r0
    }
}
