package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zztx implements com.google.android.gms.internal.ads.zzva {
    private final java.util.ArrayList zza;
    private final java.util.HashSet zzb;
    private final com.google.android.gms.internal.ads.zzvh zzc;
    private final com.google.android.gms.internal.ads.zzrq zzd;
    private android.os.Looper zze;
    private com.google.android.gms.internal.ads.zzcc zzf;
    private com.google.android.gms.internal.ads.zzom zzg;

    public zztx() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r2.zzb = r0
            com.google.android.gms.internal.ads.zzvh r0 = new com.google.android.gms.internal.ads.zzvh
            r0.<init>()
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzrq r0 = new com.google.android.gms.internal.ads.zzrq
            r0.<init>()
            r2.zzd = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public /* synthetic */ com.google.android.gms.internal.ads.zzcc zzM() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzom zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzom r0 = r1.zzg
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            return r0
    }

    protected final com.google.android.gms.internal.ads.zzrq zzc(com.google.android.gms.internal.ads.zzuy r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzrq r0 = r2.zzd
            r1 = 0
            com.google.android.gms.internal.ads.zzrq r3 = r0.zza(r1, r3)
            return r3
    }

    protected final com.google.android.gms.internal.ads.zzrq zzd(int r2, com.google.android.gms.internal.ads.zzuy r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzrq r2 = r1.zzd
            r0 = 0
            com.google.android.gms.internal.ads.zzrq r2 = r2.zza(r0, r3)
            return r2
    }

    protected final com.google.android.gms.internal.ads.zzvh zze(com.google.android.gms.internal.ads.zzuy r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzvh r0 = r2.zzc
            r1 = 0
            com.google.android.gms.internal.ads.zzvh r3 = r0.zza(r1, r3)
            return r3
    }

    protected final com.google.android.gms.internal.ads.zzvh zzf(int r2, com.google.android.gms.internal.ads.zzuy r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzvh r2 = r1.zzc
            r0 = 0
            com.google.android.gms.internal.ads.zzvh r2 = r2.zza(r0, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzg(android.os.Handler r2, com.google.android.gms.internal.ads.zzrr r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzrq r0 = r1.zzd
            r0.zzb(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzh(android.os.Handler r2, com.google.android.gms.internal.ads.zzvi r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzvh r0 = r1.zzc
            r0.zzb(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzi(com.google.android.gms.internal.ads.zzuz r3) {
            r2 = this;
            java.util.HashSet r0 = r2.zzb
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.HashSet r1 = r2.zzb
            r1.remove(r3)
            if (r0 == 0) goto L1a
            java.util.HashSet r3 = r2.zzb
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1a
            r2.zzj()
        L1a:
            return
    }

    protected void zzj() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzk(com.google.android.gms.internal.ads.zzuz r3) {
            r2 = this;
            android.os.Looper r0 = r2.zze
            java.util.Objects.requireNonNull(r0)
            java.util.HashSet r0 = r2.zzb
            boolean r1 = r0.isEmpty()
            r0.add(r3)
            if (r1 == 0) goto L13
            r2.zzl()
        L13:
            return
    }

    protected void zzl() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzm(com.google.android.gms.internal.ads.zzuz r4, com.google.android.gms.internal.ads.zzhh r5, com.google.android.gms.internal.ads.zzom r6) {
            r3 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r3.zze
            r2 = 1
            if (r1 == 0) goto Ld
            if (r1 != r0) goto Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            com.google.android.gms.internal.ads.zzdi.zzd(r2)
            r3.zzg = r6
            com.google.android.gms.internal.ads.zzcc r6 = r3.zzf
            java.util.ArrayList r1 = r3.zza
            r1.add(r4)
            android.os.Looper r1 = r3.zze
            if (r1 != 0) goto L28
            r3.zze = r0
            java.util.HashSet r6 = r3.zzb
            r6.add(r4)
            r3.zzn(r5)
            return
        L28:
            if (r6 == 0) goto L30
            r3.zzk(r4)
            r4.zza(r3, r6)
        L30:
            return
    }

    protected abstract void zzn(com.google.android.gms.internal.ads.zzhh r1);

    protected final void zzo(com.google.android.gms.internal.ads.zzcc r5) {
            r4 = this;
            r4.zzf = r5
            java.util.ArrayList r0 = r4.zza
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L17
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.ads.zzuz r3 = (com.google.android.gms.internal.ads.zzuz) r3
            r3.zza(r4, r5)
            int r2 = r2 + 1
            goto L9
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzp(com.google.android.gms.internal.ads.zzuz r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.zza
            r0.remove(r2)
            java.util.ArrayList r0 = r1.zza
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            r2 = 0
            r1.zze = r2
            r1.zzf = r2
            r1.zzg = r2
            java.util.HashSet r2 = r1.zzb
            r2.clear()
            r1.zzq()
            return
        L1d:
            r1.zzi(r2)
            return
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzr(com.google.android.gms.internal.ads.zzrr r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzrq r0 = r1.zzd
            r0.zzc(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzs(com.google.android.gms.internal.ads.zzvi r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzvh r0 = r1.zzc
            r0.zzh(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public /* synthetic */ void zzt(com.google.android.gms.internal.ads.zzbc r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected final boolean zzu() {
            r1 = this;
            java.util.HashSet r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public /* synthetic */ boolean zzv() {
            r1 = this;
            r0 = 1
            return r0
    }
}
