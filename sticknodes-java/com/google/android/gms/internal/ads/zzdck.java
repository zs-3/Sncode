package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdck implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener, com.google.android.gms.internal.ads.zzcya, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdal, com.google.android.gms.internal.ads.zzcyu, com.google.android.gms.internal.ads.zzczz, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzdga {
    private final com.google.android.gms.internal.ads.zzdci zza;
    private com.google.android.gms.internal.ads.zzeob zzb;
    private com.google.android.gms.internal.ads.zzeof zzc;
    private com.google.android.gms.internal.ads.zzfcf zzd;
    private com.google.android.gms.internal.ads.zzffk zze;

    public zzdck() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzdci r0 = new com.google.android.gms.internal.ads.zzdci
            r1 = 0
            r0.<init>(r2, r1)
            r2.zza = r0
            return
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzdck r0, com.google.android.gms.internal.ads.zzeob r1) {
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzdck r0, com.google.android.gms.internal.ads.zzfcf r1) {
            r0.zzd = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzdck r0, com.google.android.gms.internal.ads.zzeof r1) {
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzdck r0, com.google.android.gms.internal.ads.zzffk r1) {
            r0.zze = r1
            return
    }

    private static void zzn(java.lang.Object r0, com.google.android.gms.internal.ads.zzdcj r1) {
            if (r0 == 0) goto L5
            r1.zza(r0)
        L5:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdba r1 = new com.google.android.gms.internal.ads.zzdba
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzeof r0 = r2.zzc
            com.google.android.gms.internal.ads.zzdbb r1 = new com.google.android.gms.internal.ads.zzdbb
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
            r2 = this;
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdbg r1 = new com.google.android.gms.internal.ads.zzdbg
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdbm r1 = new com.google.android.gms.internal.ads.zzdbm
            r1.<init>(r3, r4)
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdcf r1 = new com.google.android.gms.internal.ads.zzdcf
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdcg r1 = new com.google.android.gms.internal.ads.zzdcg
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdby r1 = new com.google.android.gms.internal.ads.zzdby
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdbz r1 = new com.google.android.gms.internal.ads.zzdbz
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdbh r1 = new com.google.android.gms.internal.ads.zzdbh
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdbi r1 = new com.google.android.gms.internal.ads.zzdbi
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdG() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdbv r1 = new com.google.android.gms.internal.ads.zzdbv
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzeof r0 = r2.zzc
            com.google.android.gms.internal.ads.zzdca r1 = new com.google.android.gms.internal.ads.zzdca
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdcb r1 = new com.google.android.gms.internal.ads.zzdcb
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdcc r1 = new com.google.android.gms.internal.ads.zzdcc
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdbt r1 = new com.google.android.gms.internal.ads.zzdbt
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdbn r1 = new com.google.android.gms.internal.ads.zzdbn
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdbf r1 = new com.google.android.gms.internal.ads.zzdbf
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdbs r1 = new com.google.android.gms.internal.ads.zzdbs
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdbo r1 = new com.google.android.gms.internal.ads.zzdbo
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzds(com.google.android.gms.internal.ads.zzbwm r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdbj r1 = new com.google.android.gms.internal.ads.zzdbj
            r1.<init>(r3, r4, r5)
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdbl r1 = new com.google.android.gms.internal.ads.zzdbl
            r1.<init>(r3, r4, r5)
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdbu r1 = new com.google.android.gms.internal.ads.zzdbu
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdbw r1 = new com.google.android.gms.internal.ads.zzdbw
            r1.<init>(r3)
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdaz r1 = new com.google.android.gms.internal.ads.zzdaz
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdbk r1 = new com.google.android.gms.internal.ads.zzdbk
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdbc r1 = new com.google.android.gms.internal.ads.zzdbc
            r1.<init>()
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdbd r1 = new com.google.android.gms.internal.ads.zzdbd
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    public final void zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdbx r1 = new com.google.android.gms.internal.ads.zzdbx
            r1.<init>()
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    public final void zzh(com.google.android.gms.ads.internal.client.zzu r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdbp r1 = new com.google.android.gms.internal.ads.zzdbp
            r1.<init>(r3)
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdbq r1 = new com.google.android.gms.internal.ads.zzdbq
            r1.<init>(r3)
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzfcf r0 = r2.zzd
            com.google.android.gms.internal.ads.zzdbr r1 = new com.google.android.gms.internal.ads.zzdbr
            r1.<init>(r3)
            zzn(r0, r1)
            return
    }

    public final com.google.android.gms.internal.ads.zzdci zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdci r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzq(com.google.android.gms.ads.internal.client.zze r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzffk r0 = r2.zze
            com.google.android.gms.internal.ads.zzdcd r1 = new com.google.android.gms.internal.ads.zzdcd
            r1.<init>(r3)
            zzn(r0, r1)
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdce r1 = new com.google.android.gms.internal.ads.zzdce
            r1.<init>(r3)
            zzn(r0, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeob r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdbe r1 = new com.google.android.gms.internal.ads.zzdbe
            r1.<init>()
            zzn(r0, r1)
            return
    }
}
