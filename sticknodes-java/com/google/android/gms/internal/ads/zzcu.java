package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzcu implements com.google.android.gms.internal.ads.zzct {
    protected com.google.android.gms.internal.ads.zzcr zzb;
    protected com.google.android.gms.internal.ads.zzcr zzc;
    private com.google.android.gms.internal.ads.zzcr zzd;
    private com.google.android.gms.internal.ads.zzcr zze;
    private java.nio.ByteBuffer zzf;
    private java.nio.ByteBuffer zzg;
    private boolean zzh;

    public zzcu() {
            r1 = this;
            r1.<init>()
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r1.zzf = r0
            r1.zzg = r0
            com.google.android.gms.internal.ads.zzcr r0 = com.google.android.gms.internal.ads.zzcr.zza
            r1.zzd = r0
            r1.zze = r0
            r1.zzb = r0
            r1.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final com.google.android.gms.internal.ads.zzcr zza(com.google.android.gms.internal.ads.zzcr r1) throws com.google.android.gms.internal.ads.zzcs {
            r0 = this;
            r0.zzd = r1
            com.google.android.gms.internal.ads.zzcr r1 = r0.zzi(r1)
            r0.zze = r1
            boolean r1 = r0.zzg()
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzcr r1 = r0.zze
            goto L13
        L11:
            com.google.android.gms.internal.ads.zzcr r1 = com.google.android.gms.internal.ads.zzcr.zza
        L13:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public java.nio.ByteBuffer zzb() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.zzg
            java.nio.ByteBuffer r1 = com.google.android.gms.internal.ads.zzct.zza
            r2.zzg = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzc() {
            r1 = this;
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r1.zzg = r0
            r0 = 0
            r1.zzh = r0
            com.google.android.gms.internal.ads.zzcr r0 = r1.zzd
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzcr r0 = r1.zze
            r1.zzc = r0
            r1.zzk()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzd() {
            r1 = this;
            r0 = 1
            r1.zzh = r0
            r1.zzl()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzf() {
            r1 = this;
            r1.zzc()
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r1.zzf = r0
            com.google.android.gms.internal.ads.zzcr r0 = com.google.android.gms.internal.ads.zzcr.zza
            r1.zzd = r0
            r1.zze = r0
            r1.zzb = r0
            r1.zzc = r0
            r1.zzm()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public boolean zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcr r0 = r2.zze
            com.google.android.gms.internal.ads.zzcr r1 = com.google.android.gms.internal.ads.zzcr.zza
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public boolean zzh() {
            r2 = this;
            boolean r0 = r2.zzh
            if (r0 == 0) goto Lc
            java.nio.ByteBuffer r0 = r2.zzg
            java.nio.ByteBuffer r1 = com.google.android.gms.internal.ads.zzct.zza
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected com.google.android.gms.internal.ads.zzcr zzi(com.google.android.gms.internal.ads.zzcr r1) throws com.google.android.gms.internal.ads.zzcs {
            r0 = this;
            r1 = 0
            throw r1
    }

    protected final java.nio.ByteBuffer zzj(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.zzf
            int r0 = r0.capacity()
            if (r0 >= r2) goto L17
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r0)
            r1.zzf = r2
            goto L1c
        L17:
            java.nio.ByteBuffer r2 = r1.zzf
            r2.clear()
        L1c:
            java.nio.ByteBuffer r2 = r1.zzf
            r1.zzg = r2
            return r2
    }

    protected void zzk() {
            r0 = this;
            return
    }

    protected void zzl() {
            r0 = this;
            return
    }

    protected void zzm() {
            r0 = this;
            return
    }

    protected final boolean zzn() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.zzg
            boolean r0 = r0.hasRemaining()
            return r0
    }
}
