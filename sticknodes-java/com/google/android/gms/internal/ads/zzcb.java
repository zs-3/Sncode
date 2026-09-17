package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcb {
    public static final java.lang.Object zza = null;
    private static final com.google.android.gms.internal.ads.zzbc zzp = null;
    public java.lang.Object zzb;

    @java.lang.Deprecated
    public java.lang.Object zzc;
    public com.google.android.gms.internal.ads.zzbc zzd;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    public com.google.android.gms.internal.ads.zzav zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.ads.zzcb.zza = r0
            com.google.android.gms.internal.ads.zzam r0 = new com.google.android.gms.internal.ads.zzam
            r0.<init>()
            java.lang.String r1 = "androidx.media3.common.Timeline"
            r0.zza(r1)
            android.net.Uri r1 = android.net.Uri.EMPTY
            r0.zzb(r1)
            com.google.android.gms.internal.ads.zzbc r0 = r0.zzc()
            com.google.android.gms.internal.ads.zzcb.zzp = r0
            r0 = 1
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 2
            java.lang.Integer.toString(r0, r1)
            r0 = 3
            java.lang.Integer.toString(r0, r1)
            r0 = 4
            java.lang.Integer.toString(r0, r1)
            r0 = 5
            java.lang.Integer.toString(r0, r1)
            r0 = 6
            java.lang.Integer.toString(r0, r1)
            r0 = 7
            java.lang.Integer.toString(r0, r1)
            r0 = 8
            java.lang.Integer.toString(r0, r1)
            r0 = 9
            java.lang.Integer.toString(r0, r1)
            r0 = 10
            java.lang.Integer.toString(r0, r1)
            r0 = 11
            java.lang.Integer.toString(r0, r1)
            r0 = 12
            java.lang.Integer.toString(r0, r1)
            r0 = 13
            java.lang.Integer.toString(r0, r1)
            return
    }

    public zzcb() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcb.zza
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzcb.zzp
            r1.zzd = r0
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L73
            java.lang.Class<com.google.android.gms.internal.ads.zzcb> r2 = com.google.android.gms.internal.ads.zzcb.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L14
            goto L73
        L14:
            com.google.android.gms.internal.ads.zzcb r8 = (com.google.android.gms.internal.ads.zzcb) r8
            java.lang.Object r2 = r7.zzb
            java.lang.Object r3 = r8.zzb
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L73
            com.google.android.gms.internal.ads.zzbc r2 = r7.zzd
            com.google.android.gms.internal.ads.zzbc r3 = r8.zzd
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L73
            com.google.android.gms.internal.ads.zzav r2 = r7.zzj
            com.google.android.gms.internal.ads.zzav r3 = r8.zzj
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L73
            long r2 = r7.zze
            long r4 = r8.zze
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L73
            long r2 = r7.zzf
            long r4 = r8.zzf
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L73
            long r2 = r7.zzg
            long r4 = r8.zzg
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L73
            boolean r2 = r7.zzh
            boolean r3 = r8.zzh
            if (r2 != r3) goto L73
            boolean r2 = r7.zzi
            boolean r3 = r8.zzi
            if (r2 != r3) goto L73
            boolean r2 = r7.zzk
            boolean r3 = r8.zzk
            if (r2 != r3) goto L73
            long r2 = r7.zzm
            long r4 = r8.zzm
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L73
            int r2 = r7.zzn
            int r3 = r8.zzn
            if (r2 != r3) goto L73
            int r2 = r7.zzo
            int r8 = r8.zzo
            if (r2 != r8) goto L73
            return r0
        L73:
            return r1
    }

    public final int hashCode() {
            r6 = this;
            java.lang.Object r0 = r6.zzb
            int r0 = r0.hashCode()
            int r0 = r0 + 217
            com.google.android.gms.internal.ads.zzbc r1 = r6.zzd
            int r1 = r1.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            com.google.android.gms.internal.ads.zzav r1 = r6.zzj
            if (r1 != 0) goto L17
            r1 = 0
            goto L1b
        L17:
            int r1 = r1.hashCode()
        L1b:
            int r0 = r0 * 961
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.zze
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.zzf
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.zzg
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r1 = r6.zzh
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.zzi
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r6.zzk
            int r0 = r0 + r1
            long r1 = r6.zzm
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r0 = r0 * 961
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r6.zzn
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r6.zzo
            int r0 = r0 + r1
            int r0 = r0 * 31
            return r0
    }

    public final com.google.android.gms.internal.ads.zzcb zza(java.lang.Object r4, com.google.android.gms.internal.ads.zzbc r5, java.lang.Object r6, long r7, long r9, long r11, boolean r13, boolean r14, com.google.android.gms.internal.ads.zzav r15, long r16, long r18, int r20, int r21, long r22) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.zzb = r1
            if (r5 != 0) goto L9
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzcb.zzp
            goto La
        L9:
            r1 = r5
        La:
            r0.zzd = r1
            r1 = 0
            r0.zzc = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r1
            r0.zzf = r1
            r0.zzg = r1
            r1 = r13
            r0.zzh = r1
            r1 = r14
            r0.zzi = r1
            r1 = r15
            r0.zzj = r1
            r1 = 0
            r0.zzl = r1
            r1 = r18
            r0.zzm = r1
            r1 = 0
            r0.zzn = r1
            r0.zzo = r1
            r0.zzk = r1
            return r0
    }

    public final boolean zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzav r0 = r1.zzj
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
