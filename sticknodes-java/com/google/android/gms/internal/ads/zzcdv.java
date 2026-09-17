package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzcdv implements com.google.android.gms.common.api.Releasable {
    protected final android.content.Context zza;
    protected final java.lang.String zzb;
    protected final java.lang.ref.WeakReference zzc;

    public zzcdv(com.google.android.gms.internal.ads.zzccj r4) {
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getContext()
            r3.zza = r0
            com.google.android.gms.ads.internal.util.zzt r1 = com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r4.zzn()
            java.lang.String r2 = r2.afmaVersion
            java.lang.String r0 = r1.zzc(r0, r2)
            r3.zzb = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.zzc = r0
            return
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcdv r0, java.lang.String r1, java.util.Map r2) {
            java.lang.ref.WeakReference r0 = r0.zzc
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzccj r0 = (com.google.android.gms.internal.ads.zzccj) r0
            if (r0 == 0) goto Lf
            java.lang.String r1 = "onPrecacheEvent"
            r0.zzd(r1, r2)
        Lf:
            return
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
            r0 = this;
            return
    }

    public abstract void zzf();

    public final void zzg(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            android.os.Handler r0 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.internal.ads.zzcdu r7 = new com.google.android.gms.internal.ads.zzcdu
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r7)
            return
    }

    protected final void zzh(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            android.os.Handler r0 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.internal.ads.zzcds r1 = new com.google.android.gms.internal.ads.zzcds
            r1.<init>(r2, r3, r4, r5)
            r0.post(r1)
            return
    }

    public final void zzj(java.lang.String r9, java.lang.String r10, long r11) {
            r8 = this;
            android.os.Handler r0 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.internal.ads.zzcdt r7 = new com.google.android.gms.internal.ads.zzcdt
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r0.post(r7)
            return
    }

    public final void zzn(java.lang.String r16, java.lang.String r17, int r18, int r19, long r20, long r22, boolean r24, int r25, int r26) {
            r15 = this;
            android.os.Handler r0 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.internal.ads.zzcdr r14 = new com.google.android.gms.internal.ads.zzcdr
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r9 = r22
            r11 = r24
            r12 = r25
            r13 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r0.post(r14)
            return
    }

    public final void zzo(java.lang.String r21, java.lang.String r22, long r23, long r25, boolean r27, long r28, long r30, long r32, int r34, int r35) {
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r6 = r25
            r14 = r27
            r8 = r28
            r10 = r30
            r12 = r32
            r15 = r34
            r16 = r35
            android.os.Handler r0 = com.google.android.gms.ads.internal.util.client.zzf.zza
            r17 = r1
            com.google.android.gms.internal.ads.zzcdq r1 = new com.google.android.gms.internal.ads.zzcdq
            r18 = r0
            r0 = r1
            r19 = r1
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r12, r14, r15, r16)
            r0 = r18
            r1 = r19
            r0.post(r1)
            return
    }

    protected void zzp(int r1) {
            r0 = this;
            return
    }

    protected void zzq(int r1) {
            r0 = this;
            return
    }

    protected void zzr(int r1) {
            r0 = this;
            return
    }

    protected void zzs(int r1) {
            r0 = this;
            return
    }

    public abstract boolean zzt(java.lang.String r1);

    public boolean zzu(java.lang.String r1, java.lang.String[] r2) {
            r0 = this;
            boolean r1 = r0.zzt(r1)
            return r1
    }

    public boolean zzw(java.lang.String r1, java.lang.String[] r2, com.google.android.gms.internal.ads.zzcdn r3) {
            r0 = this;
            boolean r1 = r0.zzt(r1)
            return r1
    }
}
