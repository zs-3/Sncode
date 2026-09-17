package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzwr extends com.google.android.gms.internal.ads.zzcc {
    private static final java.lang.Object zzb = null;
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzbc zzf;
    private final com.google.android.gms.internal.ads.zzav zzg;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzwr.zzb = r0
            com.google.android.gms.internal.ads.zzam r0 = new com.google.android.gms.internal.ads.zzam
            r0.<init>()
            java.lang.String r1 = "SinglePeriodTimeline"
            r0.zza(r1)
            android.net.Uri r1 = android.net.Uri.EMPTY
            r0.zzb(r1)
            r0.zzc()
            return
    }

    public zzwr(long r4, long r6, long r8, long r10, long r12, long r14, long r16, boolean r18, boolean r19, boolean r20, java.lang.Object r21, com.google.android.gms.internal.ads.zzbc r22, com.google.android.gms.internal.ads.zzav r23) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r10
            r0.zzc = r1
            r1 = r12
            r0.zzd = r1
            r1 = r18
            r0.zze = r1
            java.util.Objects.requireNonNull(r22)
            r1 = r22
            r0.zzf = r1
            r1 = r23
            r0.zzg = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zza(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzwr.zzb
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto La
            r2 = 0
            return r2
        La:
            r2 = -1
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzb() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzc() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final com.google.android.gms.internal.ads.zzca zzd(int r11, com.google.android.gms.internal.ads.zzca r12, boolean r13) {
            r10 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.ads.zzdi.zza(r11, r0, r1)
            if (r13 == 0) goto La
            java.lang.Object r11 = com.google.android.gms.internal.ads.zzwr.zzb
            goto Lb
        La:
            r11 = 0
        Lb:
            r2 = r11
            r1 = 0
            r3 = 0
            long r4 = r10.zzc
            r6 = 0
            com.google.android.gms.internal.ads.zzb r8 = com.google.android.gms.internal.ads.zzb.zza
            r9 = 0
            r0 = r12
            r0.zzi(r1, r2, r3, r4, r6, r8, r9)
            return r12
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final com.google.android.gms.internal.ads.zzcb zze(int r23, com.google.android.gms.internal.ads.zzcb r24, long r25) {
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = 0
            r3 = 1
            r4 = r23
            com.google.android.gms.internal.ads.zzdi.zza(r4, r2, r3)
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzcb.zza
            com.google.android.gms.internal.ads.zzbc r3 = r0.zzf
            long r4 = r0.zzd
            r16 = r4
            com.google.android.gms.internal.ads.zzav r13 = r0.zzg
            boolean r11 = r0.zze
            r4 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r9
            r7 = r9
            r12 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r1.zza(r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18, r19, r20)
            return r24
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final java.lang.Object zzf(int r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.ads.zzdi.zza(r3, r0, r1)
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzwr.zzb
            return r3
    }
}
