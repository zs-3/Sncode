package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzamd {
    private java.lang.String zza;
    private java.lang.String zzb;
    private java.util.Set zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private float zzn;
    private int zzo;
    private boolean zzp;

    public zzamd() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.zza = r0
            r2.zzb = r0
            java.util.Set r1 = java.util.Collections.emptySet()
            r2.zzc = r1
            r2.zzd = r0
            r0 = 0
            r2.zze = r0
            r0 = 0
            r2.zzg = r0
            r2.zzi = r0
            r1 = -1
            r2.zzj = r1
            r2.zzk = r1
            r2.zzl = r1
            r2.zzm = r1
            r2.zzo = r1
            r2.zzp = r0
            return
    }

    private static int zzA(int r1, java.lang.String r2, java.lang.String r3, int r4) {
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L13
            r0 = -1
            if (r1 != r0) goto La
            goto L13
        La:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L12
            int r1 = r1 + r4
            return r1
        L12:
            return r0
        L13:
            return r1
    }

    public final float zza() {
            r1 = this;
            float r0 = r1.zzn
            return r0
    }

    public final int zzb() {
            r2 = this;
            boolean r0 = r2.zzi
            if (r0 == 0) goto L7
            int r0 = r2.zzh
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Background color not defined."
            r0.<init>(r1)
            throw r0
    }

    public final int zzc() {
            r2 = this;
            boolean r0 = r2.zzg
            if (r0 == 0) goto L7
            int r0 = r2.zzf
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Font color not defined"
            r0.<init>(r1)
            throw r0
    }

    public final int zzd() {
            r1 = this;
            int r0 = r1.zzm
            return r0
    }

    public final int zze() {
            r1 = this;
            int r0 = r1.zzo
            return r0
    }

    public final int zzf(java.lang.String r4, java.lang.String r5, java.util.Set r6, java.lang.String r7) {
            r3 = this;
            java.lang.String r0 = r3.zza
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r0 = r3.zzb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            java.util.Set r0 = r3.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            java.lang.String r0 = r3.zzd
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L29
            r4 = 1
            return r4
        L29:
            return r1
        L2a:
            java.lang.String r0 = r3.zza
            r2 = 1073741824(0x40000000, float:2.0)
            int r4 = zzA(r1, r0, r4, r2)
            java.lang.String r0 = r3.zzb
            r2 = 2
            int r4 = zzA(r4, r0, r5, r2)
            java.lang.String r5 = r3.zzd
            r0 = 4
            int r4 = zzA(r4, r5, r7, r0)
            r5 = -1
            if (r4 == r5) goto L56
            java.util.Set r5 = r3.zzc
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L4c
            goto L56
        L4c:
            java.util.Set r5 = r3.zzc
            int r5 = r5.size()
            int r5 = r5 * 4
            int r4 = r4 + r5
            return r4
        L56:
            return r1
    }

    public final int zzg() {
            r4 = this;
            int r0 = r4.zzk
            r1 = -1
            if (r0 != r1) goto Lb
            int r2 = r4.zzl
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
            int r3 = r4.zzl
            if (r3 != r2) goto L17
            r1 = 2
        L17:
            r0 = r0 | r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzh(int r1) {
            r0 = this;
            r0.zzh = r1
            r1 = 1
            r0.zzi = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzi(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzk = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzj(boolean r1) {
            r0 = this;
            r0.zzp = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzk(int r1) {
            r0 = this;
            r0.zzf = r1
            r1 = 1
            r0.zzg = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzl(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfxi.zza(r1)
            r0.zze = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzm(float r1) {
            r0 = this;
            r0.zzn = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzn(int r1) {
            r0 = this;
            r0.zzm = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzo(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzl = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzp(int r1) {
            r0 = this;
            r0.zzo = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzamd zzq(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzj = r1
            return r0
    }

    public final java.lang.String zzr() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final void zzs(java.lang.String[] r2) {
            r1 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r1.zzc = r0
            return
    }

    public final void zzt(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return
    }

    public final void zzu(java.lang.String r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    public final void zzv(java.lang.String r1) {
            r0 = this;
            r0.zzd = r1
            return
    }

    public final boolean zzw() {
            r1 = this;
            boolean r0 = r1.zzp
            return r0
    }

    public final boolean zzx() {
            r1 = this;
            boolean r0 = r1.zzi
            return r0
    }

    public final boolean zzy() {
            r1 = this;
            boolean r0 = r1.zzg
            return r0
    }

    public final boolean zzz() {
            r2 = this;
            int r0 = r2.zzj
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }
}
