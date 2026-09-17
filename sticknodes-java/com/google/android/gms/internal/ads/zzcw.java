package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcw implements com.google.android.gms.internal.ads.zzct {
    private int zzb;
    private float zzc;
    private float zzd;
    private com.google.android.gms.internal.ads.zzcr zze;
    private com.google.android.gms.internal.ads.zzcr zzf;
    private com.google.android.gms.internal.ads.zzcr zzg;
    private com.google.android.gms.internal.ads.zzcr zzh;
    private boolean zzi;
    private com.google.android.gms.internal.ads.zzcv zzj;
    private java.nio.ByteBuffer zzk;
    private java.nio.ShortBuffer zzl;
    private java.nio.ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcw() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.zzc = r0
            r2.zzd = r0
            com.google.android.gms.internal.ads.zzcr r0 = com.google.android.gms.internal.ads.zzcr.zza
            r2.zze = r0
            r2.zzf = r0
            r2.zzg = r0
            r2.zzh = r0
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r2.zzk = r0
            java.nio.ShortBuffer r1 = r0.asShortBuffer()
            r2.zzl = r1
            r2.zzm = r0
            r0 = -1
            r2.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final com.google.android.gms.internal.ads.zzcr zza(com.google.android.gms.internal.ads.zzcr r4) throws com.google.android.gms.internal.ads.zzcs {
            r3 = this;
            int r0 = r4.zzd
            r1 = 2
            if (r0 != r1) goto L1b
            int r0 = r3.zzb
            r2 = -1
            if (r0 != r2) goto Lc
            int r0 = r4.zzb
        Lc:
            r3.zze = r4
            com.google.android.gms.internal.ads.zzcr r2 = new com.google.android.gms.internal.ads.zzcr
            int r4 = r4.zzc
            r2.<init>(r0, r4, r1)
            r3.zzf = r2
            r4 = 1
            r3.zzi = r4
            return r2
        L1b:
            com.google.android.gms.internal.ads.zzcs r0 = new com.google.android.gms.internal.ads.zzcs
            java.lang.String r1 = "Unhandled input format:"
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final java.nio.ByteBuffer zzb() {
            r6 = this;
            com.google.android.gms.internal.ads.zzcv r0 = r6.zzj
            if (r0 == 0) goto L45
            int r1 = r0.zza()
            if (r1 <= 0) goto L45
            java.nio.ByteBuffer r2 = r6.zzk
            int r2 = r2.capacity()
            if (r2 >= r1) goto L27
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r6.zzk = r2
            java.nio.ShortBuffer r2 = r2.asShortBuffer()
            r6.zzl = r2
            goto L31
        L27:
            java.nio.ByteBuffer r2 = r6.zzk
            r2.clear()
            java.nio.ShortBuffer r2 = r6.zzl
            r2.clear()
        L31:
            java.nio.ShortBuffer r2 = r6.zzl
            r0.zzd(r2)
            long r2 = r6.zzo
            long r4 = (long) r1
            long r2 = r2 + r4
            r6.zzo = r2
            java.nio.ByteBuffer r0 = r6.zzk
            r0.limit(r1)
            java.nio.ByteBuffer r0 = r6.zzk
            r6.zzm = r0
        L45:
            java.nio.ByteBuffer r0 = r6.zzm
            java.nio.ByteBuffer r1 = com.google.android.gms.internal.ads.zzct.zza
            r6.zzm = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzc() {
            r9 = this;
            boolean r0 = r9.zzg()
            if (r0 == 0) goto L2c
            com.google.android.gms.internal.ads.zzcr r0 = r9.zze
            r9.zzg = r0
            com.google.android.gms.internal.ads.zzcr r1 = r9.zzf
            r9.zzh = r1
            boolean r2 = r9.zzi
            if (r2 == 0) goto L25
            com.google.android.gms.internal.ads.zzcv r2 = new com.google.android.gms.internal.ads.zzcv
            int r4 = r0.zzb
            int r5 = r0.zzc
            float r6 = r9.zzc
            float r7 = r9.zzd
            int r8 = r1.zzb
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r9.zzj = r2
            goto L2c
        L25:
            com.google.android.gms.internal.ads.zzcv r0 = r9.zzj
            if (r0 == 0) goto L2c
            r0.zzc()
        L2c:
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r9.zzm = r0
            r0 = 0
            r9.zzn = r0
            r9.zzo = r0
            r0 = 0
            r9.zzp = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcv r0 = r1.zzj
            if (r0 == 0) goto L7
            r0.zze()
        L7:
            r0 = 1
            r1.zzp = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(java.nio.ByteBuffer r8) {
            r7 = this;
            boolean r0 = r8.hasRemaining()
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.gms.internal.ads.zzcv r0 = r7.zzj
            java.util.Objects.requireNonNull(r0)
            java.nio.ShortBuffer r1 = r8.asShortBuffer()
            int r2 = r8.remaining()
            long r3 = r7.zzn
            long r5 = (long) r2
            long r3 = r3 + r5
            r7.zzn = r3
            r0.zzf(r1)
            int r0 = r8.position()
            int r0 = r0 + r2
            r8.position(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zzf() {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.zzc = r0
            r3.zzd = r0
            com.google.android.gms.internal.ads.zzcr r0 = com.google.android.gms.internal.ads.zzcr.zza
            r3.zze = r0
            r3.zzf = r0
            r3.zzg = r0
            r3.zzh = r0
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r3.zzk = r0
            java.nio.ShortBuffer r1 = r0.asShortBuffer()
            r3.zzl = r1
            r3.zzm = r0
            r0 = -1
            r3.zzb = r0
            r0 = 0
            r3.zzi = r0
            r1 = 0
            r3.zzj = r1
            r1 = 0
            r3.zzn = r1
            r3.zzo = r1
            r3.zzp = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzg() {
            r5 = this;
            com.google.android.gms.internal.ads.zzcr r0 = r5.zzf
            int r0 = r0.zzb
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 == r3) goto L31
            float r0 = r5.zzc
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 + r3
            float r0 = java.lang.Math.abs(r0)
            r4 = 953267991(0x38d1b717, float:1.0E-4)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L30
            float r0 = r5.zzd
            float r0 = r0 + r3
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L30
            com.google.android.gms.internal.ads.zzcr r0 = r5.zzf
            int r0 = r0.zzb
            com.google.android.gms.internal.ads.zzcr r3 = r5.zze
            int r3 = r3.zzb
            if (r0 != r3) goto L2f
            goto L31
        L2f:
            return r2
        L30:
            r1 = 1
        L31:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final boolean zzh() {
            r3 = this;
            boolean r0 = r3.zzp
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzcv r0 = r3.zzj
            if (r0 == 0) goto L13
            int r0 = r0.zza()
            if (r0 == 0) goto L11
            goto L12
        L11:
            return r1
        L12:
            r1 = 0
        L13:
            return r1
    }

    public final long zzi(long r17) {
            r16 = this;
            r0 = r16
            long r5 = r0.zzo
            r1 = 1024(0x400, double:5.06E-321)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L3a
            long r1 = r0.zzn
            com.google.android.gms.internal.ads.zzcv r3 = r0.zzj
            java.util.Objects.requireNonNull(r3)
            int r3 = r3.zzb()
            long r3 = (long) r3
            long r3 = r1 - r3
            com.google.android.gms.internal.ads.zzcr r1 = r0.zzh
            int r1 = r1.zzb
            com.google.android.gms.internal.ads.zzcr r2 = r0.zzg
            int r2 = r2.zzb
            if (r1 != r2) goto L2b
            java.math.RoundingMode r7 = java.math.RoundingMode.FLOOR
            r1 = r17
            long r1 = com.google.android.gms.internal.ads.zzeu.zzt(r1, r3, r5, r7)
            goto L39
        L2b:
            long r7 = (long) r1
            long r11 = r3 * r7
            long r1 = (long) r2
            long r13 = r5 * r1
            java.math.RoundingMode r15 = java.math.RoundingMode.FLOOR
            r9 = r17
            long r1 = com.google.android.gms.internal.ads.zzeu.zzt(r9, r11, r13, r15)
        L39:
            return r1
        L3a:
            float r1 = r0.zzc
            double r1 = (double) r1
            r3 = r17
            double r3 = (double) r3
            double r1 = r1 * r3
            long r1 = (long) r1
            return r1
    }

    public final void zzj(float r2) {
            r1 = this;
            float r0 = r1.zzd
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.zzd = r2
            r2 = 1
            r1.zzi = r2
        Lb:
            return
    }

    public final void zzk(float r2) {
            r1 = this;
            float r0 = r1.zzc
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.zzc = r2
            r2 = 1
            r1.zzi = r2
        Lb:
            return
    }
}
