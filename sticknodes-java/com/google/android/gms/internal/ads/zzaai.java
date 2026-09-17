package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaai implements com.google.android.gms.internal.ads.zzabv, com.google.android.gms.internal.ads.zzaaa {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaak zza;
    private final android.content.Context zzb;
    private final int zzc;
    private final java.util.ArrayList zzd;
    private final com.google.android.gms.internal.ads.zzaax zze;
    private com.google.android.gms.internal.ads.zzaf zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private long zzl;
    private boolean zzm;
    private long zzn;
    private com.google.android.gms.internal.ads.zzabs zzo;
    private java.util.concurrent.Executor zzp;

    public zzaai(com.google.android.gms.internal.ads.zzaak r1, android.content.Context r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            boolean r1 = com.google.android.gms.internal.ads.zzeu.zzJ(r2)
            r2 = 1
            if (r2 == r1) goto Lf
            r2 = 5
        Lf:
            r0.zzc = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzd = r1
            com.google.android.gms.internal.ads.zzaax r1 = new com.google.android.gms.internal.ads.zzaax
            r1.<init>()
            r0.zze = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzl = r1
            com.google.android.gms.internal.ads.zzabs r1 = com.google.android.gms.internal.ads.zzabs.zzb
            r0.zzo = r1
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.ads.zzaak.zzj()
            r0.zzp = r1
            return
    }

    private final void zzA() {
            r6 = this;
            com.google.android.gms.internal.ads.zzaf r0 = r6.zzf
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = r6.zzd
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzaf r0 = r6.zzf
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            com.google.android.gms.internal.ads.zzdi.zzb(r1)
            com.google.android.gms.internal.ads.zzo r2 = r0.zzA
            int r3 = r0.zzt
            int r4 = r0.zzu
            com.google.android.gms.internal.ads.zzag r5 = new com.google.android.gms.internal.ads.zzag
            com.google.android.gms.internal.ads.zzo r2 = com.google.android.gms.internal.ads.zzaak.zzb(r2)
            r5.<init>(r2, r3, r4)
            float r0 = r0.zzx
            r5.zza(r0)
            r5.zzb()
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final void zza(com.google.android.gms.internal.ads.zzaak r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzabs r3 = r2.zzo
            java.util.concurrent.Executor r0 = r2.zzp
            com.google.android.gms.internal.ads.zzaah r1 = new com.google.android.gms.internal.ads.zzaah
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final void zzb(com.google.android.gms.internal.ads.zzaak r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzabs r3 = r2.zzo
            java.util.concurrent.Executor r0 = r2.zzp
            com.google.android.gms.internal.ads.zzaag r1 = new com.google.android.gms.internal.ads.zzaag
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final void zzc(com.google.android.gms.internal.ads.zzaak r3, com.google.android.gms.internal.ads.zzcp r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzabs r3 = r2.zzo
            java.util.concurrent.Executor r0 = r2.zzp
            com.google.android.gms.internal.ads.zzaaf r1 = new com.google.android.gms.internal.ads.zzaaf
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final android.view.Surface zzd() {
            r1 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r0 = 0
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            r0.zzr()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaaz r0 = com.google.android.gms.internal.ads.zzaak.zzg(r0)
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzg(boolean r3) {
            r2 = this;
            r0 = 0
            r2.zzm = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.zzl = r0
            com.google.android.gms.internal.ads.zzaak r0 = r2.zza
            com.google.android.gms.internal.ads.zzaak.zzm(r0)
            if (r3 == 0) goto L1a
            com.google.android.gms.internal.ads.zzaak r3 = r2.zza
            com.google.android.gms.internal.ads.zzaaz r3 = com.google.android.gms.internal.ads.zzaak.zzg(r3)
            r3.zzi()
        L1a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzh(com.google.android.gms.internal.ads.zzaf r2) throws com.google.android.gms.internal.ads.zzabu {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaak.zzd(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzi(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaaz r0 = com.google.android.gms.internal.ads.zzaak.zzg(r0)
            r0.zzc(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzj(int r6, com.google.android.gms.internal.ads.zzaf r7) {
            r5 = this;
            r6 = 0
            com.google.android.gms.internal.ads.zzdi.zzf(r6)
            com.google.android.gms.internal.ads.zzaak r0 = r5.zza
            com.google.android.gms.internal.ads.zzaaz r0 = com.google.android.gms.internal.ads.zzaak.zzg(r0)
            float r1 = r7.zzv
            r0.zzl(r1)
            r5.zzf = r7
            boolean r7 = r5.zzm
            r0 = 1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L23
            r5.zzA()
            r5.zzm = r0
            r5.zzn = r1
            return
        L23:
            long r3 = r5.zzl
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 == 0) goto L2a
            r6 = 1
        L2a:
            com.google.android.gms.internal.ads.zzdi.zzf(r6)
            long r6 = r5.zzl
            r5.zzn = r6
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzk() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaaz r0 = com.google.android.gms.internal.ads.zzaak.zzg(r0)
            r0.zzd()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzl(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaaz r0 = com.google.android.gms.internal.ads.zzaak.zzg(r0)
            r0.zze(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzm() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaaz r0 = com.google.android.gms.internal.ads.zzaak.zzg(r0)
            r0.zzg()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzn() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaaz r0 = com.google.android.gms.internal.ads.zzaak.zzg(r0)
            r0.zzh()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzo() {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            r0.zzs()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzp(long r2, long r4) throws com.google.android.gms.internal.ads.zzabu {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza     // Catch: com.google.android.gms.internal.ads.zzij -> L6
            com.google.android.gms.internal.ads.zzaak.zzo(r0, r2, r4)     // Catch: com.google.android.gms.internal.ads.zzij -> L6
            return
        L6:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzabu r3 = new com.google.android.gms.internal.ads.zzabu
            com.google.android.gms.internal.ads.zzaf r4 = r1.zzf
            if (r4 != 0) goto L16
            com.google.android.gms.internal.ads.zzad r4 = new com.google.android.gms.internal.ads.zzad
            r4.<init>()
            com.google.android.gms.internal.ads.zzaf r4 = r4.zzaf()
        L16:
            r3.<init>(r2, r4)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzq(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaaz r0 = com.google.android.gms.internal.ads.zzaak.zzg(r0)
            r0.zzj(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzr(com.google.android.gms.internal.ads.zzabs r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.zzo = r1
            r0.zzp = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzs(android.view.Surface r2, com.google.android.gms.internal.ads.zzel r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            r0.zzt(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzt(float r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaak.zzp(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzu(long r6, long r8, long r10, long r12) {
            r5 = this;
            boolean r0 = r5.zzk
            long r1 = r5.zzh
            r3 = 1
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 != 0) goto L11
            long r1 = r5.zzi
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 == 0) goto L10
            goto L11
        L10:
            r3 = 0
        L11:
            r0 = r0 | r3
            r5.zzk = r0
            r5.zzg = r6
            r5.zzh = r8
            r5.zzi = r10
            r5.zzj = r12
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzv(java.util.List r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.zzd
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            return
        L9:
            java.util.ArrayList r0 = r1.zzd
            r0.clear()
            java.util.ArrayList r0 = r1.zzd
            r0.addAll(r2)
            r1.zzA()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzw(com.google.android.gms.internal.ads.zzaaw r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r0 = r1.zza
            com.google.android.gms.internal.ads.zzaak.zzq(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzx(long r16, boolean r18, long r19, long r21, com.google.android.gms.internal.ads.zzabt r23) throws com.google.android.gms.internal.ads.zzabu {
            r15 = this;
            r1 = r15
            r0 = 0
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            long r2 = r1.zzi
            long r2 = r16 - r2
            com.google.android.gms.internal.ads.zzaak r4 = r1.zza     // Catch: com.google.android.gms.internal.ads.zzij -> L61
            com.google.android.gms.internal.ads.zzaaz r4 = com.google.android.gms.internal.ads.zzaak.zzg(r4)     // Catch: com.google.android.gms.internal.ads.zzij -> L61
            long r11 = r1.zzg     // Catch: com.google.android.gms.internal.ads.zzij -> L61
            com.google.android.gms.internal.ads.zzaax r14 = r1.zze     // Catch: com.google.android.gms.internal.ads.zzij -> L61
            r5 = r2
            r7 = r19
            r9 = r21
            r13 = r18
            int r4 = r4.zza(r5, r7, r9, r11, r13, r14)     // Catch: com.google.android.gms.internal.ads.zzij -> L61
            r5 = 4
            if (r4 != r5) goto L22
            goto L56
        L22:
            long r4 = r1.zzj
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L3c
            if (r18 == 0) goto L2b
            goto L3c
        L2b:
            r0 = r23
            com.google.android.gms.internal.ads.zzaap r0 = (com.google.android.gms.internal.ads.zzaap) r0
            com.google.android.gms.internal.ads.zzaas r2 = r0.zzd
            com.google.android.gms.internal.ads.zzst r3 = r0.zza
            int r4 = r0.zzb
            long r5 = r0.zzc
            r2.zzaQ(r3, r4, r5)
            r0 = 1
            return r0
        L3c:
            r2 = r19
            r4 = r21
            r15.zzp(r2, r4)
            long r2 = r1.zzn
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L5c
            com.google.android.gms.internal.ads.zzaak r6 = r1.zza
            boolean r2 = com.google.android.gms.internal.ads.zzaak.zzu(r6, r2)
            if (r2 != 0) goto L57
        L56:
            return r0
        L57:
            r15.zzA()
            r1.zzn = r4
        L5c:
            r0 = 0
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            throw r0
        L61:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzabu r2 = new com.google.android.gms.internal.ads.zzabu
            com.google.android.gms.internal.ads.zzaf r3 = r1.zzf
            com.google.android.gms.internal.ads.zzdi.zzb(r3)
            r2.<init>(r0, r3)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzy() {
            r1 = this;
            android.content.Context r0 = r1.zzb
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzJ(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzz(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzaak r2 = r1.zza
            r0 = 0
            boolean r2 = com.google.android.gms.internal.ads.zzaak.zzv(r2, r0)
            return r2
    }
}
