package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgb extends com.google.android.gms.internal.ads.zzfz {
    private android.net.Uri zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final com.google.android.gms.internal.ads.zzga zzf;

    public zzgb(byte[] r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzga r0 = new com.google.android.gms.internal.ads.zzga
            r0.<init>(r3)
            r1 = 0
            r2.<init>(r1)
            r2.zzf = r0
            int r3 = r3.length
            if (r3 <= 0) goto Lf
            r1 = 1
        Lf:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.zzd
            if (r0 != 0) goto La
            r3 = -1
            return r3
        La:
            int r5 = java.lang.Math.min(r5, r0)
            byte[] r0 = r2.zzb
            com.google.android.gms.internal.ads.zzdi.zzb(r0)
            int r1 = r2.zzc
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.zzc
            int r3 = r3 + r5
            r2.zzc = r3
            int r3 = r2.zzd
            int r3 = r3 - r5
            r2.zzd = r3
            r2.zzg(r5)
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r8) throws java.io.IOException {
            r7 = this;
            r7.zzi(r8)
            android.net.Uri r0 = r8.zza
            r7.zza = r0
            com.google.android.gms.internal.ads.zzga r0 = r7.zzf
            byte[] r0 = r0.zza
            r7.zzb = r0
            long r1 = r8.zze
            int r0 = r0.length
            long r3 = (long) r0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L3c
            int r2 = (int) r1
            r7.zzc = r2
            int r0 = r0 - r2
            r7.zzd = r0
            long r1 = r8.zzf
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2b
            long r5 = (long) r0
            long r0 = java.lang.Math.min(r5, r1)
            int r1 = (int) r0
            r7.zzd = r1
        L2b:
            r0 = 1
            r7.zze = r0
            r7.zzj(r8)
            long r0 = r8.zzf
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L38
            return r0
        L38:
            int r8 = r7.zzd
            long r0 = (long) r8
            return r0
        L3c:
            com.google.android.gms.internal.ads.zzgh r8 = new com.google.android.gms.internal.ads.zzgh
            r0 = 2008(0x7d8, float:2.814E-42)
            r8.<init>(r0)
            throw r8
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            android.net.Uri r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() {
            r1 = this;
            boolean r0 = r1.zze
            if (r0 == 0) goto La
            r0 = 0
            r1.zze = r0
            r1.zzh()
        La:
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            return
    }
}
